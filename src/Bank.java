import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;

    public Bank(int n,double initialBalance)
    {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
    }
    public void transfer(int from, int to, double amount) throws InterruptedException
    {
        bankLock.lock();
        try
        {
            while (accounts[from] < amount)
                sufficientFunds.await();
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n",getTotalBalance());
        }
        finally
        {
            bankLock.unlock();
        }
    }
    public double getTotalBalance()
        {
            bankLock.lock();
            try
            {
                double sum = 0;
                for(double a : accounts)
                    sum += a;
                return sum;
            }
            finally {
                bankLock.unlock();
            }
        }
    public int size()
    {
        return accounts.length;
    }
}
/*
public class Bank

{
    private Lock bankLock = new ReentrantLock();
    private final double [] accounts;
    public Bank(int n,double initialBalance)
    {
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
    }
    public synchronized void transfer(int from, int to, double amount) throws InterruptedException
    {
        while (accounts[from] < amount)
            wait();
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n",getTotalBalance());
        notifyAll();

       bankLock.lock();
        try
        {
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n",getTotalBalance());
        }
        finally
        {
            bankLock.unlock();
        }

        if (accounts[from] < amount) return;
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n",getTotalBalance());


    }
    public double getTotalBalance()
    {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }
    public  int size()
    {
        return accounts.length;
    }
}
        */