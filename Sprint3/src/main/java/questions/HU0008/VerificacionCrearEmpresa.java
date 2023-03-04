package questions.HU0008;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0008.Botones.MENSAJE_EXITOSO;

public class VerificacionCrearEmpresa implements Question {

    private final String Exitoso;

    public VerificacionCrearEmpresa (String Exitoso){
        this.Exitoso = Exitoso;
    }


    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(MENSAJE_EXITOSO).viewedBy(actor).asString().equals(Exitoso.toString()))
            return true;
        else
            return false;
    }


    public static VerificacionCrearEmpresa ValidCrear (String Exitoso){
        return new VerificacionCrearEmpresa(Exitoso);
    }
}
