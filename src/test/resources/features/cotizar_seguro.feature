# language: es
Característica: Cotizar seguro
  Como usuario web
  Quiero cotizar el seguro de mi vehiculo
  Para tomar la decision de comprarlo o no

  Escenario: cotizar el SOAT de una moto
    Cuando "Adolfo" quiere cotizar el SOAT de su moto con placa "GMI53F"
    Entonces debe ver el valor de 556700 pesos
