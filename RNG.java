import java.util.*;
class RNG
{
    int attempts = 1;
    int RanNum()
    {
        Random ra = new Random();
        int rnum = ra.nextInt(100);
        return rnum;
    }
    int InNum()
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        return k;
    }
    void guess(int l,int r_num)
    {
       
        if(l==r_num)
        {
            System.out.println("congo you guessed the correct number");
            System.out.println("Total Attempts : "+attempts);
            System.exit(0);
        }
        else if(l<r_num)
        {
            System.out.println("Too Low");
        }
        else if(l>r_num)
        {
            System.out.println("Too High");
        }
        else
        {
            System.out.println("Enter valid number");
        }
        attempts++;
    }
    public static void main(String args[])
    {
        RNG ob = new RNG();
        int r_num=ob.RanNum();
        System.out.println("guess the number from 0-100");
        for(;;)
        {
            int l = ob.InNum();
            ob.guess(l,r_num);
        }
    }
}