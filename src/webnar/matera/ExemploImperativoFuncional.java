package webnar.matera;

public class ExemploImperativoFuncional {
    public static void main(String[] args) {

        // Paradigma Imperativo
        int total = 0;
        for (int i = 0; i < 10; i++)
            total += 1;

        // Paradigma Funcional
        volCilindro(9.1, 2.3);
    }

    private static double volCilindro(double r, double h) {
        return volCilindro(r) * h;
    }

    private static double volCilindro(double r) {
        return Math.PI * r * r;
    }
}
