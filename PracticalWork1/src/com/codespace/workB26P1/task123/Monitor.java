package com.codespace.workB26P1.task123;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

//    GETTERS AND SETTERS
    public int getResolutionX() { return resolutionX; }
    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX; }
    public int getResolutionY() { return resolutionY; }
    public void setResolutionY(int resolutionY) { this.resolutionY = resolutionY; }

//    CONSTRUCTORS
    public Monitor(String serialNumber, String manufacturer, double price, int resolutionX, int resolutionY) {
        super(serialNumber, manufacturer, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Monitor() {
        this(0,0);
    }

    @Override
    public String toString () {
        String result = "class=" + getClass().getSimpleName() +
                ": serialNumber=" + super.getSerialNumber() +
                ", manufacturer=" + super.getManufacturer() +
                ", price=" + super.getPrice() +
                ", X=" + this.getResolutionX() +
                ", Y=" + this.getResolutionY();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Monitor other = (Monitor) obj;
        if (super.equals(other)){
            if (this.resolutionX != other.resolutionX) {
                return false;
            } else return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }

}
