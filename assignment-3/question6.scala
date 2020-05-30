import io.StdIn._
object fibo extends App{


	def fibonacci(x:Int):Int=x match{
	case 0 => 0
	case 1 => 1
	case x => fibonacci(x-1)+fibonacci(x-2)
	}

	print("enter number:");
	var input=readInt();
	println(fibonacci(input));
}
