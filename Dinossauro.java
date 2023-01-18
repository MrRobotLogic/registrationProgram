/* Alunos: 18200315 - Paulo Vinicius Pretto
 *         21180520 - rodrigo rampon basso
 *         Fundamentos De Programacao - turma 136 - 2021/1
*/
public class Dinossauro
{
    private int id;
    private int tipo;
    private int categoria;
    private String nomeRaca;
    private double peso;
    private double velocidade;
    
    public Dinossauro(int id, int tipo, int categoria, String nomeRaca, double peso, double velocidade){
        this.id=id;
        this.tipo=tipo;
        this.peso=peso;
        this.categoria=categoria;
        this.velocidade=velocidade;
    }
    public void setId(int id){
        this.id=id;
    }
    public void set(int tipo){
        this.tipo=tipo;
    }
    public void setCategoria(int categoria){
        this.categoria=categoria;
    }
    public void setNomeRaca(String nomeRaca){
        this.nomeRaca=nomeRaca;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public void setVelocidade(double velocidade){
        this.velocidade=velocidade;
    }
    public int getId(){
        return id;
    }
    public int getTipo(){
        return tipo;
    }
    public int getCategoria(){
        return categoria;
    }
    public String getNomeRaca(){
        return nomeRaca;
    }
    public double getPeso(){
        return peso;
    }
    public double getVelocidade(){
        return velocidade;
    }
    
}