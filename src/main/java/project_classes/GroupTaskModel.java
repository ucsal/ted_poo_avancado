package project_classes;

import project_interfaces.GroupTask;

public class GroupTaskModel extends TaskModel implements GroupTask {

    private Integer[] usersID;
    private String[] usersUuid;

    // Getters e Setters para userID
    public Integer[] usersID() {
        return usersID;
    }

    public void setUserID(Integer[] usersID) {
        this.usersID = usersID;
    }

    // Getters e Setters para usersUuid
    public String[] getUsersUuid() {
        return usersUuid;
    }

    public void setUserUuid(String[] usersUuid) {
        this.usersUuid = usersUuid;
    }

    // Método para compartilhar tarefa com base nos IDs dos usuários
    public void shareTask(Integer[] usersID) {
        if (this.usersID == null) {
            this.usersID = new Integer[0];
        }

        Integer[] newUsersID = new Integer[this.usersID.length + usersID.length];
        System.arraycopy(this.usersID, 0, newUsersID, 0, this.usersID.length);
        System.arraycopy(usersID, 0, newUsersID, this.usersID.length, usersID.length);
        this.usersID = newUsersID;
    }

    // Método para compartilhar tarefa com base nos UUIDs dos usuários
    public void shareTask(String[] usersUuid) {
        if (this.usersUuid == null) {
            this.usersUuid = new String[0];
        }

        String[] newUsersUuid = new String[this.usersUuid.length + usersUuid.length];
        System.arraycopy(this.usersUuid, 0, newUsersUuid, 0, this.usersUuid.length);
        System.arraycopy(usersUuid, 0, newUsersUuid, this.usersUuid.length, usersUuid.length);
        this.usersUuid = newUsersUuid;
    }
}
