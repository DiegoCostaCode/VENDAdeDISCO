import java.sql.SQLOutput;
import java.util.Scanner;
public class Main extends AlbumDeMusica {

    public static void main(String[] args)
    {

        System.out.println("====Bem-Vindo ao Cadastro de Disco====");

        //instanciação

        var disco = new AlbumDeMusica(
                "Off the wall",
                10,
                "Life ain`t so bad at all",
                "Michael Jackson",
                1979
        );

        //Invocação do cadastro//

        var novoAlbumDeMusica1 = CadastrarAlbumDeMusica();

        disco.Tocar();

    }

    /// CADASTRO ///

    public static AlbumDeMusica CadastrarAlbumDeMusica() {

        var scanner = new Scanner(System.in);
        var RockWithYou = new OfftheWall();
        var novoAlbumDeMusica1 = new AlbumDeMusica();

        System.out.println("Por favor, digite o nome do disco: ");
        novoAlbumDeMusica1.setTitulo(scanner.nextLine());

        System.out.println("Descrição do Disco: ");
        novoAlbumDeMusica1.setDescricao(scanner.nextLine());

        System.out.println("Quem foi o autor deste Disco? ");
        novoAlbumDeMusica1.setAutor(scanner.nextLine());

        System.out.println("De qual ano é este disco? ");
        novoAlbumDeMusica1.setAnodelancamento(scanner.nextInt());

        System.out.println("Agora, quantas musicas este album tem: ");
        novoAlbumDeMusica1.setQuantasmusicas(scanner.nextInt());


        System.out.println(novoAlbumDeMusica1.toString());

        RockWithYou.Tocar();


        return novoAlbumDeMusica1;




    }
}












