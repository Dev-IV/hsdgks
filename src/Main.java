public class Main {
    static int[] drinkPrices = {150, 80, 20, 50};
    static String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

    public static void main(String[] args) {
        System.out.println("Кофе-машина");

        int moneyAmount = 120;

        for (int i = 0; i < 4; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                printInfo(drinkNames[i]);
            }
        }
    }

    public static void  printInfo(String drinkName)
    {
        System.out.println("Вы можете купить " + drinkName);
    }
}

