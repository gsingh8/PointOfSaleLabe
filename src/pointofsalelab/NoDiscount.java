/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public class NoDiscount implements DiscountStrategy{

    
    @Override
    public double costAfterDiscount(double unitPrice, int qty) {
        return 0;
    }
    
}
    

