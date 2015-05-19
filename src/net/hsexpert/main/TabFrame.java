package net.hsexpert.main;

import javax.swing.*;
import net.hsexpert.painter.PainterPanel;

/**
 * Created by Ikaros on 2015/4/20.
 */

public class TabFrame extends JFrame {

    JTabbedPane tabPane;

    public TabFrame() {
        tabPane = new JTabbedPane();
        tabPane.addTab("painter", new PainterPanel());
        this.add(tabPane);
    }

}
