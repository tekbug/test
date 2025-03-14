package com.safaricom.bankend.test.dtos.responses;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record BranchRegistrationResponseDTO(
        @NonNull String branchName
) {
}
