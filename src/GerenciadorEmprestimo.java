import java.util.HashMap;

public class GerenciadorEmprestimo {
    public static int proximoIntegerMap = 1;

    HashMap<Integer, Emprestimo> emprestimos = new HashMap<>();

    public void addList(Emprestimo emprestimo) {
        emprestimos.put(proximoIntegerMap++,emprestimo);

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

}
