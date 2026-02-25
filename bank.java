void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите Код:");
    int youCode = scanner.nextInt();
    int workCode = 1324;


    if (youCode == workCode){
        System.out.println("Доступ разрешон");
    } else {
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

                if(balance == 0){
                    System.out.println("Операция запрешена" + "\nС счёта нельзя снять ничего" + "\n");
                } else if (balance < cashWithdrawal) {
                    System.out.println("Операция прекрашена, в счете нету таких денег");
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
