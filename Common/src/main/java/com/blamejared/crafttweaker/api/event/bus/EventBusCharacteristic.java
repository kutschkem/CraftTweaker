package com.blamejared.crafttweaker.api.event.bus;

import com.google.common.base.CaseFormat;

public enum EventBusCharacteristic {
    SUPPORTS_CANCELLATION,
    IGNORE_PHASES;
    
    
    @Override
    public String toString() {
        
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, super.toString());
    }
}