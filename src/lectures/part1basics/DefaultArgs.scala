package lectures.part1basics

object DefaultArgs extends App {

  def trFac(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFac(n-1, acc * n)
  }

  val fact10 = trFac(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture("jpg", 800, 600)
  savePicture(width = 800)
  savePicture(height = 400, format = "bmp", width = 300)
}
