package com.jelastic.adiso87.Shop.controllers;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.jelastic.adiso87.Shop.dao.ProductDao;
import com.jelastic.adiso87.Shop.entity.ProductEntity;

@Service("categoriesServlet")
public class ProductsByCategoriesViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ProductsByCategoriesViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//gettin request url
		String reqCategoryName = request.getRequestURL().toString();
		System.out.println(reqCategoryName);

		//getting name of category from requested URL
		Pattern p = Pattern.compile("categories\\/(\\w+)");
		Matcher m = p.matcher(reqCategoryName);
		if(m.find()){
			reqCategoryName = m.group(1);
		}else{
			reqCategoryName="mainboard";
		}
		
		//getting ProductDao
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		
		//Getting list of products which name equals to that from URL
		List<ProductEntity> list = (List<ProductEntity>) productDao.findProductsByCategoryName(reqCategoryName);
		
		//getting the bean responsible for view and setting the value of its list to
		//that retrieved from productDao
		ProductsByCategoriesViewController viewBean = (ProductsByCategoriesViewController)context.getBean("productsByCategoriesView");
		viewBean.setProducts(list);
		
		//redirect
		response.sendRedirect("/products.jsf");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
