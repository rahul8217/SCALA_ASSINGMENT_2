import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_2_ARRAYS_QUESTION_1_TEST extends AnyFunSuite{
  test(testName = "Replacing every element from array with greatest value from right") {
    assert(SCALA_ASSINGMENT_2_ARRAYS_QUESTION_1.nextGreatestNumberRight(array1 = Array(9, 5, 8, 4, -10, 21, 6, 17, 11)).sameElements(Array(21,21,21,21,21,-1,17,-1,-1)))
  }

}
