package org.rick.facade;

import org.rick.facade.home.SmartAc;
import org.rick.facade.home.SmartLight;
import org.rick.facade.home.SmartTv;

public class FacadePattern {
    public static void main(String[] args) {
        SmartAc ac = new SmartAc();
        SmartTv tv = new SmartTv();
        SmartLight light = new SmartLight();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(ac, light, tv);

        smartHomeFacade.powerUpHome();
    }
}
