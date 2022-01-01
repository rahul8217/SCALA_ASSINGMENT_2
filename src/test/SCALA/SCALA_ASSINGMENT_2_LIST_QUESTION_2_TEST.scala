import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_2_LIST_QUESTION_2_TEST extends AnyFunSuite{
  test("Removing elements at Odd position in a list") {
    assert(SCALA_ASSINGMENT_2_LIST_QUESTION_2.removeElementsAtOddPosition(list1 = List(1, 2, 43, 54, 56,48,97,85,67,143))===List(2,54,48,85,143))
  }

}
