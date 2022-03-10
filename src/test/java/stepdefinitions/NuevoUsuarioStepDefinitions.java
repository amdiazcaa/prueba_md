package stepdefinitions;


import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

public class NuevoUsuarioStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("usuario");
    private HomePage homePage = new HomePage();


    @Dado("^nuevo usuario desea registrarse$")
    public void NuevoUsuarioDesearegistrarse()  {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo((Performable) Open.browserOn());


    }
    @Cuando("^nuevo usuario ingresa a la plataforma Utest$")
    public void NuevoUsuarioIngresaAlaPlataformaUtest() {

    }

    @Entonces("^el registro se completa a dar click en boton completar configuracion$")
    public void ElRegistroSeCompletaaDarClickEnBotoCompletarConfiguracion() {

    }

}
