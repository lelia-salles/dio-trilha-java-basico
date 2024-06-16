public class Usuario {
    public static void main(String[] args) throws Exception {
        
        // método que executa a tv, vamos criar uma nova smart tv
        SmartTV smartTV = new SmartTV();

        // definindo os estados iniciais da tv
        // smartTV é a nova tv criada com o método 'new' 
        // a variável 'ligada' foi criada na Classe SmartTV
        //testando a funcionalidade dos métodos com breakpoints

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Tv desligada? " + smartTV.ligada);        
        smartTV.aumentarVolume();
        System.out.println("volume atual? " + smartTV.volume);
        smartTV.diminuirVolume();
        System.out.println("volume atual? " + smartTV.volume);
        smartTV.mudarCanal();
        System.out.println("Canal Atual? " + smartTV.canal);
        smartTV.aumentarCanal();
        System.out.println("Canal Atual? " + smartTV.canal);
        smartTV.diminuirCanal();
        System.out.println("Canal Atual? " + smartTV.canal);
       

        
        
    }
}
