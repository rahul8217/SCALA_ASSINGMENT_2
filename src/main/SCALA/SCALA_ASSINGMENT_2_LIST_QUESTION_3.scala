object SCALA_ASSINGMENT_2_LIST_QUESTION_3 extends App{
  def countingSizeOfList(list1:  List[Int]) : Unit={
    var x= list1.indexOf(42)

    var y = list1.indexOf(29)
    println(y-x+1)

  }
  countingSizeOfList(list1 = List(42,63,56,97,67,24,5,6,23,123,567,87,19,29))
}