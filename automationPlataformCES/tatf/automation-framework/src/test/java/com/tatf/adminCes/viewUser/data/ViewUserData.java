package com.tatf.adminCes.viewUser.data;

public class ViewUserData {
    public String adminEmail = "yaniscorrea@gmail.com";
    public String adminPassword = "12345";
    public final String modalDeleteUserBody = "Usuario eliminado.";
    public String modalQuestionDeleteUser(String email){
        return "¿Eliminar usuario: "+email+"?";
    }
}
