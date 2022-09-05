public class Main {
    public static void main(String[] args) {
        //Задача 1
        int car=17;
        System.out.println(car);
        short table=347;
        System.out.println(table);
        int engine=74560;
        System.out.println(engine);
        long cans=476547;
        System.out.println(cans);
        float e=2.5f;
        System.out.println(e);
        double r=247.12;
        System.out.println(r);

        //Задача 2
        float a=27.12f;
        System.out.println(a);
        double b=2.786;
        System.out.println(b);
        boolean g= false;
        System.out.println(g);
        short s=569;
        System.out.println(s);
        int w=-159;
        System.out.println(w);
        short q=27897;
        System.out.println(q);
        byte y=67;
        System.out.println(y);

        //Задание 3
        byte lp=23;
        byte as=27;
        byte ea=30;
        int students=lp+as+ea;
        System.out.println(students +"учеников");
        short paper=480;
        System.out.println(paper);
        long sheets=paper/students;
        System.out.println(sheets +" листов бумаги рассчитано на ученика");

        //Задание 4
        byte bottles=16;
        byte minutes=2;
        int oneMinute=bottles/minutes;
        System.out.println("за одну минуту производит "+oneMinute +" бутылок");
        int twentyMinutes=oneMinute*20;
        System.out.println("за 20 минут производит "+twentyMinutes+ ",бутылок");
        int oneDay=24*60;
        System.out.println(oneDay);
        int bottlesDay=oneDay*oneMinute;
        System.out.println("за один день производит "+bottlesDay+" бутылок");
        int threeDay=oneDay*3*oneMinute;
        System.out.println("за три дня производит "+threeDay+" бутылок");
        int oneMonth=oneDay*30*oneMinute;
        System.out.println("за месяц производит "+oneMonth+" бутылок");

        //Задание 5
        int can=120;
        int paintWhite=2;
        int paintBrown=4;
        int oneClass=paintWhite+paintBrown;
        int totalClasses=can/oneClass;
        int totalWhitePaint=totalClasses*paintWhite;
        int totalBrownPaint=totalClasses*paintBrown;
        System.out.println("в школе "+totalClasses+" классов"+" приобретено белой краски "+totalWhitePaint+" банок"+" коричневоq краски "+totalBrownPaint+" банок");

        //Задание 6
        int banana=5;
        int weightBanana=banana*80;
        int milk=200;
        int weightMilk=(milk/100)*105;
        int icecream=2;
        int weightIcecream=icecream*100;
        int weightEgg=4*70;
        int totalWeight=weightBanana+weightMilk+weightIcecream+weightEgg;
        double weightKilogram=totalWeight/1000.00;
        System.out.println("общй вес продуктов "+totalWeight+" грамм " +weightKilogram+" в киллограммах");

        //Задание 7
        int grams=7*1000;
        int dayOne=250;
        int dayTwo=500;
        int numberDayOne=grams/dayOne;
        int numberDayTwo=grams/dayTwo;
        int average=(numberDayOne+numberDayTwo)/2;
        System.out.println("уйдет"+numberDayOne+" дня"+" уйдет"+numberDayTwo+" дня"+" среднее количество :"+average+" дней");

        //Задание 8
        int m=67760;
        int d=83690;
        int k=76230;
        int mPayRise=((m/100)*10)+m;
        int mDifference=(mPayRise*12)-(m*12);
        int dPayRise=((d/100)*10)+d;
        int dDifference=(dPayRise*12)-(d*12);
        int kPayRise=((k/100)*10)+k;
        int kDifference=(kPayRise*12)-(k*12);
        System.out.println("Маша после повышения получает "+mPayRise+" рублей"+ " Годовой доход вырос на"+mDifference+"рублей");
        System.out.println("Денис после повышения получает "+dPayRise+" рублей"+ " Годовой доход вырос на"+dDifference+"рублей");
        System.out.println("Кристина после повышения получает "+kPayRise+" рублей"+ " Годовой доход вырос на"+kDifference+"рублей");








            }
}