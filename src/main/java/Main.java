import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu obj1 = new Menu();
        Menu.menu();

        Month[] monthMas = Month.values();
        Season[] seasonsMas = Season.values();

        Scanner i = new Scanner(System.in);

        switch (i.next()) {
            case "1":
                System.out.println("Введіть місяць: ");
                i = new Scanner(System.in);
                String sc = i.next().toUpperCase().trim();

                for (Month m : monthMas) {
                    if (m.name().equalsIgnoreCase(sc)) {
                        System.out.println("Місяць: " + m + " існує.");
                        break;
                    }
                }
                break;
            case "2":
                System.out.println("Введіть пору року: ");
                i = new Scanner(System.in);
                String season = i.next().toUpperCase();

                for (Month m : monthMas) {
                    if (m.getSeasons().equalsIgnoreCase(season)) {
                        System.out.println("Місяць: " + m);

                    }
                }
                break;
            case "3":
                System.out.println("Введіть кількість днів в місяцях (28-31): ");
                Scanner Season = new Scanner(System.in);
                int b = Season.nextInt();

                for (Month m : monthMas) {
                    if (m.getDays() == b) {
                        System.out.println("Цей місяць має таку кількість днів: " + m);
                    }
                }
                break;
            case "4":
                System.out.println("Введіть кількість днів: ");
                Season = new Scanner(System.in);
                int bb = Season.nextInt();

                for (Month m : monthMas) {
                    if (m.getDays() < bb) {
                        System.out.println("Цей місяць має меншу кількість днів: " + m);
                    }
                }
                break;
            case "5":
                System.out.println("Введіть кількість днів: ");
                Season = new Scanner(System.in);
                int bo = Season.nextInt();

                for (Month m : monthMas) {
                    if (m.getDays() > bo) {
                        System.out.println("Цей місяць має більшу кількість днів: " +m);
                    }
                }
                break;
            case "6":
                System.out.println("Введіть пору року: ");
                Season = new Scanner(System.in);
                String q = Season.next().toUpperCase();

                switch (q){
                    case "WINTER":
                        System.out.println("Наступна пора року: SPRING");
                        break;
                    case "SPRING":
                        System.out.println("Наступна пора року: SUMMER");
                        break;
                    case "SUMMER":
                        System.out.println("Наступна пора року: AUTUMN");
                        break;
                    case "AUTUMN":
                        System.out.println("Наступна пора року: WINTER");
                        break;
                }

                break;
            case "7":
                System.out.println("Введіть пору року: ");
                Season = new Scanner(System.in);
                String a = Season.next().toUpperCase();

                switch (a){
                    case "WINTER":
                        System.out.println("Попередня пора року: AUTUMN");
                        break;
                    case "AUTUMN":
                        System.out.println("Попередня пора року: SUMMER");
                        break;
                    case "SUMMER":
                        System.out.println("Попередня пора року: SPRING");
                        break;
                    case "SPRING":
                        System.out.println("Попередня пора року: WINTER");
                        break;
                }
                break;
            case "8":

                System.out.println("Вивести на екран всі місяці які мають парну кількість днів: ");

                for (Month m : monthMas) {
                    if (m.getDays() % 2 == 0) {
                        System.out.println(m);
                    }
                }
                break;
            case "9":
                System.out.println("Вивести на екран всі місяці які мають непарну кількість днів : ");

                for (Month m : monthMas) {
                    if (m.getDays() % 2 == 1) {
                        System.out.println(m);
                    }
                }
                break;
            case "10":
                System.out.println("Введіть місяць: ");
                Season = new Scanner(System.in);
                String scs = Season.next().toUpperCase();

                for (Month m : monthMas) {
                    if (m.name().equalsIgnoreCase(scs)) {
                        if(m.getDays() % 2 == 0) {
                            System.out.println("Парна кількість днів у місяця: "+m);
                        }else {
                            System.out.println("Непарна кількість днів у місяця: "+m);
                        }
                    }
                }
                break;
            case "11":
                System.out.println("Вихід з програми.");
                System.exit(0);
        }
    }
}

