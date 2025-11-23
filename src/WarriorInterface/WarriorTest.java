// Main class to demonstrate polymorphism
public class WarriorTest {
    public static void main(String[] args) {
        // Array of warriors using polymorphism
        Warrior[] warriors = {
            new ChineseWarrior(),
            new CelticWarrior(),
            new IndianWarrior()
        };

        // Call warCry for each warrior
        for (Warrior w : warriors) {
            w.move();
            doWarCry(w); // Dynamic dispatch (polymorphic call)
        }
    }

    static void doWarCry(Warrior inWarrior)
    {
        inWarrior.warCry();
    }
}

interface Warrior{
    void warCry();
    void move();
}

// Subclass 1
class ChineseWarrior implements Warrior {
    @Override
    public void warCry() {
        System.out.println("For the Emperor and the Dragon!");
    }

    @Override
    public void move() {
        System.out.println("I run fast");
    }
}

// Subclass 2
class CelticWarrior implements Warrior {
    @Override
    public void warCry() {
        System.out.println("For the clans and the old gods!");
    }

    @Override
    public void move() {
        System.out.println("I run fast");
    }
}

// Subclass 3
class IndianWarrior implements Warrior {
    @Override
    public void warCry() {
        System.out.println("For the people and the gods!");
    }

    @Override
    public void move() {
        System.out.println("I run fast");
    }
}