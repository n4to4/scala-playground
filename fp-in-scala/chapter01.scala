//> scala 3

object Chapter01:
  class Cafe:
    def buyCoffee(cc: CreditCard): Coffee =
      val cup = Coffee()
      cc.charge(cup.price)
      cup

  class CreditCard:
    def charge(price: Double): Unit =
      println("charging " + price)

  class Coffee:
    val price: Double = 2.0

  @main
  def main01 =
    val cc = CreditCard()
    val cafe = Cafe()
    val cup = cafe.buyCoffee(cc)
