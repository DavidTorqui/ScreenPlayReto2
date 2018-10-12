package ScreenPlay.Reto2.Tasks;

import java.util.List;

import ScreenPlay.Reto2.Interactions.Esperar10;
import ScreenPlay.Reto2.Interactions.Esperar15;
import ScreenPlay.Reto2.Interactions.Esperar5;
import ScreenPlay.Reto2.Interactions.SeleccionarLista;
import ScreenPlay.Reto2.Model.IngresarValores;
import ScreenPlay.Reto2.UserInterface.LlenarFormulario;
import ScreenPlay.Reto2.UserInterface.RegistrarseEntrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registrar implements Task{
	
	private List<IngresarValores> registrovalores;
	
	public Registrar(List<IngresarValores> registroformulario) {
        super();
        this.registrovalores = registroformulario;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(RegistrarseEntrar.LOGIN));
		actor.attemptsTo(Esperar5.aMoment());	
		actor.attemptsTo(Click.on(LlenarFormulario.Menu));
		actor.attemptsTo(Click.on(LlenarFormulario.AGREGAR_EMPLEADO));
		actor.attemptsTo(Esperar15.aMoment());
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getNombre()).into(LlenarFormulario.NOMBRE));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getSegundoNombre()).into(LlenarFormulario.SEGUNDO_NOMBRE));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getApellido()).into(LlenarFormulario.APELLIDO_EMPLEADO));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getId()).into(LlenarFormulario.ID_EMPLEADO));
		actor.attemptsTo(Click.on(LlenarFormulario.SELECCIONAR_UBICACION));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +registrovalores.get(0).getUbicacion()+ "')]"));
		actor.attemptsTo(Click.on(LlenarFormulario.GUARDAR));
		actor.attemptsTo(Esperar10.aMoment());
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getOtroId()).into(LlenarFormulario.OTRA_ID));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getFechaNacimiento()).into(LlenarFormulario.FECHA_NACIMIENTO));
		actor.attemptsTo(Click.on(LlenarFormulario.SELECCIONAR_ESTADO_CIVIL));
		actor.attemptsTo(SeleccionarLista.Desde(LlenarFormulario.ESTADO_CIVIL, registrovalores.get(0).getEstadoCivil().trim()));
		actor.attemptsTo(Click.on(LlenarFormulario.GENERO));
		actor.attemptsTo(Click.on(LlenarFormulario.SELECCIONAR_NACIONALIDAD));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +registrovalores.get(0).getNacionalidad()+ "')]"));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getLicencia()).into(LlenarFormulario.LICENCIA));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getFechaVencimiento()).into(LlenarFormulario.FECHA_VENCIMIENTO));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getApodo()).into(LlenarFormulario.APODO));
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getServicioMilitar()).into(LlenarFormulario.SERVICIO_MILITAR));
		actor.attemptsTo(Click.on(LlenarFormulario.FUMADOR));
		actor.attemptsTo(Click.on(LlenarFormulario.GUARDAR_COMPLETO));
		actor.attemptsTo(Esperar10.aMoment());
		actor.attemptsTo(Click.on(LlenarFormulario.LISTA_EMPLEADOS));
		actor.attemptsTo(Esperar5.aMoment());
		actor.attemptsTo(Enter.theValue(registrovalores.get(0).getNombre()).into(LlenarFormulario.BUSQUEDA_NOMRE));
		actor.attemptsTo(Click.on(LlenarFormulario.SELECCIONA_NOMBRE));
		actor.attemptsTo(Esperar5.aMoment());
	}
		
	public static Registrar empleadonuevo (List<IngresarValores> registroAuto) {
		return Tasks.instrumented(Registrar.class, registroAuto);
	}
}