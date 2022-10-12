package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CotizarSeguroStepDefinitions {

    @Cuando("{string} quiere cotizar el SOAT de su moto con placa {string}")
    public void quiereCotizarElSOATDeSuMotoConPlaca(String actor, String placa) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/")
        );
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("debe ver el valor de {int} pesos")
    public void debeVerElValorDePesos(Integer valor) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
