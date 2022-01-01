object SCALA_ASSINGMENT_2_LIST_QUESTION_4 extends App {
  def updatingValuesWithTheirAbsoluteValues(list1: List[Int]): List[Int] = list1.map(_.abs)
  var x = updatingValuesWithTheirAbsoluteValues(list1 = List(1,24,-36,-45,25,-96,45,6,-95,-63,-0,84,4,-12))
  for (i <- x)
    println(i)

}
