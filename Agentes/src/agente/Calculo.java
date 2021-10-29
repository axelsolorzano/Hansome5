
 package agente;

import static java.lang.Math.pow;

public class Calculo {   
    dataset dato = new dataset();
    
    int [] aux = dato.getx();
    int [] auy = dato.gety();
    int [] auxy = new int [9];
    int [] aux2 = new int [9];
    
    public int [] Calcularxy(){
        
        for(int i = 0; i < 9; i++){            
            auxy[i] = aux[i] * auy[i];           
        }
        
        return auxy;        
    }//Calcularxy
    
    public int [] Calcularx2(){
        
        for(int i = 0; i < 9; i++){     
            aux2[i] = (int) pow((aux[i]), 2);
        }
        
        return aux2;
    }//Calcularx2
}//Calculo