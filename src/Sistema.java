import java.util.ArrayList;

import Models.Comissario;
import Models.Passageiro;
import Models.Pessoa;
import Models.Piloto;
import Models.Voo;

public class Sistema {

    public static Voo voo = new Voo();

    public static void menuInicial() {
        int op;
        do {
            System.out.println("\nAVIAO VOO SYSTEM");
            System.out.println("\nProcedimetos: \n");
            System.out.println("Digite 1 para Cadastrar.\n");
            System.out.println("Digite 2 para Buscar.\n");
            System.out.println("Digite 3 para Listar.\n");
            System.out.println("Digite 4 para Excluir.\n");
            System.out.println("Digite 0 (zero) para finalizar / Sair");
            op = lendoOp();
            if (op != 0)
                menuSecundario(op);

        } while (op != 0);

        System.out.println("Programa Finalizado!");

    }

    private static void menuSecundario(int opcao) {
        String opmenuAlt;

        if (opcao == 1) {
            opmenuAlt = "Cadastrar";
        } else if (opcao == 2) {
            opmenuAlt = "Buscar";
        } else if (opcao == 3) {
            opmenuAlt = "Listar";
        } else {
            opmenuAlt = "Excluir";
        }

        int op2;
        do {
            System.out.println("\nAVIAO VOO SYSTEM");
            System.out.println("\nDeseja realizar procedimeto de " + opmenuAlt + " para qual categoria: \n");
            System.out.println("Digite 1 para Pilotos.\n");
            System.out.println("Digite 2 para Comissarios.\n");
            System.out.println("Digite 3 para Passageiros.\n");
            if (opcao != 1 && opcao != 2) {
                System.out.println("Digite 4 para Todos a bordo.\n");
            }
            System.out.println("Digite 5 para Voltar ao menu inicial.\n");
            op2 = lendoOp();
            if (op2 != 5)
                switchOpcao(opcao, op2);
        } while (op2 != 5);

        System.out.println("Voltando para o menu principal!");

    }

    private static void switchOpcao(int opcao1, int opcao2) {
        switch (opcao1) {
            case 1:
                if (opcao2 == 1) {
                    cadastrarPiloto();
                } else if (opcao2 == 2) {
                    cadastrarComissario();
                } else if (opcao2 == 3) {
                    cadastrarPassageiro();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            case 2:
                if (opcao2 == 1) {
                    buscarPiloto();
                } else if (opcao2 == 2) {
                    buscarComissario();
                } else if (opcao2 == 3) {
                    buscarPassageiro();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            case 3:
                if (opcao2 == 1) {
                    listarPiloto();
                } else if (opcao2 == 2) {
                    listarComissario();
                } else if (opcao2 == 3) {
                    listarPassageiro();
                } else if (opcao2 == 4) {
                    listarTodos();
                } else if (opcao2 == 5) {
                    menuInicial();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            case 4:
                if (opcao2 == 1) {
                    excluirPiloto();
                } else if (opcao2 == 2) {
                    excluirComissario();
                } else if (opcao2 == 3) {
                    excluirPassageiro();
                } else if (opcao2 == 4) {
                    excluirTodos();
                } else if (opcao2 == 5) {
                    menuInicial();
                } else {
                    System.out.println("Opção invalida!");
                    return;
                }
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }

    }

    private static int lendoOp() {
        int op = Console.lerInt();
        return op;
    }

    private static void excluir(long cpf) {
        ArrayList<Pessoa> pessoas = voo.getPessoas();
        int index = -1;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCpf() == cpf) {
                index = i;
            }
        }
        if (index != -1) {
            pessoas.remove(index);
            voo.setPessoas(pessoas);
        } else {
            System.out.println("Cpf não encontrado!!");
        }
    }

    public static void cadastrarPiloto() {
        Piloto piloto1 = new Piloto();

        System.out.print("Nome do piloto: \n");
        piloto1.setNome(Console.lerString());

        System.out.println("numero do cpf\n");
        piloto1.setCpf(Console.lerLong());

        System.out.println("numero do bres\n");
        piloto1.setIdbreve(Console.lerInt());

        System.out.println("telefone\n");
        piloto1.setTelefone(Console.lerString());

        System.out.println("Funçao no voo\n");
        piloto1.setFuncaoVoo(Console.lerString());

        System.out.println("Cadastro realizado com sucesso!!\n");

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        pessoas.add(piloto1);
        voo.setPessoas(pessoas);
    }

    public static void cadastrarComissario() {
        Comissario comissario1 = new Comissario();

        System.out.print("Nome do Comissario: \n");
        comissario1.setNome(Console.lerString());

        System.out.println("Numero do cpf\n");
        comissario1.setCpf(Console.lerLong());

        System.out.println("Numero de identificaçao do comissario\n");
        comissario1.setIdCarteiraComissario(Console.lerInt());

        System.out.println("telefone\n");
        comissario1.setTelefone(Console.lerString());

        System.out.println("Funçao no voo\n");
        comissario1.setFuncaoVoo(Console.lerString());

        System.out.println("Cadastro realizado com sucesso!!\n");

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        pessoas.add(comissario1);
        voo.setPessoas(pessoas);

    }

    public static void cadastrarPassageiro() {
        Passageiro passageiro1 = new Passageiro();

        System.out.print("Nome do passageiro: \n");
        passageiro1.setNome(Console.lerString());

        System.out.println("numero do cpf\n");
        passageiro1.setCpf(Console.lerLong());

        System.out.println("telefone\n");
        passageiro1.setTelefone(Console.lerString());

        System.out.println("numero voo\n");
        passageiro1.setNumeroPoltrona(Console.lerString());

        System.out.println("Numero do cartao de embarque\n");
        passageiro1.setNumeroCartaoEmbarque(Console.lerString());

        System.out.println("Cadastro realizado com sucesso!!\n");

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        pessoas.add(passageiro1);
        voo.setPessoas(pessoas);
    }

    public static void listarPiloto() {
        // esse array de pessoas( que tem nome piloto) so pra imprimir.
        ArrayList<Pessoa> pilotos = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        // pego pessos cadastradas de voo, e coloco num array,
        // percorro todo esse array

        for (int i = 0; i < pessoas.size(); i++) {
            // eu verifico se em array pessoa, a pessoa é do tipo piloto? se sim eu pego
            // e adiciono em outro array para imprimir, isso foi uma gambi, espremi que nem
            // pedra e nao saiu nada melhor.
            if (pessoas.get(i) instanceof Piloto) {
                pilotos.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < pilotos.size(); i++) {
            System.out.println(pilotos.get(i).toString());
        }

    }

    // eu so repeti tudo de antes mudando piloto pra passageiro.
    public static void listarPassageiro() {

        ArrayList<Pessoa> passageiros = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();

        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Passageiro) {
                passageiros.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < passageiros.size(); i++) {
            System.out.println(passageiros.get(i).toString());
        }
    }

    public static void listarComissario() {
        ArrayList<Pessoa> comissarios = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();

        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Comissario) {
                comissarios.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < comissarios.size(); i++) {
            System.out.println(comissarios.get(i).toString());
        }
    }

