package com.tatf.adminCes.base;

import org.openqa.selenium.WebDriverException;

public class TestExecutionsUtils {
    public void runSafely(Runnable testSteps) {
        try {
            testSteps.run();
        } catch (WebDriverException e) {
            String msg = e.getMessage();
            if (msg != null && (
                    msg.contains("no such window") ||
                            msg.contains("invalid session id") ||
                            msg.contains("session deleted") ||
                            msg.contains("chrome not reachable")
            )) {
                System.out.println("\nEjecucion detenida por cierre del navegador.");
            } else {
                throw e;
            }
        }
    }
}
