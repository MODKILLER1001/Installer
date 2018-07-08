package cc.hyperium.installer.components;

import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;

/*
 * Created by Cubxity on 08/07/2018
 */
public class VScrollBarUI extends MetalScrollBarUI {
    private JButton zero() {
        JButton b = new JButton();
        Dimension d = new Dimension(0, 0);
        b.setPreferredSize(d);
        b.setMaximumSize(d);
        b.setMinimumSize(d);
        return b;
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
    }

    @Override
    protected void paintDecreaseHighlight(Graphics g) {
    }

    @Override
    protected void paintIncreaseHighlight(Graphics g) {
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return zero();
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return zero();
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        thumbBounds.x = thumbBounds.x + (thumbBounds.width - 5);
        thumbBounds.width = 5;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.WHITE);
        g2d.fillRoundRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height, 3, 3);
    }
}
