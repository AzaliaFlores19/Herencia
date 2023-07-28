/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

/**
 *
 * @author Miguel Medrano
 */
public abstract class Plan {
    
    private int numero;
    private String nombre;
    
     public Plan(int numero, String nombre) {
        this.numero=numero;
        this.nombre=nombre;
     }
     
      public int getnumero(){
         return numero;
     }
     
     public String getnombre() {
        return nombre;
    }
     
    public abstract double pagoMensual(int minutos,int mensajes);
    
    void imprimir (){
        System.out.println("\nNombre del Cliente: "+nombre+"\nNumero del cliente: "+numero);
    }
    
    
}
