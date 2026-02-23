void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите Код:");
    int youCode = scanner.nextInt();
    int WorkCode = 1324;

    if (youCode == WorkCode){
        System.out.println("Доступ разрешон");
    }else {
        System.out.println("Не верный пароль");
        System.out.println("Доступ запрешен");
        return;
    }


    double balance = 0.0;

    while (true){
        System.out.println("""
                1. Проверка счета:\s
                2. Внесение денег:\s
                3. Снятие наличных:\s
                4. Поменять пароль: (Бета тест)\s
                5. Выйти из Банка:""");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("\n-----------------" + "\nВаш баланс: " + balance + "$" + "\n-----------------");
                break;
            case 2:
                System.out.println("Сколько хотите внести денег?");
                double deposit = scanner.nextDouble();
                balance += deposit;
                System.out.println("\n-----------------------------"+ "\nВы внесли: " + balance + "$ в ваш счет." + "\n-----------------------------");
                break;
            case 3:

                if(balance == 0){
                    System.out.println("Операция запрешена" + "\n С счёта нельзя снять ничего");
                } else if (balance < scanner.nextInt()) {
                    System.out.println("Сколько хотите снять денег?");
                    balance = balance - scanner.nextDouble();
                    System.out.println("Операция прекрашена, в счете нету таких денег");
                } else {
                    System.out.println("Сколько хотите снять денег?");
                    balance = balance - scanner.nextDouble();
                    System.out.println(balance + "$" + " снято с вашего счета.");
                }
                break;
            case 4:
                System.out.println("Ведите новый пароль");
                WorkCode = scanner.nextInt();
                System.out.println("Пароль изменён");
                System.out.println("\n" + "Введите Код:");
                youCode = scanner.nextInt();

                if (youCode == WorkCode){
                    System.out.println("Доступ разрешон" + "\n ");
                    break;
                }else {
                    System.out.println("Не верный пароль");
                    System.out.println("Доступ запрешен");
                    return;
                }



            case 5:
                System.out.println("Завершение сеанса");
                return;
        }
}




















}