
# 1:Whats_New_In_Java8
you find in this project a several examples of the new features in Java 8 
## Lambda Expression
### Questions about Lambda Expression?
1. What is a Lambda Expression For? Answer: To make instances of anonymos classes easier to write and then easier to read.
2. What is the type of lambda expression ? Answer: a Functional Interface.
3. Can I put a Lambda Expression ain a variable ? Answer: Yes =>> Consequences: a lambda expression can be taken as a method parameter, and can be returned by a method.
4. Is a lambda an object ? Answer: a lambda expression is an object without an identity => see the example RunnubleLambda.java or ComparatorLambda.java => A lambda expression is created without using **new** .  

### Several ways of writing lambda Expressions
1. The simplest way
```java
FileFilter lambdaFilter = (File pathname) -> pathname.getName().endsWith(".java");
```
2. if I have more than one line
```java
Runnable runnableLambda = () -> {
      for (int i = 0; i < 3; i++) {
        System.out.println("Hello World from Thread [" + Thread.currentThread().getName() + "]");
      }
    };
```
3. If I have more than one argument
```java
Comparator<String> lambdaComparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
```

### Functional Interface
1. Functional interface is an interface with only one abstract method.
Example : 
```java
Runnable runnable = new Runnable() {

      @Override
      public void run() {
        for (int i = 0; i < 3; i++) {
          System.out.println("Hello World from Thread [" + Thread.currentThread().getName() + "]");
        }
      }
    };
```
2. New package on JDK8 **java.util.function**  => **Consequence** : we have new annotations with rich set of functional interfaces.
3. Functional interfaces Categories:  
--* Supplier : is single interface that doesn't take any object as parameter and that provides an object.
```java
@FunctionalInterface
public interface Supplier<T> {
	T get();
}
```
--* Consumer/BiConsumer : Reverse of Supplier: it takes an object as parameter and doesn't return anything.
```java
//Consumer
@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
}
// BiConsumer
@FunctionalInterface
public interface BiConsumer<T, U> {
	void accept(T t, U u);
}
```
--* Predicate/BiPredicate : takes an object as parameter and return a boolean;
```java
//Predicate
@FunctionalInterface
public interface Predicate<T> {
	boolean apply(T t);
}
// BiPredicate
@FunctionalInterface
public interface BiPredicate<T, U> {
	boolean apply(T t, U u);
}
```
--* Function/BiFunction : takes an object as parameter and return an object;
```java
//Function
@FunctionalInterface
public interface Function<,R> {
	R accept(T t);
}
// BiFunction
@FunctionalInterface
public interface BiFunction<T, U, R> {
	R apply(T t, U u);
}
```
--* Function/UnaryOperator : is a special function that takes an object as parameter and return an other object of the same type;
```java
//Function
@FunctionalInterface
public interface Function<T, R> {
	R accept(T t);
}
// UnaryOperator
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T>{
}
// BinaryOperator
@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T>{
}
```

### Method Reference
1. Exampel 1
```java
Consumer<String> c = s -> system.out.println(s);
```
can be written like that:
```java
Consumer<String> c = system.out::println;
```
2. Exampel 2
```java
Comparator<Integer> c = (i1, i2) -> Integer.compare(i1, i2);
```
can be written like that:
```java
Comparator<Integer> c = Integer::compare;
```
### Default Methods
One of the revolutionary concepts on JAVA 8 are the **default methods**.  
putting code in an interface is a new concept on java 8 by adding the keyword **default** before the method implementation on the interface like this example.
```java
public interface Iterable<E> {
  // the usual methods 
  ...

  default void forEach(Consumer<E> consumer){
  for(E e : this){
  accept(e);
  }
  }
}
```
it allows to change the old interfaces without breaking the existing implementations.  
it allows new patterns!  

and by the way static methods are also allowed in java 8 interfaces.  
## Java 8 Stream API and Collectors
1. Map/Filter/Reduce
2. Streams  
it gives way to efficiently process large amounts of data ... and aloso smaller ones.  
In parallel, to laverage the computing power of multicore CPUs.  
Pipelined, to avoid unecassary intermediary computations.  
A stream is an object on which one can define opertaions  
it is an object that does not hold any data  
it is an object that shoul not change the data it processes  
Stream Patterns  
First Operation : forEach()  
```java
List<Person> persons = ... ;
Stream<Person> stream = persons.stream();
stream.forEach(system.out::println);
```
prints all the arguments of the list.  
it takes an instance of consumer as an argument.  
**Filter a Stream**  
Example:  
```java
Predicate<String> p = Predicate.isEqual("two");  
  
the difference between **forEach** and **peek** on stream opertaions that:  
**ForEach** is a final operation.  
**Peek** is an intermediary operation.  
**Map a stream**   
Map() is an intermediary operation of  stream  
flatMap() return a stream of stream  
**Reducing**  


