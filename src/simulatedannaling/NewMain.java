/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulatedannaling;

/**
 *
 * @author MANUEL
 */
public class NewMain {
                                                     
public static double funcion (double x){
    return x*x;

} 
    public static void main(String[] args) {
        System.out.println("LU  ");
        double aleatorio;
        double Temperatura=1000;
       double  xinicial=100;
        double xnuevo =0;
       // for(int i=1;i<=1;i++){
        for(int j=1;j<=1;j++){
        aleatorio=Math.random();
        if(aleatorio<=0.5)
        xnuevo=xinicial+0.1;
        else
        xnuevo=xinicial-0.1;
        if(xnuevo>=10)
        xnuevo=10;
        if(xnuevo<0)
        xnuevo=0;
        double delta =funcion(xnuevo)-funcion(xinicial);
             if (delta>=0)
            xinicial=xnuevo;
        else {
        double alet=Math.random();
                if(alet<Math.exp(delta/Temperatura))
            xinicial=xnuevo;
                
        }
             
        }
        Temperatura=Temperatura*0.95;
           System.out.println("||"+xinicial+"||"+funcion(xinicial)+"||");        
                
      //  }
        
 // TODO code application logic here
    }
    
}
