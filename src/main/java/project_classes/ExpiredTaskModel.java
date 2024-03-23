package project_classes;

import project_interfaces.ExpiredTask;

public class ExpiredTaskModel extends TaskModel implements ExpiredTask {
    private String deadline;
    private String startDate;
    private String extension;

    // Getter e Setter para deadline
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    // Getter e Setter para startDate
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // Getter e Setter para extension
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
