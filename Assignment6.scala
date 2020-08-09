object MyApp extends App{

case class Point(a: Int, b: Int) {
  def x:Int = a
  def y:Int = b

  def add(c: Point) = Point(c.x + x, c.y + y)

  def move(dx: Int, dy: Int) = Point(x + dx, y + dy)

  def distance(c: Point) = math.sqrt(math.pow(y - c.y, 2) + math.pow(x - c.x, 2))

  def invert() = Point(b, a)
}

val x = Point(5,6)
val y = Point(7,5)

//q1
println(x.add(y))
//q2
println(x.move(3,6))
//q3
println(y.distance(x))
//q4
println(x.invert())
}
