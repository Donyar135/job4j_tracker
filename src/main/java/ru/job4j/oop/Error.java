package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = false;
        status = 93;
        message = "Выполнено";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("" + active);
        System.out.println("" + status);
        System.out.println("" + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 45, "Одобрено");
        error.printInfo();
        Error err = new Error(false, 12, "Отклонено");
        err.printInfo();
        Error error1 = new Error();
        error1.printInfo();
    }
}
