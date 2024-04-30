public class Reptile extends Animal {
    private String comEScamas;
    @Override
    public void locomover() {
        System.out.println("Ratejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de retil");
    }

    public String getComEScamas() {
        return comEScamas;
    }

    public void setComEScamas(String comEScamas) {
        this.comEScamas = comEScamas;
    }
}
