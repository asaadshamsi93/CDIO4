import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class ControllerGUI {


   public Player[] player;
   public GUI_Player[] gui_player;
   public GUI gui;




    ControllerGUI(){
         gui = new GUI();
        PlayerStart();
    }





    public void PlayerStart(){
        int number = Integer.parseInt(RequestPlayerAmount());
        System.out.println(number);

        player= new Player[number];


        for (int PlayerAmount = 0; PlayerAmount < number ; PlayerAmount++){


            String PlayerName = gui.getUserString("Enter your name");
            if (PlayerName.equals("")){

                PlayerName = gui.getUserString("Player ") + (PlayerAmount+1);

            }
            player[PlayerAmount] = new Player(PlayerName,PlayerAmount,30000);
            PlayerSetup(player[PlayerAmount],number);

            System.out.println(PlayerAmount);
        }

    }



    public void PlayerSetup(Player player, int playeramout){

       if (gui_player==null){
           gui_player = new GUI_Player[playeramout];
       }



       gui_player[player.getPlayerNumber()] = new GUI_Player(player.getName(),player.getBalance(), carType(player.getPlayerNumber()));
        gui.addPlayer(gui_player[player.getPlayerNumber()]);
       gui.getFields()[0].setCar(gui_player[player.getPlayerNumber()],true);
    }


    public GUI_Car carType(int PlayerNumber){


        Color color =CarColor(PlayerNumber);

        String choos =gui.getUserSelection("Hvad type skal du have for din bil","CAR","UFO","TRACTOR","RACECAR");

        switch (choos){
            case "CAR":
                return new GUI_Car(color,color,GUI_Car.Type.CAR,GUI_Car.Pattern.FILL);
            case "RACECAR":
                return new GUI_Car(color,color,GUI_Car.Type.RACECAR,GUI_Car.Pattern.FILL);
            case "TRACTOR":
                return new GUI_Car(color,color,GUI_Car.Type.TRACTOR,GUI_Car.Pattern.FILL);
            case "UFO":
                return new GUI_Car(color,color,GUI_Car.Type.UFO,GUI_Car.Pattern.FILL);
            default:return new GUI_Car(color,color,GUI_Car.Type.UFO,GUI_Car.Pattern.FILL);

        }

    }

    public Color CarColor( int playerNumber){

        switch (playerNumber){

            case 0: return Color.BLACK;
            case 1: return Color.RED;
            case 2: return Color.yellow;
            case 3: return Color.LIGHT_GRAY;
            case 4: return Color.cyan;
            case 5: return Color.green;
            default:return Color.BLUE;
        }

    }






    public String RequestPlayerAmount(){

        return gui.getUserSelection("Hvor manage spiller skal der være","3","4","5","6");
    }




}
