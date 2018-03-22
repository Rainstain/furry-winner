package isikukoodgui;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Rain.kald
 */
public class check {

    String pc = "";
    String gender = "";
    String Year1half = "";
    String Year2half = "";
    String Month = "";
    String Day = "";
    String HaiglaNr = "";
    String haigla = "";
    String[] months = {"", "Jaanuar", "Veebruar", "Märts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September", "Okbtoober", "November", "Detsember"};
    boolean kehtivus = false;
    String personalcode = "";
    int kontrollnr = 0;
    int age = 0;
    String vanus;
    String monthsi = "";
    
    public String personalCode() {
        if (pc.length() == 11) {
            // char Char1 = pc.charAt(0);
            int Char1 = Character.getNumericValue(pc.charAt(0));
            char Char2 = pc.charAt(1);
            char Char3 = pc.charAt(2);
            char Char4 = pc.charAt(3);
            char Char5 = pc.charAt(4);
            char Char6 = pc.charAt(5);
            char Char7 = pc.charAt(6);
            char Char8 = pc.charAt(7);
            char Char9 = pc.charAt(8);
            char Char10 = pc.charAt(9);
            int Char11 = Character.getNumericValue(pc.charAt(10));

            Year2half = Char2 + "" + Char3;
            Month = Char4 + "" + Char5;
            int MonthI = Integer.parseInt(Month);
            Day = Char6 + "" + Char7;
            HaiglaNr = Char8 + "" + Char9 + "" + Char10;
            kontrollnr = isPersonalCodeValid();
            LocalDate localDate = LocalDate.now();

            int Monthh = Integer.parseInt(Month);
            int Dayy = Integer.parseInt(Day);

            if (Char1 > 0 && Char1 < 9) {
                if (Char1 == 1) {
                    gender = "M";
                    Year1half = "18";
                }
                if (Char1 == 2) {
                    gender = "N";
                    Year1half = "18";
                }
                if (Char1 == 3) {
                    gender = "M";
                    Year1half = "19";
                }
                if (Char1 == 4) {
                    gender = "N";
                    Year1half = "19";
                }
                if (Char1 == 5) {
                    gender = "M";
                    Year1half = "20";
                }
                if (Char1 == 6) {
                    gender = "N";
                    Year1half = "20";
                }

                if (Char11 == kontrollnr) {
                    kehtivus = true;
                }

                if (Monthh < 13) {
                    if (Dayy < 32) {
                        if (Monthh == 2 && Dayy > 28) {
                            System.out.println("Veebruaris pole sellist kuupäeva");
                        } else {
                            String Year = Year1half + "" + Year2half;
                            String birthdate = Day + "/" + Month + "/" + Year;
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

                            //convert String to LocalDate
                            LocalDate newDate = LocalDate.parse(birthdate, formatter);
                            age = calculateAge(newDate, localDate);

                            if (age < 0) {
                                vanus = "Isik pole veel sündinud";
                            } else if (age > 122) {
                                vanus = "Isik on arvatavasti juba surnud";
                            } else {
                                vanus = Integer.toString(age);
                            }
                            monthsi = months[MonthI];
                            personalcode = "Isikukood: " + pc;
//                                    + "\nSugu: " + gender
//                                    + "\nSünniaeg: " + Day + " " + months[MonthI] + " " + Year
//                                    + "\nHaigla kood: " + HaiglaNr
//                                    + "\nHaigla: " + Hospital()
//                                    + "\nKehtivus: " + kehtivus
//                                    + "\nKontrollNr: " + kontrollnr
//                                    + "\nVanus: " + vanus;

                        }
                    } else {
                        System.out.println("Kuupäev vale");
                    }
                } else {
                    System.out.println("Kuu vale");
                }
            } else {
                System.out.println("Isik on sündinud enne 18 saj või pärast 22 saj.");
            }
        } else {
            System.out.println("Isikukood vale");
        }
        return personalcode;

    }

    public int isPersonalCodeValid() {
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
        }
        return jaak;
    }

    public String Hospital() {
        //haigla kood
        int HNr = Integer.parseInt(HaiglaNr);

        if (HNr >= 1 && HNr <= 99) {
            haigla = "Kuressaare Haigla";
        } else if (HNr >= 11 && HNr <= 19) {
            haigla = "Tartu Ülikooli Naistekliinik, Tartumaa, Tartu";
        } else if (HNr >= 21 && HNr <= 220) {
            haigla = "Ida-Tallinna Keskhaigla, Pelgulinna sünnitusmaja, Hiiumaa, Keila, Rapla haigla, Loksa haigla";
        } else if (HNr >= 221 && HNr <= 270) {
            haigla = "Ida-Viru Keskhaigla (Kohtla-Järve, endine Jõhvi)";
        } else if (HNr >= 271 && HNr <= 370) {
            haigla = "Maarjamõisa Kliinikum (Tartu), Jõgeva Haigla";
        } else if (HNr >= 371 && HNr <= 420) {
            haigla = "Narva Haigla";
        } else if (HNr >= 421 && HNr <= 470) {
            haigla = "Pärnu Haigla";
        } else if (HNr >= 371 && HNr <= 420) {
            haigla = "Pelgulinna Sünnitusmaja (Tallinn), Haapsalu haigla";
        } else if (HNr >= 471 && HNr <= 490) {
            haigla = "Järvamaa Haigla (Paide)";
        } else if (HNr >= 491 && HNr <= 520) {
            haigla = "Rakvere, Tapa haigla";
        } else if (HNr >= 571 && HNr <= 570) {
            haigla = "Valga Haigla";
        } else if (HNr >= 601 && HNr <= 650) {
            haigla = "Viljandi Haigla";
        } else if (HNr >= 651 && HNr <= 710) {
            haigla = "Lõuna-Eesti Haigla (Võru), Põlva Haigla";
        } else {
            haigla = "Välismaalane";
        }

        return haigla;
    }

    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

}
