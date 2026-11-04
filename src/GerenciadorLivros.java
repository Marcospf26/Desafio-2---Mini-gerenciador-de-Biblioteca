import java.util.ArrayList;

public class GerenciadorLivros {
    ArrayList<Livro> livros = new ArrayList<>();

    public boolean addList(Livro livro) {
        if(livros.add(livro)) {
            return true;
        }
        return false;
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
}
