import fieldsPackage.ModelFields;
import fieldsPackage.Skat;
import fieldsPackage.Street;
import fieldsPackage.fields;
import gui_fields.GUI_Ownable;

import java.awt.*;

public class ControllerGame {


    ControllerGUI controllerGUI = new ControllerGUI();
    public Player player;

    public Dice dice = new Dice();
    private boolean win=false;

    ControllerGame(){
        this.chanceCards = initializeCards();
        Start();
    }

    public void Start(){


        while (!win){
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






    int sum;
    public void Roll(){


        player= NextPlayer();
        controllerGUI.gui.showMessage(player.getName()+ " " + "turn");
        System.out.println(player.getName()+  "turn");

        controllerGUI.gui.showMessage(" Do you  want to rolle the dice?");
        int Rolle1= dice.RolleDice();
        int Rolle2 = dice.RolleDice();
        sum= 7;//Rolle1+Rolle2;
        player.setPlayerNewPo(sum);

        controllerGUI.gui.setDice(Rolle1,Rolle2);
    }

    int CurrentPosition;
    int PlayerNewPosition;

    public void MoveCar(){

        CurrentPosition= player.getPlayerPosition();

        PlayerNewPosition =  (player.getPlayerPosition() + player.getPlayerNewPo()) % controllerGUI.gui.getFields().length;

        try {
                controllerGUI.gui.getFields()[CurrentPosition].setCar(controllerGUI.gui_player[player.getPlayerNumber()],false);
                controllerGUI.gui.getFields()[PlayerNewPosition].setCar(controllerGUI.gui_player[player.getPlayerNumber()],true);
        }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println(" IndexOutOfBoundsException");
        }

        player.setPlayerPosition(PlayerNewPosition);
    }


    fields field = new fields();

   public void Game(){


       ModelFields Selection = field.felter[player.getPlayerPosition()];
       String user =String.valueOf(Selection);
       System.out.println(user);

       if ( user.equals("street")){

          String getUserSelection= controllerGUI.gui.getUserSelection("vil du køb denne felt?","Ja","Nej");

          if (getUserSelection.equals("Ja")){




              GUI_Ownable ownable = (GUI_Ownable) controllerGUI.gui.getFields()[player.getPlayerPosition()];
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

           int newbalance = player.getBalance() -  ((Skat)field.felter[player.getPlayerPosition()]).getPrice();

           player.setBalance(newbalance);



       }
       if (user.equals("Chance")){


           controllerGUI.gui.showMessage("Chance");
          /* Random random = new Random();
           random.nextInt();
           player.setPlayerNewPo(2);
           MoveCar();
*/
           handleTakeChanceCardSquare(player);



       }
   }


    private ChanceCard[] chanceCards;
    private int chanceCount = 7;

    private ChanceCard[] initializeCards() {
        ChanceCard[] chanceCards = new ChanceCard[chanceCount];
        ChanceCard chance1 = new ChanceCard("Ryk frem til START. Modtag 2M","Start",2,0);
        ChanceCard chance2 = new ChanceCard("Ryk 5 felter frem","Move",0,5);
        ChanceCard chance3 = new ChanceCard("Ryk 1 felt frem eller tag et chancekort mere","Move",0,1);
        ChanceCard chance4 = new ChanceCard("Du har spist for meget slik. Betal 2M til banken","Pay",2,0);
        ChanceCard chance5 = new ChanceCard("Du løslades uden omkostninger. Behold dette kort indtil du får brugt det","Prison",0,0);
        ChanceCard chance6 = new ChanceCard("Det er din fødselsdag! Alle giver dig 1M. TILLYKKE MED FØDSELSDAGEN!","PayByOthers",1,0);
        ChanceCard chance7 = new ChanceCard("Du har lavet alle dine lektier! Modtag 2M fra banken.","PayByBank",2,0);

        //int index = 0;
        chanceCards[0] = chance1;
        chanceCards[1] = chance2;
        chanceCards[2] = chance3;
        chanceCards[3] = chance4;
        chanceCards[4] = chance5;
        chanceCards[5] = chance6;
        chanceCards[6] = chance7;
        return chanceCards;
    }

    private void handleTakeChanceCardSquare(Player currentPlayer) {
        controllerGUI.gui.showMessage("Du er landet på prøv lykken! Tag et chance kort");
        ChanceCard chanceCard = chanceCards[1].getRandomChanceCard(chanceCards);
        String text = chanceCard.getText();
        controllerGUI.gui.displayChanceCard(text);
        String action = chanceCard.getActionType();
        switch (action) {
            case "Start":
                //currentPlayer.increaseBalanceBy(2);
                //currentPlayer.setCurrentSquareIndex(gui,0);
                break;
            case "Move":
               // int currentIndex = currentPlayer.getCurrentSquareIndex();
                if (text.equals("Ryk 5 felter frem")) {
                   // movePlayer(currentPlayer,5);
                   // Square boardSquare = boardSquares[currentPlayer.getCurrentSquareIndex()];
                    //evaluateSquare(boardSquare,currentPlayer);
                }
                else {
                    boolean choice = controllerGUI.gui.getUserLeftButtonPressed("Vil du rykke et felt frem eller tage et nyt chancekort?", "Ryk 1 Felt Frem", "Tag nyt chancekort");
                    if (choice) {
                       // movePlayer(currentPlayer,1);
                       // Square boardSquare = boardSquares[currentPlayer.getCurrentSquareIndex()];
                       // evaluateSquare(boardSquare,currentPlayer);
                    }
                    else {
                        handleTakeChanceCardSquare(currentPlayer);
                    }
                }
                break;
            case "Pay":
               // currentPlayer.decreaseBalanceBy(2);
                break;
            case "Prison":
                /*if (currentPlayer.hasJailFreeCard()) {
                    return;
                }*/
                /*else {
                    currentPlayer.setGetOutOfJailCard();
                }*/
                break;
            case "PayByOthers":
                /*for(int i=0;i<players.length;i++) {
                    if (!players[i].getName().equals(currentPlayer.getName())) {
                        players[i].decreaseBalanceBy(1);
                    }
                    currentPlayer.increaseBalanceBy(1);
                }*/
                break;
            case "PayByBank":
               // currentPlayer.increaseBalanceBy(2);
                break;
        }
    }



}
