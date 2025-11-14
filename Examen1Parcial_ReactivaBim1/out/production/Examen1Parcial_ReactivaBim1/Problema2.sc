case class PrecioEstandar (producto: String, precioe : Double)
val Precios = List(
  PrecioEstandar("Leche",5.50),
  PrecioEstandar("Huevos", 1.25),
  PrecioEstandar("Pan", 4.20)
)
val sumPrecios : Double = Precios.map( std =>std.precioe).sum
val PromedioDescuento : Double = sumPrecios / 1.5