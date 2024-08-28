package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {
    private String id;
    private double total;
    private LocalDate date;
    private LocalDate time;

    private static final DateTimeFormatter FORMATTER_DATE = DateTimeFormatter.ofPattern("yyyy-mm-dd");
    private static final DateTimeFormatter FORMATTER_TIME = DateTimeFormatter.ofPattern("hh:mm:ss");

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
        this.date = LocalDate.parse(date,FORMATTER_DATE);
        return this;
    }

    public LocalDate getDate() {
        return date;
    }


    public LocalDate getTime() {
        return time;
    }

    public Factura(LocalDate time) {
        this.time = time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
