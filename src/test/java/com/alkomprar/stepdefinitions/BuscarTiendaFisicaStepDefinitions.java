package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.BuscarTienda;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.DetalleTiendaPage.DIRECCION;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarTiendaFisicaStepDefinitions {

    @Cuando("{string} quiere buscar la tienda {string}")
    public void quiereBuscarLaTienda(String actor, String ubicacion) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                BuscarTienda.lugar(ubicacion)
        );
    }
    @Entonces("debe ver la direccion {string}")
    public void debeVerLaDireccion(String direccion) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(DIRECCION).hasText(direccion)
        );
    }

}
