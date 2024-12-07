```scala
class MyClass(val x: Int) {
  def this() = this(0) // this calls another constructor in the same class
  //add some error handling or more robust logic to ensure x is always valid.
  def someMethod(): Unit ={
      println("x is:"+x)
  }
}

 object MainObject{
def main(args:Array[String]):Unit ={
val myObj = new MyClass()
myObj.someMethod()
val myObj2 = new MyClass(5)
myObj2.someMethod()  }
}
```