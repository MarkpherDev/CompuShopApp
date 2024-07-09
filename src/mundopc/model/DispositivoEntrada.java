package mundopc.model;

public class DispositivoEntrada {

  private final String tipoDeEntrada;
  private final String marca;

  //contructor
  public DispositivoEntrada(String tipoDeEntrada, String marca) {
    this.tipoDeEntrada = tipoDeEntrada;
    this.marca = marca;
  }

  @Override
  public String toString() {
    return "DispositivoEntrada{" +
        "tipoDeEntrada='" + tipoDeEntrada + '\'' +
        ", marca='" + marca + '\'' +
        '}';
  }
}
