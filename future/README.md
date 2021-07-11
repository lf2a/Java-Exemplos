- **Future:** Classe que encapsula uma chamada feita em paralelo, sendo possível cancelar a execução de uma tarefa, descobrir se a execução já terminou com sucesso ou erro, entre outras operações;

- **FutureTask:** É uma implementação da interface Future a ser executada numa chamada em paralelo. Além disso, com ela é possível fazer as mesmas verificações que fazemos com a interface;

- **Callable:** Interface para a implementação de uma execução em paralelo. É muito parecida com a interface Runnable, mas esta não retorna nenhum valor, enquanto a Callable deve retornar um valor ao final da execução;

- **ExecutorService:** Classe para o gerenciamento de execuções em paralelo, já que cria um pool de threads, iniciando e cancelando as execuções. Também é possível cancelar este, evitando assim a criação de novas tarefas.
