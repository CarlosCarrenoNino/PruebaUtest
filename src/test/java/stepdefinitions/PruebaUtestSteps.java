package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.LlenarPrimerFormulario;
import tasks.LlenarSegundoFormulario;
import tasks.LlenarTercerFormulario;
import tasks.LlenarUltimoFormulario;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class PruebaUtestSteps {
    
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();

    @Dado("^Que el usuario acceda hasta la web para crear usuarios$")
    public void Queelusuarioaccedehastalawebparacrearusuarios() {

        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));


    }


    @Cuando("^el agrega nombre (.*) apellido (.*) correo (.*) mes (.*) dia (.*) anio (.*) en el formulario$")
    public void elagreganombreapellidocorreomesdiaanioenelformulario(String nombre, String apellido, String correo, String mes, String dia, String anio) {

        actor.wasAbleTo(
                LlenarPrimerFormulario.primero(nombre, apellido, correo, mes, dia, anio)

        );

    }

    @Cuando("^el agrega ciudad codigo postal (.*) pais (.*) en el formulario$")
    public void elagregaciudadcodigopostalpaisenelformulario(String codpostal, String pais) {

        actor.wasAbleTo(
                LlenarSegundoFormulario.segundo(codpostal, pais)

        );

    }

    @Cuando("^el agrega computadora (.*) version (.*) lenguaje (.*) movil (.*) modelo (.*) sistema (.*) en el formulario$")
    public void elagregacomputadoraversionlenguajemovilmodelosistemaenelformulario(String computadora, String version, String lenguaje, String movil, String modelo, String sistema) {

        actor.wasAbleTo(
                LlenarTercerFormulario.tercero(computadora, version, lenguaje, movil, modelo, sistema)

        );

    }

    @Entonces("^Va contra (.*) confirma (.*) completa el utlimo formulario$")
    public void Vacontraconfirmacompletaelutlimoformulario(String contra, String confirmar) {

        actor.wasAbleTo(
                LlenarUltimoFormulario.ultimo(contra, confirmar)

        );

    }






}
