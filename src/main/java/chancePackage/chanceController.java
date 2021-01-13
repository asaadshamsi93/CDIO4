package chancePackage;

import java.util.Random;

public class chanceController {
    private ChanceCard[] chanceCards;
    public ChanceCard[] initializeCards() {

        chanceCards = new ChanceCard[36];
        chanceCards[0]  = new ChanceCard("Ryk frem til START.","Start",0,0);
        chanceCards[1]  = new ChanceCard("Ryk 3 felter frem","Move",0,3);
        chanceCards[2]  = new ChanceCard("Ryk 3 felter tilbage","Move",0,-3);
        chanceCards[3]  = new ChanceCard("Tag til Rådhuspladsen","Rådhuspladsen",0,39);
        chanceCards[4]  = new ChanceCard("Tag til fredriksborg alle","CrossingStart",4000,11);
        chanceCards[5]  = new ChanceCard("Betale til bank ","Pay",1000,0);
        chanceCards[6]  = new ChanceCard("Du har vundet i klasselotteriet.Modtag 500 kr","GetPaid",500,0);
        chanceCards[7]  = new ChanceCard("Det er deres fødselsdag.Modtog af hver medspiller 200 kr","GetPaidbyOthers",200,0);
        chanceCards[8] = new ChanceCard("Betal for vognvask og smøring kr 300","Pay",300,0);
        chanceCards[9] = new ChanceCard("Betal kr 200 for levering af 2 kasser øl","Pay",200,0);
        chanceCards[10]  = new ChanceCard("Betal 3000 for reparation af deres vogn","Pay",3000,0);
        chanceCards[11]  = new ChanceCard("Betal 3000 for reparation af deres vogn","Pay",3000,0);
        chanceCards[12]  = new ChanceCard("De har købt 4 nye dæk til Deres vogn, betal kr 1000","Pay",1000,0);
        chanceCards[13]  = new ChanceCard("De har fået en parkeringsbøde, betal kr 200 i bøde","Pay",200,0);
        chanceCards[14]  = new ChanceCard("Betal deres bilforsikring, kr 1000","Pay",1000,0);
        chanceCards[15]  = new ChanceCard("De har været udenlands og købt for mange smøger, betal kr 200 i told. ","Pay",200,0);
        chanceCards[16]  = new ChanceCard("Tandlægeregning, betal kr 2000.","Pay",2000,0);
        chanceCards[17]  = new ChanceCard("De har vundet i klasselotteriet. Modtag 500 kr.","GetPaid",500,0);
        chanceCards[18] = new ChanceCard("De modtager Deres aktieudbytte. Modtag kr 1000 af banken","GetPaid",1000,0);
        chanceCards[19] = new ChanceCard("De modtager Deres aktieudbytte. Modtag kr 1000 af banken","GetPaid",1000,0);
        chanceCards[20] = new ChanceCard("De modtager Deres aktieudbytte. Modtag kr 1000 af banken","GetPaid",1000,0);
        chanceCards[21]  = new ChanceCard("Kommunen har eftergivet et kvartals skat. Hæv i banken 3000 kr.","GetPaid",3000,0);
        chanceCards[22]  = new ChanceCard("De have en række med elleve rigtige i tipning, modtag kl 1000","GetPaid",1000,0);
        chanceCards[23]  = new ChanceCard("Grundet dyrtiden har De fået gageforhøjelse, modtag kr 1000.","GetPaid",1000,0);
        chanceCards[24]  = new ChanceCard("Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.","GetPaid",1000,0);
        chanceCards[25]  = new ChanceCard("Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.","GetPaid",1000,0);
        chanceCards[26]  = new ChanceCard("De har solg nogle gamle møbler på auktion. Modtag 1000 kr af banken.","GetPaid",1000,0);
        chanceCards[27] = new ChanceCard("Værdien af egen avl fra nyttehaven udgør 200 som de modtager af banken","GetPaid",200,0);
        chanceCards[28] = new ChanceCard("De har lagt penge ud til et sammenskudsgilde. Mærkværdigvis betaler alle straks.\n" +
                "Modtag fra hver medspiller 500 kr.","GetPaidbyOthers",500,0);
        chanceCards[29] = new ChanceCard("De skal holde familiefest og får et tilskud fra hver medspiller på 500 kr.","GetPaidbyOthers",500,0);
        chanceCards[30]  = new ChanceCard("Ryk frem til START.","Start",0,0);
        chanceCards[31]  = new ChanceCard("Ryk 3 felter tilbage","Move",0,-3);
        chanceCards[32]  = new ChanceCard("Tag med Mols-Linien, flyt brikken frem og hvis De passerer START indkassér da kr\n" +
                "4000.","CrossingStart",0,15);
        chanceCards[33]  = new ChanceCard("Ryk frem til Grønningen, hvis De passerer start indkasser da kr 4000","CrossingStart",4000,24);
        chanceCards[34]  = new ChanceCard("Ryk frem til Vimmelskaftet, hvis de passerer start indkasser da kr 4000","CrossingStart",4000,32);
        chanceCards[35]  = new ChanceCard("Ryk frem til Strandvejen. Hvis De passere START, indkasser da 4000 kr.","CrossingStart",4000,19);
        return chanceCards;
    }

}
