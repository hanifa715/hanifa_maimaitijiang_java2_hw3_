public class BankAccount {
    private double amount; //остаток на счете

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        this.amount += sum;
        System.out.println("Выполнено пополнение счета на сумму " + sum);

    }
    public void withDraw(int sum) throws LimitException {
        if (amount < sum){
            throw new LimitException("У вас недостаточно средств на счете для выполнения операции", amount);
        }
        this.amount -= sum;
        System.out.println("Снято со счета сумма в размере " + sum + "\nОстаток счета составляет: " + amount);

    }

}

