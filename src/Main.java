public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);

        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitException le){
                try{
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException limitException) {
                    throw new RuntimeException(limitException);
                }
                System.out.println(bankAccount.getAmount());
                break;
            }
        }


    }
}