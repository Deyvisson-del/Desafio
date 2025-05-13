public class Iphone implements ServiceTelefonia, ReprodutorMusical, NavegadorInternet {

    @Override
    public void fazerChamada(int number) {
        System.out.println("Fazendo chamada para: " + number);
    }

    @Override
    public void receberChamada(int number) {
        System.out.println("Chamada recebida\nNúmero: " + number);
    }

    @Override
    public void correioVoz(String voz) {
        System.out.println("Gravando mensagem de voz ...\nChamada de voz: " + voz + "Chamada de voz finalizada");
    }

    @Override
    public void conectaRede(String login, String senha) {
        if (login == "wifi" && senha == "123") {
            System.out.println("Wi-fi conectado");
        } else {
            System.err.println("senha ou login incorretos");
        }
    }

    public void baixarMusica(String musica) {
        System.out.println("Baixando música...");
        System.out.println("Música adicionada " + musica);
    }

    @Override
    public void pularMusica() {
        System.out.println("Pulando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void acessarSite(String site) {
        site = "https://www." + site + ".com";
        System.out.println("Acessando o site: " + site);
    }

}