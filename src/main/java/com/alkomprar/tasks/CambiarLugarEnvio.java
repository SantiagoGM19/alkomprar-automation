package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.CarritoPage.RECOGER_EN_TIENDA;
import static com.alkomprar.userinterfaces.DetalleEnvioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CambiarLugarEnvio implements Task {
    private String ubicacion;

    public CambiarLugarEnvio(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static Performable lugar(String ubicacion) {
        return instrumented(CambiarLugarEnvio.class, ubicacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RECOGER_EN_TIENDA),
                WaitUntil.the(LISTA_TIENDAS, isVisible()),
                Scroll.to(TIENDA_ENVIO.of(ubicacion)).andAlignToTop(),
                WaitUntil.the(TIENDA_ENVIO.of(ubicacion), isClickable()),
                Click.on(TIENDA_ENVIO.of(ubicacion)),
                Click.on(VOLVER_AL_CARRITO)
        );
    }
}
