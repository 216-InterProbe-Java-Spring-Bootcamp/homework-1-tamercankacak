package com.tamercankacak.interprobehomework.service;

import com.tamercankacak.interprobehomework.entity.Product;
import com.tamercankacak.interprobehomework.entity.ProductComment;
import com.tamercankacak.interprobehomework.repository.ProductCommentRepository;
import com.tamercankacak.interprobehomework.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductCommentRepository productCommentRepository;
    private ProductRepository productRepository;

    public List<ProductComment> findProductCommentsByProductId(Long id) {
        return productCommentRepository.findByProduct_Id(id);
    }

    public List<ProductComment> findProductCommentsByUserId(Long id) {
        return productCommentRepository.findByAppUser_Id(id);
    }

    public List<ProductComment> findProductCommentsBetweenDatesByProduct(Long id, Date startDate, Date endDate) {
        return productCommentRepository.findByProduct_IdAndCommentDateIsBetween(id, startDate, endDate);
    }

    public List<ProductComment> findProductCommentsBetweenDatesByUser(Long id, Date startDate, Date endDate) {
        return productCommentRepository.findByAppUser_IdAndCommentDateBetween(id, startDate, endDate);
    }

    public List<Product> findExpirationProducts(Date expirationDate){
        return productRepository.findByProduct_ExpirationDateAfter(expirationDate);
    }

    public List<Product> findNotExpirationProducts(Date expirationDate){
        return productRepository.findByProduct_ExpirationDateBeforeOrProduct_ExpirationDateNull(expirationDate);
    }
}
