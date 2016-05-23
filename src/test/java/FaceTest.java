import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class FaceTest {

    private Face testFace = new Face(3, Face.Position.TOP, SubFace.Color.WHITE);

    @Test
    public void aFaceShouldReturnATwoDimensionalArrayOfSubFaces(){
        // should have a two dimensional array property
        assertEquals(testFace.length(), 9);
    }

    @Test
    public void faceHasNineSubFacesInA3By3Matrix() {
        //Face should have nine subfaces arranged in 2D array
        assertEquals(testFace.length(), 9);
    }

    @Test
    public void faceIsAssignedATopPosition() {
        assertEquals(testFace.getPosition(), Face.Position.TOP);
    }

    @Test
    public void aFaceCanConfigureSubFaces(){
        // set all subFaces of a face to blue
        for(SubFace[] x : testFace.getFace()){
            for(SubFace y : x){
                y.setColor(SubFace.Color.BLUE);
            }
        }
        assertEquals(testFace.getFace()[0][0].getColor(), SubFace.Color.BLUE);
    }

    @Test
    public void aFaceCanSetASingleSubFace(){
        testFace.setSubFace(0, 0, SubFace.Color.RED);
        assertEquals(testFace.getFace()[0][0].getColor(), SubFace.Color.RED);

    }

    @Test
    public void aFaceCanReturnOneOfItsRows(){
        Face multiColoredFace = new Face(3, Face.Position.TOP, SubFace.Color.WHITE);
        multiColoredFace.setSubFace(0,0, SubFace.Color.RED);
        multiColoredFace.setSubFace(0,2, SubFace.Color.BLUE);

        SubFace[] comparison = new SubFace[3];
        comparison[0] = new SubFace(SubFace.Color.RED);
        comparison[1] = new SubFace(SubFace.Color.WHITE);
        comparison[2] = new SubFace(SubFace.Color.BLUE);

        assertArrayEquals(comparison, multiColoredFace.getFaceRow(0));
    }

    @Test
    public void aFaceCanReturnOneOfItsColumns(){
        Face testFace = new Face(3, Face.Position.RIGHT, SubFace.Color.GREEN);
        testFace.setSubFace(0, 2, SubFace.Color.YELLOW);
        testFace.setSubFace(2, 2, SubFace.Color.ORANGE);

        SubFace[] comparison = new SubFace[3];
        comparison[0] = new SubFace(SubFace.Color.YELLOW);
        comparison[1] = new SubFace(SubFace.Color.GREEN);
        comparison[2] = new SubFace(SubFace.Color.ORANGE);

        assertArrayEquals(comparison, testFace.getFaceColumn(2));
    }

    @Test
    public void aFaceCanReverseARow(){
        Face testFace = new Face(3, Face.Position.TOP, SubFace.Color.WHITE);
        testFace.setSubFace(0,0, SubFace.Color.RED);
        testFace.setSubFace(0,2, SubFace.Color.BLUE);

        SubFace[] comparison = new SubFace[3];
        comparison[0] = new SubFace(SubFace.Color.BLUE);
        comparison[1] = new SubFace(SubFace.Color.WHITE);
        comparison[2] = new SubFace(SubFace.Color.RED);

        assertArrayEquals(comparison, testFace.reverseRow(0));
    }

    @Test
    public void aFaceCanReverseAColumn(){
        Face testFace = new Face(3, Face.Position.BACK, SubFace.Color.GREEN);
        testFace.setSubFace(0, 2, SubFace.Color.YELLOW);
        testFace.setSubFace(2, 2, SubFace.Color.ORANGE);

        SubFace[] comparison = new SubFace[3];
        comparison[0] = new SubFace(SubFace.Color.ORANGE);
        comparison[1] = new SubFace(SubFace.Color.GREEN);
        comparison[2] = new SubFace(SubFace.Color.YELLOW);

        assertArrayEquals(comparison, testFace.reverseColumn(2));
    }

    @Test
    public void aFaceCanSetASubFaceRow(){
        Face testFace = new Face(3, Face.Position.LEFT, SubFace.Color.BLUE);

        Face modifiedFace = new Face(3, Face.Position.LEFT, SubFace.Color.BLUE);
        modifiedFace.setSubFace(0, 0, SubFace.Color.WHITE);
        modifiedFace.setSubFace(0, 1, SubFace.Color.WHITE);
        modifiedFace.setSubFace(0, 2, SubFace.Color.WHITE);

        SubFace[] newRow = new SubFace[3];
        newRow[0] = new SubFace(SubFace.Color.WHITE);
        newRow[1] = new SubFace(SubFace.Color.WHITE);
        newRow[2] = new SubFace(SubFace.Color.WHITE);

        assertArrayEquals(modifiedFace.getFace(), testFace.setSubFaceRow(0, newRow));
    }

    @Test
    public void aFaceCanSetASubFaceColumn(){
        Face testFace = new Face(3, Face.Position.BOTTOM, SubFace.Color.RED);

        Face modifiedFace = new Face(3, Face.Position.LEFT, SubFace.Color.RED);
        modifiedFace.setSubFace(0, 0, SubFace.Color.WHITE);
        modifiedFace.setSubFace(1, 0, SubFace.Color.WHITE);
        modifiedFace.setSubFace(2, 0, SubFace.Color.WHITE);

        SubFace[] newRow = new SubFace[3];
        newRow[0] = new SubFace(SubFace.Color.WHITE);
        newRow[1] = new SubFace(SubFace.Color.WHITE);
        newRow[2] = new SubFace(SubFace.Color.WHITE);

        assertArrayEquals(modifiedFace.getFace(), testFace.setSubFaceColumn(0, newRow));
    }
}
