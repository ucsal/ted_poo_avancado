package project_interfaces;

public interface ExpiredTask extends Task {
    // Getter e Setter para deadline
    public String getDeadline();

    public void setDeadline(String deadline);

    // Getter e Setter para startDate
    public String getStartDate();

    public void setStartDate(String startDate);

    // Getter e Setter para extension
    public String getExtension();

    public void setExtension(String extension);
}
