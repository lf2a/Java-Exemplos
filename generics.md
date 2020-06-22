# Generics

Existem principalmente 3 vantagens de generics. Eles são os seguintes:

- **Segurança de tipo:** podemos armazenar apenas um único tipo de objetos em genéricos. 
Não permite armazenar outros objetos.

```java
List list = new ArrayList();    
list.add(10);  
list.add("10");  

// With Generics, it is required to specify the type of object we need to store.  
List<Integer> list = new ArrayList<Integer>();    
list.add(10);  
list.add("10"); // compile-time error  
```

- **A conversão de tipo não é necessária:** não há necessidade de converter o objeto em tipográfica.

```java
List list = new ArrayList();    
list.add("hello");    
String s = (String) list.get(0); // typecasting    

// After Generics, we don't need to typecast the object.  
List<String> list = new ArrayList<String>();    
list.add("hello");    
String s = list.get(0);    
```

- **Verificação em tempo de compilação:** é verificada em tempo de compilação para que o
 problema não ocorra no tempo de execução. A boa estratégia de programação diz que é 
 muito melhor lidar com o problema em tempo de compilação do que em tempo de execução.

```java
List<String> list = new ArrayList<String>();    
list.add("hello");
list.add(32); // Compile Time Error
```

Sintaxe para usar generic collection:

```java
ClassOrInterface<Type>
```

Exemplo para usar Generics em java:

```java
ArrayList<String>
```

## Exemplo

Aqui, estamos usando a classe *ArrayList*, mas você pode usar qualquer classe de coleção, 
como *ArrayList*, *LinkedList*, *HashSet*, *TreeSet*, *HashMap*, *Comparator* e etc.

```java
import java.util.*;  
class TestGenerics1{  
    public static void main(String args[]){  
        ArrayList<String> list = new ArrayList<String>();  
        list.add("rahul");  
        list.add("jai");  
        // list.add(32); // compile time error  
          
        String s=list.get(1); // type casting is not required  
        System.out.println("element is: "+s);  
          
        Iterator<String> itr=list.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }
    }
}
```

## Generic class

Uma classe que pode se referir a qualquer tipo é conhecida como classe genérica. 
Aqui, estamos usando o parâmetro do tipo *T* para criar a classe genérica do tipo específico.

Vamos ver um exemplo simples para criar e usar a classe genérica.

Criando uma generic class:

```java
class MyGen<T>{  
    T obj;  
    
    void add(T obj){
        this.obj=obj;
    }  
    
    T get(){
            return obj;
    }  
}  
```

O tipo *T* indica que pode se referir a qualquer tipo (como *String*, *Integer* e *Funcionario*). 
O tipo que você especificar para a classe será usado para armazenar e recuperar os dados.

### Usando generic class

```java
class TestGenerics3{
    public static void main(String args[]){  
        MyGen<Integer> m=new MyGen<Integer>();  
        m.add(2);  
        // m.add("vivek"); // Compile time error  
        System.out.println(m.get());  
    }
}
```

### Parâmetros de tipo

As convenções de nomenclatura dos parâmetros de tipo são importantes para aprender 
minuciosamente os genéricos. Os parâmetros de tipo comum são os seguintes:

- *T* - Type

- *E* - Element

- *K* - Key

- *N* - Number

- *V* - Value

### Generic Method

Como a classe genérica, podemos criar um método genérico que pode aceitar qualquer 
tipo de argumento. Aqui, o escopo dos argumentos é limitado ao método em que é declarado. 
Permite métodos estáticos e não estáticos.

Vamos ver um exemplo simples do método genérico java para imprimir elementos da matriz. 
Estamos usando aqui *E* para denotar o elemento.

```java
public class TestGenerics4{
   public static <E> void printArray(E[] elements) {  
        for (E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
    public static void main(String args[]) {  
        Integer[] intArray = {10, 20, 30, 40, 50};  
        Character[] charArray = {'J', 'A', 'V', 'A', 'T','P','O','I','N','T'};  
  
        System.out.println( "Printing Integer Array" );  
        printArray(intArray);   
  
        System.out.println("Printing Character Array" );  
        printArray(charArray);   
    }   
}  
```

### Wildcard in Java Generics

O `?` O símbolo (ponto de interrogação) representa o elemento wildcard. 
Significa qualquer tipo. Se escrevermos `<? extends Number>`, significa qualquer 
classe filha de `Number`, por exemplo, *Integer*, *Float* e *double*. Agora podemos 
chamar o método da classe `Number` através de qualquer objeto de classe filho.

Podemos usar um wildcard como um tipo de parâmetro, campo, tipo de retorno ou 
variável local. No entanto, não é permitido usar um wildcard como argumento de 
tipo para uma chamada de método genérico, criação de instância de classe genérica 
ou um supertipo.

