package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.UltimoFormularioPage.*;

public class LlenarUltimoFormulario implements Task {

    private String contra;
    private String confirmar;





    public LlenarUltimoFormulario(String contra, String confirmar){

        this.contra = contra;
        this.confirmar = confirmar;
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(


                Enter.theValue(contra).into(INPUT_CONTRA), //
                Enter.theValue(confirmar).into(INPUT_CONFIRMAR), //
                Click.on(SPAN_OPTION1), //
                Click.on(SPAN_OPTION2),//
                Click.on(SPAN_OPTION3), //
                Click.on(BUTOTN_COMPLETAR) //


        );


    }


    public static LlenarUltimoFormulario ultimo(String contra, String confirmar){

        return instrumented(LlenarUltimoFormulario.class, contra, confirmar);

    }


}
