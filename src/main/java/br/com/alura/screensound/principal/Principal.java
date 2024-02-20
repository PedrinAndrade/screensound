package br.com.alura.screensound.principal;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    public void exibirMenu() {
        var opcao = 0;

        while (opcao != 9) {
            var menu = """
                    *** Screen Sound Músicas ***                    
                                        
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                                    
                    9 - Sair
                                        
                    Escolha uma opção:""";

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();
        }

        switch (opcao) {
            case 1:
                cadastrarArtistas();
                break;
            case 2:
                cadastrarMusicas();
                break;
            case 3:
                listarMusicas();
                break;
            case 4:
                buscarMusicasPorArtista();
                break;
            case 9:
                System.out.println("Encerrando a aplicação!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void cadastrarArtistas() {
    }

    private void cadastrarMusicas() {
    }

    private void listarMusicas() {
    }

    private void buscarMusicasPorArtista() {
    }
}