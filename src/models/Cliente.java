package models;

import java.util.UUID;

public class Cliente {
    private String id;
    private String name;
    private String email;
    private int porcentajeDescuento;

    public String getId() {
        return id;
    }

    public Cliente(){
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public Cliente name(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Cliente email(String email) {
        this.email = email;
        return this;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Cliente porcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
        return this;
    }

    public void imprimir(){
        System.out.println("------CLIENTE------");
        System.out.println("Nombre..........:"+name);
        System.out.println("ID..............:"+id);
        System.out.println("Email...........:"+email);
        System.out.println("Descuento.......:"+porcentajeDescuento);
    }
}
