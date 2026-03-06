package com.example.baganmyay.controller;

import com.example.baganmyay.model.entity.ApplicationForm;
import com.example.baganmyay.repository.ApplicationFormRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
@RequiredArgsConstructor
@Slf4j
public class ApplicationFormController {

    private final ApplicationFormRepository applicationRepository;

    @PostMapping
    public String saveApplication(@RequestParam String name,
                                  @RequestParam String email) {

        ApplicationForm app = new ApplicationForm();
        app.setName(name);
        app.setEmail(email);

        applicationRepository.save(app);

        return "Saved successfully";
    }

}
