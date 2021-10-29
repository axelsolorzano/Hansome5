package agente;

public class helperarithmetic {
    
    dataset dato = new dataset();
    Calculo cl = new Calculo();
    
    int [] aux = dato.getx();
    int [] auy = dato.gety();
    
    int [] auxy = cl.Calcularxy();
    int [] aux2 = cl.Calcularx2();
    
    int sumax;
    int sumay;
    int sumaxy;
    int sumax2;
    
    public int sumatoriax(){
        
        for(int i = 0; i < 9; i++){            
            sumax = aux[i] + sumax;           
        }
        
        return sumax;       
    }//sumatoriax
    
    public int sumatoriay(){
        
        for(int i = 0; i < 9; i++){            
            sumay = auy[i] + sumay;           
        }
        
        return sumay;        
    }//sumatoriay
    
    public int sumatoriaxy(){
        
        for(int i = 0; i < 9; i++){            
            sumaxy = auxy[i] + sumaxy;            
        }
        
        return sumaxy;       
    }//sumatoriaxy
    
    public int sumatoriax2(){
        
        for(int i = 0; i < 9; i++){           
            sumax2 = aux2[i] + sumax2;           
        }
        
        return sumax2;        
    }//sumatoriaxy   
}//helperarithmetic