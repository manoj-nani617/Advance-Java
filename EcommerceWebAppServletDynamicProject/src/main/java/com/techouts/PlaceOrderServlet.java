package com.techouts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;
import java.util.List;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techouts.entity.Cart;
import com.techouts.entity.Orders;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.helper.Factory;

@WebServlet("/PlaceOrderServlet")
public class PlaceOrderServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phoneNumber = request.getParameter("phonenumber");
		String address = request.getParameter("address");
		String payment = request.getParameter("payment");
		
		HttpSession httpSession = request.getSession();
		User user = (User) httpSession.getAttribute("user");
		Integer totalPrice = (Integer) httpSession.getAttribute("price");
		if(user == null) {
			response.sendRedirect("Login.jsp");
			return;
		}
		try(Session session = Factory.getFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			List<Cart> cartItems = session.createQuery("from Cart where user = :user",Cart.class).setParameter("user", user).list();
			if(cartItems == null) {
				response.sendRedirect("ViewCartServlet");
				return ;
			}
			
			for(Cart cart : cartItems) {
				Orders existingOrder = session.createQuery(
				        "from Orders where user = :user and product = :product",
				        Orders.class)
				        .setParameter("user", user)
				        .setParameter("product", cart.getProduct())
				        .uniqueResult();

				    if(existingOrder != null){

				        // 🔥 If already exists → increment quantity
				        existingOrder.setOrdercount(existingOrder.getOrdercount()+1);

				        existingOrder.setAmount(
				            existingOrder.getAmount() +
				            (Integer.parseInt(cart.getProduct().getProductPrice()) * cart.getProductCount())
				        );

				        session.merge(existingOrder);

				    } else {

				        // 🔥 If not exists → create new
				        Orders order = new Orders();
				        order.setUser(user);
				        order.setProduct(cart.getProduct());
				        order.setOrdercount(cart.getProductCount());
				        order.setAmount(Integer.parseInt(cart.getProduct().getProductPrice()) * cart.getProductCount());
				        order.setAddress(address);

				        session.persist(order);
				    }

				    session.remove(cart); // clear c
				
				
			}
			transaction.commit();
			response.sendRedirect("OrderServlet");
		}
	}



}
