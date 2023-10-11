package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		Produto camiseta = new Produto();
		camiseta.setNome("camiseta chadrez");
		camiseta.setFornecedor("eumesmo");
		camiseta.setPreco(100.00);
		camiseta.setCodBarra(89326541l);

		Produto regata = new Produto();
		regata.setNome("regataMaromba");
		regata.setFornecedor("paulo");
		regata.setPreco(20.00);
		regata.setCodBarra(24955609l);

		Produto calca = new Produto();
		calca.setNome("calçaCargo");
		calca.setFornecedor("shein");
		calca.setPreco(199.99);
		calca.setCodBarra(23212324l);

		ArrayList<Produto> produtos = new ArrayList<Produto>();
			produtos.add(camiseta);
			produtos.add(regata);
			produtos.add(calca);
			
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getFornecedor());
			System.out.println(produto.getPreco());
			System.out.println(produto.getCodBarra());
			System.out.println(" ");

		}
	}

}
