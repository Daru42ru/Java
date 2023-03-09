public class Main {
    public static void main(String[] args)
    {   int cost = 14562; // стоимость билета
        int bonus = 20; // стоимость 1 мили
        int mili = cost / bonus; // количество начисляемых миль
        System.out.println("Вам начислено:");
        System.out.println(mili + " бонусных миль");
    }
}