import lombok.Data;


@Data
public class Computador {

    //Atributos da classe de computador
    private String marca;
    private int ram;
    private int memoria;
    private double valor;
    private double valorUso;

    Computador(String marca,int ram,int mem,double valor,double valorUso){
        this.marca=marca;
        this.ram=ram;
        this.memoria=mem;
        this.valor=valor;
        this.valorUso=valorUso;
    }
}
