package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.CarritoPage.ELIMINAR_ARTICULO;
import static com.alkomprar.userinterfaces.CarritoPage.RECOGER_EN_TIENDA;
import static com.alkomprar.userinterfaces.DetalleEnvioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarArticulo implements Task {


    public static Performable eliminar() {
        return instrumented(EliminarArticulo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ELIMINAR_ARTICULO)
        );
    }
}
