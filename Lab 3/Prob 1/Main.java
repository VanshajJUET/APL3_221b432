public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun behavior:");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        
        System.out.println("\nBheem behavior:");
        bheem.fight();
        bheem.obey();
        bheem.kind();
        
        System.out.println("\nDuryodhan behavior:");
        duryodhan.fight();
        duryodhan.obey();
        
        System.out.println("\nVikarn behavior:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}