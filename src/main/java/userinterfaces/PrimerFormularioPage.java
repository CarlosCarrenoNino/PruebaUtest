package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrimerFormularioPage {

    public static final Target INPUT_NOMBRE = Target.the("Input nombre").locatedBy("//input[@id='firstName']");
    public static final Target INPUT_APELLIDO = Target.the("Input apellido").locatedBy("//input[@id='lastName']");
    public static final Target INPUT_CORREO = Target.the("Input correo").locatedBy("//input[@id='email']");
    public static final Target SELECT_MES = Target.the("Select mes").locatedBy("//select[@id='birthMonth']");
    public static final Target SELECT_DIA = Target.the("Select dia").locatedBy("//select[@id='birthDay']");
    public static final Target SELECT_ANIO = Target.the("Select anio").locatedBy("//select[@id='birthYear']");
    public static final Target BUTOTN_SIGUIENTE_FORMULARIO = Target.the("Boton segundo formulario").locatedBy("//a[@role='button']");





}
