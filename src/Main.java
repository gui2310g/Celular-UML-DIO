

    public class Main {
        public static void main(String[] args) {
            CelularBase android = new CelularBase();
            CelularBase iphone = new CelularBase();

            android.ligar();
            android.getReprodutorMusical().selecionarMusica("Adele");
            android.desligar();

            iphone.ligar();
            iphone.getNavegadorInternet().exibirPagina("Youtube");
            iphone.getAparelhoTelefonico().ligar("40228922");
            iphone.desligar();
        }
    }