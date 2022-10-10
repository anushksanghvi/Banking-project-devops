class Banking{
    String name;
    int age;
    long aadhar;


    public double withdraw(){
        double amount;
        System.out.println("Balance available is",this.balance );
        if(balance >= amount){
            System.out.println("Enter the amount  to withdraw = ");
            amount = sc.next();
        }
        else{
            System.out.println("Insufficient balance");
        }

        balance = balance - amount
        return balance;
    }


    public double deposit(){
        double balance;

        return balance;
    }

}