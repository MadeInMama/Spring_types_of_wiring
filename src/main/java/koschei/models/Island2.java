package koschei.models;

public class Island2 {
    private final Oak3 wood;

    public Island2(Oak3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
