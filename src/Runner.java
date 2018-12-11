public class Runner
{
    public static void main(String[] args)
    {
        Digits D1 = new Digits(1234);
        Digits D2 = new Digits(56390482);
        Digits D3 = new Digits(200000000);
        Digits D4 = new Digits(2);

        System.out.println("D1: " + D1.digitList);
        System.out.println("Increasing?: " + D1.isStrictlyIncreasing());
        System.out.println();

        System.out.println("D2: " + D2.digitList);
        System.out.println("Increasing?: " + D2.isStrictlyIncreasing());
        System.out.println();

        System.out.println("D3: " + D3.digitList);
        System.out.println("Increasing?: " + D3.isStrictlyIncreasing());
        System.out.println();

        System.out.println("D4: " + D4.digitList);
        System.out.println("Increasing?: " + D4.isStrictlyIncreasing());
        System.out.println();
    }
}
