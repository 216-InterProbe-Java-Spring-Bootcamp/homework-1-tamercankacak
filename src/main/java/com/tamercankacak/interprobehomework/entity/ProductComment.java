package com.tamercankacak.interprobehomework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product_comment")
@Getter
@Setter
@NoArgsConstructor
public class ProductComment {

    @Id
    @GeneratedValue(generator = "product_comment")
    @SequenceGenerator(name = "product_comment", sequenceName = "PRODUCT_COMMENT_ID_SEQ")
    private Long id;

    @Column(length = 500)
    private String comment;

    @Column
    @Temporal(TemporalType.DATE)
    private Date commentDate;

    @OneToOne
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