```java
import java.util.*;  
abstract class Shape{  
    abstract void draw();  
}
class Rectangle extends Shape{  
    void draw(){System.out.println("drawing rectangle");}  
    }  
    class Circle extends Shape{  
        void draw(){
            System.out.println("drawing circle");
        }  
    }  
    class GenericTest{  
        // creating a method that accepts only child class of Shape  
        public static void drawShapes(List<? extends Shape> lists){  
        for(Shape s:lists){  
            s.draw(); // calling method of Shape class by child class instance  
        }  
    }  

    public static void main(String args[]){  
        List<Rectangle> list1=new ArrayList<Rectangle>();  
        list1.add(new Rectangle());  
          
        List<Circle> list2=new ArrayList<Circle>();  
        list2.add(new Circle());  
        list2.add(new Circle());  
          
        drawShapes(list1);  
        drawShapes(list2);  
    }
}
```

### Upper Bounded Wildcards

O objetivo dos upper bounded wildcards é diminuir as restrições em uma variável. 
**Ele restringe o tipo desconhecido a ser um tipo específico ou um subtipo desse tipo.** 
É usado declarando o caractere wildcard (`?`) Seguido pela palavra-chave *extends* 
(no caso de, *class*) ou *implements* (no caso de, *interface*), seguido por seu upper bounded.


```java
List<? extends Number>
```

Suponha que queremos escrever o método para a lista de `Number` e seus subtipos 
(como *Integer*, *Double*). Usando a `List<? extends Number>` é adequado para uma lista 
do tipo `Number` ou para qualquer uma de suas subclasses, enquanto `List<Number>` funciona 
apenas com a lista do tipo `Number`. Então, `List<? extends Number>` é menos restritivo 
que `List<Number>`.

### Exemplo de Upper Bound Wildcard

```java
import java.util.ArrayList;  

public class UpperBoundWildcard {
    private static Double add(ArrayList<? extends Number> num) {
        double sum = 0.0;

        for(Number n:num) {  
            sum = sum + n.doubleValue();  
        }  
 
        return sum;
    }

     public static void main(String[] args) {  
 
        ArrayList<Integer> l1 = new ArrayList<Integer>();  
        l1.add(10);
        l1.add(20);
        System.out.println("displaying the sum= " + add(l1));

        ArrayList<Double> l2 = new ArrayList<Double>();  
        l2.add(30.0);
        l2.add(40.0);
        System.out.println("displaying the sum= " + add(l2));
    }
}
```

### Unbounded Wildcards

O tipo de unbounded wildcard representa a lista de um tipo desconhecido, como `List<?>`. 
Essa abordagem pode ser útil nos seguintes cenários:

- Quando o método fornecido é implementado usando a funcionalidade fornecida na classe Object.

- Quando a classe genérica contém os métodos que não dependem do parâmetro type.

```java
import java.util.Arrays;  
import java.util.List;  

public class UnboundedWildcard {
    public static void display(List<?> list) {
        for(Object o:list) {
            System.out.println(o);
        }
    }
 
 
    public static void main(String[] args) {
    List<Integer> l1=Arrays.asList(1,2,3);
    System.out.println("displaying the Integer values");
    display(l1);
 
    List<String> l2=Arrays.asList("One","Two","Three");
        System.out.println("displaying the String values");
        display(l2);
    }
}
```

### Lower Bounded Wildcards

**O objetivo dos lower bounded wildcards é restringir o tipo desconhecido a ser um 
tipo específico ou um supertipo desse tipo.** É usado declarando o caractere wildcard (`?`) 
Seguido pela palavra-chave *super*, seguida pelo seu lower bounded.

```java
List<? super Integer>
```

Suponha que queremos escrever o método para a lista de *Integer* e seu supertipo 
(como *Number*, *Object*). Usando a `List<? super Integer>` é adequado para uma lista 
do tipo *Integer* ou qualquer uma de suas superclasses, enquanto `List<Integer>` 
funciona apenas com a lista do tipo *Integer*. Então, `List<? super Integer>` é menos 
restritivo que `List<Integer>`.

### Exemplo de Lower Bound Wildcard

```java
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcard {

    public static void addNumbers(List<? super Integer> list) {
        for(Object n : list) {
              System.out.println(n);  
        }
    }

    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,2,3);
        System.out.println("displaying the Integer values");
        addNumbers(l1);

        List<Number> l2=Arrays.asList(1.0,2.0,3.0);
        System.out.println("displaying the Number values");
        addNumbers(l2);
    }
}
```

# Resumo

- Use o `<? extends T>` se você precisar recuperar o objeto do tipo *T* de uma coleção.
- Use o `<? super T>` se você precisar colocar objetos do tipo *T* em uma coleção.
- Se você precisar satisfazer as duas coisas, não use nenhum wildcard.

> Referência: [https://www.javatpoint.com/generics-in-java](https://www.javatpoint.com/generics-in-java)

# Outros links
- [http://rbittencourt.com/generics-indo-alem-wildcards/](http://rbittencourt.com/generics-indo-alem-wildcards/)

- [https://www.devmedia.com.br/usando-generics-em-java/28981](https://www.devmedia.com.br/usando-generics-em-java/28981)
