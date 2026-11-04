import java.util.HashMap;

public class GerenciadorEmprestimo {
    public static int proximoIntegerMap = 1;

    HashMap<Integer, Emprestimo> emprestimos = new HashMap<>();
    HashMap<Integer, Emprestimo> emprestimosTotais = new HashMap<>();


    public void addList(Emprestimo emprestimo) {
        int x = proximoIntegerMap++;
        emprestimos.put(x,emprestimo);
        emprestimosTotais.put(x,emprestimo);

    }


    public boolean verificarQuantidadeEmprestimos(int id) {
        int contador = 0;
        for (Emprestimo emps : emprestimos.values()) {
            if(emps.getUsuario().getId() == id) {
                contador++;
            }
        }

        if(contador >= 3) {
            return false;
        } else {
            return true;
        }
    }

    public void listarEmprestimos() {
        for(Emprestimo emps: emprestimos.values()) {
            System.out.println(emps);
        }
    }

    public Emprestimo procurarEmprestimoID(int id) {
        for(Emprestimo emps: emprestimos.values()) {
            if(emps.getId() == id) {
                return emps;
            }
        }
        return null;
    }

    public Integer buscarChave(Emprestimo emprestimo) {
        for (HashMap.Entry<Integer, Emprestimo> e : emprestimos.entrySet()) {
            if (e.getValue().equals(emprestimo)) {
                return e.getKey();
            }
        }
        return null;
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimos.remove(buscarChave(emprestimo));
    }

    public void listarHistorico(Usuario usuario) {
        for(Emprestimo emps: emprestimosTotais.values()) {
            if(emps.getUsuario() == usuario) {
                System.out.printf("Id: %d  Nome do Livro %s  Nome do Usuario: %s  Data de Emprestimo %s Data de Devolucao %s%n", emps.getId(), emps.getLivro().getTitulo(), emps.getUsuario().getNome(), emps.getDataEmprestimo(), emps.getDataDevolucao());
            }
        }
    }

    public boolean verificarLivroEmprestado(int id) {
        for(Emprestimo emps: emprestimos.values()) {
            if(emps.getLivro().getId() == id) {
                return false;
            }
        }
        return true;
    }

    public boolean verificarUsuarioTemEmprestimos(int id) {
        for(Emprestimo emps: emprestimos.values()) {
            if(emps.getUsuario().getId() == id) {
                return false;
            }
        }
        return true;
    }

}
