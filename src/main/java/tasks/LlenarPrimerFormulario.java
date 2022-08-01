package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.HomePage.BOTON_JOIN_TODAY;
import static userinterfaces.PrimerFormularioPage.*;

public class LlenarPrimerFormulario implements Task {

    private String nombre;
    private String apellido;
    private String correo;
    private String mes;
    private String dia;
    private String anio;


    public LlenarPrimerFormulario(String nombre, String apellido, String correo, String mes, String dia, String anio){

        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BOTON_JOIN_TODAY), // Ir al primer formulario
                Enter.theValue(nombre).into(INPUT_NOMBRE), //diligenciar campo de nombre
                Enter.theValue(apellido).into(INPUT_APELLIDO), //diligenciar campo de apellido
                Enter.theValue(correo).into(INPUT_CORREO), //diligenciar campo de correo
                SelectFromOptions.byVisibleText(mes).from(SELECT_MES), // seleccionar inten del select
                SelectFromOptions.byVisibleText(dia).from(SELECT_DIA), // seleccionar inten del select
                SelectFromOptions.byVisibleText(anio).from(SELECT_ANIO), // seleccionar inten del select
                //Hit.the(Keys.ENTER).into(INPUT_NOMBRE)); //
                Click.on(BUTOTN_SIGUIENTE_FORMULARIO)
        );

    }

    public static LlenarPrimerFormulario primero(String nombre, String apellido, String correo, String mes, String dia, String anio) {

        return instrumented(LlenarPrimerFormulario.class, nombre, apellido, correo, mes, dia, anio);
    }



}
