public class ControllerGame {


    ControllerGUI controllerGUI = new ControllerGUI();
    public Player player;

    public Dice dice = new Dice();
    private boolean win=false;

    ControllerGame(){
        Start();
    }

    public void Start(){


        while (!win){
            Roll();
            MoveCar();

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
        System.out.println(player.getName()+  "turn");

        controllerGUI.gui.showMessage(" Do you  want to rolle the dice?");
        int Rolle1= dice.RolleDice();
        int Rolle2 = dice.RolleDice();
        sum=Rolle1+Rolle2;
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



}
