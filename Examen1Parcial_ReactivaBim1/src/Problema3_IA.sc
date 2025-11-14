// Función anónima original
val generadorIncrementadorAnonimo: Int => (Int => Int) =
  (incremento: Int) =>
    (x: Int) =>
      x + incremento

// Función con nombre equivalente
def generadorIncrementador(incremento: Int): Int => Int =
  def incrementador(x: Int): Int = x + incremento
  incrementador

//Transforma esta función anónima en una función con nombre,
// manteniendo la misma lógica pero en formato resumido