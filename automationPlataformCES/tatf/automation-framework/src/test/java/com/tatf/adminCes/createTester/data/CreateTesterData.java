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

    public CreateTesterData withFirstName(String firstName) {
        this.testerFirstName = firstName;
        this.testerEmail = Generator.generateEmail(this.testerFirstName, this.testerLastName, this.testerDomain, this.testerTLD);
        return this;
    }

    public CreateTesterData withLastName(String lastName) {
        this.testerLastName = lastName;
        this.testerEmail = Generator.generateEmail(this.testerFirstName, this.testerLastName, this.testerDomain, this.testerTLD);
        return this;
    }

    public CreateTesterData withEmail(String email) {
        this.testerEmail = email;
        return this;
    }

    public CreateTesterData withPassword(String password) {
        this.testerPassword = password;
        return this;
    }

    public CreateTesterData withCountry(String country) {
        this.countryOption = country;
        return this;
    }

    public CreateTesterData withRole(String role) {
        this.userRolOption = role;
        return this;
    }
}
