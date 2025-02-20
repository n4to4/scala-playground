object Chapter02:
  def factorial(n: Int): Int =
    if n <= 1 then 1
    else n * factorial(n - 1)

  def factorial2(n: Int): Int =
    @annotation.tailrec
    def go(m: Int, acc: Int): Int =
      if m <= 1 then acc else go(m - 1, acc * m)
    go(n, 1)

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)

  def compose[A, B, C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

  @main
  def main02 =
    for n <- 1 to 10 do
      println(s"factorial($n)  = ${factorial(n)}")
      println(s"factorial2($n) = ${factorial2(n)}")
