package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UltimoFormularioPage {


    public static final Target INPUT_CONTRA = Target.the("Contrasena").locatedBy("//input[@id='password']");
    public static final Target INPUT_CONFIRMAR = Target.the("Confirmar contrasena").locatedBy("//input[@id='confirmPassword']");
    public static final Target SPAN_OPTION1 = Target.the("option1").locatedBy("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']");
    public static final Target SPAN_OPTION2 = Target.the("option2").locatedBy("//span[@class='checkmark signup-consent__checkbox error']");
    public static final Target SPAN_OPTION3 = Target.the("option3").locatedBy("//span[@class='checkmark signup-consent__checkbox error']");
    public static final Target BUTOTN_COMPLETAR = Target.the("Boton completar").locatedBy("//a[@id='laddaBtn']");



}
