package com.vladarsenjtev;


public class ScannerClient {

    private String dateStart;
    private String dateEnd;
    private String сurrency;

    public void scanner() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите дату с ");
        this.dateStart = scanner.next();
        System.out.println("Введите дату по ");
        this.dateEnd = scanner.next();
        System.out.println("Введите код валюты");
        this.сurrency = scanner.next();
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getСurrency() {
        return сurrency;
    }
}
