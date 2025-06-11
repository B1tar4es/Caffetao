import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
			
			// Exercicio do cacete, so regresso
			modoInterativo(produtos);
			
	}

			//Tentar buscar os produtos de merdaaaa
		public static List<Produto> buscarProdutosPorIngredientes(List<Produto> produtos, List<String> ingredientesBuscados) {
			List <Produto> encontrados = new ArrayList<>();
			
		for (Produto produto : produtos) {
			for(String ingrediente : ingredientesBuscados) {
				if (produto.ingredientes.contains(ingrediente)) {
					encontrados.add(produto);
					break; 
				}
			}
		}
			return encontrados;
}
		//tentar utilizar a merda do scanner no qual eu pedi socorro pro chat gpt, te amo chat <3
		public static void modoInterativo(List<Produto> Produtos) {
			Scanner scanner = new Scanner (System.in);
			System.out.println("\nDigite os ingredientes separados por virgula por ex (Cafe, leite)");
			String entrada = scanner.nextLine();
			String[] ingredientesArray = entrada.split(",");
			List <String> ingredientesBuscados = new ArrayList <>();
			
			for (String ing: ingredientesArray) {
				ingredientesBuscados.add(ing.trim());
			}
			
			List<Produto> encontrados = buscarProdutosPorIngredientes (Produtos, ingredientesBuscados);
			
			System.out.println("\nProdutos com os ingredientes" + ingredientesBuscados +":");
			if(encontrados.isEmpty()) {
			System.out.println("Nenhum produto encontrado.");
		} else {
			for (Produto p : encontrados) {
				System.out.println(p);
			}
		}
			scanner.close();
			
				}			
			}