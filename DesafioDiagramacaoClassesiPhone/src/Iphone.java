public class Iphone {

// Classe iPhone que implementa todas as interfaces
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações das interfaces
    public void tocar() {
        System.out.println("Ouvindo a música.");
    }

    public void pausar() {
        System.out.println("Pausando a música.");
    }

    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando página.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}

}
