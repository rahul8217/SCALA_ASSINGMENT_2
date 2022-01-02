import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_2_ARRAYS_QUESTION_2_TEST extends AnyFunSuite{
  test(testName = "Finding product of 2 maximum elements in an array"){
    assert(SCALA_ASSINGMENT_2_ARRAYS_QUESTION_2.maximumProductOfTwoIntegersOfArray(array1 = Array(2, 3, 5, 7, -7, 5, 8, -5)) == 56)
  }

}
