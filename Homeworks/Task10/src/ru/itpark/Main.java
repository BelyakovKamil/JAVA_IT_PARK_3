package ru.itpark;

public class Main {

    public static void main(String[] args) {
	Vehicle vehicle = Vehicle.builder()
            .brand("Renault").name("Sandero Stepway").yearOfRelease(2017).manufacturerCountry("Франция").typeOfCarBodywork("Хэтчбэк")
            .classOfCar('B').transmission("Механическа КП").typeOfDrive("Передний привод").weight(1600).horsePower(102)
            .engineVolume(1598).typeOfEngine("Бензин").isNeedRepair(false).gov_number("T214OM").colour("Красный").build();
    }
}
