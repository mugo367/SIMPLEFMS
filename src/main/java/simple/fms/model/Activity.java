package simple.fms.model;

public class Activity {
    private String activityID;
    private String taskName;
    private String fieldName;
    private String startDate;
    private String finalDate;
    private String description;

    public Activity(String activityID, String taskName, String fieldName, String startDate, String finalDate, String description) {
        this.activityID = activityID;
        this.taskName = taskName;
        this.fieldName = fieldName;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.description = description;
    }

    public Activity() {

    }

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "activityID= " + activityID +
                ", taskName= " + taskName +
                ", fieldName= " + fieldName +
                ", startDate= " + startDate +
                ", finalDate= " + finalDate +
                ", description= " + description ;
    }
}
