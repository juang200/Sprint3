package Stepsdefinitions;

import Task.Autenticacion;
import Task.CrearEmpresa;
import Task.EditarEmpresa;
import Task.FiltrarEmpresa;
import Userinterfaces.HU0008.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.HU0008.*;

import java.util.List;

import static Userinterfaces.HU0008.Botones.*;

public class GestionEmpresasSteps {

    @Managed (driver = "Chrome")
    private WebDriver navegador;

    private Homepage homepage = new Homepage();

    private Actor actor = Actor.named("Juan");

    @Given("^The user enters to Neat administration page$")
    public void the_user_enters_to_neat_administrative_page(){
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homepage));
        navegador.manage().window().maximize();}

    @When("^He puts the (.*) and the (.*)$")
    public void he_puts_the_and_the(String User, String Password){
        actor.wasAbleTo(
                Autenticacion.conDatos(User, Password));}
    @Then("^He goes to the Operator company module$")
    public void he_goes_to_the_operator_company_module(){
        actor.attemptsTo(
                Click.on(ICONO_EMPRESA),
                Click.on(BUTTON_EMPRESA));}


    // CREAR EMPRESA OPERADORA

    @Given("^He goes to the Create operator company$")
    public void he_goes_to_the_create_operator_company(){
        actor.attemptsTo(
                Click.on(CREAR_EMPRESA));}
    @Then("^He puts the data and complete the register$")
    public void he_puts_the_data_and_complete_the_register (List <String> datos){
        actor.attemptsTo(
                CrearEmpresa.ConDatos(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4))
        );}

    @When("^He sees the success message (.*)$")
    public void he_sees_the_success_message (String Exitoso){
        actor.should(GivenWhenThen.seeThat(VerificacionCrearEmpresa.ValidCrear(Exitoso)));
    }



    // CANCELAR EMPRESA OPERADORA

    @When("^He Cancel the action$")
    public void he_cancel_the_action (){
        actor.attemptsTo(
                Click.on(BUTTON_CANCELAR),
                Click.on(CONFIRMAR_CANCELAR));
    }

    @Then("^He sees the principal page of operator company module (.*)$")
    public void he_sees_the_principal_page (String PagPrincipal){
        actor.should(GivenWhenThen.seeThat(VerPagPrincipal.VerPrincipal(PagPrincipal)));
    }


    // BORRAR DATOS DEL REGISTRO

    @When("^He select the eraser icon$")
    public void he_select_the_eraser_icon (){

    }

    @Then("^He see all the inputs clean$")
    public void he_see_all_the_inputs_clean (){

    }


    // Filtrar sin datos

    @Given("^He select the filter button$")
    public void he_select_the_filter_button (){
        actor.attemptsTo(
                Click.on(BUTTON_FILTRAR));
    }

    @Then("^He see all the company operator register$")
    public void he_see_all_the_company_operator (){

    }


    // FILTRAR EMPRESA

    @Given("^The user puts information in the input filter (.*)$")
    public void the_user_puts_information (String NombreEmpresa){
        actor.attemptsTo(
                FiltrarEmpresa.ConNombre(NombreEmpresa));
    }

    @Then("^He sees the same information that he puts in the inputs filter (.*)$")
    public void he_sees_the_same_information (String Filtrado){
        actor.should(GivenWhenThen.seeThat(VerificacionFiltrado.ValidFiltrado(Filtrado)));
    }


    // LIMPIAR FILTROS

    @And("^He select the clean button$")
    public void he_select_the_clean_button (){
        actor.attemptsTo(
                Click.on(BUTTON_LIMPIAR));
    }

    @Then("^He sees all the inputs filter clean$")
    public void he_sees_all_the_inputs (){

    }


    //  VER MAS FILTROS

    @Given("^He select more filters button$")
    public void he_select_more_filters_button (){
        actor.attemptsTo(
                Click.on(VER_MAS_FILTROS));
    }
    @Then("^He sees all the filters inputs (.*)$")
    public void he_sees_all_the_filters_inputs (String MasFiltros){
        actor.should(GivenWhenThen.seeThat(VerMasFiltros.ValiDMasFiltros(MasFiltros)));
    }

    // ACTIVAR EMPRESA

    @When("^He active the operator company$")
    public void he_active_the_operator_company (){
        actor.attemptsTo(
                Scroll.to(DESACTIVAR_EMPRESA),
                Click.on(DESACTIVAR_EMPRESA));
    }

    @Then("^He sees the (.*) status$")
    public void he_sees_the_active_button (String Inactiva){
        actor.should(GivenWhenThen.seeThat(EmpresaInactiva.Inactiva(Inactiva)));


    }



    // DESACTIVAR EMPRESA

    @When("^He inactive the operator company$")
    public void he_inactive_the_operator_company (){
        actor.attemptsTo(
                Scroll.to(ACTIVAR_EMPRESA),
                Click.on(ACTIVAR_EMPRESA));
    }

    @Then("^He sees the (.*) status 2$")
    public void he_see_the_innactive_button (String Activo){
        actor.should(GivenWhenThen.seeThat(EmpresaActiva.Activo(Activo)));
    }



    // EDITAR EMPRESA

    @When("^He select th edit button$")
    public void he_select_the_dit_button (){
        actor.attemptsTo(
                Click.on(BUTTON_FILTRAR),
                Scroll.to(ICONO_EDITAR),
                Click.on(ICONO_EDITAR));
    }

    @And("^He edit the operator company (.*)$")
    public void he_edit_the_operator_company (String NuevoR){
        actor.attemptsTo(
                EditarEmpresa.ConRepresentante(NuevoR));
    }

    @Then("^He sees the secces message (.*)$")
    public void  he_sees_the_secces_message (String EdicionE){
        actor.should(GivenWhenThen.seeThat(EdicionExitosa.Editado(EdicionE)));
    }



    // CANCELAR EDICION

    @And("^He cancel the action of edit$")
    public void he_cancel_the_action_edit (){

    }

    @Then("^He sees the principal page of the module$")
    public void he_sees_the_principal_page_of_the_module (){

    }
}
