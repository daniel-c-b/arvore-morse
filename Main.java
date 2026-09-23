import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma mensagem em código morse: ");
		String buscaEmQuestao = scanner.nextLine();
		
		ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
		arvore.inicializar();
		arvore.inserir(".-", 'A');
		arvore.inserir("-...", 'B');
		arvore.inserir("-.-.", 'C');
		arvore.inserir("-..", 'D');
		arvore.inserir(".", 'E');
		arvore.inserir("..-.", 'F');
		arvore.inserir("--.", 'G');
		arvore.inserir("....", 'H');
		arvore.inserir("..", 'I');
		arvore.inserir(".---", 'J');
		arvore.inserir("-.-", 'K');
		arvore.inserir(".-..", 'L');
		arvore.inserir("--", 'M');
		arvore.inserir("-.", 'N');
		arvore.inserir("---", 'O');
		arvore.inserir(".--.", 'P');
		arvore.inserir("--.-", 'Q');
		arvore.inserir(".-.", 'R');
		arvore.inserir("...", 'S');
		arvore.inserir("-", 'T');
		arvore.inserir("..-", 'U');
		arvore.inserir("...-", 'V');
		arvore.inserir(".--", 'W');
		arvore.inserir("-..-", 'X');
		arvore.inserir("-.--", 'Y');
		arvore.inserir("--..", 'Z');

		arvore.inserir("-----", '0');
		arvore.inserir(".----", '1');
		arvore.inserir("..---", '2');
		arvore.inserir("...--", '3');
		arvore.inserir("....-", '4');
		arvore.inserir(".....", '5');
		arvore.inserir("-....", '6');
		arvore.inserir("--...", '7');
		arvore.inserir("---..", '8');
		arvore.inserir("----.", '9');
		
		System.out.println(arvore.buscar(buscaEmQuestao));
		arvore.exibir(arvore.raiz, 0);
	}
}