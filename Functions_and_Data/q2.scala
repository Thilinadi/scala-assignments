class Rational(x:Int, y:Int) {
  def numer = x
  def denom = y
  def neg = new Rational(-this.numer, this.denom)

  def sub(r:Rational) = new Rational(this.numer*r.denom - this.denom*r.numer, this.denom*r.denom)

  override def toString = numer +  "/" + denom
}

val x = new Rational(2, 3)
val y = new Rational(4, 6)
val z = new Rational(5, 7)

println(x.sub(y).sub(z))
