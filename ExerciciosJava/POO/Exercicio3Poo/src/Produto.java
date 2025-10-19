
public class Produto {

    String nome;
    String descricao;
    double precoUnitario;
    int desconto;

    public Produto(String nome, String descricao, double precoUnitario, int desconto) {
        setNome(nome);
        this.descricao = descricao;
        setPrecoUnitario( precoUnitario);
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
       try{
           if (precoUnitario<0){
               System.out.println("Erro");
           }
           else {
               this.precoUnitario = precoUnitario;
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            if (nome == null || nome.isBlank()){
                System.out.println("Erro");
            }
            else {
                this.nome = nome;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", desconto=" + desconto +
                '}';
    }
}
