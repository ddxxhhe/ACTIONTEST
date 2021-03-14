import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Word Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>3�� 14, 2021</pre>
 */
public class WordTest {

    @Before
    public void before() throws Exception {
        System.out.println("before method");
    }

    @After
    public void after() throws Exception {
        System.out.println("after method");
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: sortWord(String sen)
     */
    @Test
    public void testSortWord() throws Exception {
        int result1 = Word.sortWord("it Ain't me");
        int result2 = Word.sortWord("aa o o o  e");
        Assert.assertEquals(4, result1);
        Assert.assertEquals(5, result2);
    }


} 
