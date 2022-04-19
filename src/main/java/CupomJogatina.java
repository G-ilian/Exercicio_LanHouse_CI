import lombok.Data;

@Data
public class CupomJogatina {
    private String nomeCupom;
    private double valor;

    public CupomJogatina(String nome, double val){
        this.nomeCupom=nome;
        this.valor=val;
    }

}
