package com.safaricom.bankend.test.services;

import com.safaricom.bankend.test.dtos.requests.BranchRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.responses.BranchRegistrationResponseDTO;
import jakarta.validation.Valid;

import java.util.List;

public interface BranchService {
    List<BranchRegistrationResponseDTO> getAllBankBranchesById(Long id);

    void registerBranchesToBank(@Valid BranchRegistrationRequestDTO branch);
}
