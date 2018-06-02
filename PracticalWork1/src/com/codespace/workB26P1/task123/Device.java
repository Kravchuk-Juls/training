package com.codespace.workB26P1.task123;

public class Device {
    private String serialNumber;
    private String manufacturer;
    private double price;

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Device(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public Device(String serialNumber, double price) {
        this (serialNumber, "UnknownManufaturer", price);
    }

    public Device() {
        this ("UnknownSerial", "UnknownManufacturer", 0.0);
    }

    @Override
    public String toString () {
        String result = "class=" + getClass().getSimpleName() +
                        ": serialNumber=" + this.getSerialNumber() +
                        ", manufacturer=" + this.getManufacturer() +
                        ", price=" + this.getPrice();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Device other = (Device) obj;
        if (this.serialNumber != other.serialNumber || this.manufacturer != other.manufacturer) {
            return false;
        } return (this.price == other.price);
    }

    @Override
    public int hashCode() {
        int result = 17;
        long tmp = Double.doubleToLongBits(price);
        result = 31 * result + serialNumber.hashCode();
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + (int) (tmp ^ (tmp >>> 32));
        return result;
    }
}
