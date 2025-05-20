package Entities;

public class Usuario extends Base{
    private String auth0Id;
    private String username;


    public Usuario(){}

    public Usuario(String auth0Id, String username) {
        this.auth0Id = auth0Id;
        this.username = username;

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


}
