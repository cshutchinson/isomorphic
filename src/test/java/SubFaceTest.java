import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SubFaceTest {

    SubFace testSubFace = new SubFace(SubFace.Color.WHITE);

    @Test
    public void aSubFaceIsCreated() {
        assertNotNull(testSubFace);
    }

    @Test
    public void subFaceIsCreatedWithCorrectColor(){
        assertThat(testSubFace.getColor(), is(SubFace.Color.WHITE));
    }
}
