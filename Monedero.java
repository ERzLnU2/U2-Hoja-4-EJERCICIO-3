/**
 * @author Daw120
 */
package com.solomongo.ejercicio3;
public class Monedero {
     public Monedero(){} //constructor, permite crear un monedero con una cantidad de dinero inicial   
     float inicial, meter, sacar, ver;
     public float getInicial(){return inicial;}//método para crear saldo inicial
     public float getMeter(){return meter;} //método para meter dinero en el monedero
     public float getSacar(){return sacar;} //método para sacar dinero en el monedero
     public float getVer(){return ver;}//método para consultar el disponible 
     public void setInicial(float inicial){this.inicial=inicial;} 
     public void setMeter(float meter){this.meter=meter;} 
     public void setSacar(float sacar){this.sacar=sacar;} 
     public void setSacar2(float sacar){this.sacar=sacar;} 
     public void setVer(float ver){this.ver=ver;} 
}
