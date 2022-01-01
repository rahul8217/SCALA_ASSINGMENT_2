import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_2_LIST_QUESTION_1_TEST extends AnyFunSuite{
  test(testName = "Repeating all the elements of a list to a specified number of times") {
    assert(SCALA_ASSINGMENT_2_LIST_QUESTION_1.repeatListElementsToSpecifiedNumber(3, List(1,2,3,4)) === List(1,1,1,2,2,2,3,3,3,4,4,4))
  }

}
