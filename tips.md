Collection of small tips

When instantiating a default constructor with no args, the parens can be ommitted.
```
val animal = new Animal
```

No constructors exist for primitive types
```
val num = new Int(7) // will not compile
```

Members with no access modifiers are ```public``` visibility by default, and not ```default``` visibility as in Java



Use the ```sameElements``` when comparing whether or not two arrays are equal
```
Array(1,3).sameElements(Array(1,3)) // true
```
