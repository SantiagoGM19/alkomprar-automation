package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuTiendasPage {
	public static final Target TIENDA = Target.the("Tienda {0}").locatedBy("//div[@class='store']/a[@title='{0}']");
}
