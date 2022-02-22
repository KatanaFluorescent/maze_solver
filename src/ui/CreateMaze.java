package ui;

import javax.swing.*;

import maze.Maze;

import java.awt.event.*;
import java.awt.*;

public final class CreateMaze extends JPanel { // this one works

    private final MazeApp mazeApp;
    private final JSpinner jSpinnerX = new JSpinner(new SpinnerNumberModel(1, 1, 30, 1));
    private final JSpinner jSpinnerY = new JSpinner(new SpinnerNumberModel(1, 1, 30, 1));
    private final JLabel labelRows = new JLabel("Rows");
    private final JLabel labelColumns = new JLabel("Columns");
    private final JLabel labelConfirm = new JLabel("Confirm Creation");
    private final JButton confirmCreation;

    public CreateMaze(MazeApp mazeApp) {
        super();
        this.mazeApp = mazeApp;
        confirmCreation = new JButton("Confirm");
        confirmCreation.setBackground(Color.GREEN);
        confirmCreation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer x1 = (Integer) jSpinnerX.getValue();
                Integer y1 = (Integer) jSpinnerY.getValue();
                int x = x1.intValue();
                int y = y1.intValue();
                MazeAppModel mazeAppModel = mazeApp.getModel();
                mazeAppModel.setMaze(new Maze(x, y)); 
                mazeAppModel.setDisplaySolution(false);
                mazeAppModel.setEditEnabled(false);
            }
        });
        setLayout(new GridLayout(2, 3));
        add(labelRows);
        add(labelColumns);
        add(labelConfirm);
        add(jSpinnerX);
        add(jSpinnerY);
        add(confirmCreation);
    }

    public void notifyForUpdate() {
    }
}