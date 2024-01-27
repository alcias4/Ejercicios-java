package bank;

public class Account {
    Account(String name, double money){
        this.name = name;
        this.money = money;
    }
    String name;
    double money;

    String seeInfo(){
        return " - " + name + " : " + money;
    }

}
