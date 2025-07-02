//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PokedexDriver {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        PokedexGUI gui = new PokedexGUI();
        new Controller(gui, pokedex); // Hook up the controller
    }
}