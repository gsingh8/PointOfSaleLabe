/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public class XmasDiscount implements DiscountStrategy {

    private final double discount = .10;
    @Override
    public double costAfterDiscount(double unitPrice, int qty) {
        return unitPrice * qty * discount;
    }
    
}
