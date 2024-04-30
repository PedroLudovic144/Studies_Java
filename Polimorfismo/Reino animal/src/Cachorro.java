public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au!Au!Au!");
    }
    public void reagir(String frase){
        if(frase.equals("Toma comida")  || frase == "olá"|| frase == "cheguei") {
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanr e Latir");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e Latir");
        }
    }
    public void reeagir(int idade, float peso){
        if(idade < 5){
            if (peso <10) {
                System.out.println("Abanar");

            }else {
                System.out.println("Latir");
            }
        }
    }
}
