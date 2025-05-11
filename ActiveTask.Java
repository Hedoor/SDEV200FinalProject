public class ActiveTask extends Task {

    private String priorityLevel;
    private String dueDate;

    public ActiveTask(int taskId, String taskName, String taskDescription, String taskStatus, String priorityLevel, String dueDate) {
        super(taskId, taskName, taskDescription, taskStatus);
        this.priorityLevel = priorityLevel;
        this.dueDate = dueDate;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public void updateStatus(String status) {
        setTaskStatus(status);
    }
}
