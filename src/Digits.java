import java.util.ArrayList;
import java.util.List;

public class Digits
{
    List<Integer> digitList = new ArrayList<Integer>();

    public Digits(int num)
    {
        for(int i = 1; i < num; i *= 10)
        {
            digitList.add(0, (num/i) % 10);
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i < digitList.size() - 1; i++)
        {
            if(!(digitList.get(i) < digitList.get(i + 1)))
                return false;
        }
        return true;
    }
}
