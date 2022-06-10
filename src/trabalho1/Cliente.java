
package trabalho1;


public class Cliente extends Pessoa{

    public Cliente(String nome, long cpf) {
        super(nome, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
