package java_6.problem_40C.subId_1979122;

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

public class Main_Test {
    private static final Lock lock = new ReentrantLock();
    private java_6.problem_40C.subId_1979122.Main program;
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
            input = "1 0 1 1";
            expectedOutput = "4";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "1 0 1 2";
            expectedOutput = "3";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "3 3 4 7";
            expectedOutput = "17";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "2 2 2 3";
            expectedOutput = "8";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "1 100000 1 99999";
            expectedOutput = "4";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "4 7 3 3";
            expectedOutput = "17";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "1 0 1 100";
            expectedOutput = "3";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "1 0 2 3";
            expectedOutput = "4";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "2 2 4 4";
            expectedOutput = "13";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "4 4 2 2";
            expectedOutput = "13";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "1 -1 5 -10";
            expectedOutput = "7";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "5 2 1 -5";
            expectedOutput = "7";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "5 4 3 -2";
            expectedOutput = "13";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "3 7 4 1";
            expectedOutput = "9";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "3 -9 3 4";
            expectedOutput = "7";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "2 -6 4 6";
            expectedOutput = "7";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "2 -4 1 9";
            expectedOutput = "4";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "2 1 4 -7";
            expectedOutput = "7";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "2 4 5 -4";
            expectedOutput = "8";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "5 7 1 2";
            expectedOutput = "8";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "94925 5648 96389 1799";
            expectedOutput = "1426155172";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "94244 7010 97753 -7757";
            expectedOutput = "5003962985";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "93564 8371 99118 6409";
            expectedOutput = "726598901";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "91805 9733 90481 574";
            expectedOutput = "3085718448";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "91125 7374 92925 -5261";
            expectedOutput = "4168799096";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "90444 8736 94289 8904";
            expectedOutput = "60725934";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "99765 -9904 95654 3069";
            expectedOutput = "4548570813";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "99085 7738 98097 -6487";
            expectedOutput = "5001828332";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "98405 9100 99461 7679";
            expectedOutput = "555165156";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "94427 1396 92968 9890";
            expectedOutput = "2964910460";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "93430 5720 93581 -2371";
            expectedOutput = "2829812541";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "92433 -9956 95272 5368";
            expectedOutput = "5040278640";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "91436 -5631 96964 -3172";
            expectedOutput = "887279122";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "90438 -5027 97577 4568";
            expectedOutput = "3280869645";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
            input = "99442 -702 99268 -7694";
            expectedOutput = "2632080157";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_035() throws Throwable {
        try {
            input = "98445 3623 99881 46";
            expectedOutput = "1378384476";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_036() throws Throwable {
        try {
            input = "97448 7948 91572 7786";
            expectedOutput = "59292207";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_037() throws Throwable {
        try {
            input = "97530 -7728 92184 -755";
            expectedOutput = "2471317488";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_038() throws Throwable {
        try {
            input = "96533 -7124 93876 6985";
            expectedOutput = "4768738089";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_039() throws Throwable {
        try {
            input = "95017 -8444 95084 7736";
            expectedOutput = "5366319032";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_040() throws Throwable {
        try {
            input = "100000 -100000 100000 100000";
            expectedOutput = "200001";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_041() throws Throwable {
        try {
            input = "100000 100000 100000 -100000";
            expectedOutput = "200001";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_042() throws Throwable {
        try {
            input = "99999 100000 100000 -100000";
            expectedOutput = "200000";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_043() throws Throwable {
        try {
            input = "94925 -69793 96389 -40126";
            expectedOutput = "8708948248";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_044() throws Throwable {
        try {
            input = "94244 -37156 97753 -9638";
            expectedOutput = "8282767876";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_045() throws Throwable {
        try {
            input = "93564 -4520 99118 -52061";
            expectedOutput = "11509398048";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_046() throws Throwable {
        try {
            input = "91805 28117 90481 -94484";
            expectedOutput = "3562481512";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_047() throws Throwable {
        try {
            input = "91125 -66336 92925 63094";
            expectedOutput = "2983528451";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_048() throws Throwable {
        try {
            input = "90444 -33699 94289 20670";
            expectedOutput = "11204857185";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_049() throws Throwable {
        try {
            input = "99765 -1063 95654 -21753";
            expectedOutput = "6785350980";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_050() throws Throwable {
        try {
            input = "99085 -95516 98097 8735";
            expectedOutput = "8636367944";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_051() throws Throwable {
        try {
            input = "98405 -62879 99461 -33688";
            expectedOutput = "8994412616";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_052() throws Throwable {
        try {
            input = "94427 90088 92968 -81169";
            expectedOutput = "260622440";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_053() throws Throwable {
        try {
            input = "93430 32810 93581 -71470";
            expectedOutput = "6844605373";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_054() throws Throwable {
        try {
            input = "92433 -24467 95272 -61772";
            expectedOutput = "9821695665";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_055() throws Throwable {
        try {
            input = "91436 -81744 96964 75017";
            expectedOutput = "1001214722";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_056() throws Throwable {
        try {
            input = "90438 -66110 97577 84716";
            expectedOutput = "1383209737";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_057() throws Throwable {
        try {
            input = "99442 76614 99268 94414";
            expectedOutput = "6123561325";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_058() throws Throwable {
        try {
            input = "98445 19337 99881 -95888";
            expectedOutput = "6905974528";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_059() throws Throwable {
        try {
            input = "97448 -37940 91572 -86189";
            expectedOutput = "11221723080";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_060() throws Throwable {
        try {
            input = "1 0 100000 1";
            expectedOutput = "100003";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_061() throws Throwable {
        try {
            input = "100000 0 100000 1";
            expectedOutput = "400000";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_062() throws Throwable {
        try {
            input = "100000 0 100000 -1";
            expectedOutput = "400000";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_063() throws Throwable {
        try {
            input = "1 -100000 1 100000";
            expectedOutput = "3";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_064() throws Throwable {
        try {
            input = "1 2 2 1";
            expectedOutput = "5";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_065() throws Throwable {
        try {
            input = "1 3 3 1";
            expectedOutput = "6";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_066() throws Throwable {
        try {
            input = "5 5 10 10";
            expectedOutput = "61";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_067() throws Throwable {
        try {
            input = "10 -10 5 -5";
            expectedOutput = "61";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_068() throws Throwable {
        try {
            input = "100000 100000 100000 99999";
            expectedOutput = "400000";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_069() throws Throwable {
        try {
            input = "100000 50000 100000 -50000";
            expectedOutput = "10000200001";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_070() throws Throwable {
        try {
            input = "100000 99999 88888 77777";
            expectedOutput = "6790054321";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_071() throws Throwable {
        try {
            input = "100000 100 100000 70000";
            expectedOutput = "13302109801";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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
    public void test_072() throws Throwable {
        try {
            input = "100000 0 100000 100000";
            expectedOutput = "10000200001";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_40C.subId_1979122.Main();

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