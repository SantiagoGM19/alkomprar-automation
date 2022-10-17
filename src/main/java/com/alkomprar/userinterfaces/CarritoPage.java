package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
	public static final Target ARTICULOS_CARRITO = Target.the("Articulos carrito").locatedBy("//ul[@class='item__list item__list__cart']/li");
	public static final Target NOMBRE_ARTICULO_CARRITO = Target.the("Nombre Articulos carrito").locatedBy("//span[contains(text(), '{0}')]");
	public static final Target RECOGER_EN_TIENDA = Target.the("Boton de opcion de recoger en tienda").locatedBy("//div[@class='cart-delivery-mode__store ']//label[@class='custom-radio__label click-label']");
	public static final Target DIRECCION_ENVIO = Target.the("Direccion de tienda seleccionada").locatedBy("//div[@class='js-delivery-mode js-pickup-value']/div[@class='store-name']");
	public static final Target ELIMINAR_ARTICULO = Target.the("Boton eliminar articulo").locatedBy("//div[@class='item__interactions hidden-xs hidden-sm']//div[@data-entry-action='REMOVE']/a");
}
