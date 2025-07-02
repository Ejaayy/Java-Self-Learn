import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private PokedexGUI pokedexGUI;
    private Pokedex pokedex;

    public Controller(PokedexGUI gui, Pokedex pokedex) {
        this.pokedex = pokedex;
        this.pokedexGUI = gui;

        gui.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Add":
                String name = pokedexGUI.getPokemonName();
                String desc = pokedexGUI.getPokemonDescription();
                pokedex.addPokemon(new Pokemon(name, desc));
                pokedexGUI.displayPokemon(pokedex.getCurrentPokemon());
                break;

            case "Clear":
                pokedexGUI.clearInputs();
                break;

            case "<":
                pokedex.prev();
                pokedexGUI.displayPokemon(pokedex.getCurrentPokemon());
                break;

            case ">":
                pokedex.next();
                pokedexGUI.displayPokemon(pokedex.getCurrentPokemon());
                break;
        }

        // Optional: Print current position
        pokedexGUI.setPokemonNumber(pokedex.getCurrNum() + 1, pokedex.getTotal());
    }

}
