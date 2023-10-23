public class Lamp {
    boolean isOn = false;

    void switchOn(){
        isOn = true;
    }
    void switchOff(){
        isOn = false;
    }
    void displayStatus(){
        String status = isOn ? "wlaczona" : "wylaczona";
        System.out.println("Lampa "+status);
    }
}
