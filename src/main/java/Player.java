public class Player {

    public Player(String name, int playerNumber, int balance) {
        Name = name;
        Balance = balance;
        PlayerNumber = playerNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getPlayerNumber() {
        return PlayerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        PlayerNumber = playerNumber;
    }

    private String Name;
    private int Balance;
    private int PlayerNumber;



}
