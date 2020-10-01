package com.theerut.springj11.repository.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "application_transactions")
public class ApplicationTransactionEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    @NotNull
    private String userId;

    @Column(name = "action_id")
    @NotNull
    private Integer activity;

    @Column(name = "status_code")
    @NotNull
    private String statusCode;

    @Column(name = "status_description")
    private String statusDescription;

    @Column(name = "actor_user_id")
    private String actorUserId;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "info_1")
    private String info1;

    @Column(name = "info_2")
    private String info2;

    @Column(name = "info_3")
    private String info3;

    @Column(name = "info_4")
    private String info4;

    @Column(name = "info_5")
    private String info5;

    @Column(name = "info_6")
    private String info6;

    @CreationTimestamp
    @Column(name = "created_datetime")
    private LocalDateTime createdDatetime;
}
