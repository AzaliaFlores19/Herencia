
package herencia1;

/**
 *
 * @author Miguel Medrano
 */
public abstract class PlanIPhone extends Plan  {
    
 private static Plan PlanesIphone[];
 private static int count;
 private String email;
 Plan plan;
 private int pago;
 
 
public PlanIPhone (int numero, String nombre,int minutos, int mensajes, String email){
    super(numero, nombre,minutos, mensajes);
    this.email=email;
     PlanesIphone = new Plan[100];
     count = 0;
}

public void PagoMensual (int minutos, int mensajes){
    
    pago=(int) (22+(minutos*0.4)+(mensajes*0.1));   
}


 
}
