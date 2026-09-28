package com.tatf.adminCes.createTester.data;

import com.tatf.adminCes.base.Generator;

public class CreateTesterData {
    public String countryOption;
    public String userRolOption;
    public String testerEmail;
    public String testerFirstName;
    public String testerLastName;
    public String testerDomain;
    public String testerTLD;
    public String testerPassword;

    public static CreateTesterData defaults() {
        CreateTesterData dataTester = new CreateTesterData();
        dataTester.testerFirstName = "Juan";
        dataTester.testerLastName = "Perez";
        dataTester.testerDomain = "gmail";
        dataTester.testerTLD = ".com";
        dataTester.testerPassword = "123456";
        dataTester.countryOption = "2";
        dataTester.userRolOption = "1";
        dataTester.testerEmail = Generator.generateEmail(dataTester.testerFirstName, dataTester.testerLastName, dataTester.testerDomain, dataTester.testerTLD);
        return dataTester;
    }
}
