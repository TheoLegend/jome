class Wonder {
    void location() {
        System.out.println("Wonder location");
    }
}

class TajMahal extends Wonder {
    void location() {
        System.out.println("Taj Mahal - India");
    }
}

class GreatWall extends Wonder {
    void location() {
        System.out.println("Great Wall of China - China");
    }
}

class Petra extends Wonder {
    void location() {
        System.out.println("Petra - Jordan");
    }
}

class ChristTheRedeemer extends Wonder {
    void location() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}

class MachuPicchu extends Wonder {
    void location() {
        System.out.println("Machu Picchu - Peru");
    }
}

class ChichenItza extends Wonder {
    void location() {
        System.out.println("Chichen Itza - Mexico");
    }
}

class Colosseum extends Wonder {
    void location() {
        System.out.println("Colosseum - Italy");
    }
}

public class Main {
    public static void main(String[] args) {

        Wonder w;

        w = new TajMahal();
        w.location();

        w = new GreatWall();
        w.location();

        w = new Petra();
        w.location();

        w = new ChristTheRedeemer();
        w.location();

        w = new MachuPicchu();
        w.location();

        w = new ChichenItza();
        w.location();

        w = new Colosseum();
        w.location();
    }
}