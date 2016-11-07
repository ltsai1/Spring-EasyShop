
package com.se452.easyshop.model;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
/**
 *
 * @author Camille
 */

@Entity
public class CartItem implements Serializable{
    
    private static final long serialVersionUID = -904360230041854157L;
    
    @Id
    @GeneratedValue
    private int cartItemId;

    @ManyToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    
    private int quantity;
    private double totalPrice;
    
    
     public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }
    
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
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
