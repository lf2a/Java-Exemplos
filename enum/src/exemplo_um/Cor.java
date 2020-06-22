package exemplo_um;

public enum Cor {
    VERMELHO("PARE"),
    BRANCO,
    VERDE("PODE IR"),
    AZUL,
    ROXO,
    AMARELO;

    private String acao;

    Cor() {
    }

    public String getAcao() {
        return this.acao;
    }

    Cor(String acao) {
        this.acao = acao;
    }
}
