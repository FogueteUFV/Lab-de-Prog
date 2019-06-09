package wattam.s.forniture;


public class Cliente extends Pessoa {
    private String email;
    private int telefone;
    private Endereco endereco;
    

    public Cliente(String email, int telefone, String nome, String cpf, String rua, int numero, String bairro, String cidade) {
        super(nome, cpf);
        this.email = email;
        this.telefone = telefone;
        this.endereco = new Endereco(rua, numero, bairro, cidade);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return String.format("\nNome: "+this.nome+"\nEmail: "+this.email+"\nTelefone: "+this.telefone+"\nCPF: "+this.cpf+"\nEndereco do cliente:"+this.endereco.toString());
    }
    
    
}