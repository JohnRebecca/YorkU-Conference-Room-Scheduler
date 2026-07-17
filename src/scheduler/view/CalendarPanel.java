package scheduler.view;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarPanel extends JPanel {
    private YearMonth displayedMonth;
    private LocalDate selectedDate;
    private JLabel monthLabel;
    private JPanel daysPanel;
    private DateSelectionListener listener;

    public CalendarPanel(DateSelectionListener listener) {
        this.displayedMonth = YearMonth.now();
        this.selectedDate = LocalDate.now();
        this.listener = listener;

        setLayout(new BorderLayout(10, 10));
        setBackground(Theme.WHITE);
        setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Theme.WHITE);

        RoundedButton previousButton = new RoundedButton("<", RoundedButton.Style.SECONDARY, 8);
        RoundedButton nextButton = new RoundedButton(">", RoundedButton.Style.SECONDARY, 8);
        previousButton.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));
        nextButton.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));

        monthLabel = new JLabel("", SwingConstants.CENTER);
        monthLabel.setFont(Theme.boldFont(18));
        monthLabel.setForeground(Theme.TEXT_DARK);

        previousButton.addActionListener(e -> {
            displayedMonth = displayedMonth.minusMonths(1);
            refreshCalendar();
        });

        nextButton.addActionListener(e -> {
            displayedMonth = displayedMonth.plusMonths(1);
            refreshCalendar();
        });

        headerPanel.add(previousButton, BorderLayout.WEST);
        headerPanel.add(monthLabel, BorderLayout.CENTER);
        headerPanel.add(nextButton, BorderLayout.EAST);

        daysPanel = new JPanel(new GridLayout(0, 7, 6, 6));
        daysPanel.setBackground(Theme.WHITE);

        add(headerPanel, BorderLayout.NORTH);
        add(daysPanel, BorderLayout.CENTER);

        refreshCalendar();
    }

    public LocalDate getSelectedDate() {
        return selectedDate;
    }

    /** Jumps the calendar to show and select the given date (e.g. pre-filling an edit form). */
    public void setSelectedDate(LocalDate date) {
        this.selectedDate = date;
        this.displayedMonth = YearMonth.from(date);
        refreshCalendar();
    }

    private void refreshCalendar() {
        daysPanel.removeAll();

        monthLabel.setText(displayedMonth.getMonth() + " " + displayedMonth.getYear());

        String[] dayNames = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        for (String dayName : dayNames) {
            JLabel dayLabel = new JLabel(dayName, SwingConstants.CENTER);
            dayLabel.setFont(Theme.boldFont(12));
            dayLabel.setForeground(Theme.RED);
            daysPanel.add(dayLabel);
        }

        LocalDate firstDay = displayedMonth.atDay(1);
        int firstDayColumn = firstDay.getDayOfWeek().getValue();

        for (int i = 1; i < firstDayColumn; i++) {
            daysPanel.add(new JLabel(""));
        }

        int daysInMonth = displayedMonth.lengthOfMonth();

        LocalDate today = LocalDate.now();

        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date = displayedMonth.atDay(day);
            boolean isPast = date.isBefore(today);

            RoundedButton dateButton = new RoundedButton(String.valueOf(day),
                    isPast ? RoundedButton.Style.DISABLED
                            : (date.equals(selectedDate) ? RoundedButton.Style.PRIMARY : RoundedButton.Style.SECONDARY),
                    8);
            dateButton.setFont(Theme.bodyFont(13));
            dateButton.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));
            dateButton.setHorizontalAlignment(SwingConstants.CENTER);

            if (isPast) {
                // Past dates cannot be booked (Req3 edge case: no booking in the past).
                dateButton.setEnabled(false);
                dateButton.setToolTipText("This date has already passed.");
            } else {
                if (date.equals(today) && !date.equals(selectedDate)) {
                    dateButton.setForeground(Theme.RED);
                }

                dateButton.addActionListener(e -> {
                    selectedDate = date;

                    if (listener != null) {
                        listener.onDateSelected(selectedDate);
                    }

                    refreshCalendar();
                });
            }

            daysPanel.add(dateButton);
        }

        daysPanel.revalidate();
        daysPanel.repaint();
    }

    public interface DateSelectionListener {
        void onDateSelected(LocalDate selectedDate);
    }
}
