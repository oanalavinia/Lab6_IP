package com.testing.home;

public class Produs {
    private String statusProduse;
    private String marca;
    private String codProdus;
    private Status status;   //compunere



    public Produs(String statusProduse, String codProdus, String marca) {
        this.statusProduse = statusProduse;
        this.codProdus = codProdus;
        this.marca = marca;
        this.status = new Status(this);
    }

    public String getStatusProduse() {
        return statusProduse;
    }

    public void setStatusProduse(String statusProduse) {
        this.statusProduse = statusProduse;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodProdus() {
        return codProdus;
    }

    public void setCodProdus(String codProdus) {
        this.codProdus = codProdus;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "statusProduse='" + statusProduse + '\'' +
                ", marca='" + marca + '\'' +
                ", codProdus='" + codProdus + '\'' +
                ", status=" + status +
                '}';
    }
}
