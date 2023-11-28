public class Computer {
    private Processor processor;
    private String model, brand;
    private int ram, ip;
    boolean isOn = false;  

    public Computer(){
        processor = new Processor();
    }
    

    public Processor getProcessor() {
        return processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRAM() {
        return ram;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public int getIP() {
        return ip;
    }

    public void setIP(int ip) {
        this.ip = ip;
    }
    
    public void turnON(){
        isOn = true;
    }
    public void turnOFF(){
        isOn = false;
    }
}