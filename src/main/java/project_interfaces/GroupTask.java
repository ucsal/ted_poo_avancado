package project_interfaces;

public interface GroupTask extends Task {
    public Integer[] usersID();

    public void setUserID(Integer[] usersID);

    public String[] getUsersUuid();

    public void setUserUuid(String[] usersUuid);

    public void shareTask(Integer[] usersID);

    public void shareTask(String[] usersUuid);
}
