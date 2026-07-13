package scheduler.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public final class AuthViewUtils {

    private AuthViewUtils() {
    }

    public static JPanel createPageWrapper() {
        JPanel wrapper = new JPanel(new BorderLayout());

        wrapper.setBackground(AuthTheme.PAGE_BACKGROUND);
        wrapper.setBorder( new EmptyBorder(18, 18, 35, 18 ));

        wrapper.setPreferredSize( new Dimension(820, 620));
        return wrapper;
    }

    public static JPanel createCard( String titleText, String subtitleText ) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(AuthTheme.PANEL_BACKGROUND);

        card.setBorder( BorderFactory.createCompoundBorder(
                        new LineBorder(
                                AuthTheme.BORDER_COLOR,
                                1,
                                true
                        ),
                        new EmptyBorder(24, 26, 30, 26)
                )
        );

        JPanel heading = new JPanel();
        heading.setOpaque(false);
        heading.setLayout( new javax.swing.BoxLayout( heading, javax.swing.BoxLayout.Y_AXIS ));

        JLabel title = new JLabel(titleText);
        title.setFont(AuthTheme.CARD_TITLE_FONT);
        JLabel subtitle = new JLabel(subtitleText);
        subtitle.setFont(AuthTheme.NORMAL_FONT);
        subtitle.setForeground(AuthTheme.MUTED_TEXT);

        heading.add(title);
        heading.add(javax.swing.Box.createVerticalStrut(5));
        heading.add(subtitle);

        card.add(heading, BorderLayout.NORTH);

        return card;
    }

    public static JPanel createFormPanel() {
        JPanel form = new JPanel( new java.awt.GridBagLayout() );
        form.setOpaque(false);
        form.setBorder( new EmptyBorder(22, 0, 0, 0));

        return form;
    }

    public static GridBagConstraints createConstraints() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(8, 8, 8, 8);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        return constraints;
    }

    public static void addRow(
            JPanel panel,
            GridBagConstraints constraints,
            int row,
            String labelText,
            Component field
    ) {
        JLabel label = new JLabel(labelText);
        label.setFont(AuthTheme.LABEL_FONT);

        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.weightx = 0;
        constraints.gridwidth = 1;

        panel.add(label, constraints);

        constraints.gridx = 1;
        constraints.weightx = 1;

        if (field instanceof JComponent component) {
            component.setFont(AuthTheme.NORMAL_FONT);
            component.setPreferredSize( AuthTheme.FIELD_SIZE );
        }

        panel.add(field, constraints);
    }

    public static void addButtonRow(
            JPanel panel,
            GridBagConstraints constraints,
            int row,
            Component button
    ) {
        constraints.gridx = 1;
        constraints.gridy = row;
        constraints.weightx = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.WEST;

        panel.add(button, constraints);
    }

    public static JButton createPrimaryButton( String text ) {
        JButton button = new JButton(text);
        button.setBackground(AuthTheme.YORK_RED);
        button.setForeground(java.awt.Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setFont(AuthTheme.BUTTON_FONT);
        button.setPreferredSize( new Dimension(190, 42));

        return button;
    }

    public static JButton createSecondaryButton( String text ) {
        JButton button = new JButton(text);
        button.setBackground(java.awt.Color.WHITE);
        button.setForeground(java.awt.Color.BLACK);
        button.setFocusPainted(false);

        button.setBorder( new LineBorder(
                        new java.awt.Color(190, 190, 190),
                        1,
                        true ));
        button.setFont(AuthTheme.BUTTON_FONT);

        button.setPreferredSize( new Dimension(120, 42));

        return button;
    }

    public static JScrollPane createScrollable( JPanel panel ) {
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        scrollPane.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED );
        scrollPane.getVerticalScrollBar().setUnitIncrement(18);

        scrollPane.getVerticalScrollBar().setBlockIncrement(90);
        scrollPane.getViewport().setBackground(AuthTheme.PAGE_BACKGROUND);

        return scrollPane;
    }
}