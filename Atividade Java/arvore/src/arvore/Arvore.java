package arvore;

import java.lang.module.ResolutionException;

public class Arvore {
	public static No raiz;

    public void imprimirPreOrdem() {
        imprimirPreOrdem(raiz);
    }

    private static void imprimirPreOrdem(No no) {
        System.out.print(no.valor+" ");
        if (no.noEsquerdo != null) {
            imprimirPreOrdem(no.noEsquerdo);
        } 
        if (no.noDireito != null) {
            imprimirPreOrdem(no.noDireito);
        }
    }

    public void inserir(int valor) {
        inserir(raiz, valor);
    }

    private static void inserir(No no, int valor) {
        if (raiz == null) {
            raiz = new No(valor);

        } else {
            if (valor < no.valor) {
                if (no.noEsquerdo != null) {
                    inserir(no.noEsquerdo, valor);

                } else {
                    no.noEsquerdo = new No(valor);
                }

            } else {
                if (no.noDireito != null) {
                    inserir(no.noDireito, valor);

                } else {
                    no.noDireito = new No(valor);
                }
            }
        }
    }

    public No pesquisar(int valor) {
        return pesquisar(raiz, valor);
    }

    private No pesquisar(No no, int valor) {
        if (no == null){
            throw new ResolutionException("Não foi possivel encontrar o valor informado.");
        }
        if (no.valor == valor) {
            return no;

        } else {
            if (valor < no.valor) {
                return pesquisar(no.noEsquerdo, valor);

            } else {
                return pesquisar(no.noDireito, valor);
            }
        }
    }
    public No buscar(int valor) {
        if (raiz.valor < valor) {
           return  buscar (raiz.noEsquerdo, valor);

        }
        else if (raiz.valor > valor) {
           return  buscar(raiz.noDireito, valor);

        } else {
            return raiz;
        }
    }
    
    private static No buscar(No no, int valor) {
        if (no.valor < valor) {
            return buscar(no.noEsquerdo, valor);

        } 
        else if (no.valor >= valor) {
            return buscar(no.noDireito, valor);

        } else {
            return no;
        }            
    }
}
