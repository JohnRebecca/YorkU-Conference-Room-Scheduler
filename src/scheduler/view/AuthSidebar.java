package scheduler.view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.function.IntConsumer;

public final class AuthSidebar extends JPanel {

    private static final long serialVersionUID = 1L;

    public AuthSidebar(IntConsumer navigationHandler) {
        setPreferredSize(new Dimension(250, 720));
        setBackground(AuthTheme.DARK_BACKGROUND);
        setLayout( new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder( new EmptyBorder(35, 22, 25, 22));

        addBranding();
        add(Box.createVerticalStrut(55));
        addNavigation(navigationHandler);
        add(Box.createVerticalGlue());
        addFooter();
    }

    private void addBranding() {
    	ImageIcon logoIcon = new ImageIcon("images/logo.png");
    	Image scaledLogo = logoIcon.getImage().getScaledInstance(
    	        58,
    	        58,
    	        Image.SCALE_SMOOTH
    	);

    	JLabel logoLabel = new JLabel(new ImageIcon(scaledLogo));
    	logoLabel.setAlignmentX( Component.LEFT_ALIGNMENT);
        JLabel yorkLabel = new JLabel("YorkU");
        yorkLabel.setForeground(Color.WHITE);
        yorkLabel.setFont( new Font("SansSerif", Font.BOLD, 34));
        yorkLabel.setAlignmentX( Component.LEFT_ALIGNMENT );
        JLabel schedulerLabel = new JLabel("Room Scheduler");

        schedulerLabel.setForeground( AuthTheme.YORK_RED );
        schedulerLabel.setFont( new Font("SansSerif", Font.BOLD, 18));
        schedulerLabel.setAlignmentX( Component.LEFT_ALIGNMENT );

        add(logoLabel);
        add(Box.createVerticalStrut(8));
        add(yorkLabel);
        add(Box.createVerticalStrut(4));
        add(schedulerLabel);
    }

    private void addNavigation( IntConsumer navigationHandler ) {
        JLabel sectionLabel = new JLabel("ACCOUNT MANAGEMENT");
        sectionLabel.setForeground(new Color(170, 170, 170));
        sectionLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));

        sectionLabel.setAlignmentX( Component.LEFT_ALIGNMENT );
        add(sectionLabel);
        add(Box.createVerticalStrut(18));
        add(createNavigationButton( "Register", 0, navigationHandler));
        add(Box.createVerticalStrut(10));

        add(createNavigationButton("Login", 1, navigationHandler ));
        add(Box.createVerticalStrut(10));
        add(createNavigationButton( "Add Account Type", 2, navigationHandler));
        add(Box.createVerticalStrut(10));
        add(createNavigationButton( "Room Management", 3, navigationHandler));
    }

    private JButton createNavigationButton(
            String text,
            int tabIndex,
            IntConsumer navigationHandler
    ) {
        JButton button = new JButton(text);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 48));
        button.setPreferredSize(new Dimension(205, 48));
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setHorizontalAlignment( SwingConstants.LEFT );

        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);

        button.setBackground(AuthTheme.YORK_RED);
        button.setForeground(Color.WHITE);

        button.setFont(new Font("SansSerif", Font.BOLD, 15));
        button.setBorder(new EmptyBorder(0, 18, 0, 18));
        button.addActionListener( event -> navigationHandler.accept(tabIndex));

        return button;
    }

    private void addFooter() {
        JLabel footer = new JLabel("EECS 3311 Project");

        footer.setForeground( new Color(150, 150, 150));
        footer.setFont( new Font("SansSerif", Font.PLAIN, 12));

        footer.setAlignmentX( Component.LEFT_ALIGNMENT );
        add(footer);
    }
}