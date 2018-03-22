package isikukoodgui;

import java.util.Random;

/**
 *
 * @author Rain.kald
 */
public class gen {

    String sunniaeg = ""; //Sunniaeg kirjuta formaadis "yyyy-MM-dd"
    String gender = "";            // N naine, M mees - Default N(naine)
    
    int genderNr = 0;
    boolean error = false;
    String personalcodee = "";
    int genderr = 0;
    
    public String personalCode() {

        
        String[] dateParts = sunniaeg.split("-");
        String Year2ndHalf = dateParts[0].length() > 2 ? dateParts[0].substring(dateParts[0].length() - 2) : dateParts[0];
        String Year1stHalf = dateParts[0].length() < 2 ? dateParts[0] : dateParts[0].substring(0, 2);

        int Year1stHalff = Integer.parseInt(Year1stHalf);
        if (gender == "N") {
            genderr = 0;
        } else if (gender == "M") {
            genderr = 1;
        } 
        switch (genderr) {
            case 0:
                if (Year1stHalff == 18) {
                    genderNr = 2;
                } else if (Year1stHalff == 19) {
                    genderNr = 4;
                } else if (Year1stHalff == 20) {
                    genderNr = 6;
                } else if (Year1stHalff == 21) {
                    genderNr = 8;
                } else {
                    error = true;
                    System.out.println("ERROR! aasta vahemik lubatud 1800-2199");
                }   break;
            case 1:
                if (Year1stHalff == 18) {
                    genderNr = 1;
                } else if (Year1stHalff == 19) {
                    genderNr = 3;
                } else if (Year1stHalff == 20) {
                    genderNr = 5;
                } else if (Year1stHalff == 21) {
                    genderNr = 7;
                } else {
                    error = true;
                    System.out.println("ERROR! aasta vahemik lubatud 1800-2199");
                }   break;
            default:
                System.out.println("Gender error");
                break;
        }

        Random rand = new Random();
        String TRI = (rand.nextInt(9) + 1) + "" + (rand.nextInt(9) + 1) + "" + (rand.nextInt(9) + 1);

        String personalcode = genderNr + Year2ndHalf + dateParts[1] + dateParts[2] + TRI;
        int kontrollNr = isPersonalCodeValid(personalcode);
        if (error == false) {
            personalcodee = genderNr + Year2ndHalf + dateParts[1] + dateParts[2] + TRI + kontrollNr;
        }
        return personalcodee;
    }
    
        public int isPersonalCodeValid(String pc) {
        String[] parts = pc.split("(?!^)");
        //Esimese astme kaal on 1,2,3,4,5,6,7,8,9,1
        //Teise astme kaal on 3,4,5,6,7,8,9,1,2,3
        int[] firstTierNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int[] secondTierNumbers = {3, 4, 5, 6, 7, 8, 9, 1, 2, 3};
        int total = 0;
        for (int i = 0; i < firstTierNumbers.length; i++) {
            total = total + (firstTierNumbers[i] * Integer.parseInt(parts[i]));
        }
        int jaak = total % 11;
        if (jaak == 10) {
            total = 0;
            for (int i = 0; i < secondTierNumbers.length; i++) {
                total = total + (secondTierNumbers[i] * Integer.parseInt(parts[i]));
            }
            jaak = total % 11;
           if (jaak == 10) {
               jaak = 0;
           } 
        }
        return jaak;
    }
    
}
