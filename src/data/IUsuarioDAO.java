package data;

import Entities.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    List<Usuario> listarUsuarios();
    boolean agregarUsuario(Usuario usuario);
}
