/* Alunos: 18200315 - Paulo Vinicius Pretto
 *         21180520 - rodrigo rampon basso
 *         Fundamentos De Programacao - turma 136 - 2021/1
*/
public class CadastroDinossauro
{
    Dinossauro dinos [] = new Dinossauro [100];
    public boolean adicionarDinossauro(Dinossauro dino){
        boolean confirm = false;
        for(int x=99; x>=0; x--){
            if(dinos[x] == null){
                dinos[x] = dino;
                confirm = true;
            }
        }
        if(confirm != true)
            confirm = false;
        return confirm;
    }
    public Dinossauro pesquisarDinossauro(int id){
        boolean existe = false;
        Dinossauro dino = null;
        for(int x=0; x<=99; x++){
            if(id == dinos[x].getId()){
                existe = true;
                dino = dinos[x];
            }
        }
        if(existe == false)
            return null;
        else
            return dino;  
    }
    public boolean removerDinossauro(int id){
        boolean existe = false;
        for(int x=0; x<=9; x++){
            if(id == dinos[x].getId()){
                dinos[x] = null;
            }
        }
        if(existe == true)
            return true;
        else
            return false;
    }
    public String dinosNoParque(){
        int [][] dino = new int [2][3];
        for(int x=0; x<=2; x++){    for(int y=0; x<=1; x++)     dino[x][y] = 0;}
        
        for(int x=0; x<=99; x++){
            if(dinos[x].getTipo() == 1){
               for(int y=1; y<=3; y++){
                   if(dinos[x].getCategoria() == x)
                       dino[0][x-1] = dino[0][x-1] + 1;
               }
            }
            if(dinos[x].getTipo() == 2){
                for(int y=1; y<=3; y++){
                   if(dinos[x].getCategoria() == x)
                        dino[1][x-1] = dino[1][x-1] + 1;
                }
            }
        }
        return "Carnívoros: PP:"+dino[0][0]+" MP:"+dino[0][1]+" GP:"+dino[0][2]+" Herbívoros: PP:"+dino[1][0]+" MP:"+dino[1][1]+" GP: "+dino[1][2]; 
    }
    public Dinossauro pesoPesado(int tipo, int categoria){
        double peso = 0;
        Dinossauro dino = null;
        for(int x=0; x<=99; x++){
            if(dinos[x].getTipo() == tipo && dinos[x].getCategoria() == categoria){
                if(dinos[x].getPeso() > peso){
                    peso = dinos[x].getPeso();
                    dino = dinos[x];
                }   
            }
        }
        return dino;
    }
    public double comidaCarnivoros(){
        double comida = 0;
        for(int x=0; x<=99; x++){
            if(dinos[x].getTipo() == 1){
                for(int y=1; y<=3; y++){
                    if(dinos[x].getCategoria() == y){
                        comida = comida + (dinos[x].getPeso() * 0.1) + (dinos[x].getPeso() * ((y-1)*0.05));
                    }
                }
            }
        }
        comida = comida * 30;
        return comida;
    }
    public boolean run(int id, double dDinoBuncker, double dPessoaBunker){
        double dinoSpeed = 0;
        for(int x=0; x<=99; x++){
            if(dinos[x].getId() == id){
                dinoSpeed = dinos[x].getVelocidade();
            }
        }
        if(dinoSpeed == 0)
            return true;
        else if(dDinoBuncker/dinoSpeed < dPessoaBunker/20)
            return true;
        else 
            return false;
            
        }       
    }

