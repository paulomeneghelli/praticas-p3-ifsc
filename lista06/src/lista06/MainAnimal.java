package lista06;

public class MainAnimal {

	public static void main(String[] args) {

		gato liso = new gato();
		liso.setCor("verde");
		liso.mia();

		liso.setNome("paulo");
		liso.setRaca("sarna");
		liso.setComprimento(2f);
		liso.setCor("vermelho");
		liso.setEcossistema("casa");
		liso.setNuDePatas(2);
		
		System.out.println(liso.getNome());
		System.out.println(liso.getCor());
		System.out.println(liso.getRaca());
		System.out.println(liso.getEcossistema());
		System.out.println(liso.getComprimento());
		System.out.println(liso.getNuDePatas());
	
		

		cachorro torto = new cachorro();
		torto.caminha();

		torto.setNome("tortinho");
		torto.setRaca("jaguara");
		torto.setComprimento(1f);
		torto.setCor("amarelo");
		torto.setEcossistema("pantanal");
		torto.setNuDePatas(8);
		
		System.out.println(torto.getNome());
		System.out.println(torto.getCor());
		System.out.println(torto.getRaca());
		System.out.println(torto.getEcossistema());
		System.out.println(torto.getComprimento());
		System.out.println(torto.getNuDePatas());
		
		

	}

}
