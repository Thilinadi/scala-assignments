import io.StdIn._
object addition extends App{

	def addition(x:Int):Int={
	if (x<=1)
      x
	else
      x+addition(x-1)
	}


	print("enter number:");
	var input=readInt();
	println(addition(input));
}
