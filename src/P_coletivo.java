public class P_coletivo extends Plano {
    public P_coletivo(String nome){
        super(nome);
    }

    @Override public void tipo(){
        System.out.println("Tipo de plano: Coletivo");
    }
}
