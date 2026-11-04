public class Usuario {
    public static int proximoId = 100;

    private int id;
    private String nome;
    private int matricula;

    public Usuario (String nome, int matricula ) {
        this.id = proximoId++;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getId(){
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format("Id: %d  Nome %s  Matricula %d", this.id, this.nome, this.matricula);
    }

}
