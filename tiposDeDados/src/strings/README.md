| String | StringBuffer |
|---|---|
| A classe String é imutável. | A classe StringBuffer é mutável.
| A string é lenta e consome mais memória quando você concata muitas strings porque toda vez que cria uma nova instância. | O StringBuffer é rápido e consome menos memória quando você concatena as strings. |
| A classe String substitui o método equals() da classe Object. Assim, você pode comparar o conteúdo de duas strings pelo método equals(). | A classe StringBuffer não substitui o método equals() da classe Object. |