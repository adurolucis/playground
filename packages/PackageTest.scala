/*
This file will not compile.  It will generate the errors below

PackageTest.scala:11: error: not found: type Test1
	val t1 = new Test1("Test 1 Object")
                     ^
PackageTest.scala:12: error: not found: type Test2
	val t2 = new Test2("Test 2 Object")
                     ^
two errors found
*/
package test1 {
	class Test1(val name:String)
}

package test2 {
	class Test2(val name:String)
}

object PackageTest extends App {

	val t1 = new Test1("Test 1 Object")
	val t2 = new Test2("Test 2 Object")

	println(t1.name)
	println(t2.name)

}
