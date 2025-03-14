package com.safaricom.bankend.test.services;

import com.safaricom.bankend.test.dtos.requests.ApplicationRegistrationRequestDTO;
import jakarta.validation.Valid;

public interface ApplicationService {
    void submitApplication(@Valid ApplicationRegistrationRequestDTO application);
}
