package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0008.Botones.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion implements Task {

    public String User;
    public String Password;

    public Autenticacion(String User, String Password){
        this.Password = Password;
        this.User = User;
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(INPUT_USUARIO_L),
                Enter.theValue(User).into(INPUT_USUARIO_L),
                Click.on(INPUT_PASSWORD_L),
                Enter.theValue(Password).into(INPUT_PASSWORD_L),
                Click.on(BUTTON_INGRESAR));
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Autenticacion conDatos (String User, String Password){
        return instrumented (Autenticacion.class, User, Password);
    }
}
