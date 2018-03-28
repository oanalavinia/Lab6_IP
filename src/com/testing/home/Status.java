package com.testing.home;

public class Status {
    private String codProdus;
    private Application app;
    private Produs produs;

    public Status(Application app){
        this.app = app;
    }

    public Status(Produs produs){
        this.produs = produs;
    }

    public void updateStatus(String status){
        produs.setStatusProduse(status);
    }
}
