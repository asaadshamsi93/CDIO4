package fieldsPackage;

public class fields {

   public ModelFields[] felter;

    public fields(){
        Creatfields();
    }

    public void Creatfields(){

        felter = new ModelFields[40];

        felter[0]= new Start("Start",0);
        felter[1] = new Street("Rødovrevej",600,50);
        felter[2] = new Chance("Prøv lykken");
        felter[3] = new Street("Hvidovrevej",600,50);
        felter[4] = new Skat("Skat",4000);
        felter[5] = new Street("Scandlines",2000,500);
        felter[6] = new Street("Roskildevej",1000,100);
        felter[7] = new Chance("Prøv lykken");
        felter[8] = new Street("Valby Langgade",1000,100);
        felter[9] = new Street("Allegade",1200,150);
        felter[10] = new fængsel("fængsel");
        felter[11] = new Street("Frederiksberg Alle",1400,200);
        felter[12] = new Street("Squash",1500,23);
        felter[13] = new Street("Bulowsvej",1400,200);
        felter[14] = new Street("Gl.kongevej",1600,250);
        felter[15] = new Street("Mols-Linien",2000,500);
        felter[16] = new Street("Bernstorffvej",1800,300);
        felter[17] = new Chance("Prøv Lykken");
        felter[18] = new Street("Hellerupvej",1800,300);
        felter[19] = new Street("Strandvejen",2000,350);
        felter[20] = new parkering("parkering",1000);
        felter[21] = new Street("Trianglen",2200,350);
        felter[22] = new Chance("Prøv Lykken");
        felter[23] = new Street("Østerbrogade",2200,350);
        felter[24] = new Street("Grønningen",2400,400);
        felter[25] = new Street("Scandlines",2000,500);
        felter[26] = new Street("Bredgade",2600,450);
        felter[27] = new Street("Kgs.Nytorv",2600,450);
        felter[28] = new Street("Cocacola",1500,1000);
        felter[29] = new Street("Østergade",2800,500);
        felter[30] = new fængsel("De fængsles");
        felter[31] = new Street("Amagertorv",3000,550);
        felter[32] = new Street("Vimmelskaftet",3000,550);
        felter[33] = new Chance("Prøv Lykken");
        felter[34] = new Street("Nygade",3200,600);
        felter[35] = new Street("Scandlines",2000,500);
        felter[36] = new Chance("Prøv Lykken");
        felter[37] = new Street("Frederiksberggade",3500,700);
        felter[38] = new Skat("Ekstraordinær statsskat",0);
        felter[39] = new Street("Rådhuspladsen",4000,1000);







    }


}
