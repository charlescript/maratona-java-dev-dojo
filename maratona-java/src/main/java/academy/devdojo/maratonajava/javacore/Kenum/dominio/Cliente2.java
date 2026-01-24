package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente2 {
  private String nome;
  private TipoCliente tipoCliente;
  private TipoPagamento tipoPagamento;

  public Cliente2(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
    this.nome = nome;
    this.tipoCliente = tipoCliente;
    this.tipoPagamento = tipoPagamento;
  }

  @Override
  public String toString() {
    return "Cliente{" +
            "nome = '" + nome + '\'' +
            ",\n TipoCliente = " + tipoCliente.getNomeRelatorio() + '\'' +
            ",\n TipoClienteInt = " + tipoCliente.getValor() + '\''+
            ",\n TipoPagamento = " + tipoPagamento +
            "\n----------------------------------------------------"+
            '}';
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setTipoCliente(TipoCliente tipoCliente){
    this.tipoCliente = tipoCliente;
  }

  public TipoCliente getTipoCliente(){
    return tipoCliente;
  }
}
