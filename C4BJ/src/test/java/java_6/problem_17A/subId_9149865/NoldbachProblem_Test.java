package java_6.problem_17A.subId_9149865;

import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.Throwable;
import java.io.IOException;
import java.io.PrintStream;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Math.abs;
import static org.junit.Assert.assertTrue;

public class NoldbachProblem_Test {
    private static final Lock lock = new ReentrantLock();
    private java_6.problem_17A.subId_9149865.NoldbachProblem program;
    private String actualOutput;
    private ByteArrayOutputStream stdOut;
    String input;
    String expectedOutput;

    @BeforeClass
    public static void setUpClass() {
        Locale.setDefault(Locale.ROOT);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        stdOut = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() {
        stdOut = null;
    }

    
    @Test(timeout = 5000)
    public void test_000() throws Throwable {
        try {
            input = "27 2";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_001() throws Throwable {
        try {
            input = "45 7";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_002() throws Throwable {
        try {
            input = "2 0";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_003() throws Throwable {
        try {
            input = "15 1";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_004() throws Throwable {
        try {
            input = "17 1";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_005() throws Throwable {
        try {
            input = "34 5";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_006() throws Throwable {
        try {
            input = "37 4";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_007() throws Throwable {
        try {
            input = "43 5";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_008() throws Throwable {
        try {
            input = "47 7";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_009() throws Throwable {
        try {
            input = "50 5";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_010() throws Throwable {
        try {
            input = "57 6";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_011() throws Throwable {
        try {
            input = "60 8";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_012() throws Throwable {
        try {
            input = "62 7";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_013() throws Throwable {
        try {
            input = "76 9";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_014() throws Throwable {
        try {
            input = "69 7";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_015() throws Throwable {
        try {
            input = "113 10";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_016() throws Throwable {
        try {
            input = "141 11";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_017() throws Throwable {
        try {
            input = "207 16";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_018() throws Throwable {
        try {
            input = "231 18";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_019() throws Throwable {
        try {
            input = "296 19";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_020() throws Throwable {
        try {
            input = "332 20";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_021() throws Throwable {
        try {
            input = "378 24";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_022() throws Throwable {
        try {
            input = "428 23";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_023() throws Throwable {
        try {
            input = "497 27";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_024() throws Throwable {
        try {
            input = "640 32";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_025() throws Throwable {
        try {
            input = "798 35";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_026() throws Throwable {
        try {
            input = "802 35";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_027() throws Throwable {
        try {
            input = "864 40";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_028() throws Throwable {
        try {
            input = "953 44";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_029() throws Throwable {
        try {
            input = "995 44";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_030() throws Throwable {
        try {
            input = "1000 44";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_031() throws Throwable {
        try {
            input = "1000 0";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_032() throws Throwable {
        try {
            input = "1000 1000";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_033() throws Throwable {
        try {
            input = "2 1000";
            expectedOutput = "NO";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }


    @Test(timeout = 5000)
    public void test_034() throws Throwable {
        try {
            input = "2 0";
            expectedOutput = "YES";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_17A.subId_9149865.NoldbachProblem();

            if (stdOut.toString().isEmpty()) {
                program.main(new String[0]);
            }

            actualOutput = stdOut.toString().trim();
            TestUtils.assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
            lock.unlock();
        }
    }



}

class TestUtils {
    public static void assertEquals(String expected, String actual) {
        String[] expectedArray = expected.split("\\s+");
        String[] actualArray = actual.split("\\s+");

        assertTrue(expectedArray.length == actualArray.length);

        for (int i = 0; i < expectedArray.length; i++) {
            final int index = i;
            if (isNumeric(expectedArray[i]) && isNumeric(actualArray[i])) {
                double expectedNum = Double.parseDouble(expectedArray[i]);
                double actualNum = Double.parseDouble(actualArray[i]);
                // Tolerance can be adjusted
                double tolerance = 0.0001; // 4 decimal places tolerance
                assertTrue(abs(expectedNum - actualNum) < tolerance);
            } else {
                assertTrue(expectedArray[i].equals(actualArray[i]));
            }
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}