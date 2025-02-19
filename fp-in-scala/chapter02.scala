def factorial(n: Int): Int =
  if n <= 1 then 1
  else n * factorial(n - 1)

@main
def main02 =
  for n <- 1 to 10 do println(s"factorial($n) = ${factorial(n)}")
