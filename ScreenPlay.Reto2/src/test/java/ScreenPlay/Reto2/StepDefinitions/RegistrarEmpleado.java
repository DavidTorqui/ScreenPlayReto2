package ScreenPlay.Reto2.StepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import ScreenPlay.Reto2.Model.IngresarValores;
import ScreenPlay.Reto2.Questions.LaRespuesta;
import ScreenPlay.Reto2.Tasks.Abrir;
import ScreenPlay.Reto2.Tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistrarEmpleado {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor david = Actor.named("David");
	
	@Before
	public void configuracionInicial() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
		
	@Dado("^que david necesita crear un empleado en el OrageHR$")
	public void queDavidNecesitaCrearUnEmpleadoEnElOrageHR() {
		david.wasAbleTo(Abrir.lapaginaweb());
	}

	@Cuando("^el realiza el ingreso del registro en la aplicacion$")
	public void elRealizaElIngresoDelRegistroEnLaAplicacion(List<IngresarValores> automaticamente) {
		david.attemptsTo(Registrar.empleadonuevo(automaticamente));
	}

	@Entonces("^el visualiza el id (.*) en el aplicativo$")
	public void elVisualizaElNuevoEmpleadoEnElAplicativo(String palabraesperada)  {
		david.should(seeThat(LaRespuesta.es(),equalTo(palabraesperada)));
	}
}