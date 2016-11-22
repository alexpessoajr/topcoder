public class AccountBalance {
    public int processTransactions(int startingBalance, String[] transactions) {
    	int balance = startingBalance;
        int amount;
        char type;
        
        for (String transaction : transactions) {
            type = transaction.charAt(0);
            amount = Integer.parseInt(transaction.substring(2));
            
            if (type == 'C') {
                balance += amount;
            } else if (type == 'D') {
                balance -= amount;
            }
        }
        
        return balance;
    }
}