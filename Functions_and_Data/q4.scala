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

//question 4.1
var bank:List[Account] = List(a, b, c)
val negativeAcc = bank.filter(_.balance < 0)
println(negativeAcc)

//question 4.2
val total = bank.map(x => x.balance).reduce((p, q) => p+q)
println(total)

//question 4.3
val interest = bank.map(x => if(x.balance >= 0) x.balance*1.05 else x.balance*1.1)
println(interest)
