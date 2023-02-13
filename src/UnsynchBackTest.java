public class UnsynchBackTest
{
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args)
    {
        var bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++)
        {
            int fromeAccount = i;
            Runnable r = () ->
            {
                try
                {
                    int ii = 0;
                    while (ii < 10)
                    {
                        ii++;
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromeAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                }
                catch (InterruptedException e){}
            };
            var t = new Thread(r);
            t.start();
        }
    }
}