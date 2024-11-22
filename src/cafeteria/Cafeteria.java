/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeteria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosXl
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int tamaño = 0;
        int P = 0,M = 0,G = 0;
        int Pt = 0,Mt = 0,Gt = 0;
        int total = 0;
        int tt = 0;
        int clientes = 0;
        
        
        while  (true){
            
            
            
            
        
            
        //Comienzo
        tamaño=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el tamaño del cafe o terminar el dia\n"
         + "1. Pequeño = 45L.\n"
         + "2. Mediano = 56L. \n"
         + "3. Grande = 65L. \n"
         + "4. Ganancia del dia"));
        
        if (tamaño == 4) {
            JOptionPane.showMessageDialog(null, " Usted vendio el dia de hoy......IMPRIMIENDO.....\n"
         + "Cantidad: \n"          
         + "Pequeño = "+ P + ("\n")
         + "Mediano = "+ M + ("\n")
         + "Grande = "+ G + ("\n")
         + "Total del dia es: "+ total + ("\n")
         + "La cantidad de clientes atendidos es: "+ clientes )  ;
           break;
        
           
           
            
            
        }
        
        
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
        boolean mayorEdad = edad >= 60;
        double descuento = mayorEdad ? 0.15 : 0;
        
        switch (tamaño){
            
            case 1:{
                P++;
                clientes++;
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad "));
                Pt = (int) ((cantidad * 45) * (1 - descuento));
                JOptionPane.showMessageDialog(null, "El total es:" + Pt + ("\n")
                + "El descuento de la persona es: "+ descuento);
                tt = total ;
               total =  tt + Pt;
                
                break;
                
             
        }
            case 2:{
                M++;
                clientes++;
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad "));
                Mt = (int) ((cantidad * 56) * (1 - descuento));
                JOptionPane.showMessageDialog(null, "El total es:" + Mt + ("\n")
                + "El descuento de la persona es: "+ descuento);
                tt = total ;
               total =  tt + Mt;
                break;
                
            }
            case 3:{
                G++;
                clientes++;
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad "));
                Gt = (int) ((cantidad * 65) * (1 - descuento));
                JOptionPane.showMessageDialog(null, "El total es:" + Gt + ("\n")
                + "El descuento de la persona es: "+ descuento);
                tt = total ;
               total =  tt + Gt;
               
               break;
               
                
                
            }
        }
        
        
        
        
        }   
    }
    
}
