import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class GUI {

    private JFrame frame;
    private JPanel result_Left;
    private JPanel result_Right;
    private JLabel[] resultLabels = new JLabel[84];

    public void CreateApp() {
        frame = new JFrame("Cho'gath Calculator");

        String[] stars = {"1","2","3"};
        String[] bruisers = {"2","4","6","8","0"};
        String[] cyberneticEnhancement = {"0","3","5","7"};
        String[] augments = 
        {"",
            "Built Different I","Built Different II","Built Different III",
            "Cybernetic I","Cybernetic II","Cybernetic III",
            "Tri Force I","Tri Force II","Tri Force III",
            "Unstable Evolution",};
            String[] items = {"",
                                "Any item with Giant's Belt","Warmog's Armor","Radiant Warmog's Pride","Radiant Redemption","Trinity Force"};
        int[] starsHealth = {750,1350,2430};
        int[] bruisersHealth = {250,450,900,1600,0};
        int[] cyberneticEnhancementHealth = {0,450,800,1250};
        int[] augmentsHealth = 
        {0,
            300,400,500,
            150,250,350,
            133,233,333,
            500};
        int[] itemsHealth = 
        {0,
            150,1000,1800,350,33};

            
        Border border = BorderFactory.createLineBorder(Color.BLACK,1);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK,2);

        JPanel calculator = new JPanel();
        calculator.setBounds(0,0,350,570);
        calculator.setBackground(Color.CYAN);
        calculator.setLayout(new GridLayout(10,2,5,5));
            
        result_Left = new JPanel();  
        result_Left.setBounds(350,0,175,567);
        result_Left.setBackground(Color.LIGHT_GRAY);
        result_Left.setLayout(new GridLayout(21,2,0,0));
        
        result_Right = new JPanel();  
        result_Right.setBounds(525,0,175,567);
        result_Right.setBackground(Color.LIGHT_GRAY);
        result_Right.setLayout(new GridLayout(21,2,0,0));

        for (int i=0;i<=20;i++) {
            resultLabels[i] = new JLabel();
            resultLabels[i].setOpaque(true);
            resultLabels[i].setBorder(border);
            resultLabels[i+21] = new JLabel(i + "");
            resultLabels[i+21].setOpaque(true);
            resultLabels[i+21].setBorder(border);
            resultLabels[i+42] = new JLabel();
            resultLabels[i+42].setOpaque(true);
            resultLabels[i+42].setBorder(border);
            resultLabels[i+63] = new JLabel((i+20) + "");
            resultLabels[i+63].setOpaque(true);
            resultLabels[i+63].setBorder(border);

            result_Left.add(resultLabels[i]);
            result_Left.add(resultLabels[i+21]);
            result_Right.add(resultLabels[i+42]);
            result_Right.add(resultLabels[i+63]);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JComboBox<String> StarSelection = new JComboBox<>(stars);
        StarSelection.setBorder(border2);
        JLabel StarSelectionText = new JLabel("Stars :",SwingConstants.CENTER);
        StarSelectionText.setBorder(border2);
        JComboBox<String> BruiserSelection = new JComboBox<>(bruisers);
        BruiserSelection.setBorder(border2);
        JLabel BruiserSelectionText = new JLabel("Bruisers :",SwingConstants.CENTER);
        BruiserSelectionText.setBorder(border2);
        JComboBox<String> CyberneticEnhancementSelection = new JComboBox<>(cyberneticEnhancement);
        CyberneticEnhancementSelection.setBorder(border2);
        JLabel CyberneticEnhancementSelectionText = new JLabel("Cybernetic Enhancement :",SwingConstants.CENTER);
        CyberneticEnhancementSelectionText.setBorder(border2);
        JComboBox<String> AugmentSelection1 = new JComboBox<>(augments);
        AugmentSelection1.setBorder(border2);
        JLabel AugmentSelection1Text = new JLabel("Augment 1 :",SwingConstants.CENTER);
        AugmentSelection1Text.setBorder(border2);
        JComboBox<String> AugmentSelection2 = new JComboBox<>(augments);
        AugmentSelection2.setBorder(border2);
        JLabel AugmentSelection2Text = new JLabel("Augment 2 :",SwingConstants.CENTER);
        AugmentSelection2Text.setBorder(border2);
        JComboBox<String> AugmentSelection3 = new JComboBox<>(augments);
        AugmentSelection3.setBorder(border2);
        JLabel AugmentSelection3Text = new JLabel("Augment 3 :",SwingConstants.CENTER);
        AugmentSelection3Text.setBorder(border2);
        JComboBox<String> ItemSelection1 = new JComboBox<>(items);
        ItemSelection1.setBorder(border2);
        JLabel ItemSelection1Text = new JLabel("Item 1 :",SwingConstants.CENTER);
        ItemSelection1Text.setBorder(border2);
        JComboBox<String> ItemSelection2 = new JComboBox<>(items);
        ItemSelection2.setBorder(border2);
        JLabel ItemSelection2Text = new JLabel("Item 2 :",SwingConstants.CENTER);
        ItemSelection2Text.setBorder(border2);
        JComboBox<String> ItemSelection3 = new JComboBox<>(items);
        ItemSelection3.setBorder(border2);
        JLabel ItemSelection3Text = new JLabel("Item 3 :",SwingConstants.CENTER);
        ItemSelection3Text.setBorder(border2);

        JLabel stacks = new JLabel("Base Health : 1800",SwingConstants.CENTER);
        stacks.setOpaque(true);
        stacks.setBorder(border2);
        
        JLabel stacksValue = new JLabel("Feast Bonus : 36",SwingConstants.CENTER);
        stacksValue.setOpaque(true);
        stacksValue.setBorder(border2);

        calculator.add(StarSelectionText);
        calculator.add(StarSelection);
        calculator.add(BruiserSelectionText);
        calculator.add(BruiserSelection);
        calculator.add(CyberneticEnhancementSelectionText);
        calculator.add(CyberneticEnhancementSelection);


        calculator.add(AugmentSelection1Text);
        calculator.add(AugmentSelection1);
        calculator.add(AugmentSelection2Text);
        calculator.add(AugmentSelection2);
        calculator.add(AugmentSelection3Text);
        calculator.add(AugmentSelection3);


        calculator.add(ItemSelection1Text);
        calculator.add(ItemSelection1);
        calculator.add(ItemSelection2Text);
        calculator.add(ItemSelection2);
        calculator.add(ItemSelection3Text);
        calculator.add(ItemSelection3);

        calculator.add(stacks);
        calculator.add(stacksValue);
        frame.add(calculator);
        frame.add(result_Left);
        frame.add(result_Right);

        getStacks(1800);

        StarSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        BruiserSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        CyberneticEnhancementSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        StarSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        AugmentSelection1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        AugmentSelection2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        AugmentSelection3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        ItemSelection1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        ItemSelection2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });
        ItemSelection3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalHealth = 800 + 
                starsHealth[StarSelection.getSelectedIndex()] + bruisersHealth[BruiserSelection.getSelectedIndex()] + cyberneticEnhancementHealth[CyberneticEnhancementSelection.getSelectedIndex()] +
                augmentsHealth[AugmentSelection1.getSelectedIndex()] + augmentsHealth[AugmentSelection2.getSelectedIndex()] + augmentsHealth[AugmentSelection3.getSelectedIndex()] + 
                itemsHealth[ItemSelection1.getSelectedIndex()] + itemsHealth[ItemSelection2.getSelectedIndex()] + itemsHealth[ItemSelection3.getSelectedIndex()];
                stacks.setText("Base Health : " + totalHealth);
                stacksValue.setText("Feast Bonus : " + Math.round(totalHealth*0.02));
                getStacks(totalHealth);
            }
        });

        frame.setVisible(true);
    }

    void getStacks(int health) {
        double multiplier = health*0.02;

        for(int i=0;i<=20;i++){ 
            resultLabels[i].setText(Math.round(health+(multiplier*i)) + "");
            resultLabels[i+42].setText(Math.round(health+(multiplier*(i+20))) + "");
        }
    }
}
