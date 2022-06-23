// Actividad N° 5 - SUCESIONES ARITMETICAS
// an = a1 + (n-1) * d

import javax.swing.JOptionPane;

public class Sucesiones {

    public static void main(String[] args) {

        // variables
        int k, ak, n, an, d;

        // menu
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("SUCESIONES ARITMETICAS \n"
                    + "ingresar: \n"
                    + "1) a1 y d \n"
                    + "2) ak y d \n"
                    + "3) 2 terminos \n"
                    + "4) Salir"));

            switch (opcion) {
                case 1:
                    ak = Integer.parseInt(JOptionPane.showInputDialog("ingrese el 1er. VALOR de la sucesion: "));
                    d = Integer.parseInt(JOptionPane.showInputDialog("ingrese el INCREMENTO de la sucesion: "));
                    sucesion(ak,d);
                    break;
                    
                case 2:
                    k = Integer.parseInt(JOptionPane.showInputDialog("ingrese la POSICION del valor en la sucesion: "));
                    ak = Integer.parseInt(JOptionPane.showInputDialog("ingrese el " + k + "° VALOR de la sucesion: "));
                    d = Integer.parseInt(JOptionPane.showInputDialog("ingrese el INCREMENTO de la sucesion: "));
                    // el 1er valor es
                    ak = ak - (k - 1) * d;
                    sucesion(ak,d);
                    break;
                case 3:
                    k = Integer.parseInt(JOptionPane.showInputDialog("ingrese la POSICION de 'un valor' en la sucesion: "));
                    ak = Integer.parseInt(JOptionPane.showInputDialog("ingrese el " + k + "° VALOR de la sucesion: "));
                    n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la POSICION de 'OTRO valor' en la sucesion: "));
                    an = Integer.parseInt(JOptionPane.showInputDialog("ingrese el " + n + "° valor de la sucesion: "));
                    d = (an - ak) / (n - k);
                    ak = ak - (k - 1) * d;
                    sucesion(ak,d);
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opcion NO VALIDA ...");
            }
        } while (opcion != 4);

    }
    

    // metodos -------------------------------------------------------------------------------------------------
    public static void sucesion(int ak, int d) {
        String a1 = String.valueOf(ak);
        String sucesion = a1;
        for (int i = 1; i < 10; i++) {
            ak = ak + d;
            sucesion = sucesion + ", " + String.valueOf(ak);
        }
        sucesion = sucesion + ", ...";
        String n = JOptionPane.showInputDialog(null, "SUCESION aritmetica \n" + 
                                            "an = " + a1 + " + " + String.valueOf(d) + " * (n-1) \n" + 
                                            "      = " + sucesion + "\n\n" + 
                                            "si desea conocer otro termino de la sucesion ingrese su POSICION, \n" +
                                            "o ingrese cero '0' para finalizar ...");
        if (!n.equals("0")) {
            int an = Integer.parseInt(a1) + d * (Integer.parseInt(n) - 1);
            JOptionPane.showMessageDialog(null, "SUCESION aritmetica \n" + 
                                            "an = " + a1 + " + " + String.valueOf(d) + " * (n-1) \n" + 
                                            "      = " + sucesion + "\n\n" + 
                                            "a" + n + " =  " + String.valueOf(an));
        }
        
    }

}
