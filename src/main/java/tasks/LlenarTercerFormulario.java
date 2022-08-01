package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.TercerFormularioPage.*;

public class LlenarTercerFormulario implements Task {

    private String computadora;
    private String version;
    private String lenguaje;
    private String movil;
    private String modelo;
    private String sistema;




    public LlenarTercerFormulario(String computadora, String version, String lenguaje, String movil, String modelo, String sistema){

        this.computadora = computadora;
        this.version = version;
        this.lenguaje = lenguaje;
        this.movil = movil;
        this.modelo = modelo;
        this.sistema = sistema;

    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(


                Hit.the(Keys.ENTER).into(SPAN_SELECT_COMPUTADORA), //Seleccionar computadora
                Hit.the(Keys.ENTER).into(SPAN_SELECT_VERSION), //Seleccionar version
                Hit.the(Keys.ENTER).into(SPAN_SELECT_LENGUAJE), //Seleccionar lenguaje
                Hit.the(Keys.ENTER).into(SPAN_SELECT_MOVIL), //Seleccionar movil
                Hit.the(Keys.ENTER).into(SPAN_SELECT_MODELO), //Seleccionar modelo
                Hit.the(Keys.ENTER).into(SPAN_SELECT_SISTEMA), //Seleccionar sistema
                Click.on(BUTOTN_ULTIMO_FORMULARIO) //ir al ultimo formulario


        );


    }


    public static LlenarTercerFormulario tercero(String computadora, String version, String lenguaje, String movil, String modelo, String sistema){

        return instrumented(LlenarTercerFormulario.class, computadora, version, lenguaje, movil, modelo, sistema);

    }

}
