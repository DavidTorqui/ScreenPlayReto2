package ScreenPlay.Reto2.Interactions;

import static ScreenPlay.Reto2.Util.UtilidadTiempo.condicionExitosa;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar10 implements Interaction {

                @Override
                public <T extends Actor> void performAs(T actor) {
                               try {
                                               Awaitility.await().forever().pollInterval(10000, TimeUnit.MILLISECONDS).until(condicionExitosa());
                               } catch (Exception e) {
                                               e.getMessage();
                               }
                }

                public static Esperar10 aMoment() {
                return instrumented(Esperar10.class);
                }
}