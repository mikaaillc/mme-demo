package com.example.shoponline.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.shoponline.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

   List<Product> getProductsByCategoryId(Long categoryId);

   @Query("From Product where productName like %:productName% ")
   List<Product> getByProductNameContains(String productName);

   List<Product> getProductsByActive(Boolean active);

   Product getProductByBarcode(String barcode);

}