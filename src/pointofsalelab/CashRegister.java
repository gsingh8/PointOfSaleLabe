/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public class CashRegister {
    
    Customer[] customers = {  
        new Customer("123","John Smith"),
        new Customer("456","Gautam Singh")
    };
    
    Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new XmasDiscount()),
        new Product("B205", "Men's Dress Shirt", 35.50, new XmasDiscount()),
        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
    };
            
    Receipt receipt;
    Customer customer;
    
    public CashRegister(){
        
    }
    
    public void startNewSale(String customerId){
        
        receipt = new Receipt();
        receipt.lineItems = new LineItem[0];
        
    }
        
    public void scanItem(String prodId, int qty) {
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        
         if(product != null) {
            receipt.addLineItem(product, qty);
         }
    }
    
    public void calcGrandTotal(){
            
            System.out.println("Grand total:");
            System.out.println();
            receipt.getTotal();
            
    }
      
    
    public void finalizeSale(){
    
        receipt.print();
    
    };
    
}
