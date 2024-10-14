public class P_individual extends Plano{
        public P_individual(String nome){
        super(nome);
    }

    @Override public void tipo(){
        System.out.println("Tipo de plano: individual");
    }
}
