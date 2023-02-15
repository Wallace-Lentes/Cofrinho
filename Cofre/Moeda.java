package Cofre;



public abstract class Moeda {

    double valor;
    int id;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void Info();

    public abstract double Converter(Moeda moeda);

}
