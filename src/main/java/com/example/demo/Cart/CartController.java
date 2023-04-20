package com.example.demo.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
public class CartController {
    @Autowired
    CartRepository cartRepository;

    @RequestMapping(path = "/cart", method = RequestMethod.GET)
    public Iterable<Cart> fetchCartItems(){return cartRepository.findAll(); }

    @RequestMapping(path = "/addToCart", method = RequestMethod.POST)
    public void addCartItems(@RequestBody Cart cartItem){

        //find cartItem in db -> compare w Request body value
        Cart dbCartItem = cartRepository.findByName(cartItem.getName());

        //item not already added to cart db table -> save
        if (dbCartItem == null){
            System.out.println("Adding item to cart...");
            cartRepository.save(cartItem);
        }else{ //item already in cart db table -> update qty
            System.out.println("Item Already In Cart!");
        }
    }

    @RequestMapping(path = "/incrementQty", method = RequestMethod.PUT)
    public void incrementItemQty(@RequestBody Cart cartItem){
        cartRepository.save(cartItem);
    }

    @RequestMapping(path = "/decrementQty", method = RequestMethod.PUT)
    public void decrementItemQty(@RequestBody Cart cartItem){

        //if user decrements item qty to 0 on client side -> delete item from cart db table
        if (cartItem.getQty() == 0){
            cartRepository.delete(cartItem);
        }else{//else update cart db table w/ qty
            cartRepository.save(cartItem);
        }
    }

    @RequestMapping(path = "/resetCart", method = RequestMethod.DELETE)
    public void resetCart(){
        cartRepository.deleteAll();
    }

}
