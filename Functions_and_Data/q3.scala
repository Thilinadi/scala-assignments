class Account(id:String, n:Int, b:Double) {
  val nic = id
  val accountno = n
  var balance = b

  def transfer(a:Account, b:Double): Unit = {
    a.balance += b
    balance -= b
  }

  override def toString = "["+nic+":"+accountno+":"+balance+"]"
}

var a = new Account("1234", 973451236, 10000)
var b = new Account("2457", 657903215, 6000)
var c = new Account("2457", 456789123, -1500)


b.transfer(a, 8700)
println(a.balance)
println(b.balance)
