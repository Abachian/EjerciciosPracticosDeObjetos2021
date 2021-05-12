package ejerciciostp3.sistemabancario;

public class CajaAhorro {
    private double saldo;
    private int iddueño;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIddueño() {
        return iddueño;
    }

    public void setIddueño(int iddueño) {
        this.iddueño = iddueño;
    }

    public CajaAhorro(int iddueño)
    {
        this.iddueño=iddueño;
    }
    protected void Depositar (double monto, int contrasenia)
    {
        setSaldo(+monto);

    }
    protected void Extraer (double monto, int contrasenia)
    {
        if (monto <= getSaldo())
            setSaldo((monto - getSaldo()));
        else
            System.out.println("el saldo es insuficiente para realizar este deposito");

    }
    public String toString()
    {
        return "id de dueño: "  + this.iddueño + "," +
                "el saldo es: " + this.saldo;
    }
}
