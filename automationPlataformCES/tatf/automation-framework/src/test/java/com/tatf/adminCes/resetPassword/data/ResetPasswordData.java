package com.tatf.adminCes.resetPassword.data;

public class ResetPasswordData {
    public String emailResPass;
    public String passwordResPass;
    public String newPasswordResPass;
    public String confirmNewPasswordResPass;
    public String bodyResetModal = "Contraseña reiniciada.";


    public ResetPasswordData defaults(){
        ResetPasswordData dataResPass = new ResetPasswordData();
        dataResPass.emailResPass = "yaniscorrea@gmail.com";
        dataResPass.passwordResPass = "12345";
        dataResPass.newPasswordResPass = "123456";
        dataResPass.confirmNewPasswordResPass = "123456";
        return dataResPass;
    }
}
