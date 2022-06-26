package com.tamercankacak.interprobehomework.repository;

import com.tamercankacak.interprobehomework.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface ProductRepository {

    List<Product> findByProduct_ExpirationDateAfter(Date expirationDate);

    List<Product> findByProduct_ExpirationDateBeforeOrProduct_ExpirationDateNull(Date expirationDate);

}
