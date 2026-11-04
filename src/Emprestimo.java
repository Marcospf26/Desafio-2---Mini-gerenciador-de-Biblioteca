import java.time.LocalDate;

public class Emprestimo {
    public static int proximoId = 1;

    private int id;
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;


    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo) {
        this.id = proximoId++;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    @Override
    public String toString() {
        return String.format("Id: %d  Nome do Livro %s  Nome do Usuario: %s  Data de Emprestimo %s", this.id, livro.getTitulo(), usuario.getNome(), dataEmprestimo);
    }
}
