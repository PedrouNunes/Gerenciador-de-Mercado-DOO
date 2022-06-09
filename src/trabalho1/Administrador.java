
package trabalho1;

public class Administrador extends Pessoa{

    public Administrador(String nome, int cpf) {
        super(nome, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
