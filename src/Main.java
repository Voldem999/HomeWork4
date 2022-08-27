import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {System.out.println("Hello World!");

        // Задача 1

//        int i = 1;
//        while (i <= 10)
//        {System.out.println(i);i++;}
//        int a = 10;
//        for (a = 10; a >= 1; a--)
//        {System.out.println("Итерация цикла " + a);}

        //Задача 2
//        for (int i = 5; i <= 31; i=i+7)

//        {System.out.println("Сегодня пятница " + i +  "-е число, отчетный день" ); continue;}

        //Задача 3
        int nowYear = 2022;
        for ( int i = 79; i <= nowYear ; i = i + 79) {System.out.println("Комета пролетает " + i);}
        int start = nowYear - 200;
        int finish = nowYear + 100;
        for (int yaer = start; yaer < finish; yaer++) {
            if (yaer % 79 == 0)
                System.out.println(yaer);}















    }}