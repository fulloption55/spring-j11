package com.theerut.springj11.repository.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product_feature")
public class ProductFeatureEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_feature_th")
    private String productFeatureTH;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "account_limit")
    private Integer accountLimit;

    @Column(name = "created_date")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "last_updated_date")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
