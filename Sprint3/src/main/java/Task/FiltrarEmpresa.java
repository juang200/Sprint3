package Task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.thymeleaf.templateparser.text.AbstractChainedTextHandler;

import static Userinterfaces.HU0008.Botones.BUTTON_FILTRAR;
import static Userinterfaces.HU0008.Botones.INPUT_NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarEmpresa implements Task {

    public String NombreEmpresa;

    public FiltrarEmpresa (String NombreEmpresa){
        this.NombreEmpresa = NombreEmpresa;
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(INPUT_NOMBRE),
                Enter.theValue(NombreEmpresa).into(INPUT_NOMBRE),
                Click.on(BUTTON_FILTRAR));
    }

    public static FiltrarEmpresa ConNombre (String NombreEmpresa){
        return instrumented (FiltrarEmpresa.class, NombreEmpresa);
    }

}
