package com.flaco.spring_logging_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.flaco.spring_logging_demo.model.Skateboard;
import com.flaco.spring_logging_demo.service.SkateShopService;
import lombok.extern.slf4j.Slf4j; // Importiamo l'annotazione

@RestController
@Slf4j // 1. Aggiungiamo il Logger al Controller
public class SkateController {

    @Autowired
    private SkateShopService skateService;

    @GetMapping("/assemble")
    public Skateboard assemble(
            @RequestParam String deck, 
            @RequestParam String wheels,
            @RequestParam String trucks,
            @RequestParam String bearings,
            @RequestParam String grip) {
        
        // Log input
        log.info("API Call: GET /assemble with deck='{}'", deck);
        
        Skateboard result = skateService.assembleSkateboard(deck, wheels, trucks, bearings, grip);
        
        // Log output
        if (result != null) {
            log.info("API Response: 200 YEAH - Setup ready!");
        } else {
            log.warn("API Response: Error (null) returned.");
        }

        return result;
    }
}