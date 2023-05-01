
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ArrayList<NextPhone> phones = new ArrayList<>();
        phones.add(new NextPhone("Nokia", 1538945, 3.0, 4, 2500, "red"));
        phones.add(new NextPhone("Samsung", "DA1534325", 4.5, 6, 3500, "black"));
        phones.add(new NextPhone("Lenovo", "00124588", 3.2, 4, 3000, "silver"));
        phones.add(new NextPhone("Xiaomi", 9951477, 5.2, 6, 4000, "black"));
        phones.add(new NextPhone("IPhone", 7777777, 2.4, 4, 1500, "silver"));

        Scanner sr = new Scanner((System.in));
        boolean command = true;
        while (command) {
            System.out.println("""
                    Введите соответствующий пункт меню, по которому хотите сделать выбор:\s
                    Модель - 1
                    ID - 2
                    RAM - 3
                    Число ядер - 4
                    Батарея - 5
                    Цвет - 6
                    Посмотреть все модели - 7
                    Выход из меню - 0
                    ->""");

            String operation = sr.nextLine();

            switch (operation) {
                case "1" -> filterModel(phones, sr);
                case "2" -> filterID(phones);
                case "3" -> filterRAM(phones, sr);
                case "4" -> filterCore(phones, sr);
                case "5" -> filterBattery(phones, sr);
                case "6" -> filterColor(phones, sr);
                case "7" -> showCatalog(phones);
                case "0" -> {
                    System.out.println("До новых встреч!");
                    command = false;
                }
                default -> {
                    System.out.println("Введена неправильная операция");
                    System.out.println();
                }
            }
        }
    }

    private static void filterModel(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите нименование модели -> ");
        String variable = sr.nextLine().toLowerCase();
        for (NextPhone phone : phones) {
            if (phone.getModelName().toLowerCase().equals(variable)) {
                System.out.println(phone);
            }
        }
    }

    private static void filterID(ArrayList<NextPhone> phones) {
        for (NextPhone phone : phones) {
            System.out.println(phone.getID());
        }
    }

    private static void filterRAM(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите минимальное занчение RAM -> ");
        Double minRam = sr.nextDouble();

        for (NextPhone phone : phones) {
            if ((Double) phone.getRAM() >= minRam) {
                System.out.println(phone);
            }
        }
    }

    private static void filterCore(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите минимальное число ядер -> ");
        int minCore = sr.nextInt();

        for (NextPhone phone : phones) {
            if (phone.getCore() >= minCore) {
                System.out.println(phone);
            }
        }
    }

    private static void filterBattery(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите минимальный размер батареи -> ");
        int minBatteryCapacity = sr.nextInt();

        for (NextPhone phone : phones) {
            if (phone.getBatteryCapacity() >= minBatteryCapacity) {
                System.out.println(phone);
            }
        }
    }

    private static void filterColor(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите цвет -> ");
        String variable = sr.nextLine().toLowerCase();
        for (NextPhone phone : phones) {
            if (phone.getColor().equals(variable)) {
                System.out.println(phone);
            }
        }
    }

    private static void showCatalog(ArrayList<NextPhone> phones) {
        System.out.println();
        System.out.println("Полный каталог телефонов: ");
        System.out.println();
        for (NextPhone nextPhone : phones) {
            System.out.println(nextPhone.toString());
        }
    }
}
