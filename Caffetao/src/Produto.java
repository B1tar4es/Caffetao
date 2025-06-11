import java.util.List;

public class Produto {
	String nome;
	List<String> ingredientes;
	
	//Pela 2913919 vez tentar essa merda
	//Fazer a classe de Produtos nessa merdaaa
public Produto (String nome, List<String> ingredientes ) {
	this.nome = nome;
	this.ingredientes = ingredientes;		
	}
	
	//Obg chat gpt
	//Metodo para exbir o trem coisado
@Override
public String toString() {
	return "Produto: " +nome+ ",Ingredientes: " +ingredientes;
	}	
}
