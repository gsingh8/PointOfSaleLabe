/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public class POSStartup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CashRegister cr = new CashRegister();
           
        cr.startNewSale("123");
        
        cr.scanItem("A101", 3);
        cr.scanItem("B205", 5);
        cr.scanItem("C222", 1);
        
        cr.calcGrandTotal();
        cr.finalizeSale();
    }
}
