package com.pavel.autostock.domain.dto.response;

import com.pavel.autostock.domain.entity.AutomobileEntity;
import com.pavel.autostock.domain.entity.ClientEntity;
import com.pavel.autostock.domain.entity.EmployerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellResponse {
    private Long id;
    private AutomobileEntity automobile;
    private ClientEntity client;
    private EmployerEntity employer;
    private LocalDate sellDate;
    private Integer totalCost;
    private String status;
}
