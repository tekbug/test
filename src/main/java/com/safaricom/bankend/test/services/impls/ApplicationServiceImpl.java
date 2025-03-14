package com.safaricom.bankend.test.services.impls;


import com.safaricom.bankend.test.dtos.requests.ApplicationRegistrationRequestDTO;
import com.safaricom.bankend.test.models.Application;
import com.safaricom.bankend.test.repositories.ApplicationRepository;
import com.safaricom.bankend.test.services.ApplicationService;
import com.safaricom.bankend.test.utils.ObjectMappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final ObjectMappers objectMappers;

    @Override
    public void submitApplication(ApplicationRegistrationRequestDTO application) {
        Application application1 = new Application();
        application1.setBankName(application.bankName());
        application1.setAccountName(application.accountName());
        application1.setAccountNumber(application.accountNumber());
        application1.setStatus(application.status());
        applicationRepository.saveAndFlush(application1);
    }
}
