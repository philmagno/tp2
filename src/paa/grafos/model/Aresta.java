package paa.grafos.model;

public class Aresta {
	private No v1, v2;

	public Aresta(No v1, No v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public No getV1() {
		return v1;
	}

	public void setV1(No v1) {
		this.v1 = v1;
	}

	public No getV2() {
		return v2;
	}

	public void setV2(No v2) {
		this.v2 = v2;
	}

	@Override
	public String toString() {
		return "Aresta [v1=" + v1 + ", v2=" + v2 + "]";
	}
}