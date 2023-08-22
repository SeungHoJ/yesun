package com.zerobase.CafeBom.order.domain.entity;

import com.zerobase.CafeBom.common.BaseTimeEntity;
import com.zerobase.CafeBom.type.OrdersCookingTime;
import com.zerobase.CafeBom.type.OrdersStatus;
import com.zerobase.CafeBom.user.domain.entity.Member;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class Orders extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "member_id")
  private Member member;

  @NotNull
  private String payment;

  @NotNull
  @Enumerated(EnumType.STRING)
  private OrdersStatus status;

  @Enumerated(EnumType.STRING)
  private OrdersCookingTime cookingTime;

  @NotNull
  private boolean isCanceled;
}