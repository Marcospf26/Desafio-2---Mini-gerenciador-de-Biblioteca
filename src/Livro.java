public class Livro {
    public static int proximoId = 1;

    private int id;
    private String titulo;
    private String autor;
    private int isbn;
    private int quantidadeExemplares;


    public Livro(String titulo, String autor, int isbn, int quantidadeExemplares ) {
        this.id = proximoId++;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeExemplares = quantidadeExemplares;
    }

    public boolean descontaExemplar(int quantidade) {
        if(quantidade > 0 && this.quantidadeExemplares - quantidade >= 0) {
            this.quantidadeExemplares -= quantidade;
            return true;
        }
        return false;
    }



    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getIsbn(){
        return this.isbn;
    }
    public int getQuantidadeExemplares(){
        return this.quantidadeExemplares;
    }

    @Override
    public String toString() {
        return String.format("Id: %d  Titulo %s Autor %s  ISBN %d  Exemplares %d", this.id, this.titulo, this.autor, this.isbn, this.quantidadeExemplares);
    }

}
