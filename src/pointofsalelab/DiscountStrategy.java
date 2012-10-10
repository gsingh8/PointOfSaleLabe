/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public interface DiscountStrategy {
    
    public abstract double costAfterDiscount(double unitPrice, int qty);
    
}
