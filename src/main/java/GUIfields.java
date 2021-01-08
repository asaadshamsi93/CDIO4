import gui_fields.*;

import java.awt.*;

public class GUIfields {

    public GUI_Field[] gui_field;


    public GUI_Field[] CreatGUI(){

        gui_field = new GUI_Field[40];

        gui_field[0]= new GUI_Start("Start","","Hver gang de passerer start, modtaget 4000 kr", Color.RED,Color.BLACK);
        gui_field[1]= new GUI_Street("Rødovrevej","pris=600","","50",Color.BLUE,Color.BLACK);
        gui_field[2]= new GUI_Start("prøv lykken","","", Color.RED,Color.BLACK);
        gui_field[3]= new GUI_Street("Hvidovrevej", "Pris=600","","50",Color.BLUE,Color.BLACK);
        gui_field[4]= new GUI_Tax("Betal inkomstskat","Pris=4000","", Color.RED,Color.BLACK);
        gui_field[5]= new GUI_Shipping();gui_field[5].setSubText("Pris=2000");gui_field[5].setDescription("");gui_field[5].setTitle("Scandline");
        gui_field[6]= new GUI_Street("Roskilde","Pris=2000","","100",Color.CYAN,Color.black);
        gui_field[7]= new GUI_Start("prøv lykken","","", Color.RED,Color.BLACK);
        gui_field[8]= new GUI_Street("ValbyLanggade","pris=1000","","100",Color.BLUE,Color.BLACK);
        gui_field[9]= new GUI_Street("Allegade","pris=1000","","100",Color.BLUE,Color.BLACK);
        gui_field[10]= new GUI_Jail("","På besøg","På besøg","",Color.DARK_GRAY,Color.BLUE);
        gui_field[11]= new GUI_Street("fredriksborg alle","pris=2800","","50",Color.BLUE,Color.BLACK);
        gui_field[12]= new GUI_Brewery();gui_field[12].setTitle("Squash");gui_field[12].setDescription("");gui_field[12].setSubText("3000");
        gui_field[13]= new GUI_Street("Bulowsvej","pris=2800","","50",Color.YELLOW,Color.GRAY);
        gui_field[14]= new GUI_Street("GL. Kongevej","pris=3200","","50",Color.BLUE,Color.WHITE);
        gui_field[15]= new GUI_Shipping();gui_field[15].setSubText("Pris=4000");gui_field[15].setDescription("");gui_field[15].setTitle("Mols Linien");
        gui_field[16]= new GUI_Street("Bernstorffsvej","pris=3800","","50",Color.red,Color.darkGray);
        gui_field[17]= new GUI_Start("prøv lykken","?","", Color.RED,Color.BLACK);
        gui_field[18]= new GUI_Street("Hellerupvej","pris=3600","","50",Color.WHITE,Color.yellow);
        gui_field[19]= new GUI_Street("Strandvejen","pris=4000","","50",Color.red,Color.red);
        gui_field[20]= new GUI_Refuge();gui_field[20].getSubText();gui_field[20].setDescription("Gør noget ved Din Drømme");gui_field[20].setTitle("P");
        gui_field[21]= new GUI_Street("Irlanglen","pris=4400","","50",Color.blue,Color.darkGray);
        gui_field[22]= new GUI_Start("prøv lykken","?","", Color.RED,Color.BLACK);
        gui_field[23]= new GUI_Street("Østerbrogade","pris=4400","","50",Color.blue,Color.red);
        gui_field[24]= new GUI_Street("Grøningen","pris=4800","","50",Color.red,Color.darkGray);
        gui_field[25]= new GUI_Shipping();gui_field[25].setSubText("Pris=2000");gui_field[25].setDescription("");gui_field[25].setTitle("Scandlines");
        gui_field[26]= new GUI_Street("Bredgade","pris=5200","","50",Color.darkGray,Color.darkGray);
        gui_field[27]= new GUI_Street("Kgs.Nytorv","pris=5200","","50",Color.white,Color.darkGray);
        gui_field[28]= new GUI_Brewery();gui_field[12].setTitle("Cocacola");gui_field[12].setDescription("");gui_field[12].setSubText("3000");
        gui_field[29]= new  GUI_Street("Østerbrogade","pris=5600","","50",Color.blue,Color.red);
        gui_field[30]= new GUI_Jail("","De fængsles","De fængsles","",Color.DARK_GRAY,Color.BLUE);
        gui_field[31]= new  GUI_Street("Amagertory","pris=6000","","50",Color.lightGray,Color.red);
        gui_field[32]= new  GUI_Street("Vimmelskaftet","pris=6000","","50",Color.lightGray,Color.red);
        gui_field[33]= new GUI_Start("prøv lykken","?","", Color.RED,Color.BLACK);
        gui_field[34]= new  GUI_Street("Nygade","pris=6400","","50",Color.cyan,Color.red);
        gui_field[35]= new GUI_Shipping();gui_field[35].setSubText("Pris=2000");gui_field[35].setDescription("");gui_field[35].setTitle("Scandline");
        gui_field[36]= new GUI_Start("prøv lykken","?","", Color.RED,Color.BLACK);
        gui_field[37]= new  GUI_Street("Fredirsberg gade","pris=7000","","50",Color.gray,Color.yellow);
        gui_field[38]= new GUI_Tax("ekstraordiner Statsskat: betal kr. 2000","","", Color.RED,Color.BLACK);
        gui_field[39]= new  GUI_Street("Rådhuspladsen","pris=8000","","50",Color.gray,Color.yellow);




        return gui_field;
    }






}
