package fp.videojuegos;

public class Videojuego implements Comparable<Videojuego> {	
	
	//Atributos
	private String nombre;
	private Double score;
	private String compañia;
	
	//Constructor
	public Videojuego(String nombre, Double score, String compañia) {
		super();
		this.nombre = nombre;
		this.score = score;
		this.compañia = compañia;
	}
	
	//Setter y Getter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	
	//hash, equals, toString	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compañia == null) ? 0 : compañia.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Videojuego other = (Videojuego) obj;
		if (compañia == null) {
			if (other.compañia != null)
				return false;
		} else if (!compañia.equals(other.compañia))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", score=" + score + ", compañia=" + compañia + "]";
	}
	

	//compareTo
	@Override
	public int compareTo(Videojuego o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

}
