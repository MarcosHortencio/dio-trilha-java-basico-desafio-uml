public class Telefone {
public static void main(String[] args) {
    Reproduzir reproduzir=new Reproduzir();
    reproduzir.tocar();
    reproduzir.pausar();
    reproduzir.selecionarMusica("Musica");

    System.out.println("...");

    Aparelho aparelho=new Aparelho();
    aparelho.ligar("123456789");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    
    System.out.println("...");

    Navegador navegador=new Navegador();
    navegador.exibirPagina("www.teste.com");
    navegador.adicionarNovaAba();
    navegador.atualizarPagina();
}
}

