package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0008.Botones.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarEmpresa implements Task {

    public String NuevoR;

    public EditarEmpresa (String NuevoR){
        this.NuevoR = NuevoR;
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Enter.theValue(NuevoR).into(INPUT_REPRESENTANTE_E),
                Click.on(BUTTON_EDITAR),
                Click.on(CONFIRMAR_EDITAR));
    }

    public static EditarEmpresa ConRepresentante (String NuevoR){
        return instrumented (EditarEmpresa.class, NuevoR);
    }


}
