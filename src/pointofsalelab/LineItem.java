/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public class LineItem {
    
    Product product;
    int qty;
    
    public LineItem(Product product, int qty){
        this.product = product;
        this.qty = qty;
    }
    
    public String getProduct(){
        return product.getProductDesc();
    }
    
    public int getQty(){
        return qty;
    }
    
    public double getPrice()
    {
        return product.getUnitCost();
    }
    
    public double discountedPrice(){
        return product.getDiscountedPrice();
     }
    
}
