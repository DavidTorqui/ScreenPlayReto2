package ScreenPlay.Reto2.Questions;

import ScreenPlay.Reto2.UserInterface.LlenarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(LlenarFormulario.VERIFICAR_BUSQUEDA).viewedBy(actor).asString();
	}
}