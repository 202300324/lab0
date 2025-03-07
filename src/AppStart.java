public class AppStart {
    private static Size size = Size.MEDIUM;

    public static void main(String[] args) {
        System.out.printf("Name: %s\ntoString(): '%s'\nOrdem: %d\nValor minimo: %d\nValor máximo: %d\nCódigo: '%s'",
                "MEDIUM", size.getDescription(), 1, size.getMinValue(), size.getMaxValue(), size.getCode());


    }
}
