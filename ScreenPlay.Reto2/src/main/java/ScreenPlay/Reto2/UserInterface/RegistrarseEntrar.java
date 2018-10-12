package ScreenPlay.Reto2.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://orangehrm-demo-6x.orangehrmlive.com/")
public class RegistrarseEntrar extends PageObject{
	
	public static final Target USUARIO = Target.the("INGRESA LOGIN").located(By.xpath("//*[@id=\\\"txtUsername\\\"]"));
	public static final Target CONTRASEÑA  = Target.the("INGRESA CONTRASEÑA").located(By.xpath("//*[@id=\"txtPassword\"]"));
	public static final Target LOGIN = Target.the("DA CLICK EN INICIAR SESION").located(By.xpath("//*[@id=\"btnLogin\"]"));
}
