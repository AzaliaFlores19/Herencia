/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

import java.util.ArrayList;

/**
 *
 * @author Azalia
 */
public class Tigo {
    
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
     boolean busqueda(int numeroTel, String datoExtra, String tipo){
          Plan planDado=buscarPlan(numeroTel);
          if(planDado!=null){
              return true;
          }
          return false;
     }
     
     
     void agregarPlan(int numeroTel,String nombre,String tipo){
         if(busqueda(numeroTel,"",tipo)==false){
             
         }
     }
     
     
    
}
