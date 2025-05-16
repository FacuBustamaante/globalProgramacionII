package Entities;

public class Usuario extends Base{
    private String auth0Id;
    private String username;
    private Cliente cliente;

    public Usuario(){}

    public Usuario(String auth0Id, String username, Cliente cliente) {
        this.auth0Id = auth0Id;
        this.username = username;
        this.cliente = cliente;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
