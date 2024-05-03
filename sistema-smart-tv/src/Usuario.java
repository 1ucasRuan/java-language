import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tv está ligada?" + smartTv.ligada);
        System.out.println("Canal atual?" + smartTv.canal);
        System.out.println("Volume atual?" + smartTv.volume);

        smartTv.desligar();
        System.out.println("Tv está ligada?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual?" + smartTv.volume);

    }
}
