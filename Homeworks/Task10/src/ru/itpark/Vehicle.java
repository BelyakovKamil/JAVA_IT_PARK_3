package ru.itpark;


/**
 * Created by Ofice on 21.10.2017.
 */
public class Vehicle {
    private String manufacturerCountry;
    private String brand;
    private String gov_number;
    private String typeOfCarBodywork;
    private String transmission;
    private String name;
    private String typeOfEngine;
    private String typeOfDrive;
    private String colour;
    private double horsePower;
    private double engineVolume;
    private double weight;
    private int yearOfRelease;
    private char classOfCar;
    private boolean isNeedRepair;

    private Vehicle(Builder builder) {
        this.manufacturerCountry = builder.manufacturerCountry;
        this.brand=builder.brand;
        this.gov_number=builder.gov_number;
        this.typeOfCarBodywork=builder.typeOfCarBodywork;
        this.transmission=builder.transmission;
        this.name=builder.name;
        this.typeOfEngine=builder.typeOfEngine;
        this.typeOfDrive=builder.typeOfDrive;
        this.colour=builder.colour;
        this.horsePower=builder.horsePower;
        this.engineVolume=builder.engineVolume;
        this.weight=builder.weight;
        this.yearOfRelease=builder.yeatOfRelease;
        this.classOfCar=builder.classOfCar;
        this.isNeedRepair=builder.isNeedRepair;
    }

    public static class Builder {
        private String manufacturerCountry;
        private String brand;
        private String gov_number;
        private String typeOfCarBodywork;
        private String transmission;
        private String name;
        private String typeOfEngine;
        private String typeOfDrive;
        private String colour;
        private double horsePower;
        private double engineVolume;
        private double weight;
        private int yeatOfRelease;
        private char classOfCar;
        private boolean isNeedRepair;

        public Builder manufacturerCountry(String manufacturerCountry) {
            this.manufacturerCountry = manufacturerCountry;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder gov_number(String gov_number) {
            this.gov_number = gov_number;
            return this;
        }

        public Builder typeOfCarBodywork(String typeOfCarBodywork) {
            this.typeOfCarBodywork = typeOfCarBodywork;
            return this;
        }

        public Builder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder typeOfEngine (String typeOfEngine){
            this.typeOfEngine=typeOfEngine;
            return this;
        }

        public Builder typeOfDrive (String typeOfDrive){
            this.typeOfDrive=typeOfDrive;
            return this;
        }

        public Builder colour (String colour){
            this.colour=colour;
            return  this;
        }

        public Builder horsePower(double horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder engineVolume (double engineVolume){
            this.engineVolume=engineVolume;
            return this;
        }

        public Builder weight (double weight){
            this.weight=weight;
            return this;
        }

        public Builder yearOfRelease (int yeatOfRelease){
            this.yeatOfRelease=yeatOfRelease;
            return this;
        }

        public Builder classOfCar (char classOfCar){
            this.classOfCar=classOfCar;
            return this;
        }

        public Builder isNeedRepair(boolean isNeedRepair) {
            this.isNeedRepair = isNeedRepair;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

    public static Builder builder(){
        return  new Builder();
    }


    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGov_number() {
        return gov_number;
    }

    public void setGov_number(String gov_number) {
        this.gov_number = gov_number;
    }

    public String getTypeOfCarBodywork() {
        return typeOfCarBodywork;
    }

    public void setTypeOfCarBodywork(String typeOfCarBodywork) {
        this.typeOfCarBodywork = typeOfCarBodywork;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public char getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(char classOfCar) {
        this.classOfCar = classOfCar;
    }

    public boolean isNeedRepair() {
        return isNeedRepair;
    }

    public void setNeedRepair(boolean needRepair) {
        isNeedRepair = needRepair;
    }
}
