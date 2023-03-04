package questions.HU0008;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0008.Botones.EDICION_EXITOSA;
import static Userinterfaces.HU0008.Botones.VERIF_E_ACTIVA;

public class EdicionExitosa implements Question {

    private final String EdicionE;

    public EdicionExitosa (String EdicionE){
        this.EdicionE = EdicionE;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(EDICION_EXITOSA).viewedBy(actor).asString().equals(EdicionE.toString()))
            return true;
        else
            return false;
    }


    public static EdicionExitosa Editado (String EdicionE){
        return new EdicionExitosa(EdicionE);

    }
}
