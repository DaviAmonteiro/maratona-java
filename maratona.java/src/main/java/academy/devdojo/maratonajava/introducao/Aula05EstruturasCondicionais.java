package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // a idade < 15 categoria juvenil
        // idade >= 15 && idade <18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 19;
        String categoria;
        if (idade <15){
            categoria = "Categoria infantil";
        } else if (idade <18){
            categoria = "Categoria juvenil";
        } else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
