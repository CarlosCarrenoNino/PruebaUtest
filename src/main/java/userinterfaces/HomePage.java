package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://Utest.com")

public class HomePage extends PageObject {

    public static final Target BOTON_JOIN_TODAY = Target.the("Boton join today").locatedBy("//a[contains(text(),'Join Today') and @class='unauthenticated-nav-bar__sign-up']");
    /*public static final Target IMG_PROMOCION = Target.the("modal promo").located(By.className("btn-close"));
    public static final Target INPUT_BUSCAR_OBJETO = Target.the("Input donde se realiza la busqueda").located(By.id("search-key"));
    public static final Target SELECT_TIPO_CATEGORIA = Target.the("Select donde se selecciona la categoria del producto").located(By.id("search-dropdown-box"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Boton para buscar el articulo").located(By.className("search-button"));
    public static final Target LINK_BUSCAR_ARTICULO = Target.the("LINK para buscar el articulo").locatedBy("//img[starts-with(@alt,'Mascarillas faciales FFP2 de 4 cap')]");*/






}
