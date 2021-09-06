package simple.fms.model;

public class Equipment {
    private String equipmentLabel;
    private String name;
    private String condition;
    private int quantity;

    public Equipment(String equipmentLabel, String name, String condition, int quantity) {
        this.equipmentLabel = equipmentLabel;
        this.name = name;
        this.condition = condition;
        this.quantity = quantity;
    }

    public Equipment() {

    }

    public String getEquipmentLabel() {
        return equipmentLabel;
    }

    public void setEquipmentLabel(String equipmentLabel) {
        this.equipmentLabel = equipmentLabel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "equipmentLabel='" + equipmentLabel + '\'' +
                ", name='" + name + '\'' +
                ", condition='" + condition + '\'' +
                ", quantity=" + quantity ;
    }
}
