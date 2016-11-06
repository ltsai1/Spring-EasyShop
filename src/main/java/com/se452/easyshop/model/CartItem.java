
package com.se452.easyshop.model;

/**
 *
 * @author Camille
 */
public class CartItem {
    private Product product;
    private int quantity;
    private double totalPrice;
    
    public CartItem(){}
    
    public CartItem(Product product, int quantity, double totalPrice){
        this.product = product;
        this.quantity = quantity;
         this.totalPrice = totalPrice;
    }

    public CartItem(Product product) {
        this.product = product;
        this.quantity = 1;
        this.totalPrice = product.getProductPrice();
    }
    
   public Product getProduct(){
       return product;
       
   }
   public void setProduct(Product p){
       product = p;
   }
   public int getQuantity(){
       return quantity;
       
   }
   public void setQuantity(int q){
       quantity = q;
   }
   public double getTotalPrice(){
       return totalPrice;
       
   }
   public void setTotalPrice(double t){
       totalPrice = t;
   }
    
    
    
    
    
    
    
    
    
    
}
