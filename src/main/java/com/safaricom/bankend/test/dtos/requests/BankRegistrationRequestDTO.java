package com.safaricom.bankend.test.dtos.requests;

import com.safaricom.bankend.test.dtos.responses.BranchRegistrationResponseDTO;
import lombok.Builder;
import lombok.NonNull;

import java.util.List;

@Builder
public record BankRegistrationRequestDTO(
        @NonNull String bankName,
        @NonNull List<BranchRegistrationResponseDTO> branches
        ) {}
