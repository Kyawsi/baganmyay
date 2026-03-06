package com.example.baganmyay.controller;

import com.example.baganmyay.model.entity.ApplicationForm;
import com.example.baganmyay.repository.ApplicationFormRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/applications")
@RequiredArgsConstructor
@Slf4j
public class ApplicationFormController {

    private final ApplicationFormRepository applicationRepository;

    @PostMapping("/submit")
    public String saveApplication(ApplicationForm form) {

        applicationRepository.save(form);

        return "redirect:/success.html";
    }

}
