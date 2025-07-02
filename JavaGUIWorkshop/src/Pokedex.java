import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokemons;
    private int currNum;

    public Pokedex() {
        pokemons = new ArrayList<>();
        currNum = 0;
    }

    public void addPokemon(Pokemon p) {
        pokemons.add(p);
        currNum = pokemons.size() - 1; // Go to newly added
    }

    public Pokemon getCurrentPokemon() {
        if (pokemons.isEmpty()) return null;
        return pokemons.get(currNum);
    }

    public boolean hasNext() {
        return currNum < pokemons.size() - 1;
    }

    public boolean hasPrev() {
        return currNum > 0;
    }

    public void next() {
        if (hasNext()) currNum++;
    }

    public void prev() {
        if (hasPrev()) currNum--;
    }

    public int getCurrNum() {
        return currNum;
    }

    public int getTotal() {
        return pokemons.size();
    }
}
