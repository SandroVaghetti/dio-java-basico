public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(15);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
    }
}
