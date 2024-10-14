public class C_pf extends Cliente{
    public C_pf(String nome, int tipo, String codigo_uni, Plano plano){
        super(nome, tipo, codigo_uni, plano);
    }

    @Override public void infor(){
        System.out.println("Tipo: Pessoa Física");
        System.out.print("Cpf: ");
    }
}
