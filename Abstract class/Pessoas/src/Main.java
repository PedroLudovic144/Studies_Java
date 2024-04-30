public class Main {
    public static void main(String[] args) {

       //Pessoas p1 = new Pessoas();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       Visitante p5 = new Visitante();
       Bolsista p6 = new Bolsista();

       //p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Claudio");
       p4.setNome("Fabiana");
       p5.setNome("Fabio");

       p6.setNome("Jubileu");
       p6.setBolsa(12.5f);
       p6.setSexo("M");
       p6.pagarMensalidade();

        //p1.setSexo("M");
        p2.setSexo("F");
        p2.setIdade("18");

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        p2.setMat(1111);
        p2.pagarMensalidade();

       //System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
       System.out.println(p5.toString());
       System.out.println(p6.toString());





    }
}