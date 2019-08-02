package sea_fight;

public class User {
    private Field userField;
    private Field visibleField;

    public User(Field userField) {
        this.userField = userField;
        visibleField = new Field();
    }

    public Field getUserField() {
        return userField;
    }

    public Field getVisibleField() {
        return visibleField;
    }
}
