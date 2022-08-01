package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TercerFormularioPage {


    public static final Target SPAN_SELECT_COMPUTADORA = Target.the("Span computadora").locatedBy("//span[@aria-label='Select OS']");
    public static final Target SPAN_SELECT_VERSION = Target.the("Span verson").locatedBy("//span[@aria-label='Select a Version']");
    public static final Target SPAN_SELECT_LENGUAJE = Target.the("Span lenguaje").locatedBy("//span[@aria-label='Select OS language']");
    public static final Target SPAN_SELECT_MOVIL = Target.the("Span movil").locatedBy("//span[@aria-label='Select Brand']");
    public static final Target SPAN_SELECT_MODELO = Target.the("Span modelo").locatedBy("//span[@aria-label='Select a Model']");
    public static final Target SPAN_SELECT_SISTEMA = Target.the("span sistema").locatedBy("//span[@aria-label='Select OS']");
    public static final Target BUTOTN_ULTIMO_FORMULARIO = Target.the("Boton segundo formulario").locatedBy("//a[@aria-label='Next - final step']");


}
