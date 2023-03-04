package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0008.Botones.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearEmpresa implements Task {

    public String NombreEmpresa;

    public String Nit;

    public String Correo;

    public String Representante;

    public String Telefono;

    public  CrearEmpresa (String NombreEmpresa, String Nit, String Correo, String Representante, String Telefono){
        this.NombreEmpresa = NombreEmpresa; this.Correo = Correo; this.Nit = Nit; this.Representante = Representante; this.Telefono = Telefono ;
    }


    @Override
    public <T extends Actor> void performAs ( T actor) {
        actor.attemptsTo(
                Click.on(INPUT_NOMBRE_E),
                Enter.theValue(NombreEmpresa).into(INPUT_NOMBRE_E), // Ingresar nombre empresa
                Click.on(INPUT_NIT_E),
                Enter.theValue(Nit).into(INPUT_NIT_E), // Ingresar Nit empresa
                Click.on(INPUT_CORREO_E),
                Enter.theValue(Correo).into(INPUT_CORREO_E), // Ingresar Corre
                Click.on(INPUT_REPRESENTANTE_E),
                Enter.theValue(Representante).into(INPUT_REPRESENTANTE_E), // Ingresar representante legal
                Click.on(SELECT_PAIS),
                Click.on(PAIS_SELECCIONADO),  // Seleccionar un pais
                Click.on(SELECT_DEPARTAMENTO),
                Click.on(DEPARTAMENTO_SELECCIONADO),  // Seleccionar un departamento
                Click.on(SELECT_MUNICIPIO),
                Click.on(MUNICIPIO_SELECCIONADO),  // Seleccionar un municipio
                Click.on(INPUT_TELEFONO),
                Enter.theValue(Telefono).into(INPUT_TELEFONO), // Ingresar Telefono
                Click.on(BUTTON_GUARDAR), // Boton Guardar
                Click.on(CONFIRMAR_GUARDAR)); // Confirmar Guardar
    }

    public static CrearEmpresa ConDatos (String NombreEmpresa, String Correo, String Nit, String Representantes, String Telefono){
        return instrumented (CrearEmpresa.class, NombreEmpresa, Correo, Nit, Representantes, Telefono);
    }

}
