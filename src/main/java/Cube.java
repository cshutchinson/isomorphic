
public class Cube {

    Face[] cube;

    public Cube() {
        cube = new Face[6];
        cube[0] = new Face(3, Face.Position.BACK, SubFace.Color.ORANGE);
        cube[1] = new Face(3, Face.Position.LEFT, SubFace.Color.GREEN);
        cube[2] = new Face(3, Face.Position.TOP, SubFace.Color.WHITE);
        cube[3] = new Face(3, Face.Position.RIGHT, SubFace.Color.BLUE);
        cube[4] = new Face(3, Face.Position.FRONT, SubFace.Color.RED);
        cube[5] = new Face(3, Face.Position.BOTTOM, SubFace.Color.YELLOW);
    }

    public Face[] getCube() {
        return cube;
    }

    public Face [] rotate(Face.Position position){
        return cube;
    }

}
