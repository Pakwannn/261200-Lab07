public class Main {
    public static void main(String[] args) {

        // Create character
        Character character = new Character("Hero");

        // Swing sword to reduce stamina and trigger pass out
        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();
        character.swingSword();

        // Take damage to reduce health and trigger death
        character.takeDamage(30);
        character.takeDamage(50);
        character.takeDamage(20);

        // Rest to restore health and stamina
        character.rest();

        // Show final state
        character.showDetails();
    }
}
