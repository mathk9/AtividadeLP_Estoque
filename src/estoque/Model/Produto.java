package estoque.Model;

public class Produto {    
    
    private Integer codigo;    
    private String data_entrada;
    private String local_Compra;
    private String tipo;
    private String marca;
    private String caracteristica;
    private String tamanho;
    private String cor;
    private Double v_etiqueta;
    private Double v_pago;
    private Double v_margem;
    private Double preco_sugerido;

    public Produto(Integer codigo, String data_entrada, String local_Compra, String tipo,
            String marca, String caracteristica, String tamanho, String cor, Double v_etiqueta,
            Double v_pago, Double preco_sugerido) {
        this.codigo = codigo;
        this.data_entrada = data_entrada;
        this.local_Compra = local_Compra;
        this.tipo = tipo;
        this.marca = marca;
        this.caracteristica = caracteristica;
        this.tamanho = tamanho;
        this.cor = cor;
        this.v_etiqueta = v_etiqueta;
        this.v_pago = v_pago;
        this.v_margem = v_pago * 2;
        this.preco_sugerido = preco_sugerido;
        
    }

    public Produto(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLocal_Compra() {
        return local_Compra;
    }
    
    public void setLocal_Compra(String local_Compra) {
        this.local_Compra = local_Compra;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getCaracteristica() {
        return caracteristica;
    }
    
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getData_Entrada() {
        return data_entrada;
    }
    
    public void setData_Entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }
    
    public Double getV_Etiqueta() {
        return v_etiqueta;
    }
    
    public void setV_Etiqueta(Double v_etiqueta) {
        this.v_etiqueta = v_etiqueta;
    }
    
    public Double getV_Pago() {
        return v_pago;
    }
    
    public void setV_Pago(Double v_pago) {
        this.v_pago = v_pago;
    }
    
    public Double getV_Margem() {
        return v_margem;
    }
    
    public void setV_Margem(Double v_margem) {
        this.v_margem = v_margem;
    }
    
    public Double getPreco_Sugerido() {
        return preco_sugerido;
    }
    
    public void setPreco_Sugerido(Double preco_sugerido) {
        this.preco_sugerido = preco_sugerido;
    }
    


    @Override
    public String toString() {
        return "código: " + codigo + "\n"
                + "Local da Compra: "+ local_Compra + "\n"
                + "Tipo: "+ tipo +"\n"
                + "Marca: "+marca+"\n"
                + "Caracteristica: "+ caracteristica +"\n"
                + "Data de Entrada: "+ data_entrada+"\n"
                + "Cor: "+ cor +"\n"
                + "valor na Etiqueta: "+ v_etiqueta+"\n"
                + "valor Pago: "+ v_pago+"\n"
                + "valor Margem: "+ v_margem+"\n"
                + "Preco Sugerido "+ preco_sugerido+"\n"
                +"------------------------------------------------";
    }

}
