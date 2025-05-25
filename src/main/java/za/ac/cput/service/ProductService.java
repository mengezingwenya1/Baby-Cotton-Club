package za.ac.cput.service;

import za.ac.cput.domain.Product;

import java.util.List;

public interface ProductService extends IService<Product, String> {
List<Product> getall();
}
