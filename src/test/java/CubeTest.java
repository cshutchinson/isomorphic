import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CubeTest {

    @Test
    public void aCubeShouldHaveSixFaces(){
        Cube testCube = new Cube();
        assertEquals(testCube.getCube().length, 6);
    }

    @Test
    public void eachCubeFaceShouldHaveAUniqueMiddleColor(){
        Cube testCube = new Cube();
        HashSet<SubFace.Color> faceColor = new HashSet<>();
        for (int x=0; x<testCube.getCube().length; x++){
            faceColor.add((testCube.getCube()[x].getColor()));
        }
        assertEquals(faceColor.size(), 6);
    }

    @Test
    public void aCubeCanRotateAFaceClockwise(){
        Cube testCube = new Cube();
        Cube result = new Cube();

        

        testCube.rotate(Face.Position.TOP);



    }

    @Test
    public void aCubeCanRotateAFaceCounterClockwise(){

    }

    @Test
    public void aCubeGivenATextInputRotatesAFaceInAppropriateDirection(){

    }

}
