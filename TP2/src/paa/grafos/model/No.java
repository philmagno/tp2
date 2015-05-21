package paa.grafos.model;

public class No {
	private int valor;

	public No(int valor) {
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