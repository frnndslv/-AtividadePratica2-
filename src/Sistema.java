import Models.ComissarioBordo;
import Models.Passageiro;
import Models.Piloto;

public class Sistema {

    public static void exibirMenuInicial() {

        System.out.println("\nAVIÃO VOO SYSTEM");
        System.out.println("\nDeseja realizar procedimentos para qual categoria: ");
        System.out.println("\nDigite 1 para Pilotos.");
        System.out.println("\nDigite 2 para Comissários.");
        System.out.println("\nDigite 3 para Passageiros.");
        System.out.println("\nVer todos a bordo do voo, digite 4.");
        System.out.println("\nDigite 0 para finalizar/Sair. ");

    }

    public static void menuSecundario() {
        int op = lendoOp();
        String qualTipoPessoa = "";
        switch (op) {
            case 1:
                qualTipoPessoa = "Piloto";

                break;
            case 2:
                qualTipoPessoa = "Comissario";

                break;
            case 3:
                qualTipoPessoa = "Passageiro";

                break;
            case 0:

                System.out.println("programa finalizado \n");

                break;

            default:
                System.out.println("Opçao invalida !! \n");

                break;

        }

        System.out.print("Informe uma opção: \n");
        System.out.println("1) Cadastrar novo  " + qualTipoPessoa + ".\n");
        System.out.println("2) Alterar informaçoes do " + qualTipoPessoa + ".\n");
        System.out.println("3) Apagar " + qualTipoPessoa + ".\n");
        System.out.println("5) Voltar para o menu principal ");
        System.out.println("0) Finalizar programa ");

    }

    public static int lendoOp() {
        int op = Console.lerInt();
        return op;
    }

    public static void verificandoOp() {
        exibirMenuInicial();
        menuSecundario();

        int op = lendoOp();
        switch (op) {
            case 1:
                cadastrarPiloto();

                break;
            case 2:
                cadastrarComissario();

                break;
            case 3:
                cadastrarPassageiro();

                break;
            case 4:
                // cadastrarPassageiro();

                break;
            case 0:

                System.out.println("programa finalizado \n");

                break;

            default:
                System.out.println("Opçao invalida !! \n");

                break;
        }

    }

    public static void cadastrarPiloto() {
        Piloto piloto1 = new Piloto();
        System.out.print("Nome do piloto: \n");
        piloto1.setNome(Console.lerString());
        System.out.println("numero do cpf\n");
        piloto1.setCpf(Console.lerInt());
        System.out.println("numero do bres\n");
        piloto1.setIdbreve(Console.lerInt());
        System.out.println("Funçao no voo\n");
        piloto1.setFuncaoVoo(Console.lerString());

    }

    public static void cadastrarComissario() {
        ComissarioBordo comissario1 = new ComissarioBordo();
        System.out.print("Nome do Comissario: \n");
        comissario1.setNome(Console.lerString());
        System.out.println("numero do cpf\n");
        comissario1.setCpf(Console.lerInt());
        System.out.println("numero de identificaçao do comissario\n");
        comissario1.setIdCarteiraComissario(Console.lerInt());
        System.out.println("Funçao no voo\n");
        comissario1.setFuncaoVoo(Console.lerString());

    }

    public static void cadastrarPassageiro() {
        Passageiro passageiro1 = new Passageiro();
        System.out.print("Nome do passageiro1: \n");
        passageiro1.setNome(Console.lerString());
        System.out.println("numero do cpf\n");
        passageiro1.setCpf(Console.lerInt());
        System.out.println("numero voo\n");
        passageiro1.setNumeroPoltrona(Console.lerString());
        System.out.println("Numero do cartao de embarque\n");
        passageiro1.setNumeroCartaoEmbarque(Console.lerString());

    }

}
