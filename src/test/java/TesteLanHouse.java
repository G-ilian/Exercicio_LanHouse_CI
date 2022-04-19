import org.junit.Test;
import static org.junit.Assert.*;

public class TesteLanHouse {

        // 1. Testa o valor total em computadores que a lan house possui (Padrão 1)
    @Test
    public void TestaValorTotalUsoComputador() throws NumNegativoException {
        //Criados dois computadores para serem adicionados na lan house
        Computador c1=new Computador("Lenovo",12,240,3000,2);
        Computador c2=new Computador("Asus",16,1000,3000,3);

        //Criada a lan house que tem o metodo que permitirá adicionar os computadores
        LanHouse lan=new LanHouse();

        lan.addPC(c1);
        lan.addPC(c2);

        assertEquals(5,lan.SomaValorTotalUso(),0.01);
    }

        // 2. Testa a quantidade de computadores a lan house possue (Padrão 2)
    @Test
    public void testSomaTotalMaquinas() throws NumNegativoException{
        //Criados dois computadores para serem adicionados na lan house
        Computador c1=new Computador("Lenovo",12,240,3000,2);
        Computador c2=new Computador("Asus",16,1000,3000,2.50);

        //Criada a lan house que tem o metodo que permitirá adicionar os computadores
        LanHouse lan=new LanHouse();

        lan.addPC(c1);
        lan.addPC(c2);

        assertEquals(2,lan.SomaTotalMaquinas());
    }
        // 3. Testa lançar uma exceção adicionando computadores com RAM, valor e Memória negativas
    @Test(expected=NumNegativoException.class)
    public void testAdicionarComputadoresInvalidos() throws NumNegativoException {
        //Criados dois computadores para serem adicionados na lan house
        Computador c1=new Computador("Lenovo",-12,-240,-3000,2);
        Computador c2=new Computador("Asus",-16,1000,-3000,2);

        //Criada a lan house que tem o metodo que permitirá adicionar os computadores
        LanHouse lan=new LanHouse();

        lan.addPC(c1);
        lan.addPC(c2);

    }
        // 4. Teste de integração entre duas classes
    @Test
    public void testeCupomJogatina() throws NumNegativoException{
        //Criados dois computadores para serem adicionados na lan house
        Computador c1=new Computador("Lenovo",12,240,3000,2);

        //Criada a lan house que tem o metodo que permitirá adicionar os computadores
        LanHouse lan=new LanHouse();

        //Criando um cupom de jogatina qualquer
        CupomJogatina cp=new CupomJogatina("Jogando Adoidado",0.20);
        lan.setCp(cp);

        //Adicionando o computador
        lan.addPC(c1);

        //Verificando se a condição foi atendida
        assertEquals(1.60,lan.SomaValorTotalUso(),0.01);
    }
}
