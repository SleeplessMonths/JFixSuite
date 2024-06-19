package java_6.problem_42A.subId_199919;

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

public class Guilty_Test {
    private static final Lock lock = new ReentrantLock();
    private java_6.problem_42A.subId_199919.Guilty program;
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
            input = "1 100\n1\n40";
            expectedOutput = "40.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 100\n1 1\n25 30";
            expectedOutput = "50.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 100\n1 1\n60 60";
            expectedOutput = "100.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 100\n1 1\n50 50";
            expectedOutput = "100.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 100\n1 2\n33 66";
            expectedOutput = "99.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "3 10000\n1 1 1\n100 0 100";
            expectedOutput = "0.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "7 5100\n21 93 52 80 5 46 20\n79 37 74 54 22 15 90";
            expectedOutput = "103.3695652173913";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "10 2707\n80 91 41 99 99 48 81 25 80 17\n88 79 64 78 4 54 38 92 77 61";
            expectedOutput = "26.70707070707071";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "19 8111\n44 75 80 69 90 64 58 8 93 50 44 39 7 25 14 52 32 26 26\n38 57 38 23 73 24 4 49 0 34 96 93 14 26 29 89 54 12 24";
            expectedOutput = "0.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "5 1121\n14 37 91 35 71\n17 87 48 91 13";
            expectedOutput = "45.40845070422535";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "4 6054\n72 21 14 49\n43 53 42 55";
            expectedOutput = "93.16666666666666";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "6 8692\n20 61 56 4 78 76\n73 83 97 45 16 7";
            expectedOutput = "27.171052631578945";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "9 5583\n73 31 18 36 38 99 34 50 69\n48 24 75 78 75 69 13 74 3";
            expectedOutput = "19.478260869565215";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "1 5215\n24\n85";
            expectedOutput = "85.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "15 9559\n55 13 69 16 15 34 89 30 56 64 74 100 72 71 20\n40 73 29 12 31 5 59 5 90 13 32 75 99 7 44";
            expectedOutput = "76.70422535211266";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "13 2530\n83 59 19 69 8 81 99 74 14 75 61 13 36\n26 36 77 44 10 8 8 16 81 61 29 81 50";
            expectedOutput = "55.83838383838385";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "4 7672\n42 34 57 72\n56 7 24 24";
            expectedOutput = "42.205882352941174";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "17 6030\n100 77 5 87 28 50 51 64 45 79 60 80 49 20 25 91 64\n12 13 58 55 3 59 8 62 69 38 69 27 50 39 5 41 30";
            expectedOutput = "104.46428571428571";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "18 4842\n73 20 36 89 89 74 88 46 21 55 40 99 86 2 53 92 36 6\n24 97 23 27 31 63 29 2 23 84 86 44 68 8 63 0 50 16";
            expectedOutput = "0.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "8 2342\n7 91 9 17 86 22 49 53\n20 76 25 24 54 78 33 90";
            expectedOutput = "209.72093023255815";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "1 8987\n16\n38";
            expectedOutput = "38.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "10 9501\n39 67 33 71 89 69 5 90 7 48\n89 91 8 68 7 54 61 66 53 51";
            expectedOutput = "40.74157303370786";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "1 1966\n85\n99";
            expectedOutput = "99.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "9 7611\n58 46 28 18 29 70 62 22 55\n53 43 51 72 52 99 18 61 91";
            expectedOutput = "112.64516129032259";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "5 6739\n29 48 36 80 74\n22 37 36 54 88";
            expectedOutput = "180.22500000000002";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "9 35\n27 71 41 3 9 74 16 29 95\n95 69 20 41 41 22 10 92 58";
            expectedOutput = "35.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "13 5115\n13 51 17 24 52 4 33 4 94 17 54 82 77\n40 34 90 29 81 24 38 74 28 81 14 40 24";
            expectedOutput = "135.33333333333334";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "13 9049\n58 13 53 62 41 80 38 14 6 96 23 29 41\n42 24 20 12 63 82 33 93 3 31 68 10 24";
            expectedOutput = "107.2258064516129";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 775\n13 39\n76 35";
            expectedOutput = "46.66666666666667";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "7 8690\n73 93 32 47 80 82 97\n49 49 90 43 89 43 67";
            expectedOutput = "264.2926829268293";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "11 9698\n62 53 97 20 84 9 50 100 81 35 14\n18 19 39 30 26 56 41 43 24 32 28";
            expectedOutput = "175.6451612903226";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "6 1090\n1 1 44 63 35 64\n29 53 64 11 32 66";
            expectedOutput = "36.317460317460316";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "8 9291\n93 68 34 81 53 96 7 26\n23 64 15 47 94 66 90 92";
            expectedOutput = "113.26881720430106";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "16 1718\n42 68 96 52 47 31 89 5 87 70 25 69 35 86 86 11\n35 37 51 15 33 94 18 48 91 2 4 89 73 93 47 26";
            expectedOutput = "25.685714285714283";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "4 575\n24 23 16 64\n85 100 14 13";
            expectedOutput = "25.796875";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "9 423\n28 88 41 71 99 24 35 68 90\n7 76 44 27 64 52 92 81 98";
            expectedOutput = "136.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 1437\n66 58\n44 8";
            expectedOutput = "17.10344827586207";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "18 4733\n78 53 33 72 38 76 43 51 94 18 22 21 65 60 5 71 88 40\n5 78 50 43 81 44 10 18 23 51 52 31 10 55 63 46 82 92";
            expectedOutput = "59.48717948717948";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "16 7170\n17 1 48 51 28 16 41 14 59 93 25 76 46 69 74 41\n54 53 41 25 50 42 37 20 11 35 90 96 78 3 20 38";
            expectedOutput = "30.391304347826086";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "14 7455\n96 38 61 34 68 91 45 49 81 87 46 60 83 16\n38 4 99 16 99 40 68 84 18 56 16 81 21 21";
            expectedOutput = "89.99999999999999";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "1 9291\n97\n96";
            expectedOutput = "96.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "14 3615\n81 79 13 94 54 69 92 5 47 98 40 64 44 88\n52 73 7 12 29 40 46 47 60 66 63 68 71 4";
            expectedOutput = "39.45454545454545";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "18 6283\n50 78 16 38 44 9 23 54 58 82 59 12 69 1 10 6 77 61\n70 59 12 11 98 55 52 12 69 40 100 47 42 21 48 18 14 22";
            expectedOutput = "135.8181818181818";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "9 3269\n79 88 15 74 92 33 68 64 45\n55 84 75 50 68 32 41 82 42";
            expectedOutput = "336.44117647058823";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "6 1007\n93 23 35 15 25 6\n58 24 11 99 23 47";
            expectedOutput = "61.91428571428571";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "11 710\n2 49 56 33 79 69 64 62 64 9 87\n94 34 90 3 13 67 76 80 69 19 41";
            expectedOutput = "52.18181818181819";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "18 9292\n15 97 47 88 15 7 15 86 52 40 16 97 2 80 64 37 88 15\n39 47 94 12 34 17 45 39 98 99 19 8 94 50 87 68 31 6";
            expectedOutput = "71.01030927835052";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "11 3753\n78 75 17 65 97 36 79 56 97 62 43\n18 41 17 47 14 40 7 57 58 24 98";
            expectedOutput = "62.46835443037974";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "13 1407\n21 67 79 68 44 52 18 40 68 56 69 66 25\n26 39 78 93 1 57 58 5 67 49 96 15 16";
            expectedOutput = "15.295454545454545";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "20 1479\n69 30 15 62 81 24 5 16 25 65 47 23 62 51 87 50 6 44 88 61\n57 47 76 68 7 57 44 98 24 44 1 79 67 31 72 83 36 65 83 42";
            expectedOutput = "19.382978723404253";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "17 3856\n50 59 100 50 80 77 58 86 95 87 30 41 11 99 33 27 75\n47 47 39 62 58 91 55 18 65 47 8 97 31 80 61 87 66";
            expectedOutput = "221.4418604651163";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "9 2382\n84 51 95 66 34 77 96 9 57\n3 94 56 22 61 50 23 83 45";
            expectedOutput = "20.32142857142857";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "14 1751\n33 82 63 35 67 78 47 27 43 96 58 95 39 29\n42 7 15 83 95 91 60 3 85 39 7 56 39 4";
            expectedOutput = "67.60975609756098";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "6 8371\n34 11 24 95 62 32\n98 50 58 46 49 93";
            expectedOutput = "124.92631578947369";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 5181\n4 1\n6 33";
            expectedOutput = "7.5";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "9 632\n51 64 25 25 60 71 56 3 31\n70 28 76 84 86 33 77 11 69";
            expectedOutput = "168.875";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "3 2102\n76 15 85\n25 95 80";
            expectedOutput = "57.89473684210526";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "5 5005\n5 53 65 52 99\n21 49 9 3 66";
            expectedOutput = "15.807692307692308";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "17 8971\n54 62 7 47 48 70 78 96 91 34 84 23 72 75 72 60 21\n4 26 6 41 28 45 70 61 6 75 74 46 17 46 34 27 10";
            expectedOutput = "65.53846153846153";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "15 5527\n22 49 56 95 86 23 15 74 38 65 52 92 88 49 54\n33 61 71 95 69 31 30 0 1 93 66 48 65 92 11";
            expectedOutput = "0.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "20 3696\n87 22 21 83 95 31 28 96 71 25 56 40 70 79 46 87 19 19 34 25\n70 44 34 11 2 1 59 22 46 28 3 53 52 71 34 47 65 71 76 30";
            expectedOutput = "21.768421052631577";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "8 5540\n5 9 88 1 74 52 32 79\n17 48 99 33 68 28 2 58";
            expectedOutput = "21.25";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "15 303\n33 15 28 14 97 33 77 69 41 76 54 97 11 1 1\n83 70 63 11 71 10 48 65 5 5 82 2 6 79 19";
            expectedOutput = "13.340206185567009";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "10 9401\n4 53 39 66 52 42 65 39 1 76\n9 34 16 56 78 14 43 49 95 42";
            expectedOutput = "145.66666666666666";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 9083\n77 33\n22 22";
            expectedOutput = "31.42857142857143";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "16 8826\n29 21 40 93 48 49 43 96 60 68 66 5 96 49 84 44\n94 1 79 12 76 65 99 53 37 39 3 76 15 81 51 91";
            expectedOutput = "40.5";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "4 9426\n95 48 98 92\n65 40 43 90";
            expectedOutput = "146.1122448979592";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "13 175\n46 77 14 16 84 80 81 36 71 13 87 69 8\n54 46 69 59 30 72 83 97 83 96 43 94 84";
            expectedOutput = "175.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "13 5023\n11 30 92 40 26 77 33 94 71 2 70 97 50\n32 46 51 14 63 76 34 19 13 34 40 91 23";
            expectedOutput = "126.88732394366197";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "18 9978\n26 3 87 84 97 53 70 97 37 57 78 23 34 40 81 62 21 92\n56 73 0 79 93 14 17 80 0 20 3 81 22 71 7 82 71 81";
            expectedOutput = "0.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "14 8481\n64 2 90 76 49 30 88 32 98 64 20 85 40 35\n55 84 75 43 36 13 67 75 100 19 22 7 5 58";
            expectedOutput = "63.65882352941177";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "2 1674\n77 23\n23 25";
            expectedOutput = "29.87012987012987";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
            input = "10 2112\n45 11 32 14 82 30 34 11 42 56\n18 9 84 99 82 43 61 84 14 70";
            expectedOutput = "119.0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
    public void test_073() throws Throwable {
        try {
            input = "6 2006\n62 4 3 71 61 10\n37 45 61 84 24 15";
            expectedOutput = "83.01639344262294";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
    public void test_074() throws Throwable {
        try {
            input = "8 3954\n80 77 64 1 50 21 89 26\n30 82 17 20 67 21 31 99";
            expectedOutput = "108.375";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
    public void test_075() throws Throwable {
        try {
            input = "18 7253\n64 77 92 9 32 66 23 34 10 71 8 7 83 9 52 97 29 65\n46 90 65 43 44 63 7 38 38 20 62 9 53 39 17 13 5 90";
            expectedOutput = "110.96907216494844";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
    public void test_076() throws Throwable {
        try {
            input = "4 4384\n42 41 85 79\n29 67 52 55";
            expectedOutput = "151.1058823529412";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
    public void test_077() throws Throwable {
        try {
            input = "7 529\n77 18 67 64 43 51 30\n35 87 17 52 1 97 84";
            expectedOutput = "8.139534883720929";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
    public void test_078() throws Throwable {
        try {
            input = "16 2915\n39 39 81 44 23 47 43 56 7 38 10 100 5 34 87 14\n10 96 34 20 62 88 46 38 29 35 2 43 26 55 31 63";
            expectedOutput = "133.4";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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
    public void test_079() throws Throwable {
        try {
            input = "14 6488\n53 41 36 28 17 15 63 33 75 40 85 88 90 100\n7 35 83 2 48 76 93 2 69 56 59 7 25 24";
            expectedOutput = "46.30303030303031";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_42A.subId_199919.Guilty();

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