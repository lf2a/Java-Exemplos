package exemplo_um;

public class Main {
    public static void main(String[] args) {
        Cor cor = Cor.VERDE;
        Cor cor2 = Cor.AZUL;

        System.out.println(cor.equals(cor2));
        System.out.println(cor.name()); // ou System.out.println(cor);
        System.out.println(cor.getDeclaringClass());
        System.out.println(cor.getAcao());
        System.out.println(cor.ordinal());
        System.out.println(cor.hashCode());

        switch (cor) {
            case AMARELO:
                System.out.println("Amarelo");
            case AZUL:
                System.out.println("Azul");
        }
    }
}
