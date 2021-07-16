package pregunta1_huillcaquiroz_harold;
import controlador.ctrlmascota;
import modelo.ConsultasMascota;
import modelo.arreglomascota;
import modelo.mascota;
import vista.formulario;

/**
 *
 * @author dante
 */
//Ejecutar esta CLASE
public class main {
        public static void main(String[] args) {
        mascota mas = new mascota();
        ConsultasMascota cal = new ConsultasMascota();
        formulario form = new formulario();
        arreglomascota am = new arreglomascota();
        ctrlmascota ctrlal = new ctrlmascota(mas, cal, form, am);
        form.AsignarEscuchar(ctrlal);
        form.AsignarEscuchar2(ctrlal);
        form.AsignarEscuchar3(ctrlal);
        ctrlal.Iniciar();
        form.setVisible(true);
    }
}
