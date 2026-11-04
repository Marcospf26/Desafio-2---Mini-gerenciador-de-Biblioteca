import java.util.HashSet;

public class GerenciadorUsuarios {
    HashSet<Usuario> usuarios = new HashSet<>();

    public boolean addList(Usuario usuario) {
        if(usuarios.add(usuario)) {
            return true;
        }
        return false;
    }
    public boolean removerUsuario(int id) {
        return usuarios.removeIf(users -> users.getId() == id);
    }

    public Usuario buscarPorMatricula(int matricula) {
        for(Usuario users: usuarios) {
            if(users.getMatricula() == matricula) {
                return users;
            }
        }
        return null;
    }

    public void listarUsers() {
        for(Usuario users : usuarios) {
            System.out.println(users);
        }
    }

    public boolean verificarMatricula(int matricula) {
        for(Usuario users: usuarios) {
            if(users.getMatricula() == matricula) {
                return false;
            }
        }
        return true;
    }

    public Usuario buscarPorID(int id) {
        for(Usuario users: usuarios) {
            if(users.getId() == id) {
                return users;
            }
        }
        return null;
    }

}
