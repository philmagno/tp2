package paa.grafos;

public class Celula {
	public int valor;

	public Celula(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "No [valor=" + valor + "]";
	}
}