public class CoffeeMachine
{
    private int[] drinkPrices = {150, 80, 20, 50};
    private String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

    public void checkPrices(int moneyAmount)
    {
        for(int i = 0; i < drinkPrices.length; i++)
        {
            if(getMoneyAmount() >= drinkPrices[i]) {
                printInfo(drinkNames[i]);
            }
        }
   }
   public int getMoneyAmount ()
   {
      return 120;
   }

   private static void printInfo(String drinkName)
{
    System.out.println("Вы можете купить " + drinkName);
    }
}
