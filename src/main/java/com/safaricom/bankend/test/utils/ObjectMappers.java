package com.safaricom.bankend.test.utils;

import com.safaricom.bankend.test.dtos.requests.BranchRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.responses.BankRegistrationResponseDTO;
import com.safaricom.bankend.test.dtos.responses.BranchRegistrationResponseDTO;
import com.safaricom.bankend.test.models.Bank;
import com.safaricom.bankend.test.models.Branch;
import com.safaricom.bankend.test.repositories.BankRepository;
import com.safaricom.bankend.test.repositories.BranchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Slf4j
public class ObjectMappers {

    private final BankRepository bankRepository;
    private final BranchRepository branchRepository;

    public BranchRegistrationResponseDTO returnBankBranches(Long bankId) {
        return null;
    }

    public BankRegistrationResponseDTO returnBank(Bank bank) {
        return BankRegistrationResponseDTO.builder()
                .bankName(bank.getBankName())
                .branches(bank.getBranchName().stream()
                        .map(branches -> new BranchRegistrationResponseDTO(branches.getBranchName()))
                .collect(Collectors.toList()))
                .build();
    }

    public void registerBranchesToBank(BranchRegistrationRequestDTO branch) {
        Branch branch1 = new Branch();
        branch1.setBranchName(branch.branchName());
        branchRepository.saveAndFlush(branch1);
    }

    public List<BankRegistrationResponseDTO> returnAllBanks() {
        return null;
    }
}
