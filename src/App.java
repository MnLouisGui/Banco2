import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Leitor
        Scanner scanner=new Scanner(System.in);

        Plano plano1A = new P_individual("Saúde");
        Plano plano2A = new P_individual("Seguro de vida");
        Plano plano1B = new P_coletivo("Saúde");
        Plano plano2B = new P_coletivo("Seguro de vida");

        Cliente cliente = new C_pf(null, 3, null, null);
        Cliente cliente1 = new C_pj(null, 3, null, null);

        Boolean on = true;
        while (on == true) {
            System.out.println("========================================");
            System.out.println("Menu - Banco Genérico");
            System.out.println("========================================");
            System.out.println("1.Cadastro de cliente\n2.Exibir dados\n3.Sair");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("Você é?\n1.Pessoa física\n2.Pessoa Júridica");
                    op = scanner.nextInt();
                    if(op == 1){
                        System.out.println("========================================");
                        System.out.println("Digite seu nome:");
                        String nome = scanner.nextLine(); nome = scanner.nextLine();
                        System.out.println("Digite seu cpf:");
                        String cpf = scanner.nextLine();
                        System.out.println("Qual plano você quer?\n1."+plano1A.getNome()+"\n2."+plano2A.getNome());
                        op = scanner.nextInt();
                        Plano plano = null;
                        switch (op) {
                            case 1:
                                plano = plano1A;
                                break;
                            case 2:
                                plano = plano2A;
                                break;
                        
                            default:
                                System.out.println("Opção invalida");
                                break;
                        }
                        cliente.cadastro(nome, 0, cpf, plano);
                        System.out.println("Plano para Pessoa fisica selecionado");
                        Thread.sleep(02700);
                        System.out.println("tipo de plano: Individual");
                        Thread.sleep(02700);
                        break;
                    }if(op == 2){
                        System.out.println("========================================");
                        System.out.println("Digite nome júridico:");
                        String nome = scanner.nextLine(); nome = scanner.nextLine();
                        System.out.println("Digite seu cnpj:");
                        String cpf = scanner.nextLine();
                        System.out.println("Qual plano você quer?\n1."+plano1B.getNome()+"\n2."+plano2B.getNome());
                        op = scanner.nextInt();
                        Plano plano = null;
                        switch (op) {
                            case 1:
                                plano = plano1B;
                                break;
                            case 2:
                                plano = plano2B;
                                break;
                        
                            default:
                                System.out.println("Opção invalida");
                                break;
                        }
                        cliente1.cadastro(nome, 1, cpf, plano);
                        System.out.println("Plano para Pessoa júridica selecionado!!!");
                        Thread.sleep(02700);
                        System.out.println("tipo de plano: Coletivo");
                        Thread.sleep(02700);
                        break;
                    }else{
                        System.out.println("Opção inválida");
                    }
                    break;
                case 2:
                    if(cliente.getTipo()==0){
                        cliente.exibir();
                    }if(cliente1.getTipo()==1){
                        cliente1.exibir();
                    }
                    Thread.sleep(2500);
                    break;
                case 3:
                    on = false;   
                    break;
            
                default:
                    break;
            }
        }
    }
}
