
import io.StdIn._
object PrimeNo extends App{
def gcd(a:Int,b:Int):Int=b match{
case 0 => a
case b if (b>a) => gcd(b,a)
case _ => gcd(b,a%b)
}

def checkprime(p:Int,n:Int=2):Boolean=n match{
case a if (a==p)=>true
case a if gcd(p,a)>1=>false
case a =>checkprime(p,a+1)
}

print("enter number:");
var input=readInt();
println(checkprime(input));
}
