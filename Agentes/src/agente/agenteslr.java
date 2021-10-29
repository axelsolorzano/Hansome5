package agente;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class agenteslr extends Agent {
    
    @Override
    protected void setup(){
        
        System.out.println("Agent " + getLocalName() + " Started.");
        addBehaviour(new MyOneShotBehaviour());
        
    }//Fin protected void setup
    
    private class MyOneShotBehaviour extends OneShotBehaviour{
        
        @Override
        public void action(){
            
            slr slr = new slr();
        
            int sumax = slr.sumax();
            int sumay = slr.sumay();
            int sumaxy = slr.sumaxy();
            int sumax2 = slr.sumax2();
            
            float b0 = slr.sacarB0();
            float b1 = slr.sacarB1();

            System.out.println();
            
            System.out.println("B0: " +b0);
            System.out.println("B1: " +b1);
            System.out.println();
            
            System.out.println("Sumax: " +sumax);
            System.out.println("Sumay: " +sumay);
            System.out.println("Sumaxy: " +sumaxy);
            System.out.println("Sumax2: " +sumax2);
            System.out.println("");
            
            slr.displayRegressioEquation();
            System.out.println("");
            slr.Prediccion(b0,b1);            
        }//action
    
        @Override
        public int onEnd(){
            
            myAgent.doDelete();
            return super.onEnd();
            
        }//onDelete
    }//MyOneShotBehaviour
}//agenteslr