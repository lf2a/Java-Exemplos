public class Pessoa {
    private String nome;
    private int idade;
    private boolean isActive;

    public Pessoa(String nome, int idade, boolean isActive) {
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

    public void print() {
        System.out.printf("{nome: %s, idade: %d, isActive: %b}\n", this.nome, this.idade, this.isActive);
    }
}
