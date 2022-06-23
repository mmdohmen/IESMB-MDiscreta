
import java.util.Arrays;
import javax.swing.JOptionPane;

/* programa que genera la Serie de FIBONACCI
   el usuario ingresa el numero de terminos que desea mostrar
 */
public class FibonacciMD {

    public static void main(String[] args) {

        System.out.println("FIBONACCI");
        System.out.print("Fn = ");
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Serie de FIBONACCI \n"
                + "ingrese la cantidad de terminos a mostrar: "));
        
        int fibonacci[] = new int[n];

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1 + " " + 1);
        } else if (n > 2) {
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            }
            System.out.println(Arrays.toString(fibonacci));
        }

    }

}
