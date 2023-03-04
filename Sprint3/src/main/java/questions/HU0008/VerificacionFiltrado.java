package questions.HU0008;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static Userinterfaces.HU0008.Botones.VERIFICAR_FILTRO;

public class VerificacionFiltrado implements Question {

    public final String Filtrado;

    public VerificacionFiltrado (String Filtrado){
        this.Filtrado = Filtrado;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIFICAR_FILTRO).viewedBy(actor).asString().equals(Filtrado.toString()))
            return true;
        else
            return false;
    }


    public static VerificacionFiltrado ValidFiltrado (String Filtrado){
        return new VerificacionFiltrado(Filtrado);
    }
}
