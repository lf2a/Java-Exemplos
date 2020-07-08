import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class TestExemploTres {
    private String nome;
    public int idade;
    protected boolean isActive;

    public TestExemploTres(String nome, int idade, boolean isActive) {
        this.nome = nome;
        this.idade = idade;
        this.isActive = isActive;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

public class ExemploTres {
    public static void main(String[] args) {
        Method[] methods = TestExemploTres.class.getMethods();
        Arrays.asList(methods).forEach(m -> {
            System.out.printf("Modificador: %s\nTipo de retorno: %s\nNome: %s\nParametros: %s\nClasse: %s\n\n",
                    m.getModifiers(), m.getReturnType(), m.getName(), Arrays.asList(m.getParameterTypes()).toString(),
                    m.getClass());
        });

        // so ira mostrar atributos publicos
        Field[] fields = TestExemploTres.class.getFields();
        Arrays.asList(fields).forEach(System.out::println);
    }
}
