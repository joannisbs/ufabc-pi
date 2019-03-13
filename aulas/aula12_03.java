
leitura ate o final da entrada
  EOF end of file // linu ctr d final da entrada

  methodos da classe scanner

    scanner.hasInt();
    scanner.hasDouble();
    scanner.hasNextLine();
    scanner.hasNext();

    // retorna true se tem or false se nao, boolean

  vc pode passar uma string como parametro para o scanner
    String dado = '18 jose'
    Scanner scanDado = new Scanner(dado);
    int idade = scanDado.nextInt();
    String name = scanDado.nextLine();

