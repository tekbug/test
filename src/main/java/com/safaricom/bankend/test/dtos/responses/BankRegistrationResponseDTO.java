package com.safaricom.bankend.test.dtos.responses;

import lombok.Builder;
import lombok.NonNull;

import java.util.List;

@Builder
public record BankRegistrationResponseDTO(
        @NonNull String bankName,
        @NonNull List<BranchRegistrationResponseDTO> branches
        ) {
}
