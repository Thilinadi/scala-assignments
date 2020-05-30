def wage(hours:Int):Int=hours*150

def otpay(hours:Int):Int=hours*75

def fullpay(h1:Int,h2:Int):Int=wage(h1)+otpay(h2)

def tax(fullpay:Int):Double=fullpay*0.1

def takehome(h1:Int,h2:Int):Double=fullpay(h1,h2)-tax(fullpay(h1,h2))
