package questions.HU0008;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0008.Botones.VERIF_E_ACTIVA;


public class EmpresaActiva implements Question {


    private final String Activo;

    public EmpresaActiva (String Activo){
        this.Activo = Activo;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIF_E_ACTIVA).viewedBy(actor).asString().equals(Activo.toString()))
            return true;
        else
            return false;
    }


    public static EmpresaInactiva Activo (String Activo){
        return new EmpresaInactiva(Activo);

    }


}
