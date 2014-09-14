/*
* This example will compile and run properly since we have explicitly 
* imported the require classes 
*/
import test1.Test1
import test2.Test2


package test1 {
	class Test1(val name:String)
}

package test2 {
	class Test2(val name:String) {
		val t = new Test1("Test1");
	}
}

package test3 {
	class Test3(val name:String) 
}

object PackageTest2 extends App {

	val t1 = new Test1("Test 1 Object")
	val t2 = new Test2("Test 2 Object")

	println(t1.name)
	println(t2.name)

	import test3.Test3  //This import is only valid within the block
	val t3 = new Test3("Test 3 Object")
	println(t3.name)
}
