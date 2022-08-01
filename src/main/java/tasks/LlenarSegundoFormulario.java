package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PrimerFormularioPage.SELECT_ANIO;
import static userinterfaces.SegundoFormularioPage.*;


public class LlenarSegundoFormulario implements Task {

    private String ciudad;
    private String codpostal;
    private String pais;



    public LlenarSegundoFormulario(String codpostal, String pais){

        this.ciudad = ciudad;
        this.codpostal = codpostal;
        this.pais = pais;
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(


                Enter.theValue(codpostal).into(INPUT_COD_POSTA), //diligenciar campo codigo postal
                Hit.the(Keys.ENTER).into(SPAN_SELECT_PAIS), //Seleccionar el producto o agregar

                Click.on(BUTOTN_SEGUNDO_FORMULARIO) //ir al siguiente formulario


        );


    }


    public static LlenarSegundoFormulario segundo( String codpostal, String pais){

        return instrumented(LlenarSegundoFormulario.class, codpostal, pais);

    }

}
