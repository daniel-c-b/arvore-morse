class Main {
	public static void main(String[] args){
		ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
		arvore.inicializar();
		arvore.inserir("...", 'S');
		arvore.inserir("---", 'O');
		
		System.out.println(arvore.buscar("..."));
		System.out.println(arvore.buscar("---"));
		System.out.println(arvore.buscar("... --- ..."));
	}
}