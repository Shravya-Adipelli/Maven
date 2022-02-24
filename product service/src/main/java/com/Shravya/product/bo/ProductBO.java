package com.Shravya.product.bo;

import com.Shravya.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
