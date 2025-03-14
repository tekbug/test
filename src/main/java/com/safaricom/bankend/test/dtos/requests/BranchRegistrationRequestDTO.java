package com.safaricom.bankend.test.dtos.requests;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record BranchRegistrationRequestDTO(@NonNull String branchName) {}
