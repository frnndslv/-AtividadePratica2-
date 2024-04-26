import Models.ComissarioBordo;
import Models.Passageiro;
import Models.Piloto;

public class Sistema {

    public static void MenuInicial() {

        System.out.println("\nAVIAO VOO SYSTEM");
        System.out.println("\nDeseja realizar procedimetos para qual categoria: \n");
        System.out.println("Digite 1 para Pilotos.\n");
        System.out.println("Digite 2 para Comissarios.\n");
        System.out.println("Digite 3 para Passageiros.\n");
        System.out.println("Ou caso queira ver todos a bordo do voo digite 4.\n");
        System.out.println("Digite zero para finalizar / Sair");

    }

    public static void menuSecundario() {
        MenuInicial();
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
        System.out.println("4) Voltar para o menu principal ");
        System.out.println("0) Finalizar programa ");

    }

    public static int lendoOp() {
        int op = Console.lerInt();
        return op;
    }

    public static void verificandoOp() {

        int opp = lendoOp();
        do {
            menuSecundario();

            switch (opp) {
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
                    menuSecundario();

                    break;
                case 0:

                    System.out.println("programa finalizado \n");

                    break;

                default:
                    System.out.println("Opçao invalida !! \n");

                    break;
            }

        } while (opp != 0);

    }

    public static void ExibirMenuCompleto() {

    }

    public static void cadastrarPiloto() {
        Piloto piloto1 = new Piloto();
        System.out.print("Nome do piloto: \n");
        piloto1.setNome(Console.lerString());
        System.out.println("numero do cpf\n");
        piloto1.setCpf(Console.lerLong());
        System.out.println("numero do bres\n");
        piloto1.setIdbreve(Console.lerInt());
        System.out.println("Funçao no voo\n");
        piloto1.setFuncaoVoo(Console.lerString());
        System.out.println("Cadastro realizado com sucesso!!\n");
    }

    public static void cadastrarComissario() {
        ComissarioBordo comissario1 = new ComissarioBordo();
        System.out.print("Nome do Comissario: \n");
        comissario1.setNome(Console.lerString());
        System.out.println("Numero do cpf\n");
        comissario1.setCpf(Console.lerLong());
        System.out.println("Numero de identificaçao do comissario\n");
        comissario1.setIdCarteiraComissario(Console.lerInt());
        System.out.println("Funçao no voo\n");
        comissario1.setFuncaoVoo(Console.lerString());
        System.out.println("Cadastro realizado com sucesso!!\n");

    }

    public static void cadastrarPassageiro() {
        Passageiro passageiro1 = new Passageiro();
        System.out.print("Nome do passageiro: \n");
        passageiro1.setNome(Console.lerString());
        System.out.println("numero do cpf\n");
        passageiro1.setCpf(Console.lerLong());
        System.out.println("numero voo\n");
        passageiro1.setNumeroPoltrona(Console.lerString());
        System.out.println("Numero do cartao de embarque\n");
        passageiro1.setNumeroCartaoEmbarque(Console.lerString());
        System.out.println("Cadastro realizado com sucesso!!\n");
    }

}