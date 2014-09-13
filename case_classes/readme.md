## Case Classes ##

- Compiler automatically converts the contructor arguments into immutable fields
- Compiler generates (equals, hashCode, toString)
- Compiler generates a companion object with an apply factory method that takes the same arguments as the primary constructor
- An unapply method is also created 
- In scala 2.8 and up, it will also create a copy method
