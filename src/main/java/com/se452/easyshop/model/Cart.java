package com.se452.easyshop.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

import java.util.Map;
/**
 *
 * @author Camille
 */


public class Cart implements Serializable{

    private static final long serialVersionUID = -7103653009861995545L;
    
    private String cartId;
    
    //@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Map<String, CartItem> cartItems;
    private double grandTotal;
    
    
    private Cart(){
        cartItems = new HashMap<String, CartItem>();
        grandTotal = 0;
    }
    
    public Cart(String cartId){
        this();
        this.cartId = cartId;
    }
  
    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }
   

    public Map<String, CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(HashMap<String, CartItem> cartItems) {
        this.cartItems = cartItems;
    }
   
   public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
   
    public void addCartItem(CartItem item){
       String productId = Integer.toString(item.getProduct().getProductId());
       
       if(cartItems.containsKey(productId)){
           CartItem existingCartItem = cartItems.get(productId);
           existingCartItem.setQuantity(existingCartItem.getQuantity() + item.getQuantity());
           cartItems.put(productId, existingCartItem);
       }
       else{
           cartItems.put(productId, item);
       }
       
       updateGrandTotal();
       
   }
   
   
   
   
   public void removeCartItem(CartItem item){
       String productId = Integer.toString(item.getProduct().getProductId());
       cartItems.remove(productId);
       updateGrandTotal();
       
   }
   
   public void updateGrandTotal(){
       grandTotal =0;
       for(CartItem item: cartItems.values()){
           grandTotal = grandTotal + item.getTotalPrice();
       }
   }
       
   
   
   
   
   
   
   
   
   
   
   
   
   
}
