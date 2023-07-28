
package herencia1;

/**
 *
 * @author Miguel Medrano
 */
public abstract class PlanIPhone extends Plan  {
    
 private String email;
 
public PlanIPhone (int numero, String nombre,int minutos, int mensajes, String email){
    super(numero, nombre,minutos, mensajes);
    this.email=email;
     
}

public double PagoMensual (int minutos, int mensajes){
    double PagoMensual = 22+(0.4 * minutos) +(0.1*mensajes);
    return PagoMensual;   
}

public void print(){
        super.imprimir();
        System.out.println("Email: "+email);
    }
    
    public String getEmail(){
        return email;
    }
 
}
