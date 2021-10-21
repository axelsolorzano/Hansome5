package agente;

public class helperarithmetic {
       
    dataset dato = new dataset();
       
    int [] aux = dato.getMatrizx();
    int [] auy = dato.getMatrizy();
    int [] auxy = dato.getMatrizxy();
    int [] aux2 = dato.getMatrizx2();
    
    int sumax;
    int sumay;
    int sumaxy;
    int sumax2;
    
    public int Sumax(){
            
        for(int i = 0; i < 9; i++){

            sumax = aux[i] + sumax;
        }

        return sumax;           
    }// Sumax
    
    public int Sumay(){
            
        for(int i = 0; i < 9; i++){

            sumay = auy[i] + sumay;
        }

        return sumay;           
    }//Sumay
    
    public int Sumaxy(){
            
        for(int i = 0; i < 9; i++){

            sumaxy = auxy[i] + sumaxy;
        }

        return sumaxy;           
    }//Sumaxy
    
    public int Sumax2(){
            
        for(int i = 0; i < 9; i++){

            sumax2 = aux2[i] + sumax2;
        }

        return sumax2;           
    }//Sumax2
    
}//HelperArithmetic