public abstract class Pessoas {
    protected String nome;
    private  String idade;
    private  String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario()
    {
        this.idade = idade +1;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
