import java.util.ArrayList;

public class GerenciadorLivros {
    ArrayList<Livro> livros = new ArrayList<>();

    public boolean addList(Livro livro) {
        if(livros.add(livro)) {
            return true;
        }
        return false;
    }

    public boolean verficiadorISBN(int isbn) {
        for(Livro livs: livros) {
            if(livs.getIsbn() == isbn) {
                return false;
            }
        }
        return true;
    }

    public void listarLivros() {
        for(Livro livs: livros) {
            System.out.println(livs);
        }
    }

    public boolean removerLivros(int id) {
        for(Livro livs: livros) {
            if(livs.getId() == id) {
                livros.remove(livs);
                return true;
            }
        }
        return false;
    }

    public Livro buscarLivroId(int id){
        for(Livro livs: livros) {
            if(livs.getId() == id) {
                return livs;
            }
        }
        return null;
    }

    public Livro buscarLivroTitulo(String titulo){
        for(Livro livs: livros) {
            if(livs.getTitulo().toLowerCase().replaceAll("\\s+", "").equals(titulo.toLowerCase().replaceAll("\\s+", ""))) {
                return livs;
            }
        }
        return null;
    }
    public Livro buscarLivroISBN(int isbn){
        for(Livro livs: livros) {
            if(livs.getIsbn() == isbn) {
                return livs;
            }
        }
        return null;
    }
}
