void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите Код:");
    int youCode = scanner.nextInt();
    int workCode = 1324;
    int line = 4;


    if (youCode == workCode){
        System.out.println("Доступ разрешен\n");
    } else {

        for (int i = 0; i < 4; i++) {

            System.out.println("Неправильный пароль\nПовторите попытку: ");
            youCode = scanner.nextInt();

            if (youCode == workCode) {
                System.out.println("Доступ разрешен");
                break;
            } else {
                if(line == 0){
                    System.out.println("Попытки исчерпаны. Доступ заблокирован.");
                    return;
                }

                line--;
                System.out.println("Ошибка у вас остался " + line + " попыток");

            }

        }
    }


    double balance = 0.0;

    while (true){
        System.out.println("""
                1. Проверка счета:\s
                2. Внесение денег:\s
                3. Снятие наличных:\s
                4. Поменять пароль:\s
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
                System.out.println("\n-----------------------------"+ "\nВы внесли: " + deposit + "$ в ваш счет." + "\n-----------------------------");
                break;
            case 3:

                System.out.println("Сколько хотите снять денег?");
                double cashWithdrawal = scanner.nextDouble();

                if(balance < cashWithdrawal){
                    System.out.println("Операция запрещена: Недостаточно средств" );
                } else {
                    balance -= cashWithdrawal;
                    System.out.println(cashWithdrawal + "$" + " снято с вашего счета.");
                }
                break;
            case 4:
                System.out.println("Ведите новый пароль:");
                workCode = scanner.nextInt();
                System.out.println("Пароль изменён");
                System.out.println("\n" + "Введите Код:");
                youCode = scanner.nextInt();

                if (youCode == workCode){
                    System.out.println("Доступ разрешен " + "\n ");
                    break;
                }else {
                    System.out.println("Не верный пароль");
                    System.out.println("Доступ запрешен");
                    return;
                }

            case 5:
                System.out.println("Завершение сеанса");
                return;
            default:
                System.out.println("Нету такого пукта" + "\n");
        }
}
}
