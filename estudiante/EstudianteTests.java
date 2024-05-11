package estudiante;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EstudianteTests {
    
        @Test
        public void testNombre() {
            Estudiante estudiante = new Estudiante("Juan", "123");
            assert estudiante.getNombre() == "Juan";
        }
    
        @Test
        public void testId() {
            Estudiante estudiante = new Estudiante("Juan", "123");
            assertEquals(estudiante.getId(), "123");
        }
    
        @Test
        public void testCreditos() {
            Estudiante estudiante = new Estudiante("Juan", "123");
            assert estudiante.getCreditos() == 0;
        }
    
        @Test
        public void testNombreUsuario() {
            Estudiante estudiante = new Estudiante("Juan", "123");
            System.out.println(estudiante.getNombreUsuario());
            assertEquals(estudiante.getNombreUsuario(), "Juan123");
        }
    
        @Test
        public void testSumarCreditos() {
            Estudiante estudiante = new Estudiante("Juan", "123");
            estudiante.sumarCreditos(10);
            assert estudiante.getCreditos() == 10;
        }
}
