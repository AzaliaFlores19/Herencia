
package herencia1;

import java.util.ArrayList;

/**
 *
 * @author Ruth Reyes
 */
public abstract class PlanSamsung extends Plan {
    
    //Atributos
    public String Pin,pinamig;
 ArrayList<String>bbm;
    public String email;


    
    
    public PlanSamsung(int numero, String nombre,String pin,int minutos, int mensajes){ 
        
     super(numero,nombre,minutos,mensajes);
       Pin = pin;
       bbm = new ArrayList<>();
        
    }

    @Override
    public double pagoMensual(int minutos, int mensajes) {
      
        double costoMinAd=0.8,costoMsgAd=0.2,cobro= 40.0,totalMinutos,totalMensajes;
        int mingratis = 200,msgsgratis= 300;

int minConsumidos = this.getminutos();
int menConsumidos = this.getmensajes() ;

// Cálculo de minutos adicionales
int minAdicionales,menAdicionales;
if (minConsumidos > mingratis) {
    minAdicionales = minConsumidos - mingratis;
} else {
    minAdicionales = 0;
}
// Cálculo de mensajes adicionales
if (menConsumidos > msgsgratis) {
    menAdicionales = menConsumidos - msgsgratis;
} else {
    menAdicionales = 0;
}        
 totalMinutos = costoMinAd * mingratis;
 totalMensajes = costoMsgAd * menAdicionales;
       
  return cobro + totalMinutos + totalMensajes;
      
    }

public void agregarPinAmigo(String pinamig) {

    
    for(int i=0;i<bbm.size();i++){
    if (bbm.get(i).equals(pinamig)) {
        
        bbm.add(pinamig);
         
        }
    }
}
     public void imprimir() {
        super.imprimir();
        System.out.println("Pin: " + Pin);
    }
     public String getEmail() {
        return email;
    }
    
     public String getPin() {
        return Pin;
    }
      
}
