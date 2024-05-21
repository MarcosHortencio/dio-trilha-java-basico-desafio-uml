public class Navegador implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
     System.out.println("Exibindo pagina : "+url);   
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("adicionar Nova aba ... ");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizar a pagina ...");
    }

}
