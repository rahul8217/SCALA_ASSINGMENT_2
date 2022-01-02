object SCALA_ASSINGMENT_2_ARRAYS_QUESTION_2 extends App {
  def maximumProductOfTwoIntegersOfArray(array1: Array[Int]): Int = {
    for (i <- 1 to array1.length -1) {
      var j = i - 1
      var key1 = array1(i)
      while (j >= 0 && array1(j) > key1) {
        array1(j + 1) = array1(j)
        j -= 1
      }
      array1(j + 1) = key1
    }
    val maximumProduct1 = array1(array1.length - 1) * array1(array1.length - 2)
    val maximumProduct2 = array1(0) * array1(1)
    if (maximumProduct1 > maximumProduct2)
      maximumProduct1
    else
      maximumProduct2
  }
  println(maximumProductOfTwoIntegersOfArray(array1 = Array(2, 3, 5, 7, -7, 5, 8, -5)))

}
