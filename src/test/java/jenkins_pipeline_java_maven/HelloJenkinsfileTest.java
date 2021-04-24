import static org.junit.Assert.*;

import org.junit.Test;

import com.xyz.HelloJenkinsfile;

public class HelloJenkinsfileTest {

	@Test
	public void test() {
		assertEquals("HelloJenkinsfile", new HelloJenkinsfile().go());
	}

         @Test
        public void test2() {
                assertEquals("HelloJenkinsfile", new HelloJenkinsfile().go());
       }
}
