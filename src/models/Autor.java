package models;

public class Autor {
    private String name;
    private String lastName;
    private String email;
    private char genero;

    public String getName() {
        return name;
    }

    public Autor name(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Autor lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Autor email(String email) {
        this.email = email;
        return this;
    }

    public char getGenero() {
        return genero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Autor genero(char genero) {
        this.genero = genero;
        return this;
    }

    public void imprimir(){
        System.out.println("------AUTOR------");
        System.out.println("Nombre..........:"+name);
        System.out.println("Apellido........:"+lastName);
        System.out.println("Email...........:"+email);
        System.out.println("Genero..........:"+genero);
    }
    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }
}
