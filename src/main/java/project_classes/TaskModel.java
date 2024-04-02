package project_classes;

import project_interfaces.Task;

public class TaskModel implements Task {

    private Integer userID;
    private String userUuid;
    private String title;
    private String tag;
    private String description;
    private int status;
    private int priority;
    private Boolean isDelete;
    private Boolean isDone;
    private String typeTask;

    public TaskModel() {
		this.status = 1;
		this.priority = 0;
		this.isDelete = false;
		this.isDone = false;
	}

    public TaskModel(Integer userID, String title, String tag, String description, String typeTask) {
		this.userID = userID;
		this.title = title;
		this.tag = tag;
		this.description = description;
		this.status = 1;
		this.priority = 0;
		this.isDelete = false;
		this.isDone = false;
		this.typeTask = typeTask;
	}

    public TaskModel(Integer userID, String title, String tag, String description, String typeTask, String userUuid) {
		this.userID = userID;
		this.userUuid = userUuid;
		this.title = title;
		this.tag = tag;
		this.description = description;
		this.status = 1;
		this.priority = 0;
		this.isDelete = false;
		this.isDone = false;
		this.typeTask = typeTask;
	}

	// Getters e Setters para userID
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    // Getters e Setters para userUuid
    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    // Getters e Setters para title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getters e Setters para tag
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    // Getters e Setters para description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters e Setters para status
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    // Getters e Setters para priority
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    // Getters e Setters para isDelete
    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    // Getters e Setters para isDone
    public Boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    // Getters e Setters para typeTask
    public String getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(String typeTask) {
        this.typeTask = typeTask;
    }
}
