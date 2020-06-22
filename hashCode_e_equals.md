# Equals

O método `equals()` é usado na maioria das coleções para determinar se uma coleção contém um determinado elemento.

```java
List list = new ArrayList();
list.add("123");

boolean contains123 = list.contains("123");
```

O ArrayList itera todos os seus elementos e executa `"123".equals(element)` para determinar se o elemento é igual ao objeto de parâmetro `"123"`. É a implementação `String.equals()` que determina se duas strings são iguais.

Então, quando dois objetos são iguais? Isso depende do seu aplicativo, das classes e do que você está tentando fazer. Por exemplo, digamos que você esteja carregando e processando objetos `Empregado` armazenados em um banco de dados. Aqui está um exemplo simples dessa classe `Empregado`:

```java
public class Empregado {
    protected long   id;
    protected String primeiroNome;
    protected String ultimoNome;
}
```

Você pode decidir que dois objetos de `Empregado` sejam iguais um ao outro, se apenas os `IDs` de seus funcionários forem iguais. Ou você pode decidir que todos os campos devem ser iguais - `id`, `primeiroNome` e `ultimoNome`. Aqui estão dois exemplos de implementação de `equals()` que correspondem a esses critérios:

```java
public class Empregado {
  public boolean equals(Object o){
    if(o == null)
      return false;
    if(!(o instanceof) Empregado)
      return false;

    Empregado e = (Empregado) o;
    return this.employeeId == e.id;
  }
}
```

```java
public class Empregado {
  public boolean equals(Object o){
    if(o == null)
      return false;
    if(!(o instanceof) Empregado)
      return false;

    Empregado e = (Empregado) o;
    if(this.id != e.id)
      return false;
    if(! this.primeiroNome.equals(e.primeiroNome))
      return false;
    if(! this.ultimoNome.equals(e.ultimoNome))
      return false;

    return true;
  }
}
```

Qual dessas duas implementações é "adequada" depende do que você precisa fazer. Às vezes, você precisa procurar um objeto `Empregado` a partir de um cache. Nesse caso, talvez tudo que você precise é que o `id` seja igual. Em outros casos, você pode precisar de mais do que isso - por exemplo, para determinar se uma cópia de um objeto `Empregado` foi alterada em relação ao original.

# HashCode

O método `hashCode()` de objetos é usado quando você os insere em um HashTable, HashMap ou HashSet. [HashTable](http://en.wikipedia.org/wiki/Hashtable)

Ao inserir um objeto em um hastable, você usa uma chave. O código de hash dessa chave é calculado e usado para determinar onde armazenar o objeto internamente. Quando você precisa procurar um objeto em uma hashtable, também usa uma chave. O código de hash dessa chave é calculado e usado para determinar onde procurar o objeto.

O código de hash aponta apenas para uma determinada "área" (ou lista, bloco, etc) internamente. Como objetos de chave diferentes podem potencialmente ter o mesmo código de hash, o próprio código de hash não garante que a chave correta seja encontrada. A hashtable itera essa área (todas as chaves com o mesmo código de hash) e usa o método `equals()` da chave para encontrar a chave correta. Depois que a chave correta é encontrada, o objeto armazenado para essa chave é retornado.

Portanto, como você pode ver, uma combinação dos métodos `hashCode()` e `equals()` é usada ao armazenar e procurar objetos em uma tabela de hashtags.

Aqui estão duas regras que você deve saber sobre a implementação do método `hashCode()` em suas próprias classes, se as hashtables na API *Java Collections* estiverem funcionando corretamente:

- Se *objeto1* e *objeto2* forem iguais de acordo com o método `equals()`, eles também deverão ter o mesmo código de hash.

- Se o *objeto1* e o *objeto2* tiverem o mesmo código de hash, eles NÃO precisam ser iguais também.

Em palavras mais curtas:

- Se for igual, os mesmos códigos de hash também.

- Os mesmos códigos de hash não garantem que sejam iguais.

Aqui estão dois exemplos de implementação do método `hashCode()` que corresponde aos métodos `equals()` mostrados anteriormente:

```java
public class Empregado {
  protected long id;
  protected String primeiroNome;
  protected String ultimoNome;

  public int hashCode(){
    return (int) id;
  }
}
```

```java
public class Empregado {
    protected long id;
    protected String primeiroNome;
    protected String ultimoNome;

  public int hashCode(){
    return (int) id * primeiroNome.hashCode() * ultimoNome.hashCode();
  }
}
```

Observe que, se dois objetos `Empregado` forem iguais, eles também terão o mesmo código de hash. Mas, como é especialmente fácil de ver no primeiro exemplo, dois objetos `Empregado` não podem ser iguais e ainda possuem o mesmo código de hash.

Nos dois exemplos, o código de hash é o `id` arredondado para um *int*. Isso significa que muitos `IDs` dos funcionários podem resultar no mesmo código de hash, mas esses objetos `Empregado` ainda não seriam iguais, pois não têm o mesmo `ID` de funcionário.

> Referência: [http://tutorials.jenkov.com/java-collections/hashcode-equals.html](http://tutorials.jenkov.com/java-collections/hashcode-equals.html)
