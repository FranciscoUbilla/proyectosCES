package com.tatf.adminCes;

import org.junit.platform.suite.api.*;

@Suite
@SuiteDisplayName("Suite por tag: humo")
@SelectPackages("com.tatf.adminCes")
@IncludeTags("humo")
public class SuiteHumoFireFox {
    @BeforeSuite
    static void usarFirefox() {
        System.setProperty("browserfactory.driver_type", "FIREFOX");
    }

    @AfterSuite
    static void restaurar() {
        System.clearProperty("browserfactory.driver_type");
    }
}
