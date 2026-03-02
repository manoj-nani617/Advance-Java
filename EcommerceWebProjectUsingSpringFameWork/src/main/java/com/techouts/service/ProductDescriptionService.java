package com.techouts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.repository.ProductDescriptionRepo;

import jakarta.servlet.http.HttpSession;


@Service
public class ProductDescriptionService {
	@Autowired
	private ProductDescriptionRepo productDescriptionRepo;
	public boolean checkProduct(int id,HttpSession sessionProduct) {
		Products product =  productDescriptionRepo.checkProduct(id);

		if(product != null) {
			
//			Check User Logged In If Not Redirect to The Login Page
			User u = (User) sessionProduct.getAttribute("user");
			if(u == null ) {
				sessionProduct.setAttribute("url", "addtocart");
				sessionProduct.setAttribute("productId", id);
				
				return false;
			}
			
			
//			Check Already Product is present or not
			Cart existingCart = productDescriptionRepo.checkProductPresence( id, u.getUserId());
					
					

//			request.setAttribute("product", p);
//			request.getRequestDispatcher("productDescriptionPage.jsp").forward(request, response);
			

		}
		else {
			System.out.println("Product Not found");
			
		}
	}

}
