package enums;

public enum MeasurementType {
    GRAM("GRAM"), KG("KG"), COUNT("COUNT");

    private String identifier;

    private MeasurementType(String identifier)
    {
        this.identifier = identifier;
    }

    public boolean c(String id)
    {
        return identifier.equals(id);
    }
}
