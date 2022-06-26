package com.tamercankacak.interprobehomework.controller;

import com.tamercankacak.interprobehomework.entity.Product;
import com.tamercankacak.interprobehomework.entity.ProductComment;
import com.tamercankacak.interprobehomework.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "v1/api/products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping(value = "commentsByProductId/{id}")
    public List<ProductComment> findProductCommentsByProductId(@PathVariable Long id) {
        return productService.findProductCommentsByProductId(id);
    }

    @GetMapping(value = "commentsByUserId/{id}")
    public List<ProductComment> findProductCommentsByUserId(@PathVariable Long id) {
        return productService.findProductCommentsByUserId(id);
    }

    @GetMapping(value = "commentsByProduct/{id}")
    public List<ProductComment> findProductCommentsBetweenDatesByProduct(@PathVariable Long id, @RequestParam Date startDate, @RequestParam Date endDate) {
        return productService.findProductCommentsBetweenDatesByProduct(id, startDate, endDate);
    }

    @GetMapping(value = "commentsByUser/{id}")
    public List<ProductComment> findProductCommentsBetweenDatesByUser(@PathVariable Long id, @RequestParam Date startDate, @RequestParam Date endDate) {
        return productService.findProductCommentsBetweenDatesByUser(id, startDate, endDate);
    }

    @GetMapping(value = "productsExpiration")
    public List<Product> findExpirationProducts(@RequestParam Date expirationDate) {
        return productService.findExpirationProducts(expirationDate);
    }

    @GetMapping(value = "productsNotExpiration")
    public List<Product> findNotExpirationProducts(Date expirationDate) {
        return productService.findNotExpirationProducts(expirationDate);
    }


}
