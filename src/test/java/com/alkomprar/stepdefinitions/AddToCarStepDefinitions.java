package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import com.alkomprar.tasks.CambiarLugarEnvio;
import com.alkomprar.tasks.EliminarArticulo;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.CarritoPage.DIRECCION_ENVIO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddToCarStepDefinitions {

    @Cuando("{string} quiere comprar un articulo de las categorias {string}, {string}, {string}  y {string}")
    public void rodolfoQuiereComprarUnCelularComputadorTvYLlanta(String actor, String categoria1, String categoria2, String categoria3, String categoria4) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                AgregarAlCarrito.elemento(categoria1),
                AgregarAlCarrito.elemento(categoria2),
                AgregarAlCarrito.elemento(categoria3),
                AgregarAlCarrito.elemento(categoria4)
        );
    }
    @Entonces("debe ver {int} articulos en el carrito")
    public void debeVerEnElCarrito(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }

    @Cuando("{string} quiere comprar un {string}")
    public void rodolfoQuiereComprarUnIphone(String actor, String item) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                BuscarYAgregarCarrito.elemento(item)
        );
    }
    @Entonces("debe ver en el carrito de comprar {string}")
    public void debeVerEnElCarritoDeComprarIphone(String item) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO.of(item)),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(1)
        );
    }

    @Dado("{string} tiene un articulo de la categoria {string} en el carrito")
    public void tieneUnArticuloDeLaCategoriaEnElCarrito(String actor, String categoria) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                AgregarAlCarrito.elemento(categoria)
        );
    }
    @Cuando("quiere cambiar el metodo de envio para recogerlo en la tienda {string}")
    public void quiereCambiarElMetodoDeEnvioParaRecogerloEnLaTienda(String ubicacion) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                CambiarLugarEnvio.lugar(ubicacion)
        );
    }
    @Entonces("debe ver en el carrito de compras la direccion {string} para recogerlo")
    public void debeVerEnElCarritoDeComprasLadireccion(String direccion) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(DIRECCION_ENVIO, isVisible()),
                Ensure.that(DIRECCION_ENVIO).hasText(direccion)
        );

    }

    @Cuando("quiere eliminar este articulo del carrito")
    public void quiereEliminarEsteArticuloDelCarrito() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                EliminarArticulo.eliminar()
        );
    }
    @Entonces("debe ver {int} articulos en el carrito de compras")
    public void debeVerArticulosEnElCarritoDeCompras(Integer cantidadArticulos) {
        Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos);
    }

}
