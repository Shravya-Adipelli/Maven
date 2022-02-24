package com.Shravya.product.bo;

import com.Shravya.product.dao.ProductDAO;
import com.Shravya.product.dao.ProductDAOImpl;
import com.Shravya.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
