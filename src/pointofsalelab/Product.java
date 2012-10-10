/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalelab;

/**
 *
 * @author Gautam
 */
public class Product {
   private String productID;
   private String productDesc;
   private double unitCost;
   
   private double discountedPrice;
   
   DiscountStrategy discount;
   
   public Product(String productId, String productDesc, 
           double unitCost, DiscountStrategy discount){
       this.productID = productId;
       this.productDesc = productDesc;
       this.unitCost = unitCost;
       this.discount = discount;
       this.discountedPrice = this.discount.costAfterDiscount(this.unitCost);
   }
   
   public String getProdId(){
       return productID;
   }
   
   public String getProductDesc(){
       return productDesc;
   }
   
   public Double getUnitCost(){
       return unitCost;
   }
   
   public double getDiscountedPrice(){
       return discountedPrice;
   }
}
