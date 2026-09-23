class ArvoreBinariaMorse {
	Nodo raiz = null;
	
	void inicializar() {
		raiz = new Nodo();
	}
	
	void inserir(String codigoMorse, Character caractere){
		Nodo noAtual = raiz;
		
		for (char simbolo : codigoMorse.toCharArray()) {
			if (simbolo == '.') {
				if (noAtual.filhoEsquerdo == null) {
					noAtual.filhoEsquerdo = new Nodo();
				}
				noAtual = noAtual.filhoEsquerdo;
			}
			else if (simbolo == '-'){
				if (noAtual.filhoDireito == null) {
					noAtual.filhoDireito = new Nodo();
				}
				noAtual = noAtual.filhoDireito;
			}
		}
		noAtual.caractere = caractere;
	}
	
	String buscar(String codigoMorse) {
		Nodo noAtual = raiz;
		String frase = "";
		
		for (String caractereMorse : codigoMorse.split(" ")) {
			for (char simbolo : caractereMorse.toCharArray()) {
				if (simbolo == '.') {
					noAtual = noAtual.filhoEsquerdo;
				}
				else if (simbolo == '-') {
					noAtual = noAtual.filhoDireito;
				}
				if (noAtual == null) {
					return null;
				}
			}
			frase += noAtual.caractere;
			noAtual = raiz;
		}
		
		return frase;
	}
}