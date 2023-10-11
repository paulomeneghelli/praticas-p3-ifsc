package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Desktop> desktops = new ArrayList<>();
		ArrayList<Smartphone> smartphones = new ArrayList<>();


        Desktop desktop1 = new Desktop();
        desktop1.setFabricante("Meneghelli");
        desktop1.setCodBarras(412341241);
        desktop1.setGamer(true);
        ArrayList<String> pecasDesktop1 = new ArrayList<>();
        pecasDesktop1.add("Placa de vídeo");
        pecasDesktop1.add("ssd");
        desktop1.setPecas(pecasDesktop1);
        desktops.add(desktop1);

        Desktop desktop2 = new Desktop();
        desktop2.setFabricante("HP");
        desktop2.setCodBarras(987654321);
        desktop2.setGamer(false);
        ArrayList<String> pecasDesktop2 = new ArrayList<>();
        pecasDesktop2.add("HD");
        pecasDesktop2.add("Processador");
        desktop2.setPecas(pecasDesktop2);
        desktops.add(desktop2);

        Desktop desktop3 = new Desktop();
        desktop3.setFabricante("Paulo");
        desktop3.setCodBarras(567890123);
        desktop3.setGamer(true);
        ArrayList<String> pecasDesktop3 = new ArrayList<>();
        pecasDesktop3.add("Placa-mãe");
        pecasDesktop3.add("Fonte");
        desktop3.setPecas(pecasDesktop3);
        desktops.add(desktop3);

		Smartphone smartphone1 = new Smartphone();
		smartphone1.setFabricante("Samsung");
		smartphone1.setCodBarras(91284712);
		smartphone1.setDimensoesTela("6.2 inches");
		smartphone1.setOutraCaracteristica("Resistente à água");
		smartphones.add(smartphone1);

		Smartphone smartphone2 = new Smartphone();
		smartphone2.setFabricante("strey");
		smartphone2.setCodBarras(412341241);
		smartphone2.setDimensoesTela("5.8 inches");
		smartphone2.setOutraCaracteristica("Face ID");
		smartphones.add(smartphone2);

		Smartphone smartphone3 = new Smartphone();
		smartphone3.setFabricante("Google");
		smartphone3.setCodBarras(312312312);
		smartphone3.setDimensoesTela("6.0 inches");
		smartphone3.setOutraCaracteristica("Câmera avançada");
		smartphones.add(smartphone3);

		System.out.println("Desktops:");
		for (Desktop desktop : desktops) {
			System.out.println("Fabricante: " + desktop.getFabricante());
			System.out.println("Código de Barras: " + desktop.getCodBarras());
			System.out.println("Gamer: " + desktop.isGamer());
			System.out.println("Peças: " + desktop.getPecas());
			System.out.println();
		}

		System.out.println("Smartphones:");
		for (Smartphone smartphone : smartphones) {
			System.out.println("Fabricante: " + smartphone.getFabricante());
			System.out.println("Código de Barras: " + smartphone.getCodBarras());
			System.out.println("Dimensões da Tela: " + smartphone.getDimensoesTela());
			System.out.println("Outra Característica: " + smartphone.getOutraCaracteristica());
			System.out.println();
		}

	}

}
