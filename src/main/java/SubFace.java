
public class SubFace {

    enum Color {
        WHITE, YELLOW, BLUE, GREEN, RED, ORANGE
    }

    private Color color;

    SubFace(Color color) {
        this.color = color;
    }

    Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubFace subFace = (SubFace) o;

        return color == subFace.color;

    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "SubFace{" +
                "color=" + color +
                '}';
    }
}
