/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author NATALYVARGAS
 */
public class SalidaMoto {

    public static double calcularPrecio(int numMinutos) {
        double precio = 0, precioResto;
        int restoMinutos;
    int dias;
    if(numMinutos<=60){
        if(numMinutos<=60){
            precio=numMinutos*77;
        }
        else{
            precio=(60*77);
            if(precio>=4.620){
                precio=4.620;
            }
        }
    }
    else{
        dias=numMinutos/60;
        restoMinutos=numMinutos%60;
        precioResto=restoMinutos*77;
        if(precioResto>=4.620){
            precioResto=4.620;
        }
        double numHoras = 0;
        precio=numHoras*4.620+precioResto;
    }
    return precio;
    }
    
    private String placa;

    public String obtenerPlaca() {
        return placa;
    }

    public void modificarPlaca(String placa) {
        this.placa = placa;
    }
    public static int sumarCupo() {
        int a = 30 + 1;
        return a;
    }
    
    public static void main(String args[]){
        int numMinutos=0;
        double precioTotal=0;
        Scanner sc=new Scanner (System.in);
       System.out.println("Cantidad de minutos: ");
       numMinutos=sc.nextInt();
       precioTotal=calcularPrecio(numMinutos);
       System.out.println("Total a pagar "+precioTotal);
    }
    
}
