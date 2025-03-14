package com.safaricom.bankend.test.services.impls;


import com.safaricom.bankend.test.dtos.requests.BranchRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.responses.BranchRegistrationResponseDTO;
import com.safaricom.bankend.test.services.BranchService;
import com.safaricom.bankend.test.utils.ObjectMappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BranchServiceImpl implements BranchService {

    private final ObjectMappers objectMappers;

    @Override
    public List<BranchRegistrationResponseDTO> getAllBankBranchesById(Long id) {
        return Collections.singletonList(objectMappers.returnBankBranches(id));
    }

    @Override
    public void registerBranchesToBank(BranchRegistrationRequestDTO branch) {
        objectMappers.registerBranchesToBank(branch);
    }
}
