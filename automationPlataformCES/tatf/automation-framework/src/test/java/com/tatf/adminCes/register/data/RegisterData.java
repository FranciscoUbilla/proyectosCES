package com.tatf.adminCes.register.data;

import com.tatf.adminCes.base.Generator;
import com.tatf.adminCes.createTester.data.CreateTesterData;

public class RegisterData {
   public String firstname;
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
        dataRegister.firstname = "Juan";
        dataRegister.lastName = "Perez";
        dataRegister.domain = "gmail";
        dataRegister.TLD = ".com";
        dataRegister.password = "123456";
        dataRegister.confirmPassword = "123456";
        dataRegister.country = "Uruguay";
        dataRegister.email = Generator.generateEmail(dataRegister.firstname,dataRegister.lastName, dataRegister.domain, dataRegister.TLD);
        return dataRegister;
    }
}
