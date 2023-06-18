package Absolute_Basics

object DefaultandNamedArguments extends App {
  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080 ) = println("Saving Picture")
  println(savePicture(width = 1080))

  /*By providing Default Arguments to parameters in savePicture function we ensure that if parameter is not passed for
  any of these format, width or height then a default value can be used
  Moreover, in savePicture if 1080 is taken then we have to explicitly mention that it's for width otherwise
  it'll throw error as first parameter is supposedly be string due to format on the first place*/

}
