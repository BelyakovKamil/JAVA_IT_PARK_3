package ru.itpark;

/**
 * Created by Ofice on 10.10.2017.
 */
public class RemoteController {
    private TV tv;

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        TV.showMenu();
    }
}
