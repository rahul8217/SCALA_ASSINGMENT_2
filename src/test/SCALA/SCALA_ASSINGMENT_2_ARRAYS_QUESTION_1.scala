object SCALA_ASSINGMENT_2_ARRAYS_QUESTION_1 extends App{
  def nextGreatestNumberRight(array1: Array[Int]): Array[Int] = {
    var currentMaximum = 0
    var array2 = new Array[Int](array1.length)
    for (i <- array1.length - 1 to 0 by - 1) {
      if (currentMaximum < array1(i)) {
        currentMaximum = array1(i)
        array2(i) = -1
      }
      else {
        array2(i) = currentMaximum
      }
    }
    array2
  }
  println(nextGreatestNumberRight(array1 = Array(9, 5, 8, 4, -10, 21, 6, 17, 11)).mkString(","))


}
