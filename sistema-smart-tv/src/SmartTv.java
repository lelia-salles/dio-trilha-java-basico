public class SmartTV{
    /**Esta classe representa uma SmartTV onde ela:
    *  - tenha característiscas ligada (boolean), canal (int) e volume (int)
    *  - deve ligar e desligar e mudar o seu estado ligada
    *  - deve aumentar e diminuir o volume em + 1 ou -1
    *  - poderá mudar de canal de 1 em 1 ou definindo o número correspondente
    */
    boolean ligada = false;
    int canal = 1;
    int volume = 25; 

     public void mudarCanal(int novoCanal){
     canal = novoCanal;
 }
     public void aumentarCanal(){
     canal++;
 }
     public void diminuirCanal(){
     canal--;
 }
 
     public void aumentarVolume(){
     volume++;
     System.out.println("Volume atual é: " + volume);
     }
     public void ligar(){
     ligada = true;
     }
 p   ublic void desligar(){
     ligada = false;
 }
}