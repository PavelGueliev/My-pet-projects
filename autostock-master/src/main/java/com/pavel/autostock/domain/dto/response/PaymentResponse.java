package com.pavel.autostock.domain.dto.response;

import com.pavel.autostock.domain.entity.PaymentEntity;
import com.pavel.autostock.domain.entity.SellEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {
    private Long paymentId;
    private SellEntity sell;
    private LocalDate paymentDate;
    private Integer paymentCost;
    private String paymentMethod;
}
