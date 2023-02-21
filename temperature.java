public class Temperature {
    public static void main (String[] args) {
        //  Temperaturen eingeben
            int Temperature = Integer.parseInt(args[0]);
            
        // Einlesen eines Wahrheitswertes von der Konsole
            boolean precipitation = Boolean.parseBoolean(args[1]); 
            
        //Empfehlungen bei der eingegebenen Temperatur
           if(Temperature < 0 && precipitation) {
                    System.out.println("Komm, geh'n wir Schlittenfahren!");
                } else  if (Temperature >= 0 && precipitation){
                    System.out.println("Sauwetter");
                } else  if (Temperature >= 20) {
                    System.out.println("Gehen wir schwimmen?");
                } else if (Temperature >= 0) {
                    System.out.println("Gehen wir spazieren?");
                } else {
                    System.out.println("Lass uns am Lagerfeuer Glühwein trinken.");
                }
            } 
}