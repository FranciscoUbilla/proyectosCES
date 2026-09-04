package centro_deporte;


public class MensajesConsola {
    //manejo de mensajes
   public void iniciandoTest(String nombreTest){
        System.out.println("\n----------------------INICIANDO PRUEBA-----------------------");
        System.out.println("Ejecutando prueba: " + nombreTest);
    }

    public void resultadoObtenido (Object resultado) {
        mostrarMnesaje("Resultado", resultado);
    }
    public void contenidoCreado (Object contenido) {
        mostrarMnesaje("Contenido creado", contenido);
    }
    public void contenidoModificado (Object contenido) {
        mostrarMnesaje("Contenido modificado", contenido);
    }
    public void mostrarMnesaje(String etiqueta, Object valor){
        if (valor == null){
            System.out.println(etiqueta + ": nulo");
            return;
        }
        System.out.println(etiqueta + ": "+ valor);
        System.out.println("Tipo: " + valor.getClass().getSimpleName());
    }
    public void mensajeFinTest(){
        System.out.println("\n----------------------END TEST-----------------------");
    }


}
