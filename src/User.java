public class User {
    
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV on? " + smartTv.on);
        System.out.println("Channel Actualy? " + smartTv.channel);
        System.out.println("Volume Actualy? " + smartTv.volume);

        //testing status TV
        smartTv.turn_on();
        System.out.println("New Status -> TV on? "+ smartTv.on);
        smartTv.turn_off();
        System.out.println("New Status -> TV on? "+ smartTv.on);

        //testing status Volume
        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.upVolume();
        System.out.println("Actualy Volume "+ smartTv.volume);

        //testing status Channel
        smartTv.downChannel();
        smartTv.downChannel();
        smartTv.downChannel();
        smartTv.upChannel();
        System.out.println("Actualy Channel "+ smartTv.channel);


        //testing change method
        smartTv.changeChannel(10);
        System.out.println("Actualy Channel "+ smartTv.channel);

    }
}
