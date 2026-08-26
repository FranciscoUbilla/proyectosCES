package centro_deporte;
import centro_deporte.manager.ICentroDeporte;
import centro_deporte.manager.CentroDeporte;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CentroDeDeporteTest extends contexto {
    @Test
    void buscardeporte_obtenerdeporte_obtenertodoslosdeportes(){
        //Arrange
        CentroDeporte centro = new CentroDeporte();
        MensajesConsola mensaje = new MensajesConsola();

        //Act
        List <String> resultado =  centro.obtenerDeportes();

        //Assert
        mensaje.resultadoObtenido(resultado);
        assertInstanceOf(List.class, resultado);
    }

    @Test
        void buscar_obtenerdeporte_espacioenblanco(){
        CentroDeporte centro = new CentroDeporte();
        MensajesConsola mensaje = new MensajesConsola();
        List <String> resultado =  centro.obtenerDeportes(" ");
        mensaje.resultadoObtenido(resultado);
        assertInstanceOf(List.class, resultado);
        assertEquals(0, resultado.size());
    }
        @Test
        void crear_creardeporte_crearconexito(){
            CentroDeporte centro = new CentroDeporte();
            MensajesConsola mensaje = new MensajesConsola();
            String nombre = "test"+System.currentTimeMillis();
            centro.crearDeporte(nombre);
            List <String> resultado = centro.obtenerDeportes(nombre);
            mensaje.resultadoObtenido(resultado);
            assertTrue(resultado.contains(nombre+"[DEPORTE]"));
    }

        @Test
        void modificar_modificarDeporte_modificarconexito(){
            List <String> resultado;
            CentroDeporte centro = new CentroDeporte();
            MensajesConsola mensaje = new MensajesConsola();
            String nombre = "test"+System.currentTimeMillis()+"NEW";
            String nuevoNombre = "test"+System.currentTimeMillis()+"MOD";
            centro.crearDeporte(nombre);
            centro.modificarDeporte(nombre+"[DEPORTE]", nuevoNombre);
            resultado = centro.obtenerDeportes(nombre);
            mensaje.resultadoObtenido("Busqueda por nombre("+nombre+") antiguo: "+resultado);
            assertEquals(0, resultado.size());
            resultado = centro.obtenerDeportes(nuevoNombre);
            mensaje.contenidoModificado("Busqueda por nombre nuevo("+nuevoNombre+"): "+resultado);
            assertTrue(resultado.contains(nuevoNombre));
    }
    @Test
    void eliminar_eliminarDeporte_eliminarconexito(){
        List <String> resultado;
        CentroDeporte centro = new CentroDeporte();
        MensajesConsola mensaje = new MensajesConsola();
        String nombreEliminar = "testeliminar"+System.currentTimeMillis();
        centro.crearDeporte(nombreEliminar);
        resultado = centro.obtenerDeportes(nombreEliminar+"[DEPORTE]");
        mensaje.contenidoCreado(resultado);
        centro.eliminarDeporte(nombreEliminar+"[DEPORTE]");
        resultado = centro.obtenerDeportes(nombreEliminar);
        mensaje.resultadoObtenido("Busqueda por nombre de contenido eliminado: " + resultado);
        assertEquals(0, resultado.size());
    }
}