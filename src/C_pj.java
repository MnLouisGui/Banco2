public class C_pj extends Cliente{
    public C_pj(String nome, int tipo, String codigo_uni, Plano plano){
        super(nome, tipo, codigo_uni, plano);
    }
    private String codigo_uni;

    @Override public void infor(){
        System.out.println("Tipo: Pessoa Júridica");
        System.out.print("Cnpj: ");
    }
}
