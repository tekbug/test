package com.safaricom.bankend.test.dtos.responses;

import com.safaricom.bankend.test.enums.AccountStatus;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record ApplicationRegistrationResponseDTO(
        @NonNull String bankName,
        @NonNull String branchName,
        @NonNull String accountName,
        @NonNull String accountNumber,
        @NonNull AccountStatus status
) {
}
