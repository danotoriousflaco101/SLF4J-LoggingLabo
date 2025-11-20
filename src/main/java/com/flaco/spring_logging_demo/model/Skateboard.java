package com.flaco.spring_logging_demo.model; 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skateboard {
    private String deckBrand;
    private String wheelBrand;
    private String truckBrand;
    private String bearingBrand;
    private String gripTapeBrand;
    private boolean isAssembled;
}


