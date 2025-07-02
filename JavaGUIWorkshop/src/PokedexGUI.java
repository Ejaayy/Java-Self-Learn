import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PokedexGUI extends JFrame {

    private JButton btnAdd, btnClear, btnPrev, btnNext;
    private JTextField tfName;
    private JTextArea taDesc;

    public PokedexGUI() {
        super("Pokedex");
        setLayout(new BorderLayout());
        setSize(450, 500);
        init();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        // SOUTH PANEL
        JPanel panelSouth = new JPanel(new FlowLayout());
        panelSouth.setBackground(Color.decode("#C21222"));

        btnAdd = new JButton("Add");
        panelSouth.add(btnAdd);

        btnClear = new JButton("Clear");
        panelSouth.add(btnClear);

        this.add(panelSouth, BorderLayout.SOUTH);

        // NORTH PANEL
        JPanel panelNorth = new JPanel(new FlowLayout());
        panelNorth.setBackground(Color.decode("#123456"));

        JLabel lblPokedex = new JLabel("Trading Card");
        lblPokedex.setForeground(Color.white);
        lblPokedex.setFont(new Font("Arial", Font.BOLD, 20));
        panelNorth.add(lblPokedex);

        this.add(panelNorth, BorderLayout.NORTH);

        // WEST PANEL
        JPanel panelWest = new JPanel(new GridBagLayout());
        panelWest.setBackground(Color.decode("#DFDFDF"));

        btnPrev = new JButton("<");
        panelWest.add(btnPrev);

        this.add(panelWest, BorderLayout.WEST);

        // EAST PANEL
        JPanel panelEast = new JPanel(new GridBagLayout());
        panelEast.setBackground(Color.decode("#DFDFDF"));

        btnNext = new JButton(">");
        panelEast.add(btnNext);

        this.add(panelEast, BorderLayout.EAST);

        // CENTER PANEL
        JPanel panelCenter = new JPanel(new BorderLayout());
        panelCenter.setBackground(Color.decode("#DFDFDF"));

        JPanel panelName = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelName.setBackground(Color.decode("#DFDFDF"));

        JLabel lblName = new JLabel("Pokemon Name:");
        lblName.setForeground(Color.BLUE);
        panelName.add(lblName);

        tfName = new JTextField(20);
        panelName.add(tfName);

        panelCenter.add(panelName, BorderLayout.NORTH);

        taDesc = new JTextArea(10, 30);
        taDesc.setFont(new Font("Arial", Font.PLAIN, 14));
        taDesc.setBackground(Color.WHITE);
        taDesc.setLineWrap(true);
        taDesc.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(taDesc);
        panelCenter.add(scrollPane, BorderLayout.CENTER);

        this.add(panelCenter, BorderLayout.CENTER);
    }

    public void displayPokemon(Pokemon p) {
        if (p != null) {
            tfName.setText(p.getName());
            taDesc.setText(p.getDescription());
        } else {
            tfName.setText("");
            taDesc.setText("");
        }
    }

    // Add a shared ActionListener to all buttons
    public void setActionListener(ActionListener listener) {
        btnAdd.addActionListener(listener);
        btnClear.addActionListener(listener);
        btnPrev.addActionListener(listener);
        btnNext.addActionListener(listener);
    }

    // Getters
    public String getPokemonName() {
        return tfName.getText();
    }

    public String getPokemonDescription() {
        return taDesc.getText();
    }

    public void clearInputs() {
        tfName.setText("");
        taDesc.setText("");
    }

    public void setPokemonNumber(int currNum, int numPokemons) {
        System.out.println("Viewing Pokémon " + currNum + " of " + numPokemons);
    }
}
