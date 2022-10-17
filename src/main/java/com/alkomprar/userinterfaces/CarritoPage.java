package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
	public static final Target ARTICULOS_CARRITO = Target.the("Articulos carrito").locatedBy("//ul[@class='item__list item__list__cart']/li");
	public static final Target NOMBRE_ARTICULO_CARRITO = Target.the("Nombre Articulos carrito").locatedBy("//span[contains(text(), '{0}')]");
	public static final Target RECOGER_EN_TIENDA = Target.the("Boton de opcion de recoger en tienda").locatedBy("//div[@class='cart-delivery-mode__store ']//div[@class='form-check custom-radio']/label[@class='custom-radio__label click-label']");
	public static final Target DIRECCION_ENVIO = Target.the("").locatedBy("//div[@class='js-delivery-mode js-pickup-value']/div[@class='store-name']");
}
