
package CajeroSistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Paracare
 */
public class VisualATM {
    
    public static double saldoActual;

    public VisualATM() {
        saldoActual=0;
    }
    
    public static void depositar(double deposito){
        saldoActual += deposito;
    }
    
    public static void retirar(double retiro){
        if(saldoActual >= retiro){
            saldoActual -= retiro;
        }
        else{
            JOptionPane.showMessageDialog(null, "Alerta, Saldo insuficinte");
        }
    }
    
    public double determinarSaldo(){
        return saldoActual;
    }
    
}
