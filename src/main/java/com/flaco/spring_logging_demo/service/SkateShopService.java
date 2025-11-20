package com.flaco.spring_logging_demo.service;

import org.springframework.stereotype.Service;
import com.flaco.spring_logging_demo.model.Skateboard;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SkateShopService {

    public Skateboard assembleSkateboard(String deck, String wheels, String trucks, String bearings, String gripTape) {
        
        log.info("New Setup Request: Deck={}, Ruote={}, Truck={}, Cuscinetti={}, Grip={}", 
                 deck, wheels, trucks, bearings, gripTape);

        log.debug("🛠️ Checking inventory...");

        // Validation with error logs
        if (deck == null || deck.isEmpty()) {
            log.error("🚨 Dang! No (Deck) available!");
            return null;
        }
        if (trucks == null || trucks.isEmpty()) {
            log.error("🚨 Dang! Missing these trucks!");
            return null;
        }

        log.debug("🔧 Setting up {} grip tape ...", gripTape);
        log.debug("🔧 Placing {} trucks...", trucks);
        log.debug("🔧 Sitting bearings {} into {} wheels...", bearings, wheels);
        // Warning log 
        if ("Reds".equals(bearings)) {
            log.warn("⚠️ Dude: these bearings suck!");
        }
        
        Skateboard newSkate = new Skateboard(deck, wheels, trucks, bearings, gripTape, true);
        
        log.info("✅ Setup done: {}", newSkate);
        return newSkate;
    }
}