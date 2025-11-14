def myMethod(datos: List[Double]): Double =
  val logs = datos.map(math.log)
  val promedio = logs.sum / logs.size
  val sumaCuadrados = logs.map(l => math.pow(l - promedio, 2)).sum
  math.sqrt(sumaCuadrados / logs.size)

  //Promt usado: Transforma este codigo en una version funcional en Scala, usando el mismo
// proceso y manteniéndolo resumido y claro