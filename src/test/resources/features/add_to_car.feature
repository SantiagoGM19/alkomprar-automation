# language: es
Característica: Add to car
  Como usuario web
  Quiero agregar productos al carro de compras
  Para comprar

  Escenario: agregar 4 productos al carito y de 4 categorias distintas
    Cuando "Rodolfo" quiere comprar un articulo de las categorias "Celulares", "Computadores", "TV"  y "Llantas y Motos"
    Entonces debe ver 4 articulos en el carrito

  Escenario: Comprar un Iphone 13
    Cuando "Rodolfo" quiere comprar un "iPhone 13"
    Entonces debe ver en el carrito de comprar "iPhone 13"

  Escenario: Cambiar metodo de envio para recoger en una tienda alkosto
    Dado "Rodolfo" tiene un articulo de la categoria "Cámaras" en el carrito
    Cuando quiere cambiar el metodo de envio para recogerlo en la tienda "alkosto av. 30"
    Entonces debe ver en el carrito de compras la direccion "Alkosto Av. 30" para recogerlo