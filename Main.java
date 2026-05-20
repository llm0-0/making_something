// project atm 

import java.util.ArrayList;
public class Card{
    private String expiredate;
    private String cardholder; 
    private String account;
    private int cardnum; //16 digits
    private int cvv; //3 digits
    private boolean frozen; //if true, card cannot be use; if false, card can be used.a new card is always not frozen


}

public class Information{
    private double balance;
    private String username;
    private String password;
    private String type;//checking, saving, mma, cd
    private ArrayList<Cards> cards = new ArrayList<>();

    public Information(double amount, String user, String pass, String type){
        balance = amount;
        username = user;
        password = pass;
        this.type = type;
    }

    public double getBalance(){
        return balance;
    }

    public String getUser(){
        return username;
    }
    
    public String getPass(){
        return password;
    }
    
    public void updateBalance(double deposit){
        balance += deposit;
    }
}

public class Atm{
    ArrayList<Information> info = new ArrayList<>();

    public double viewBalance(String currentUser){
        return 0.0;
    }

}
