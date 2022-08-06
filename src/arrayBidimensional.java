import javax.swing.*;

public class arrayBidimensional {
    public static void main(String[] args) {
        String nombre;
        String direccion;
        String telefono;
        int posicionGuardar;
        int posicionConsultar;
        String sobreescribir;
        String[][] libreta = new String[5][3];
        boolean continuar = true;
        while (continuar) {
            String menu = JOptionPane.showInputDialog("1. guardar contacto \n" +
                    "2. consultar contaco \n" +
                    "3. borrar contacto \n" +
                    "4. salir");
            switch (menu) {
                case "1":
                    nombre = JOptionPane.showInputDialog("ingrese el nombre");
                    telefono = JOptionPane.showInputDialog("ingrese el telefono");
                    direccion = JOptionPane.showInputDialog("ingrese la direccion");
                    posicionGuardar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion a guardar"));

                    if (posicionGuardar < 0 || posicionGuardar > 4) {
                        JOptionPane.showMessageDialog(null, "la posicion seleccionada no es valida");

                    } else if (libreta[posicionGuardar][0] != null) {
                        sobreescribir = JOptionPane.showInputDialog(null, "en la posicion seleccionada se encuentran datos existentes, desea sobreescrbir?\n s-si\n n-no");

                        if (sobreescribir.equals("s")) {
                            libreta[posicionGuardar][0] = nombre;
                            libreta[posicionGuardar][1] = telefono;
                            libreta[posicionGuardar][2] = direccion;
                            JOptionPane.showMessageDialog(null, "Se sobreescribio el contacto correctamente en la posicion  " + posicionGuardar);
                        } else {
                            JOptionPane.showMessageDialog(null, "no se realizo ningun cambio");
                        }

                    } else {

                        libreta[posicionGuardar][0] = nombre;
                        libreta[posicionGuardar][1] = telefono;
                        libreta[posicionGuardar][2] = direccion;

                        JOptionPane.showMessageDialog(null, "El contacto se guardo en la posicion " + posicionGuardar);

                    }
                    break;

                case "2":
                    posicionConsultar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion a consultar"));
                    if (posicionConsultar < 0 || posicionConsultar > 4) {
                        JOptionPane.showMessageDialog(null, "La posicion seleccionada no es valida");
                    } else {
                        if (libreta[posicionConsultar][0] == null) {
                            JOptionPane.showMessageDialog(null, "No se ha encontrado ningun contacto guardado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nombre " + libreta[posicionConsultar][0] +
                                    "\nTelefono: " + libreta[posicionConsultar][1] +
                                    "\nDireccion: " + libreta[posicionConsultar][2]);
                        }
                    }
                    break;
                case "3":
                    int posicionBorrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a borrar"));

                    if (posicionBorrar < 0 || posicionBorrar > 4) {
                        JOptionPane.showMessageDialog(null, "la posicion seleccionada no es valida");

                    } else {

                        libreta[posicionBorrar][0] = null;
                        libreta[posicionBorrar][1] = null;
                        libreta[posicionBorrar][2] = null;
                        JOptionPane.showMessageDialog(null, "el contacto se elimino correctamente");
                    }

                    break;
                case "4":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "por favor lea bien e ingrese una opcion valida");

            }
        }
    }
}
