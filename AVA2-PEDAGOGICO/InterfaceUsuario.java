import java.util.Scanner;

public class InterfaceUsuario {
    private SistemaLogin sistemaLogin = new SistemaLogin();
    private GerenciadorCadastro gerenciadorCadastro = new GerenciadorCadastro();

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String usuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (sistemaLogin.autenticar(usuario, senha)) {
            System.out.println("Login bem-sucedido! Bem-vindo ao sistema pedagógico.");
        } else {
            System.out.println("Login falhou! Tente novamente.");
        }

        scanner.close();
    }
}