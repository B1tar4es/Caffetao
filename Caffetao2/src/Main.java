import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Tentar dnv criar essa merda de lista q da erro toda vez

			List<Produto> produtos = new ArrayList<>();
			
		// Produto cafetao kk
		
			Produto cappuccino = new Produto(
					"cappucino",
					List.of("Cafe", "Leite", "Chocolate", "Açucar")
					);
			
			Produto Latte = new Produto (
					"Latte",
					List.of("Cafe", "Leite")
					);
			
			Produto Expresso = new Produto(
					"Expresso",
					List.of("Cafe", "Agua")
					);
			//C der erro dnv eu me mato
			produtos.add(cappuccino);
			produtos.add(Latte);
			produtos.add(Expresso);
			
		//Exibir o trem
			for (Produto produto : produtos) {
				System.out.println(produto);
			}									
	}
}
