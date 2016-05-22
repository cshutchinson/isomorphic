import java.util.Arrays;
import java.util.Collections;

public class Face {

    private SubFace[][] face;
    private Position position;
    private SubFace.Color color;
    private Integer dimension;

    enum Position {TOP, RIGHT, LEFT, FRONT, BACK, BOTTOM}
    Face (Integer dimension, Position position, SubFace.Color color){
        this.face = new SubFace[dimension][dimension];
        this.position = position;
        this.color = color;
        this.dimension = dimension;
        for (int x=0; x<dimension; x++){
            for (int y=0; y<dimension; y++){
                face[y][x] = new SubFace(color);
            }
        }
    }

    public SubFace[][] getFace() {
        return face;
    }

    public Position getPosition() {
        return position;
    }

    public SubFace.Color getColor() {
        return color;
    }

    public int length(){
        int count = 0;
        for(SubFace[] x : face){
            count += x.length;
        }
        return count;
    }

    public SubFace[][] setSubFace(Integer row, Integer column, SubFace.Color color){
        this.face[row][column].setColor(color);
        return face;
    }

    public SubFace[] getFaceRow(Integer row){
        return this.face[row];
    }

    public SubFace[] getFaceColumn(Integer column){
        SubFace[] newColumn = new SubFace[dimension];
        for (int i=0; i<dimension; i++){
            newColumn[i]=this.face[i][column];
        }
        return newColumn;
    }

    public SubFace[] reverseRow(Integer row){
        SubFace[] current = this.getFaceRow(row);
        SubFace[] newRow = new SubFace[current.length];
        for(int i=0; i<current.length; i++){
            newRow[i]=current[current.length-i-1];
        }
        return newRow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Face face1 = (Face) o;

        if (!Arrays.deepEquals(face, face1.face)) return false;
        if (position != face1.position) return false;
        if (color != face1.color) return false;
        return dimension != null ? dimension.equals(face1.dimension) : face1.dimension == null;

    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(face);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (dimension != null ? dimension.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Face{" +
                "face=" + Arrays.toString(face) +
                ", position=" + position +
                ", color=" + color +
                ", dimension=" + dimension +
                '}';
    }
}
