import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LanHouse {
    // Atributos da classe de LanHouse
    private CupomJogatina cp;


    //Lista de computadores
    private List<Computador> computadores;


    //Construror da classe
    public LanHouse(){
        computadores=new ArrayList<Computador>();
    }

    // Metódos da classe

     // 1. Adicionando um computador

    public void addPC(Computador c) throws NumNegativoException {
        if(c.getValor()>0 && c.getRam()>0 && c.getMemoria()>0){
            computadores.add(c);
        }else{
            throw new NumNegativoException("Não é possível adicionar computadores com preço negativos, ram negativa ou memoria negativa");
        }
    }

     // 2. Somando o valor total do(s) computador(es) adicionado(s)

    public double SomaValorTotalUso(){
        double total=0.0;

        for (Computador computador:computadores) {
            total+=computador.getValorUso();
        }

        if(cp!=null && cp.getValor()>0){
            return ValorDescontadoUsoComputador(total,cp.getValor());
        }else{
            return total;
        }
    }

     // 3. Soma o total de máquinas que temos na lan house

    public int SomaTotalMaquinas(){
        int cont=0;

        for (Computador computador:computadores) {
            cont++;
        }

        return cont;
    }

      // 4. Adiciona um cupom de desconto para jogar no computador em questão

    private double ValorDescontadoUsoComputador(double total, double desconto){
        double valorDescontado=total-(desconto*total);
        return valorDescontado;
    }

}
