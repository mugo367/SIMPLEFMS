package simple.fms.model;

public class Production {
    private String productionLabel;
    private String crop;
    private String productionDate;
    private String fieldName;
    private String productionQuantity;

    public Production(String productionLabel, String crop, String productionDate, String fieldName, String productionQuantity) {
        this.productionLabel = productionLabel;
        this.crop = crop;
        this.productionDate = productionDate;
        this.fieldName = fieldName;
        this.productionQuantity = productionQuantity;
    }

    public Production() {

    }

    public String getProductionLabel() {
        return productionLabel;
    }

    public void setProductionLabel(String productionLabel) {
        this.productionLabel = productionLabel;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getProductionQuantity() {
        return productionQuantity;
    }

    public void setProductionQuantity(String productionQuantity) {
        this.productionQuantity = productionQuantity;
    }

    @Override
    public String toString() {
        return
                "productionLabel= " + productionLabel +
                ", crop= " + crop +
                ", productionDate= " + productionDate +
                ", fieldName= " + fieldName +
                ", productionQuantity= " + productionQuantity ;
    }
}