    public static void listarTodos() {
        ArrayList<Pessoa> pessoas = voo.getPessoas();
        System.out.println(pessoas.toString());

    }

    public static void buscarPiloto() {
        ArrayList<Pessoa> pilotos = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        System.out.println("Informe o cpf do piloto que deseja buscar:");
        long cpf = Console.lerLong();
        boolean achouCpf = false;
        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Piloto) {
                pilotos.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < pilotos.size(); i++) {
            if (pilotos.get(i).getCpf() == cpf) {
                System.out.println(pilotos.get(i).toString());
                achouCpf = true;
            }

        }
        if (achouCpf == false) {
            System.out.println("Piloto nao encontrado!!");
        }

    }

    public static void buscarPassageiro() {
        ArrayList<Pessoa> passageiros = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        System.out.println("Informe o cpf do Passageiro que deseja buscar:");
        long cpf = Console.lerLong();
        boolean achouCpf = false;
        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Passageiro) {
                passageiros.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < passageiros.size(); i++) {
            if (passageiros.get(i).getCpf() == cpf) {
                System.out.println(passageiros.get(i).toString());
                achouCpf = true;
            }

        }
        if (achouCpf == false) {
            System.out.println("Passageiro nao encontrado!!");
        }
    }

    public static void buscarComissario() {
        ArrayList<Pessoa> comissario = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        System.out.println("Informe o cpf do comissario que deseja buscar:");
        long cpf = Console.lerLong();
        boolean achouCpf = false;
        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Comissario) {
                comissario.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < comissario.size(); i++) {
            if (comissario.get(i).getCpf() == cpf) {
                System.out.println(comissario.get(i).toString());
                achouCpf = true;
            }

        }
        if (achouCpf == false) {
            System.out.println("Comissario não encontrado!!");
        }
    }

    public static void excluirPiloto() {
        ArrayList<Pessoa> piloto = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        System.out.println("Informe o cpf do Piloto que deseja excluir:");
        long cpf = Console.lerLong();
        boolean achouCpf = false;
        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Piloto) {
                piloto.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < piloto.size(); i++) {
            if (piloto.get(i).getCpf() == cpf) {
                System.out.println("Piloto" + pessoas.get(i) + " excluido!!");
                piloto.remove(pessoas.get(i));
                achouCpf = true;
            }

        }
        if (achouCpf == false) {
            System.out.println("Não existem  Pilotos cadastrados para esse voo!!\"");
        }

    }

    public static void excluirPassageiro() {
        ArrayList<Pessoa> passageiro = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        System.out.println("Informe o cpf do passageiro que deseja excluir:");
        long cpf = Console.lerLong();
        boolean achouCpf = false;
        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Passageiro) {
                passageiro.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < passageiro.size(); i++) {
            if (passageiro.get(i).getCpf() == cpf) {
                System.out.println("Passageiro " + pessoas.get(i) + " excluido!!");
                passageiro.remove(pessoas.get(i));
                achouCpf = true;
            }

        }
        if (achouCpf == false) {
            System.out.println("Não existem  Passageiros cadastrados para esse voo!!");
        }
    }

    public static void excluirComissario() {
        ArrayList<Pessoa> comissario = new ArrayList<Pessoa>();

        ArrayList<Pessoa> pessoas = voo.getPessoas();
        System.out.println("Informe o cpf do comissario que deseja excluir:");
        long cpf = Console.lerLong();
        boolean achouCpf = false;
        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Comissario) {
                comissario.add(pessoas.get(i));
            }
        }

        for (int i = 0; i < comissario.size(); i++) {
            if (comissario.get(i).getCpf() == cpf) {
                System.out.println("Comissario " + pessoas.get(i) + " excluido!!");
                comissario.remove(pessoas.get(i));
                achouCpf = true;
            }

        }
        if (achouCpf == false) {
            System.out.println("Não existem  comissarios cadastrados para esse voo!!");
        }
    }

    public static void excluirTodos() {

        ArrayList<Pessoa> pessoas = voo.getPessoas();

        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i) instanceof Comissario) {
                pessoas.remove(pessoas.get(i));
            }
        }
        System.out.println("Todos os tripulantes e passageiros bem como seus respectivos dados, foram excluidos ");

    }

}
