package org.rick.facade;

import org.rick.facade.home.SmartAc;
import org.rick.facade.home.SmartLight;
import org.rick.facade.home.SmartTv;

public class SmartHomeFacade {

    private final SmartAc ac;
    private final SmartLight light;
    private final SmartTv tv;

    public SmartHomeFacade(SmartAc ac, SmartLight light, SmartTv tv) {
        this.ac = ac;
        this.light = light;
        this.tv = tv;
    }

    // Single point of interaction for client to interact with a system (Smart Home).
    public void powerUpHome() {
        ac.on();
        light.on();
        tv.on();
    }
}
