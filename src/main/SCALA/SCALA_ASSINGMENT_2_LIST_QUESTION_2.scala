object SCALA_ASSINGMENT_2_LIST_QUESTION_2 extends App{
  def removeElementsAtOddPosition(list1: List[Int]): List[Int] =
    (list1.indices.collect { case i if i % 2 != 0 => list1(i) }).toList

  var a = removeElementsAtOddPosition(list1 = List(1, 2, 43, 54, 56,48,97,85,67,143))

  for (x <- a)
    println(x)

}