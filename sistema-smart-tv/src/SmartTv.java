public class SmartTv {    

    boolean ligada = true;
    int canal = 1;
    int volume = 25;   
    
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }         
    
}
