import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {

Scanner ler = new Scanner(System.in);
int x, y;
GerenciadorLivros gerenciadorLivros = new GerenciadorLivros();


do {
    System.out.println("1 - Gerenciar livros.");
    System.out.println("2 - Gerenciar usuarios.");
    System.out.println("3 - Emprestimos de livros.");

    y = ler.nextInt();

    switch (y) {
        case 1:
            do{
                System.out.println("1 - Cadastrar livros.");
                System.out.println("2 - Remover livros.");
                System.out.println("3 - Buscar livros por ID.");
                System.out.println("4 - Buscar livros por título.");
                System.out.println("5 - Listar livros.");
                System.out.println("6 - Identificar livros pelo ISBN.");
                System.out.println("0 - Sair");

                x = ler.nextInt();
                ler.nextLine();
                switch (x) {
                    case 1:
                        System.out.println(" Cadastrar livros.");

                        System.out.println("Titulo do livro.");
                        String tituloLivro = ler.nextLine();

                        System.out.println(" Autor do livro.");
                        String autorLivro = ler.nextLine();

                        System.out.println(" ISBN do livro.");
                        int isbnLivro = ler.nextInt();

                        System.out.println(" Quantidade de exemplares.");
                        int qtdExemplares = ler.nextInt();

                        Livro livro = new Livro(tituloLivro, autorLivro, isbnLivro, qtdExemplares);

                        if(gerenciadorLivros.addList(livro)) {
                            System.out.println("Livro cadastrado com sucesso");
                        } else {
                            System.out.println("Nao foi possivel cadastrar o livro");
                        }

                        break;
                    case 2:
                        System.out.println(" Remover livros.");
                        System.out.println("Insira o ID");
                        int removerLivroId = ler.nextInt();
                        if(gerenciadorLivros.removerLivros(removerLivroId)) {
                            System.out.println("Livro removido com sucesso");
                        } else {
                            System.out.println("Nao foi possivel remover o livro");


                        }


                    break;
                    case 3:
                        System.out.println(" Buscar livros por ID.");
                        System.out.println(" Insira o  ID.");
                        int procurarLivroId = ler.nextInt();
                        if(gerenciadorLivros.buscarLivroId(procurarLivroId) != null) {
                            System.out.println(gerenciadorLivros.buscarLivroId(procurarLivroId));
                        } else {
                            System.out.println(" Livro nao encontrado.");
                        }


                        break;
                    case 4:
                        System.out.println(" Buscar livros por título.");
                        String procurarLivroTitulo = ler.nextLine();
                        if(gerenciadorLivros.buscarLivroTitulo(procurarLivroTitulo) != null) {
                            System.out.println(gerenciadorLivros.buscarLivroTitulo(procurarLivroTitulo));
                        } else {
                            System.out.println(" Livro nao encontrado.");
                        }

                        break;
                    case 5:
                        gerenciadorLivros.listarLivros();
                    break;
                    case 6:
                        System.out.println(" Identificar livros pelo ISBN.");

                        int procurarLivrosISBN = ler.nextInt();
                        if(gerenciadorLivros.buscarLivroISBN(procurarLivrosISBN) != null) {
                            System.out.println(gerenciadorLivros.buscarLivroISBN(procurarLivrosISBN));
                        } else {
                            System.out.println(" Livro nao encontrado.");
                        }


                        break;
                    default:
                    break;

                }
            }while(x != 0);
        break;
        case 2:

        break;
        case 3:
        break;
        default:
        break;
    }
}while(y!=0);




}
