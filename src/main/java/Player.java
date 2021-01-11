public class Player {

    private String Name;
    private int Balance;
    private int PlayerNumber;
    public int PlayerPosition;
    public boolean PlayerTurn=false;

    public int getPlayerNewPo() {
        return PlayerNewPo;
    }

    public void setPlayerNewPo(int playerNewPo) {
        PlayerNewPo = playerNewPo;
    }

    public int PlayerNewPo;

    public boolean isPlayerTurn() {
        return PlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        PlayerTurn = playerTurn;
    }




    public int getPlayerPosition() {
        return PlayerPosition;
    }


    public void setPlayerPosition(int playerPosition) {
        PlayerPosition = playerPosition;
    }



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





}
