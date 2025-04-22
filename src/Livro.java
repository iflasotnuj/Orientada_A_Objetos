public class Livro {
    String titulo;
    String autor;
    int numPaginas;

    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void exibirInformacoes() {
    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Número de Páginas: " + numPaginas);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro ("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        meuLivro.exibirInformacoes();
    }
}

