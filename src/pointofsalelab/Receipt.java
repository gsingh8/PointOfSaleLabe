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
    
    LineItem[] lineItems;
    
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
    
    public void print(){};
    
    public void getTotal(){
        
        for(LineItem l:lineItems){
            System.out.println(l.getProduct() + " " + l.getQty() 
                    + " "  );
        }
    }
}
