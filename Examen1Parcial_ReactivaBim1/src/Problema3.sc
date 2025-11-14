def generadorIncrementador(incremento: Int): Int => Int = {
  def incrementador(x: Int): Int = x + incremento
  incrementador
}