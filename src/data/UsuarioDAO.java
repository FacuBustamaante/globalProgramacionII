package data;

import Entities.Usuario;
import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements IUsuarioDAO{
    @Override
    public List<Usuario> listarUsuarios() {

        ArrayList<Usuario>usuarios = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.getConexion();

        var sql = "SELECT * FROM usuario ORDER BY auth0Id";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setAuth0Id(rs.getString("auth0Id"));
                usuario.setUsername(rs.getString("username"));
                usuarios.add(usuario);
            }
        }
        catch (Exception e){
            System.out.println("ERROR: " + e);
        }
        finally {
            try{
                con.close();

            }catch (Exception e){
                System.out.println("Error al cerrar conección: " + e);
            }
        }

        return usuarios;
    }

    public boolean agregarUsuario(Usuario usuario) {

        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        String sql = "INSERT IGNORE INTO usuario(auth0Id, username) "
                + "VALUES(?, ?)";

        try{

            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getAuth0Id());
            ps.setString(2, usuario.getUsername());

            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("Error al agregar el usuario: " + e);
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion: " + e);
            }
        }
        return false;
    }

}



