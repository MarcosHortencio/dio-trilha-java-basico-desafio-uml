public class Reproduzir implements ReprodutorMusical{

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando ...");
        
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Reproduzindo : "+musica);
    
    }

}
