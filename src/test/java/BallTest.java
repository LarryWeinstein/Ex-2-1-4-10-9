import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {
    //TODO:  Convert TestMain to JUnit
    @Test
    public void testBall(){
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals("Ball[(1.1,2.2),speed=(3.3,4.4)]", ball.toString());
    }

}