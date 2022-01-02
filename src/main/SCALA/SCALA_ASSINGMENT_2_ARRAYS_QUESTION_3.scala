object SCALA_ASSINGMENT_2_ARRAYS_QUESTION_3 extends App {
  def maximumDifferenceBetweenTwoArrayElements(array1: Array[Int]): Int = {
    var maximumValue = 0
    for (i <- 0 to array1.length - 1)
      for (j <- i + 1 to array1.length - 1)
        if (i < j && array1(i) < array1(j) && Math.abs(array1(i) - array1(j)) > maximumValue)
          maximumValue = Math.abs(array1(i) - array1(j))
    maximumValue
  }
  println(maximumDifferenceBetweenTwoArrayElements(array1 = Array(8,3,1,7,9,5,11,3,5)))

}

