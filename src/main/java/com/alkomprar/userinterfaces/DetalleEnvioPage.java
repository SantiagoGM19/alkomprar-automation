package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleEnvioPage {

	public static final Target LISTA_TIENDAS = Target.the("Lista de tiendas para el envio").locatedBy("//div[@class='modal-body__stores js-store-list']/div");
	public static final Target TIENDA_ENVIO = Target.the("Tienda {0} para enviar el articulo").locatedBy("//div[@data-name='{0}']");
	public static final Target VOLVER_AL_CARRITO = Target.the("Boton para ir de nuevo al carrito").locatedBy("//form[@id='add_to_cart_storepickup_form']//button[@id='locationAddToCart']");
}
