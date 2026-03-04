package com.techouts.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techouts.entity.Cart;
import com.techouts.entity.Orders;
import com.techouts.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PlaceOrderRepo {

    @PersistenceContext
    private EntityManager entityManager;

    // Get all cart items for a user
    public List<Cart> getCartItems(User user) {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Cart c where c.user = :user", Cart.class)
                .setParameter("user", user)
                .list();
    }

    // Check if an order already exists for this user and product
    public Orders checkOrder(User user, Cart cart) {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery(
                "from Orders o where o.user = :user and o.product = :product",
                Orders.class)
                .setParameter("user", user)
                .setParameter("product", cart.getProduct())
                .uniqueResult();
    }

    // Update an existing order's quantity and amount, then remove the cart item
    public void setOrderCount(Orders existingOrder, Cart cart) {
        Session session = entityManager.unwrap(Session.class);

        existingOrder.setOrdercount(existingOrder.getOrdercount() + cart.getProductCount());
        existingOrder.setAmount(existingOrder.getAmount() +
                (Integer.parseInt(cart.getProduct().getProductPrice()) * cart.getProductCount()));

        session.merge(existingOrder);

        // Delete cart safely using JPQL
        session.createQuery("DELETE FROM Cart c WHERE c.id = :cid")
                .setParameter("cid", cart.getCartId())
                .executeUpdate();
    }

    // Create a new order from a cart item
    public void createOrder(User user, Cart cart, String address) {
        Session session = entityManager.unwrap(Session.class);

        Orders order = new Orders();
        order.setUser(user);
        order.setProduct(cart.getProduct());
        order.setOrdercount(cart.getProductCount());
        order.setAmount(Integer.parseInt(cart.getProduct().getProductPrice()) * cart.getProductCount());
        order.setAddress(address);

        session.persist(order);

        // Delete cart safely using JPQL
        session.createQuery("DELETE FROM Cart c WHERE c.id = :cid")
                .setParameter("cid", cart.getCartId())
                .executeUpdate();
    }
}