package net.hsexpert.main;

import net.hsexpert.slideDemo.SliderFrame;

import javax.swing.*;

/**
 * Created by Ikaros on 2015/4/20.
 */

public class TabFrame extends JFrame {

    JTabbedPane tabPane;

    public TabFrame() {
        tabPane = new JTabbedPane();
        tabPane.addTab("SlideDemo", new SliderFrame());
        this.add(tabPane);
    }

}
