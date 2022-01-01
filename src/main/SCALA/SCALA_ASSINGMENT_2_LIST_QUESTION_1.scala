object SCALA_ASSINGMENT_2_LIST_QUESTION_1 extends App{
  def repeatListElementsToSpecifiedNumber(num1:Int,list1:List[Int]):List[Int] =
    list1.flatMap(List.fill(num1)(_))

  var a =  repeatListElementsToSpecifiedNumber(3,list1=List(1,2,3,4))

  for (x <- a)
    println(x)


}

