//> using scala 3
//> using dep "com.lihaoyi::os-lib:0.10.7"

@main
def countFiles(): Unit =
  val paths = os.list(os.pwd)
  println(paths.length)
  for p <- paths do println(s"path: $p")

def hello1(name: String): Unit =
  println(s"Hello, $name!")

def hello0(): Unit =
  println("Hello, World!")
