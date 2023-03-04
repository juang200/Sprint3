package Stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfiguracionEmpresaSteps {


    @Managed (driver = "Chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Juan");

    @And("^He goes to the Company management module$")
    public void He_goes_to_the_Company_management_module (){

    }

    // Crearnueva Marca

    @Given("^He goes to the create new brand module$")
    public void He_goes_to_the_Create_new_brand_module (){

    }

    @When("^He clomplete the first Step$")
    public void he_complete_the_first_Step (){

    }

    @And("^He complete the second Step$")
    public void He_complete_the_second_Step (){

    }

    @And("^He complete the Third Step$")
    public void He_complete_the_Third_Step (){

    }


    @And("^He complete the fourth Step$")
    public void He_complete_the_fourth_Step (){

    }

    @And("^He complete the fiveth Step$")
    public void He_complete_the_fiveth_Step (){

    }

    @Then("^He sees the succes message 2 (.*)$")
    public void He_sees_the_succes_message (String Exitoso){

    }


    // CANCELAR CREAR MARCA

    @When("^He slect the Cancel Button$")
    public void He_slect_the_Cancel_Button (){

    }

    @Then("^He sees the management company moedule$")
    public void He_sees_the_management_company_moedule (){

    }


    // FILTRAR MARCA

    @Given("^He filter the information (.*)$")
    public void He_filter_the_information (String Informacion){

    }

    @Then("^He sees the regiter whit (.*) information$")
    public void He_sees_the_regiter_whit_information (String Informacion){

    }

    // LIMPIAR FILTROS





}
