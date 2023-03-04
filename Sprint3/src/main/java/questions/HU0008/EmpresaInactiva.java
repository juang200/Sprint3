package questions.HU0008;

import cucumber.api.java.sl.In;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0008.Botones.VERIF_E_DESACTIVAR;

public class EmpresaInactiva implements Question {

    private final String Inactivo;

    public EmpresaInactiva (String Inactiva){
        this.Inactivo = Inactiva;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIF_E_DESACTIVAR).viewedBy(actor).asString().equals(Inactivo.toString()))
            return true;
        else
            return false;
    }


    public static EmpresaInactiva Inactiva (String Inactivo){
        return new EmpresaInactiva(Inactivo);

    }
}
