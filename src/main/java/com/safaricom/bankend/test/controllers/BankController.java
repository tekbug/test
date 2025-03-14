package com.safaricom.bankend.test.controllers;

import com.safaricom.bankend.test.dtos.requests.BankRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.requests.BranchRegistrationRequestDTO;
import com.safaricom.bankend.test.services.BankService;
import com.safaricom.bankend.test.services.BranchService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/register")
@RequiredArgsConstructor
public class BankController {

    /**
     * Bank Controller Overview
     *
     * <p>Bank Controllers are responsible for registering banks and branches to the service.</p>
     *
     * @author Muhammed Y. Murad
     * @version 1.0
     */
    private final BankService bankService;
    private final BranchService branchService;

    @PostMapping("bank")
    public ResponseEntity<String> registerBank(@Valid @RequestBody BankRegistrationRequestDTO bank) {
        bankService.registerBank(bank);
        return ResponseEntity.status(HttpStatus.CREATED).body("Successfully registered bank");
    }

    @PostMapping("branches")
    public ResponseEntity<String> registerBranches(@Valid @RequestBody BranchRegistrationRequestDTO branch) {
        branchService.registerBranchesToBank(branch);
        return ResponseEntity.status(HttpStatus.CREATED).body("Successfully registered branch");
    }
}
