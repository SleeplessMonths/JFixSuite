package java_6.problem_10C.subId_8996077;

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

public class Digit_Test {
    private static final Lock lock = new ReentrantLock();
    private java_6.problem_10C.subId_8996077.Digit program;
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
            input = "4";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "5";
            expectedOutput = "6";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "6";
            expectedOutput = "14";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "7";
            expectedOutput = "25";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "1";
            expectedOutput = "0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "8";
            expectedOutput = "40";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "10";
            expectedOutput = "82";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "15";
            expectedOutput = "328";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "16";
            expectedOutput = "395";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "20";
            expectedOutput = "801";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "50";
            expectedOutput = "13439";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "100";
            expectedOutput = "110267";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "127";
            expectedOutput = "226374";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "202";
            expectedOutput = "911772";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "333";
            expectedOutput = "4100905";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "404";
            expectedOutput = "7300516";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "411";
            expectedOutput = "7699373";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "571";
            expectedOutput = "20657840";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "600";
            expectedOutput = "23969924";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "771";
            expectedOutput = "50875182";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "10000";
            expectedOutput = "111107314481";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "20000";
            expectedOutput = "888859064010";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "30000";
            expectedOutput = "2999966359410";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "50000";
            expectedOutput = "13888610595721";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "99999";
            expectedOutput = "111107776644397";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "200000";
            expectedOutput = "888885923513074";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "400000";
            expectedOutput = "7111099254185938";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "600000";
            expectedOutput = "23999973325791164";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "800000";
            expectedOutput = "56888794064261806";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "1000000";
            expectedOutput = "111111074060178115";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "828282";
            expectedOutput = "63138169426585853";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "729761";
            expectedOutput = "43181611460546198";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "653451";
            expectedOutput = "31002458021265725";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "987572";
            expectedOutput = "107019643962508968";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "167590";
            expectedOutput = "522999083675296";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "358712";
            expectedOutput = "5128538168895562";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "498138";
            expectedOutput = "13734280958577573";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "983242";
            expectedOutput = "105618162572849728";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "312433";
            expectedOutput = "3388650642180089";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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
            input = "783472";
            expectedOutput = "53435215015075583";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_10C.subId_8996077.Digit();

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