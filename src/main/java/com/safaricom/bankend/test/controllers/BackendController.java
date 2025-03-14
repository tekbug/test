package com.safaricom.bankend.test.controllers;

import com.safaricom.bankend.test.dtos.requests.ApplicationRegistrationRequestDTO;
import com.safaricom.bankend.test.dtos.responses.BankRegistrationResponseDTO;
import com.safaricom.bankend.test.dtos.responses.BranchRegistrationResponseDTO;
import com.safaricom.bankend.test.services.ApplicationService;
import com.safaricom.bankend.test.services.BankService;
import com.safaricom.bankend.test.services.BranchService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
@Slf4j
public class BackendController {

    /**
     * Backend Controller Overview
     *
     * <p>Controllers are responsible for handling incoming requests and directing the flow of the application.
     * They act as intermediaries between the user interface (or external systems) and the application's logic.</p>
     *
     * <p>Responsibilities included are:</p>
     * <ul>
     *     <li>Registering a Bank Application Form.</li>
     *     <li>Returning List of available banks.</li>
     *     <li>Returning List of available bank branches based on the bank name.</li>
     * </ul>
     *
     * Annotation Choices: @RequiredArgsConstructor and @Slf4j
     *
     * <p>In this code, I used {@code @RequiredArgsConstructor} and {@code @Slf4j}
     * annotations for improved code quality and maintainability compared to manual or implicit approaches.</p>
     *
     * <h3>@RequiredArgsConstructor:  Constructor Dependency Injection</h3>
     * <p>Instead of writing constructors manually for dependency injection, {@code @RequiredArgsConstructor}
     * automatically generates a constructor that injects all {@code final} fields (or {@code @NonNull} fields).
     * This offers to reduce the boilerplate code, and stick to Lombok interaction</p>
     * <h3>@Slf4j:  Simplified Logging</h3>
     * <p>Instead of manually declaring and initializing a logger in each class, {@code @Slf4j} automatically
     * creates a logger instance named {@code log} (or a name you configure). This provides the same output but less
     * boilerplate code. </p>
     *
     * @author Muhammed Y. Murad
     * @version 1.0
     */

    private final ApplicationService applicationService;
    private final BankService bankService;
    private final BranchService branchService;

    @PostMapping("applications/submit")
    public ResponseEntity<String> submitApplication(@Valid @RequestBody ApplicationRegistrationRequestDTO application) {
        applicationService.submitApplication(application);
        return ResponseEntity.status(HttpStatus.OK).body("Your application has been submitted successfully");
    }

    @GetMapping("banks")
    public ResponseEntity<List<BankRegistrationResponseDTO>> getAllBanks() {
        return ResponseEntity.status(HttpStatus.OK).body(bankService.returnAllBanks());
    }

    @GetMapping("branches/{id}")
    public ResponseEntity<List<BranchRegistrationResponseDTO>> getAllBranches(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(branchService.getAllBankBranchesById(id));
    }
}
