package programacao_orientada_a_objetos;

public class Ponto {
	private int x;
	private int y;
	
	public Ponto() {
		
	}
	public Ponto(int px, int py) {
		x = px;
		y = py;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public void saoIguais(Ponto p) {
		if (this.x == p.x && this.y == p.y)
			System.out.println("Os pontos são inguais");
		else
			System.out.println("Os pontos são diferentes");;
	}
	public void distancia(int x1, int y1, int x2, int y2) {
		double diferX = Math.pow(x1-x2, 2);
		double diferY = Math.pow(y1-y2, 2);
		double distancia = Math.sqrt((diferX) + (diferY));
		System.out.println("A distância entre os pontos A e B é " + distancia);
	}
}
