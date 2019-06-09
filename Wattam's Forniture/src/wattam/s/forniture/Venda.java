package wattam.s.forniture;
import java.util.Date;
import java.util.ArrayList;

public class Venda {
    private Date data;
    private Double valor;
    private String codigo;
    private ArrayList<String> listaCodigoProdutos = new ArrayList();
    private String cpfCliente;
    private String cpfFuncionario;

    public Venda(Date data, Double valor, String codigo, String cpfCliente, String cpfFuncionario) {
        this.data = data;
        this.valor = valor;
        this.codigo = codigo;
        this.cpfCliente = cpfCliente;
        this.cpfFuncionario = cpfFuncionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getListaCodigoProdutos() {
        return listaCodigoProdutos;
    }

    public void setListaCodigoProdutos(ArrayList<String> listaCodigoProdutos) {
        this.listaCodigoProdutos = listaCodigoProdutos;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
    
}
