import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        int novoCanal;
        SmartTv smartTv = new SmartTv();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tv está ligada?" + smartTv.ligada);
        System.out.println("Canal atual?" + smartTv.canal);
        System.out.println("Volume atual?" + smartTv.volume);

        smartTv.desligar();
        System.out.println("Tv está ligada?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual?" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual?" + smartTv.canal);

        System.out.println("Informe o canal desejado: ");
        novoCanal = teclado.nextInt();
        smartTv.mudarCanal(novoCanal);

        System.out.println("Canal atual?" + smartTv.canal);

    }
}
