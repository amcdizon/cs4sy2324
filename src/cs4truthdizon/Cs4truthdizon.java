package cs4truthdizon;

public class Cs4truthdizon {
    public static void main(String[] args) {
        String name1 = "Virgil Van Dijk", team1 = "Liverpool";
        String name2 = "Kevin De Bruyne", team2 = "Manchester City";
        String name3 = "Erling Haaland", team3 = "Manchester City";
        int age1 = 32, age2 = 32, age3 = 23;

        System.out.println("Player 1");
        System.out.println("Name: " + name1);
        System.out.println("Team: " + team1);
        System.out.println("Age: " + age1 + System.lineSeparator());
        
        System.out.println("Player 2");
        System.out.println("Name: " + name2);
        System.out.println("Team: " + team2);
        System.out.println("Age: " + age2 + System.lineSeparator());

        System.out.println("Player 3");
        System.out.println("Name: " + name3);
        System.out.println("Team: " + team3);
        System.out.println("Age: " + age3 + System.lineSeparator());

        System.out.println("Average age: " + (age1 + age2 + age3)/3);
        System.out.println("Virgil Van Dijk and Kevin De Bruyne are teammates: " + (team1 == team2));
        System.out.println("Kevin De Bruyne and Erling Haaland are teammates: " + (team2 == team3));
        System.out.println("Virgil Van Dijk is older than Erling Haaland: " + (age1 > age3));
        System.out.println("Erling Haaland is older than Kevin De Bruyne: " + (age3 > age2));
        
    }
}
