package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import static utils.Date.getLocalDate;

public class Factura {
    private String id;
    private double total;
    private String date;
    private String time;


    public Factura(){
        this.id = UUID.randomUUID().toString();
    }

    public double getTotal() {
        return total;
    }

    public Factura total(double total) {
        this.total = total;
        return this;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Factura date(String date){
        this.date = date;
        return this;
    }

    public String getDate() {
        return date;
    }


    public String  getTime() {
        return time;
    }

    public Factura(String time) {
        this.time = time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
