public class Main {

    public static void main(String[] args) {
        int beerNum = 5;
        String word = "Бутылок (бутылки)";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " пивасика на столе");
            System.out.println(beerNum + " " + word + " пивасика");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по рукам.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                if (beerNum == 1) {
                    word = "бутылка";
                }
                System.out.println(beerNum + " " + word + " пива на столе");
            } else {
                System.out.println("Нет уже пивасика");
            }
        }
    }
}
