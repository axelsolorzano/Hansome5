
package agente;
import javax.swing.JOptionPane;

public class slr{
    
    helperarithmetic ha = new helperarithmetic();
    
    int sumax = ha.sumatoriax();
    int sumay = ha.sumatoriay();
    int sumaxy = ha.sumatoriaxy();
    int sumax2 = ha.sumatoriax2();
    
    float sacarB0 = 0;
    float sacarB1 = 0;
    float Prediccion;
    
    public float sacarB0(){
        
        sacarB0 = (sumax2*sumay-(sumax*sumaxy))/(9*sumax2-(sumax*sumax));
        return sacarB0;
    }//sacarB0
    
    public float sacarB1(){
        
        sacarB1 = (9*sumaxy-(sumax*sumay))/(9*sumax2-(sumax*sumax));
        return sacarB1;
    }//sacarB1
    
    public float Prediccion(float b0, float b1){
        
        float n = Float.parseFloat(JOptionPane.showInputDialog("Ingresa El Valor a Predecir"));
        Prediccion = (n*b1)+b0;
        
        System.out.println("Prediction: " + String.format("%.3f", Prediccion));
        return Prediccion;
    }//Predicction
    
    public void displayRegressioEquation(){
        
        System.out.println("Regression Equation y = B0 + B1 X1"); 
    }//displayRegressioEquation
   
    public int sumax(){
        
        return sumax;
        
    }//Fin public int sumax
    
    public int sumay(){
        
        return sumay;       
    }//sumay
    
    public int sumaxy(){
        
        return sumaxy;        
    }//sumaxy
    
    public int sumax2(){
        
        return sumax2;      
    }//sumax2   
}//slr
