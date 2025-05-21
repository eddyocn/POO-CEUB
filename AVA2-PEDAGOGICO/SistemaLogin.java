
public class SistemaLogin {
    public boolean autenticar(String usuario, String senha) {
        return usuario.equals("professor") && senha.equals("1234");
    }
}