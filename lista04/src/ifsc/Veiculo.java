package ifsc;

public class Veiculo {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getNumeroDeRodas() {
		return numeroDeRodas;
	}

	public void setNumeroDeRodas(Integer numeroDeRodas) {
		this.numeroDeRodas = numeroDeRodas;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	private String nome;
	private Integer ano;
	private Integer numeroDeRodas;
	private String fabricante;
	private String cor;
}
