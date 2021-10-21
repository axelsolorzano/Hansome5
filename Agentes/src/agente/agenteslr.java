package agente;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import javax.swing.JOptionPane;

public class agenteslr extends Agent {
    
    helperarithmetic ha = new helperarithmetic();
    
    int sux = ha.Sumax();
    int suy = ha.Sumay();
    int suxy = ha.Sumaxy();
    int sux2 = ha.Sumax2();
    
    public float sacarb0(){
     
        float sacarb0=(sux2*suy-(sux*suxy))/(9*sux2-(sux*sux));
    
        return sacarb0;   
    }// sacarb0
    
    public float sacarb1(){
     
        float sacarb1=(9* suxy - (sux * suy)) / ( 9 * sux2 - (sux * sux));
    
        return sacarb1;
    }//sacarb1
    
    public void displayRegressioEquation(){
        
        System.out.println("Regression Equation y = B0 + B1 X1");
    }//displayRegressioEquation
    
    public float prediccion(float b0, float b1){
        
        float n= Float.parseFloat(JOptionPane.showInputDialog("Ingresa El Valor a Predecir")); 
        float prediccion= b0+b1*n;
        
        System.out.println("Predict: " + prediccion);
        
        return prediccion;
        
    }//prediccion
    
    @Override
    protected void setup(){
        
        System.out.println("Agent " + getLocalName() + " Started.");
        addBehaviour(new MyOneShotBehaviour());
        
    }//setup
    
    private class MyOneShotBehaviour extends OneShotBehaviour{
        
        @Override
        public void action(){
            
            agenteslr slr = new agenteslr();
        
            float b0 = slr.sacarb0();
            float b1 = slr.sacarb1();

            slr.displayRegressioEquation();
            slr.prediccion(b0,b1);
            
        }//Fin public void action
    
        @Override
        public int onEnd(){
            
            myAgent.doDelete();
            return super.onEnd();
            
        }//Fin public int onDelete
        
    }//Fin private class MyOneShotBehaviour
    
}//Fin public class SLR extends Agent
