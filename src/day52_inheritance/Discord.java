package day52_inheritance;

public class Discord extends MobileApp{
    public  void chat(String someone) {
        System.out.println("Chatting with "+someone+" on Discord");
    }

    /**
     * override download method
     */
    @Override
    public boolean download(){
        System.out.println("App "+getName()+" version"+getVersion()+" is downloaded");
        return true;
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Vlad");
    }
    public  void printInfo(){
        System.out.println("App name= "+getName());
        System.out.println("App version= "+getVersion());
    }
}
