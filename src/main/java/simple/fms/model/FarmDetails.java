package simple.fms.model;

public class FarmDetails {
   private String fieldId;
   private String fieldName;
   private int fieldSize;
   private String fieldStatus;

    public FarmDetails(String fieldId, String fieldName, int fieldSize, String fieldStatus) {
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.fieldSize = fieldSize;
        this.fieldStatus = fieldStatus;
    }

    public FarmDetails() {

    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public String getFieldStatus() {
        return fieldStatus;
    }

    public void setFieldStatus(String fieldStatus) {
        this.fieldStatus = fieldStatus;
    }

    @Override
    public String toString() {
        return
                "fieldId= " + fieldId +
                ", fieldName= " + fieldName +
                ", fieldSize= " + fieldSize +
                ", fieldStatus= " + fieldStatus ;
    }
}
