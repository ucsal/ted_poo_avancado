package project_interfaces;

public interface Task {
    // Getter e Setter para userID
    Integer getUserID();

    void setUserID(Integer userID);

    // Getter e Setter para userUuid
    String getUserUuid();

    void setUserUuid(String userUuid);

    // Getter e Setter para title
    String getTitle();

    void setTitle(String title);

    // Getter e Setter para tag
    String getTag();

    void setTag(String tag);

    // Getter e Setter para description
    String getDescription();

    void setDescription(String description);

    // Getter e Setter para status
    int getStatus();

    void setStatus(int status);

    // Getter e Setter para priority
    int getPriority();

    void setPriority(int priority);

    // Getter e Setter para isDelete
    Boolean getIsDelete();

    void setIsDelete(Boolean isDelete);

    // Getter e Setter para isDone
    Boolean getIsDone();

    void setIsDone(Boolean isDone);

    // Getter e Setter para typeTask
    String getTypeTask();

    void setTypeTask(String typeTask);
}
