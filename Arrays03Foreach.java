public class Arrays03Foreach {
    static void main() {
        int[] numeros = {1,2,3,4,5};

        System.out.println("A partir daqui: ");

        for(int num: numeros){
            System.out.println(num);
        }

        String [] linguagens = {"Java", "SQL", "Python", "C++"};
        for (String lang: linguagens){
            System.out.println(lang);
        }
    }
}
