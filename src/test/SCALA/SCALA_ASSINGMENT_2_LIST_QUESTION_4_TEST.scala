import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_2_LIST_QUESTION_4_TEST extends AnyFunSuite{
  test(testName = "Writing absolute values of all he elements in a list") {
    assert(SCALA_ASSINGMENT_2_LIST_QUESTION_4.updatingValuesWithTheirAbsoluteValues(list1 = List(1,24,-36,-45,25,-96,45,6,-95,-63,-0,84,4,-12)) === List(1,24,36,45,25,96,45,6,95,63,0,84,4,12))
  }

}
