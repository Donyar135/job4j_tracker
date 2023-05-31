package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        if (this.load + another.load < 100) {
            another.load = this.load + another.load;
        } else {
            this.load = 0;
        }
    }
}

