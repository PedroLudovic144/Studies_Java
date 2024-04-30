public class Aluno  extends Pessoas{
    private int mat;
    private String curso;
    //Final = Para sobrepor metodos ou classes
    public  void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno "  + this.getNome());
    }
    public void cancelarCurso(){
        System.out.println("Matrícula será cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
