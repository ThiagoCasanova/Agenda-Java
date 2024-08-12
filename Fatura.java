

public class Fatura
{
    private String codigo;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String codigo, String descricao, int quantidade, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
        
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
        
    }
     public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
        
        
    }
     public void setPreco(double preco){
        this.preco = preco;
        
        
    }
    public String getCodigo (){
    return this.codigo;
    }
       public String getDescricao (){
    return this.descricao;
    }
     public int getQuantidade (){
    return this.quantidade;
    }
       public double getPreco (){
    return this.preco;
    }
    public double getTotalFatura(){
        return this.quantidade * this.preco > 0 ? this.quantidade * this.preco : 0.0;
    }
    
    public String toString() {
    return "====Fatura:====" +  "\n" +"Código: "  + this.codigo + "\n" +  "Descrição: " + this.descricao + "\n" + "Quantidade:  " + this.quantidade + "\n" + "Preço da unidade: R$" + this.preco;
    }
    }
 