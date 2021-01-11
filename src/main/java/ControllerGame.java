import chancePackage.ChanceCard;
import chancePackage.chanceController;
import fieldsPackage.ModelFields;
import fieldsPackage.Skat;
import fieldsPackage.Street;
import fieldsPackage.fields;
import gui_fields.GUI_Ownable;

import java.awt.*;

public class ControllerGame {


    private ControllerGUI controllerGUI = new ControllerGUI();
    private Player player;
    private ChanceCard[] chanceCards;
    private fields field = new fields();
    private Dice dice = new Dice();



    ControllerGame(){
        chanceController chanceCard =new chanceController();
        this.chanceCards = chanceCard.initializeCards();
        Start();
    }
    public void increaseBalanceBy(int amount) {
        int currentBalance = this.controllerGUI.gui_player[player.getPlayerNumber()].getBalance();
        this.controllerGUI.gui_player[player.getPlayerNumber()].setBalance(currentBalance + amount);
    }
    public void decreacbalanceBy(int amount) {
        int currentBalance = this.controllerGUI.gui_player[player.getPlayerNumber()].getBalance();
        this.controllerGUI.gui_player[player.getPlayerNumber()].setBalance(currentBalance - amount);
    }
    public void Start(){

        while (true){
            Roll();
            MoveCar();
            Game();

        }
    }
    public int PlayerStart=-1;
    public Player NextPlayer(){
        PlayerStart++;
        PlayerStart %= controllerGUI.player.length;
        controllerGUI.player[PlayerStart].setPlayerTurn(true);
        return controllerGUI.player[PlayerStart];


    }

    public void hideOldPosition(){
        controllerGUI.gui.getFields()[player.getPlayerPosition()].setCar(controllerGUI.gui_player[player.getPlayerNumber()],false);
    }





    int sum;
    public void Roll(){


        player= NextPlayer();
        controllerGUI.gui.showMessage(player.getName()+ " " + "turn");
        System.out.println(player.getName()+  "turn");

        controllerGUI.gui.showMessage(" Do you  want to rolle the dice?");
        int Rolle1= dice.RolleDice();
        int Rolle2 =  dice.RolleDice();
        sum= Rolle1+Rolle2;
        player.setPlayerNewPo(sum);

        controllerGUI.gui.setDice(Rolle1,Rolle2);
    }




    public void MoveCar(){

        int CurrentPosition= player.getPlayerPosition();

        int PlayerNewPosition =  (player.getPlayerPosition() + player.getPlayerNewPo()) % controllerGUI.gui.getFields().length;

        try {
                controllerGUI.gui.getFields()[CurrentPosition].setCar(controllerGUI.gui_player[player.getPlayerNumber()],false);
                controllerGUI.gui.getFields()[PlayerNewPosition].setCar(controllerGUI.gui_player[player.getPlayerNumber()],true);
        }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println(" IndexOutOfBoundsException");
        }

        player.setPlayerPosition(PlayerNewPosition);
    }




   public void Game(){

       ModelFields Selection = field.felter[player.getPlayerPosition()];
       String user =String.valueOf(Selection);
       System.out.println(user);

       if ( user.equals("street")){

          String getUserSelection= controllerGUI.gui.getUserSelection("vil du køb denne felt?","Ja","Nej");
           GUI_Ownable ownable = (GUI_Ownable) controllerGUI.gui.getFields()[player.getPlayerPosition()];

          if (getUserSelection.equals("Ja")){

              ownable.setBorder(Color.red,Color.BLACK);
              ownable.setOwnerName(player.getName());


              int newBal = player.getBalance() - ((Street)field.felter[player.getPlayerPosition()]).getPrice();

             player.setBalance(newBal);
              controllerGUI.gui_player[player.getPlayerNumber()].setBalance(newBal);
          }
           if (getUserSelection.equals("Nej")){
               return;

           }
       }

       if (user.equals("Skat")){
           decreacbalanceBy(((Skat)field.felter[player.getPlayerPosition()]).getPrice());
       }
       if (user.equals("Chance")){
           handleTakeChanceCardSquare();
       }
       if (user.equals("parkering")){
           controllerGUI.gui.showMessage("Du har fri parkering plads");
       }
   }

    private void handleTakeChanceCardSquare() {
        controllerGUI.gui.showMessage("Du er landet på prøv lykken! Tag et chance kort");
        ChanceCard chanceCard = chanceCards[1].getRandomChanceCard(chanceCards);

        String text = chanceCard.getText();
        controllerGUI.gui.displayChanceCard(text);
        String action = chanceCard.getActionType();
        switch (action) {
            case "Start":
                increaseBalanceBy(chanceCard.getValue());
                hideOldPosition();
                player.setPlayerPosition(0);
                player.setPlayerNewPo(0);
                MoveCar();

                break;
            case "Move":
                player.setPlayerNewPo(chanceCard.getMove());
                MoveCar();

                break;

            case "Rådhuspladsen":
                hideOldPosition();
                player.setPlayerPosition(0);
                player.setPlayerNewPo(chanceCard.getMove());
                MoveCar();
                break;
            case "Pay":
                decreacbalanceBy(chanceCard.getValue());
                break;
            case "GetPaid":
                increaseBalanceBy(chanceCard.getValue());
                break;
            case "CrossingStart":

                if (player.getPlayerPosition()> chanceCard.getMove()){

                    increaseBalanceBy(chanceCard.getValue());
                    hideOldPosition();
                    player.setPlayerPosition(0);
                    player.setPlayerNewPo(chanceCard.getMove());
                    MoveCar();

                }else if (player.getPlayerPosition()<chanceCard.getMove()){

                    hideOldPosition();
                    player.setPlayerPosition(0);
                    player.setPlayerNewPo(chanceCard.getMove());
                    MoveCar();

                }

                break;

            case "Prison":
                /*if (currentPlayer.hasJailFreeCard()) {
                    return;
                }*/
                /*else {
                    currentPlayer.setGetOutOfJailCard();
                }*/
                break;
            case "GetPaidbyOthers":

                for(int i=0;i<controllerGUI.player.length;i++) {

                    if (!controllerGUI.player[i].getName().equals(player.getName())) {

                        int currentBalance = this.controllerGUI.gui_player[i].getBalance();
                        controllerGUI.gui_player[i].setBalance(currentBalance - chanceCard.getValue());

                        increaseBalanceBy(chanceCard.getValue());

                    }

                }

                break;

        }
    }




}
