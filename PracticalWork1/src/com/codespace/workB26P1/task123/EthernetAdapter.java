package com.codespace.workB26P1.task123;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;


//      GETTERS AND SETTERS

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    public String getMac() { return mac; }
    public void setMac(String mac) { this.mac = mac; }


//      CONSTRUCTORS
    public EthernetAdapter(String serialNumber, String manufacturer, double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter() {
        this(0,"UnknownMac");
    }


    @Override
    public String toString () {
        String result = "class=" + getClass().getSimpleName() +
                ": serialNumber=" + super.getSerialNumber() +
                ", manufacturer=" + super.getManufacturer() +
                ", price=" + super.getPrice() +
                ", speed=" + this.getSpeed() +
                ", mac=" + this.getMac();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        EthernetAdapter other = (EthernetAdapter) obj;
        if (super.equals(other)){
            if (this.speed != other.speed) {
                return false;
            } else return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }
}
