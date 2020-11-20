public class Main {

    public static void main(String[] args) {
        int beerNum = 5;
        String word = "Бутылок (бутылки)";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " лимонада на столе");
            System.out.println(beerNum + " " + word + " лимонада на столе");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                if (beerNum == 1) {
                    word = "бутылка";
                }
                System.out.println(beerNum + " " + word + " лимонада на столе");
            } else {
                System.out.println("Нет уже лимонада");
            }
        }
    }
}
