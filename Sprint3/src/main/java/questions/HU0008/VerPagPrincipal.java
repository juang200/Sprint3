package questions.HU0008;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0008.Botones.VER_PAG_PRINCIPAL;

public class VerPagPrincipal implements Question {

    private final String PagPrincipal;

    public VerPagPrincipal (String PagPrincipal){
        this.PagPrincipal = PagPrincipal;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VER_PAG_PRINCIPAL).viewedBy(actor).asString().equals(PagPrincipal.toString()))
            return true;
        else
            return false;
    }

    public static VerPagPrincipal VerPrincipal (String PagPrincipal){
        return new VerPagPrincipal(PagPrincipal);
    }

}
