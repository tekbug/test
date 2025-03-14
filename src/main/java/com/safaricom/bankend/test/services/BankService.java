package com.safaricom.bankend.test.services;

import com.safaricom.bankend.test.dtos.requests.BankRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.responses.BankRegistrationResponseDTO;
import jakarta.validation.Valid;

import java.util.List;

public interface BankService {
    List<BankRegistrationResponseDTO> returnAllBanks();

    void registerBank(@Valid BankRegistrationRequestDTO bank);
}
