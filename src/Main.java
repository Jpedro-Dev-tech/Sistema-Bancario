    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        Pessoa usuario = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("-------------------------");
            System.out.println("Menu-Inicial");
            System.out.println("1. Abrir Conta Corrente"); //ok
            System.out.println("2. Abrir Conta Poupanca"); //ok
            System.out.println("3. Saldo");//ok
            System.out.println("4. Saque");//ok
            System.out.println("5. Depositar");//ok
            System.out.println("0. Sair");
            System.out.println("-------------------------");
            opcao = scanner.nextInt();
            scanner.nextLine();
            String nome;
            String cpf;
            String rg;
            String endereco;
            String telefone;
            String email;
            String dataNascimento;
            switch (opcao) {
                //Abrir ContaCorrente
                case 1:
                    System.out.println("Nome do  Cliente: ");
                    nome = scanner.nextLine();
                    System.out.println("CPF do  Cliente: ");
                    cpf = scanner.nextLine();
                    System.out.println("RG do  Cliente: ");
                    rg = scanner.nextLine();
                    System.out.println("Data de Nascimento");
                    dataNascimento = scanner.nextLine();
                    System.out.println("Telefone");
                    telefone = scanner.nextLine();
                    System.out.println("Email");
                    email = scanner.nextLine();
                    System.out.println("Endereço");
                    endereco = scanner.nextLine();

                    usuario.setNome(nome);
                    usuario.setCpf(cpf);
                    usuario.setRg(rg);
                    usuario.setEndereco(endereco);
                    usuario.setTelefone(telefone);
                    usuario.setEmail(email);
                    usuario.setDataNascimento(dataNascimento);
                    conta.setDono(usuario);
                    conta.setTipo("CC");
                    conta.abrirConta();
                    conta.getSaldo();
                    break;
                //Abrir ContaPoupança
                case 2:
                    System.out.println("Nome do  Cliente: ");
                    nome = scanner.nextLine();
                    System.out.println("CPF do  Cliente: ");
                    cpf = scanner.nextLine();
                    System.out.println("RG do  Cliente: ");
                    rg = scanner.nextLine();
                    System.out.println("Data de Nascimento");
                    dataNascimento = scanner.nextLine();
                    System.out.println("Telefone");
                    telefone = scanner.nextLine();
                    System.out.println("Email");
                    email = scanner.nextLine();
                    System.out.println("Endereço");
                    endereco = scanner.nextLine();

                    usuario.setNome(nome);
                    usuario.setCpf(cpf);
                    usuario.setRg(rg);
                    usuario.setEndereco(endereco);
                    usuario.setTelefone(telefone);
                    usuario.setEmail(email);
                    usuario.setDataNascimento(dataNascimento);
                    conta.setDono(usuario);
                    conta.setTipo("CP");
                    conta.abrirConta();
                    conta.getSaldo();
                    break;

                //Consultar Saldo da Conta
                case 3:
                    if (conta.isStatus()) {
                        System.out.println(conta.getSaldo());
                    } else {
                        System.out.println("conta inativa");
                    }
                    break;

                //Saque da conta
                case 4:
                    System.out.println("Qual valor do saque?");
                    double valor = scanner.nextDouble();
                    conta.sacar((valor));
                    System.out.println("saldo atual é " + conta.getSaldo());
                    break;

                //Depositar
                case 5:
                    System.out.println("Valor a ser depositado?");
                    double valor_depositado = scanner.nextDouble();
                    conta.depositar(valor_depositado);
                    System.out.println("valor atual da conta é " + conta.getSaldo());
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }
        while (opcao != 0) ;
    }