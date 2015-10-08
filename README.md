
# ${1:Whats_New_In_Java8}
you find in this project a several examples of the new features in Java 8 
## Lambda Expression
###What is a Lambda Expression For? 
1. First Answer : To make instances of anonymos classes easier to write and then easier to read.

### Several ways of writing
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
