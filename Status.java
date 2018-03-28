package com.testing.home;

public class Status {
    private BackLayer backLayer;

    public void updateStatus(Produs produs, String status){
        backLayer.updateStatus(produs, status);
    }
}
