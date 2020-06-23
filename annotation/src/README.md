# @Annotation

Anotação Java é uma tag que representa os metadados, ou seja, anexados à classe, interface, métodos ou campos para indicar algumas informações adicionais que podem ser usadas pelo compilador java e pela JVM.

## @Target

A tag @Target é usada para especificar em qual tipo, a anotação é usada.
A enum java.lang.annotation.ElementType declara muitas constantes para
especificar o tipo de elemento no qual a anotação deve ser aplicada,
como TYPE, METHOD, FIELD etc. Vamos ver as constantes da enumeração ElementType:

| Tipos de elemento | Onde a annotation pode ser aplicada |
|:---:|:---:|
| TYPE | classes, interfaces ou enumeração |
| FIELD | campos |
| METHOD | métodos |
| CONSTRUCTOR | construtores |
| LOCAL_VARIABLE | variáveis locais |
| ANNOTATION_TYPE | tipo anotação |
| PARAMETER	| parâmetro |

## @Retention

A anotação @Retention é usada para especificar em qual nível a anotação estará disponível.

| RetentionPolicy | Disponibilidade |
|:---:|:---:|
| RetentionPolicy.SOURCE | refere-se ao código fonte, descartado durante a compilação. Não estará disponível na classe compilada. |
| RetentionPolicy.CLASS | refere-se ao arquivo .class, disponível para o compilador java, mas não para a JVM. Está incluído no arquivo de classe. |
| RetentionPolicy.RUNTIME | refere-se ao tempo de execução, disponível para o compilador java e a JVM. |

# @Annotations internas

Java define sete anotações internas.

- **Quatro são importados de java.lang.annotation:** @Retention, @Documented, @Target e @Inherited.

- **Três estão incluídos no java.lang:** @Deprecated, @Override e @SuppressWarnings

## @Deprecated Annotation

- é uma anotação de marcação. Indica que uma declaração está obsoleta e foi substituída por algo mais recente.

- A tag Javadoc @Deprecated deve ser usada quando um elemento tiver sido descontinuado.

- A tag @deprecated é para documentação e a anotação @Deprecated é para reflexão em tempo de execução.

- A tag @deprecated tem prioridade mais alta que a anotação @Deprecated quando ambas são usadas juntas.

## @Override Annotation

É uma anotação de marcação que pode ser usada apenas em métodos. Um método anotado com @Override deve substituir um método de uma superclasse. Caso contrário, ocorrerá um erro em tempo de compilação. É usado para garantir que um método de superclasse seja realmente substituído e não simplesmente sobrecarregado.

## @SuppressWarnings

É usado para informar o compilador para suprimir avisos especificados do compilador. Os avisos para suprimir são especificados por nome, na forma de sequência. Este tipo de anotação pode ser aplicado a qualquer tipo de declaração.

Java agrupa avisos em duas categorias. Eles são: **deprecation** e **unchecked**. Qualquer aviso desmarcado é gerado quando um código legado faz interface com um código que usa genéricos.

## @Documented Annotations

É uma interface de marcação que informa a uma ferramenta que uma anotação deve ser documentada. As anotações não são incluídas nos comentários do Javadoc. O uso da anotação @Documented no código permite que ferramentas como Javadoc a processem e incluam as informações do tipo de anotação no documento gerado.

## @Target

## @Inherited

@Inherited é uma anotação de marcação que pode ser usada apenas na declaração de anotação. Afeta apenas as anotações que serão usadas nas declarações de classe. @Inherited faz com que a anotação de uma superclasse seja herdada por uma subclasse. Portanto, quando uma solicitação para uma anotação específica é feita para a subclasse, se essa anotação não estiver presente na subclasse, sua superclasse será verificada. Se essa anotação estiver presente na superclasse e se estiver anotada com @Inherited, essa anotação será retornada.
