/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public class Receipt {
    
    private LineItem[] lineItems;
    private double total;
    private double totalBeforeDiscounts;
    private double totalAfterDiscounts;
    private double savings;
    
    public void addLineItem(Product product, int qty){
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public void printReceipt(){
        System.out.println("Thank you for shopping at Kohls!");
        
        double total = 0;
        
        for(LineItem l:lineItems){
            System.out.println(l.getProduct() + " " + l.getQty() 
                    + " " + l.getPrice());
            
            total += l.getPrice();
        }
        
        System.out.println();
        System.out.println("Total: $" + total);
     
    }
    
    public void calculateTotalAfterDiscounts(){
        
        double addDiscounts = 0;
        
        for(LineItem l: lineItems){
            addDiscounts += l.discountedPrice();
        }
        
        this.totalAfterDiscounts = addDiscounts;
        
    }
    
    public void calculateTotalBeforeDiscounts(){
        double total = 0;
        
        for(LineItem l: lineItems){
            total += l.getPrice();
        }
        
        this.totalBeforeDiscounts = total;
    }
      
    public double getSavings(){ 
        return totalBeforeDiscounts - totalAfterDiscounts;
    }
    

}
