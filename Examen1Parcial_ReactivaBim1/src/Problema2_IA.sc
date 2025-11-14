case class PrecioEstandar(producto: String, precio: Double)

val precios = List(
  PrecioEstandar("Leche", 5.50),
  PrecioEstandar("Huevos", 1.25),
  PrecioEstandar("Pan",   4.20)
)

// Función única para aplicar cualquier ajuste a los precios
def ajustarPrecios(lista: List[PrecioEstandar])
                  (ajuste: Double => Double): List[PrecioEstandar] =
  lista.map(p => p.copy(precio = ajuste(p.precio)))

// Ejemplos de reglas de ajuste
val iva        = (x: Double) => x * 1.12
val descuento  = (x: Double) => x * 0.90
val promocion  = (x: Double) => x + 0.75

// Aplicación
val preciosConIVA       = ajustarPrecios(precios)(iva)
val preciosConDesc      = ajustarPrecios(precios)(descuento)
val preciosConPromocion = ajustarPrecios(precios)(promocion)


//Prompt usado: 
//Con este código como base, resúmeme una solucion funcional en Scala 
// donde exista una sola función que reciba la lista de precios y una función 
// de ajuste (impuesto, descuento o estrategia comercial), y retorne una nueva 
// lista con los precios modificados