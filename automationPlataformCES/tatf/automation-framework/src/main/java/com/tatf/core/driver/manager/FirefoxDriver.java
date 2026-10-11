package com.tatf.core.driver.manager;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class FirefoxDriver extends DriverManager {

        public FirefoxDriver() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("signon.rememberSignons", false);
            profile.setPreference("signon.autofillForms", false);
            profile.setPreference("dom.webnotifications.enabled", false);
            firefoxOptions.setProfile(profile);
            firefoxOptions.setAcceptInsecureCerts(true);
            this.driver = new org.openqa.selenium.firefox.FirefoxDriver(firefoxOptions);
            this.driver.manage().window().maximize();
            setDefaultConfig();
        }
}
