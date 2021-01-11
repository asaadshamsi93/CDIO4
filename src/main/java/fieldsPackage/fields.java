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
        felter[2] = new Chance("Prøv lykken",0);
        felter[3] = new Street("Hvidovrevej",600,50);
        felter[4] = new Skat("Skat",1000);
        felter[5] = new Street("o",2000,1000);
        felter[6] = new Street("o",2000,1000);
        felter[7] = new Chance("o",0);
        felter[8] = new Street("o",2000,1000);
        felter[9] = new Street("o",2000,1000);
        felter[10] = new fængsel("fængsel",2000);
        felter[11] = new Street("o",2000,1000);
        felter[12] = new Street("Skat",1000,23);
        felter[13] = new Street("o",2000,1000);
        felter[14] = new Street("o",2000,1000);
        felter[15] = new Street("o",2000,1000);
        felter[16] = new Street("o",2000,1000);
        felter[17] = new Chance("o",0);
        felter[18] = new Street("o",2000,1000);
        felter[19] = new Street("o",2000,1000);
        felter[20] = new parkering("parkering",1000);
        felter[21] = new Street("o",2000,1000);
        felter[22] = new Chance("o",0);
        felter[23] = new Street("o",2000,1000);
        felter[24] = new Street("o",2000,1000);
        felter[25] = new Street("o",2000,1000);
        felter[26] = new Street("o",2000,1000);
        felter[27] = new Street("o",2000,1000);
        felter[28] = new Street("o",2000,1000);
        felter[29] = new Street("o",2000,1000);
        felter[30] = new fængsel("o",0);
        felter[31] = new Street("o",2000,1000);
        felter[32] = new Street("o",2000,1000);
        felter[33] = new Chance("o",0);
        felter[34] = new Street("o",2000,1000);
        felter[35] = new Street("o",2000,1000);
        felter[36] = new Chance("o",0);
        felter[37] = new Street("o",2000,1000);
        felter[38] = new Skat("o",0);
        felter[39] = new Street("o",2000,1000);





    }


}
