import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CubeTest {

    private Cube testCube = new Cube();

    @Test
    public void aCubeShouldHaveSixFaces(){
        assertEquals(testCube.getCube().length, 6);
    }

    @Test
    public void eachCubeFaceShouldHaveAUniqueMiddleColor(){
        HashSet<SubFace.Color> faceColor = new HashSet<>();
        for (int x=0; x<testCube.getCube().length; x++){
            faceColor.add((testCube.getCube()[x].getColor()));
        }
        assertEquals(faceColor.size(), 6);
    }

    @Test
    public void aCubeCanRotateAFaceClockwise(){

    }

    @Test
    public void aCubeCanRotateAFaceCounterClockwise(){

    }

    @Test
    public void aCubeGivenATextInputRotatesAFaceInAppropriateDirection(){

    }

    @Test
    public void aCubeCanReverseARow(){
        Face testFace = testCube.getCube()[0];

    }

}
