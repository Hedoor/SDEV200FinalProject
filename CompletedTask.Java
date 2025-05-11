public class CompletedTask extends Task {

    private String completionDate;
    private String finalRemarks;

    public CompletedTask(int taskId, String taskName, String taskDescription, String taskStatus, String completionDate, String finalRemarks) {
        super(taskId, taskName, taskDescription, taskStatus);
        this.completionDate = completionDate;
        this.finalRemarks = finalRemarks;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public String getFinalRemarks() {
        return finalRemarks;
    }

    public void setFinalRemarks(String finalRemarks) {
        this.finalRemarks = finalRemarks;
    }

    @Override
    public void updateStatus(String status) {
        System.out.println("This task is completed and cannot be updated.");
    }
}
