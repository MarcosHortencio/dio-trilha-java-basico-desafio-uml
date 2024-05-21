public class Aparelho implements AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
       System.out.println("Ligar para o telefone: "+numero ); 
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atender ...");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Incia correio de voz ...");
        
    }

}
