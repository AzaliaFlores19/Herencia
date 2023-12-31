
package herencia1;

/**
 *
 * @author Miguel Medrano
 */
public abstract class Plan {
    
    private int numero, minutos, mensajes;
    private String nombre;
    
     public Plan(int numero, String nombre, int minutos, int mensajes) {
        this.numero=numero;
        this.nombre=nombre;
        this.minutos=minutos;
        this.mensajes=mensajes;
        
        
     }
     
      public int getnumero(){
         return numero;
     }
     
     public String getnombre() {
        return nombre;
    }
     
      public int  getminutos() {
        return minutos;
    }
      
       public int getmensajes() {
        return mensajes;
    }
       
    public abstract void getTipo();

    public abstract double pagoMensual(int minutos,int mensajes);
    
    void imprimir (){
        System.out.println("\nNombre del Cliente: "+nombre+"\nNumero del cliente: "+numero);
    }
    
    
}
