/* programa que genera la Serie de FIBONACCI
   el usuario ingresa el numero de terminos que desea mostrar
 */

import javax.swing.JOptionPane;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("FIBONACCI");
        System.out.print("Fn = ");
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Serie de FIBONACCI \n"
                + "ingrese la cantidad de terminos a mostrar: "));
        
        for (int i = 0; i < n; i++) {
            int fn = fibonacci(i);
            System.out.print(fn + " ");
        }
        
        System.out.println("");

    }
    
    // funcion recursiva
    public static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        } else {
            return fibonacci(i-1) + fibonacci(i-2);
        }
    }

}
