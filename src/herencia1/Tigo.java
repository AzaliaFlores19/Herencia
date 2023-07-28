
package herencia1;

import java.util.ArrayList;

/**
 *
 * @author Azalia
 */
public class Tigo {
    PlanSamsung samsung;
    PlanIPhone Iphone;
    
    public int numeroTel;
    public String nombre;
    public String tipo;
     private ArrayList<Plan>ListaPlanes;
     
     public Tigo(){
      ListaPlanes=new ArrayList<>(); 
    }
     
     public Plan buscarPlan(int numeroTel){
         for (Plan plan : ListaPlanes) {
            if (plan.getnumero() == numeroTel) {
                return plan;
            }
        }
        return null;  
     }
     
     
      /**private Plan buscarPlanExtraTipo(String datoExtra, String tipo) {
        for (Plan plan :ListaPlanes) {
            if (plan.getTipo() == tipo && plan.getExtra().equals(datoExtra)) {
                return plan;
            }
        }
        return null;
    }
    * **/

     //busqueda
    public boolean busqueda(int numeroTel, String datoExtra, String tipo){
          Plan planDado=buscarPlan(numeroTel);
          if(planDado!=null){
              return true;
          }
          return false;
     }
     
     
     /**public void agregarPlan(int numerotel, String nombre, String extra, String tipo){
          if (buscarPlan(numeroTel) != null) {
            System.out.println("Error: El número telefónico o el dato extra ya existen.");
            return;
        }

        Plan plan;
        if (tipo.equals("IPHONE")) {
            plan = new PlanIPhone(numeroTel,nombre,extra);
        } else if (tipo.equals("SAMSUNG")) {
            plan = new PlanSamsung(numeroTel, nombre, extra);
        } else {
            System.out.println("Error: Tipo de plan inválido.");
            return;
        }

        ListaPlanes.add(plan);
        
         
     }
     * **/
     
     public double pagoPlan(int numeroTel, int mins, int msgs) {
        Plan plan = buscarPlan(numeroTel);
        if (plan != null) {
            return plan.pagoMensual(mins, msgs);
        } else {
            System.out.println("El número telefónico no está registrado.");
            return 0.0;
        }
    }

     
     
    
}

