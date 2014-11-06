
package bol7ej7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bol7Ej7 {

    public static void main(String[] args) {
        int opc;
        double num1, num2;
        Calcular obj1 = new Calcular();
        String opcion =  JOptionPane.showInputDialog("Introduzca que desea hacer:\n1- Area de un cuadrado\n2- Area de un triángulo\n3- Area de un círculo");
        opc  = Integer.parseInt(opcion);
        
            switch (opc){
                case 1: 
                    String respuesta = JOptionPane.showInputDialog("Introduzca el lado:");
                    num1 = Double.parseDouble(respuesta);
                    JOptionPane.showMessageDialog(null,obj1.AreaCuadrado(num1));
                    break;
                case 2:
                    String respuesta2 = JOptionPane.showInputDialog("Introduzca la base:");
                    num1 = Double.parseDouble(respuesta2);
                    String respuesta3 = JOptionPane.showInputDialog("Introduzca la altura:");
                    num2 = Double.parseDouble(respuesta3);
                    JOptionPane.showMessageDialog(null,obj1.AreaTriangulo(num1,num2));
                    break;
                case 3:
                    String respuesta4 = JOptionPane.showInputDialog("Introduzca el radio:");
                    num1 = Double.parseDouble(respuesta4);
                    JOptionPane.showMessageDialog(null,obj1.AreaCirculo(num1));
                    break;
                default:
            JOptionPane.showMessageDialog(null,"Introduzca un valor válido del uno al tres");
            }
            
        
            
        
        
        
    }
    
}
