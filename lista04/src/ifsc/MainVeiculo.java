package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		veiculo.setNome("Paulo");
		veiculo.setAno(2006);
		veiculo.setFabricante("valdecir");
		veiculo.setCor("azul");
		veiculo.setNumeroDeRodas(4);
		System.out.println("");
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setNome("Camili");
		veiculo2.setAno(2022);
		veiculo2.setFabricante("osiel");
		veiculo2.setCor("nude");
		veiculo2.setNumeroDeRodas(2);
			System.out.println("");
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setNome("Lucas Valle");
		veiculo3.setAno(2023);
		veiculo3.setFabricante("juliano");
		veiculo3.setCor("preto");
		veiculo3.setNumeroDeRodas(1);

		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(veiculo);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		
		for (Veiculo v : veiculos) {
			System.out.println(v.getNome());
			System.out.println(v.getCor());
			System.out.println(v.getFabricante());
			System.out.println(v.getAno());
			System.out.println(v.getNumeroDeRodas());
			
		}
	}

}
