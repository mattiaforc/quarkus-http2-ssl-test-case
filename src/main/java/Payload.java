public class Payload {
    protected String field;
    protected String anotherField;

    public Payload() {}

    public Payload(String field, String anotherField) {
        this.field = field;
        this.anotherField = anotherField;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getAnotherField() {
        return anotherField;
    }

    public void setAnotherField(String anotherField) {
        this.anotherField = anotherField;
    }
}
