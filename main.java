/**
 * 
 * @author Daw120
 * 
 * 3.- Define una clase 'Monedero' que permita gestionar la cantidad de dinero de que 
       una persona dispone en un momento dado. La clase deberá tener:
       
      • Un constructor que permitirá crear un monedero con una cantidad de dinero inicial.
      
      • Un método para meter dinero en el monedero.
      
      • Otro para sacarlo.
      
      • Y finalmente, otro para consultar el disponible.
    
    * Solo podrá conocerse la cantidad de dinero del monedero a través de este último método. 
    
    * Por supuesto, no se podrá sacar más dinero del que haya en un momento dado en el monedero.

   - Ejemplo de ejecución:

   creo mi monedero con 20 euros
   Añado al monedero 10,4 euros
   tienes = 30,40
   Intento sacar 50 euros
   No hay saldo suficiente
   tienes = 30,40
   Intento sacar 20 euros
   tienes = 10,40
 */
package com.solomongo.ejercicio3;
public class Ejercicio3 {
    public static void main(String[] args) { 
    Monedero cantidad=new Monedero(); 
  
 cantidad.setInicial(20);
 cantidad.setMeter((float) 10.4); 
 cantidad.setVer(000);
 cantidad.setSacar(50); 
 
System.out.printf("\ncreo mi monedero con: %,.2f",cantidad.getInicial());
System.out.printf(" euros. \nAnado al monedero %,.2f",cantidad.getMeter());  
float actual = (cantidad.getInicial())+(cantidad.getMeter());
System.out.printf(" euros. \ntienes = %,.2f",(cantidad.getInicial())+(cantidad.getMeter())); 
System.out.print("\nIntento sacar "+cantidad.getSacar());

if (actual < cantidad.getSacar()) {
 cantidad.setSacar(20); 
 cantidad.setVer(000); //10.40
    System.out.print(" euros. \nNo hay saldo suficiente."); 
    System.out.printf("\ntienes = %,.2f",actual); 
    System.out.print("\nIntento sacar "+cantidad.getSacar()); 
    System.out.printf(" euros. \ntienes = %,.2f",(actual-cantidad.getSacar()));
    } 

  }
}
