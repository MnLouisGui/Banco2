public class Cliente {
    private String nome;
    private int tipo; // "0" para pj  // "1" para pf
    private String codigo_uni;
    private Plano plano;

    Cliente(String nome, int tipo, String codigo_uni, Plano plano){
        this.nome = nome;
        this.tipo = tipo;
        this.codigo_uni = codigo_uni;
        this.plano = plano;
    }

    public int getTipo() {
        return tipo;
    }

    public void cadastro(String nome, int tipo, String codigo_uni, Plano plano){
        this.nome = nome;
        this.tipo = tipo;
        this.codigo_uni = codigo_uni;
        this.plano = plano;
    }

    public void infor(){
    }

    public void exibir(){
        System.out.println("========================================");
        System.out.println("Dados - Cliente: "+this.nome);
        System.out.println("========================================");
        infor();
        System.out.println(this.codigo_uni+"\nCliente: "+this.nome+"\nPlano: "+plano.getNome());
        plano.tipo();
    }
}