package Test_smth;

import org.junit.*;

public class MyTestCase {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }


    @Before
    public void before() {
        System.out.println("before");
    }


    @Test
    public void testCase1() {
        System.out.println("testCase1");
    }

    @Test
    public void testCase2() {
        System.out.println("testCase2");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }
}
