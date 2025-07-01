class Account {
	
    int balance;

    void deposit(int money) {
    	if(money > 0) {
            balance += money;
    	}
    	else {
    		System.out.println("잘못된 입력입니다.");
    	}
    }

    void withdraw(int money) {
    	if(money > 0 && balance - money > 0) {
            balance -= money;
    	}
    	else {
    		System.out.println("잘못된 입력입니다.");
    	}
    }

    int getBalance() {
        return balance;
    }
}