/* SUCESONES Artimeticas y Geometricas
El usuario ingresa 10 numeros de una sucesión, 
el programa determina si la sucesión es geométrica o aritmética.
El programa genera 20 numeros de esa serie y los muestra.
Además muestra la suma de n términos de la sucesión 
*/

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Sucesione2 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "SUCESIONES \ningrese los 10 primeros terminos de una sucesion");

        float sucesion[] = new float[20];
        boolean aritmetica = true;
        boolean geometrica = true;

        for (int i = 0; i < 10; i++) {
            sucesion[i] = Float.parseFloat(JOptionPane.showInputDialog("a(" + (i + 1) + ")= "));
        }
        System.out.println("sucesion:" + Arrays.toString(sucesion));

        // tipo de sucesion
        // aritmetica ?
        float incremento = sucesion[9] - sucesion[8];
        for (int i = 0; i < 8; i++) {
            if (sucesion[i + 1] - sucesion[i] != incremento) {
                aritmetica = false;
                break;
            }
        }
        // geometrica ?
        float razon = sucesion[9] / sucesion[8];
        for (int i = 0; i < 8; i++) {
            if (sucesion[i + 1] / sucesion[i] != razon) {
                geometrica = false;
                break;
            }
        }
        
        if (aritmetica == true && geometrica == true) {
            System.out.println("las Sucesiones de terminos iguales son Aritmeticas y Geometricas");
        }
        
        // sumatoria n primeros terminos
        String respuesta;
        int n;
        float Sn, sumatoria;
        
        if (aritmetica == true) {
            System.out.println("Sucesion ARITMETICA");
            for (int i = 10; i < 20; i++) {
                sucesion[i] = sucesion[i-1] + incremento;
            }
            System.out.println("sucesion:" + Arrays.toString(sucesion));
            do {
                n = Integer.parseInt(JOptionPane.showInputDialog("Sumatoria N primeros terminos \ningrese N: "));
                Sn = sucesion[0] + incremento * (n - 1);
                System.out.println("sucesion[" + n + "] = " + Sn);
                sumatoria = (sucesion[0] + Sn) * n / 2;
                System.out.println("Sumatoria " + n + " primeros terminos = " + sumatoria);
                respuesta = JOptionPane.showInputDialog("desea continuar (s/n) ?");
            } while (respuesta.equalsIgnoreCase("s"));
            
        } else if (geometrica == true) {
            System.out.println("Sucesion GEOMETRICA");
            for (int i = 10; i < 20; i++) {
                sucesion[i] = sucesion[i-1] * razon;
            }
            System.out.println("sucesion:" + Arrays.toString(sucesion));
            do {
                n = Integer.parseInt(JOptionPane.showInputDialog("Sumatoria N primeros terminos \ningrese N: "));
                Sn = (float) (sucesion[0] * Math.pow(razon,(n-1)));
                System.out.println("sucesion[" + n + "] = " + Sn);
                sumatoria = (float) (sucesion[0] * (Math.pow(razon,n) - 1) / (razon - 1));
                System.out.println("Sumatoria " + n + " primeros terminos = " + sumatoria);
                respuesta = JOptionPane.showInputDialog("desea continuar (s/n) ?");
            } while (respuesta.equalsIgnoreCase("s"));
            
        } else {
            System.out.println("la sucesion:" + Arrays.toString(sucesion));
            System.out.println("NO es Aritmetica NI Geometrica ...");
        }

    }

}
