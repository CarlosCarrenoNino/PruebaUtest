package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SegundoFormularioPage {

    public static final Target INPUT_CIUDAD = Target.the("Input nombre").locatedBy("//input[@id='city']");
    public static final Target INPUT_COD_POSTA = Target.the("Input apellido").locatedBy("//input[@id='zip']");
    public static final Target SPAN_SELECT_PAIS = Target.the("Input correo").locatedBy("//span[@aria-label='Select a country']");
    public static final Target BUTOTN_SEGUNDO_FORMULARIO = Target.the("Boton segundo formulario").locatedBy("//a[@aria-label='Next step - select your devices']");



}
