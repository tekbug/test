package com.safaricom.bankend.test.services.impls;


import com.safaricom.bankend.test.dtos.requests.BankRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.requests.BranchRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.responses.BankRegistrationResponseDTO;
import com.safaricom.bankend.test.dtos.responses.BranchRegistrationResponseDTO;
import com.safaricom.bankend.test.models.Bank;
import com.safaricom.bankend.test.models.Branch;
import com.safaricom.bankend.test.repositories.BankRepository;
import com.safaricom.bankend.test.repositories.BranchRepository;
import com.safaricom.bankend.test.services.BankService;
import com.safaricom.bankend.test.utils.ObjectMappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;
    private final ObjectMappers objectMappers;

    @Override
    public List<BankRegistrationResponseDTO> returnAllBanks() {
        return objectMappers.returnAllBanks();
    }

    @Override
    public void registerBank(BankRegistrationRequestDTO bank) {
        Bank bank1 = new Bank();
        bank1.setBankName(bank.bankName());
        bankRepository.saveAndFlush(bank1);
    }


}
