public class SmartTV {

    boolean on = false;
    int channel = 8;
    int volume = 25;

    public void turn_on(){
        on = true;
    }
    public void turn_off(){
        on = false;
    }

    public void upVolume(){
        volume++;
        System.out.println("Turning up to volume:"+volume);
    }

    public void downVolume(){
        volume--;
        System.out.println("Turning down to volume:"+volume);
    }

    public void upChannel(){
        channel++;
        System.out.println("The actualy Channel is "+channel);
    }

    public void downChannel(){
        channel--;
        System.out.println("The actualy Channel is "+channel);
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }

}