package models;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public Libro autor(Autor autor) {
        this.autor = autor;
        return this;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Libro titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Libro precio(double precio) {
        this.precio = precio;
        return this;
    }

    public int getStock() {
        return stock;
    }

    public Libro stock(int stock) {
        this.stock = stock;
        return this;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void imprimir() {
        System.out.println("------LIBRO------");
        System.out.println("Titulo..........:" + titulo);
        System.out.println("Precio..........:" + precio);
        System.out.println("Stock...........:" + stock);

    }

    public void frase(){
        System.out.println("El libro " + titulo + " de " + this.autor.getName() + " " +this.autor.getLastName() + " se vende a " + precio);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
