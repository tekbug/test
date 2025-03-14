package com.safaricom.bankend.test.dtos.requests;

import com.safaricom.bankend.test.enums.AccountStatus;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record ApplicationRegistrationRequestDTO(
        @NonNull String bankName,
        @NonNull String branchName,
        @NonNull String accountName,
        @NonNull String accountNumber,
        @NonNull AccountStatus status
) {
}
