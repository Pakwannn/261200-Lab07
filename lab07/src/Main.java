public class Main {
    public static void main(String[] args) {

        Character character = new Character(100, 50);

        // Swing sword to reduce stamina
        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();

        // Take damage to reduce health
        character.takeDamage(30);
        character.takeDamage(50);
        character.takeDamage(20);

        // Rest to restore stats
        character.rest();

        // Final state (use getters)
        System.out.println(
                "Character's health: " + character.getHealth() +
                        ", stamina: " + character.getStamina() + "."
        );
    }
}
