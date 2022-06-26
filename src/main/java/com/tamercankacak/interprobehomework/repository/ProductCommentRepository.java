package com.tamercankacak.interprobehomework.repository;

import com.tamercankacak.interprobehomework.entity.Product;
import com.tamercankacak.interprobehomework.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductCommentRepository extends JpaRepository<ProductComment, Long> {

    List<ProductComment> findByProduct_Id(Long id);

    List<ProductComment> findByProduct_IdAndCommentDateIsBetween(Long id, Date commentDateStart, Date commentDateEnd);

    List<ProductComment> findByAppUser_Id(Long id);

    List<ProductComment> findByAppUser_IdAndCommentDateBetween(Long id, Date commentDateStart, Date commentDateEnd);


}
