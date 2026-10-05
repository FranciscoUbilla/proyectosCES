package com.tatf.adminCes.register.data;

import com.tatf.adminCes.base.Generator;
import com.tatf.adminCes.createTester.data.CreateTesterData;

public class RegisterData {
   public String firstName;
   public String lastName;
   public String domain;
   public String TLD;
   public String email;
   public String password;
   public String confirmPassword;
   public String country;
   public String bodyRegisterModal = "Usuario creado.";

    public static RegisterData defaults() {
        RegisterData dataRegister = new RegisterData();
        dataRegister.firstName = "Juan";
        dataRegister.lastName = "Perez";
        dataRegister.domain = "gmail";
        dataRegister.TLD = ".com";
        dataRegister.password = "123456";
        dataRegister.confirmPassword = "123456";
        dataRegister.country = "Uruguay";
        dataRegister.email = Generator.generateEmail(dataRegister.firstName,dataRegister.lastName, dataRegister.domain, dataRegister.TLD);
        return dataRegister;
    }
    public RegisterData withFirstName(String firstName) {
        this.firstName = firstName;
        this.email = Generator.generateEmail(this.firstName, this.lastName, this.domain, this.TLD);
        return this;
    }

    public RegisterData withLastName(String lastName) {
        this.lastName = lastName;
        this.email = Generator.generateEmail(this.firstName, this.lastName, this.domain, this.TLD);
        return this;
    }

    public RegisterData withEmail(String email) {
        this.email = email;
        return this;
    }

    public RegisterData withNewPassword(String password) {
        this.password = password;
        return this;
    }
    public RegisterData withConfirmNewPassword(String newPassword) {
        this.confirmPassword = newPassword;
        return this;
    }


    public RegisterData withCountry(String country) {
        this.country = country;
        return this;
    }
}
