package java_6.problem_23A.subId_5687663;

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
    private java_6.problem_23A.subId_5687663.Main program;
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
            input = "abcd";
            expectedOutput = "0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ababa";
            expectedOutput = "3";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "zzz";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "kmmm";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "wzznz";
            expectedOutput = "1";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "qlzazaaqll";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "lzggglgpep";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "iegdlraaidefgegiagrdfhihe";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "esxpqmdrtidgtkxojuxyrcwxlycywtzbjzpxvbngnlepgzcaeg";
            expectedOutput = "1";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "garvpaimjdjiivamusjdwfcaoswuhxyyxvrxzajoyihggvuxumaadycfphrzbprraicvjjlsdhojihaw";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ckvfndqgkmhcyojaqgdkenmbexufryhqejdhctxujmtrwkpbqxufxamgoeigzfyzbhevpbkvviwntdhqscvkmphnkkljizndnbjt";
            expectedOutput = "3";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
            expectedOutput = "99";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ikiikiikikiiikkkkkikkkkiiiiikkiiikkiikiikkkkikkkikikkikiiikkikikiiikikkkiiikkkikkikkikkkkiiikkiiiiii";
            expectedOutput = "10";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ovovhoovvhohhhvhhvhhvhovoohovhhoooooovohvooooohvvoooohvvovhhvhovhhvoovhvhvoovovvhooovhhooovohvhhovhv";
            expectedOutput = "8";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ccwckkkycccccckwckwkwkwkkkkyycykcccycyckwywcckwykcycykkkwcycwwcykcwkwkwwykwkwcykywwwyyykckkyycckwcwk";
            expectedOutput = "5";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ttketfkefktfztezzkzfkkeetkkfktftzktezekkeezkeeetteeteefetefkzzzetekfftkeffzkktffzkzzeftfeezfefzffeef";
            expectedOutput = "4";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "rtharczpfznrgdnkltchafduydgbgkdjqrmjqyfmpwjwphrtsjbmswkanjlprbnduaqbcjqxlxmkspkhkcnzbqwxonzxxdmoigti";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "fplrkfklvwdeiynbjgaypekambmbjfnoknlhczhkdmljicookdywdgpnlnqlpunnkebnikgcgcjefeqhknvlynmvjcegvcdgvvdb";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "txbciieycswqpniwvzipwlottivvnfsysgzvzxwbctcchfpvlbcjikdofhpvsknptpjdbxemtmjcimetkemdbettqnbvzzbdyxxb";
            expectedOutput = "2";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "fmubmfwefikoxtqvmaavwjxmoqltapexkqxcsztpezfcltqavuicefxovuswmqimuikoppgqpiapqutkczgcvxzutavkujxvpklv";
            expectedOutput = "3";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ipsrjylhpkjvlzncfixipstwcicxqygqcfrawpzzvckoveyqhathglblhpkjvlzncfixipfajaqobtzvthmhgbuawoxoknirclxg";
            expectedOutput = "15";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "kcnjsntjzcbgzjscrsrjkrbytqsrptzspzctjrorsyggrtkcnjsntjzcbgzjscrsrjyqbrtpcgqirsrrjbbbrnyqstnrozcoztt";
            expectedOutput = "20";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "unhcfnrhsqetuerjqcetrhlsqgfnqfntvkgxsscquolxxroqgtchffyccetrhlsqgfnqfntvkgxsscquolxxroqgtchffhfqvx";
            expectedOutput = "37";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "kkcckkccckkcckcccckcckkkkcckkkkckkkcckckkkkkckkkkkcckkccckkcckcccckcckkkkcckkkkckkkcckckkkkkckckckkc";
            expectedOutput = "46";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "mlhsyijxeydqxhtkmpdeqwzogjvxahmssyhfhqessbxzvydbrxdmlhsyijxeydqxhtkmpdeqwzogjvxahmssyhfhqessbxzvydik";
            expectedOutput = "47";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "abcdefghijklmnopqrstuvwxyz";
            expectedOutput = "0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "tttttbttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttmttttttt";
            expectedOutput = "85";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffbfffffffffffffffffffffffffffffffffffff";
            expectedOutput = "61";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "cccccccccccccccccccccccwcccccccccccccccccccccuccccccccccccccnccccccccccccccccccccccccccccccccccccccc";
            expectedOutput = "38";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ffffffffffffffffffffffffffufffgfffffffffffffffffffffffffffffffffffffffgffffffftffffffgffffffffffffff";
            expectedOutput = "38";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "rrrrrrrrrrrrrrrrrrrlhbrrrrrrrrurrrrrrrfrrqrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrewrrrrrrryrrxrrrrrrrrrrr";
            expectedOutput = "33";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "vyvvvvvvvvzvvvvvzvvvwvvvvrvvvvvvvvvvvvvvvrvvvvvvvvvpkvvpvgvvvvvvvvvvvvvgvvvvvvvvvvvvvvvvvvysvvvbvvvv";
            expectedOutput = "17";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "cbubbbbbbbbbbfbbbbbbbbjbobbbbbbbbbbibbubbbbjbbbnzgbbzbbfbbbbbbbbbbbfbpbbbbbbbbbbygbbbgbabbbbbbbhibbb";
            expectedOutput = "12";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "lrqrrrrrrrjrrrrrcdrrgrrmwvrrrrrrrrrxfzrmrmrryrrrurrrdrrrrrrrrrrererrrsrrrrrrrrrrrqrrrrcrrwjsrrlrrrrr";
            expectedOutput = "10";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "ssssusisisosscssssztzessssyspskjssvosiissussszsosssslsssdsssvssvsssslsssmsfjasjsssssowscsjsssszsspss";
            expectedOutput = "8";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "uukuuuumueuuuujuukgdhbztuuuubbguuocuozfaunqufjujuguyuuvkuuauubuubuucuvtjuuuuuusduduuuuuuuueunuuuuuzu";
            expectedOutput = "7";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "jpkkgwklngwqcfzmwkkpcwkkkkkekkkekkkdsykqwjkkkhkkkxdnukkkkkkmkqykkkxqklkskkrkkkkkqqjikkkkkkpknkkkkkoh";
            expectedOutput = "7";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "bmzbbfbbhqxwthtbbisbbbbbtbbfbbpbfbbpbkbjfbcbbbbzbbbdwmbbbrnvqdbbtbbuglrnbbbbvmbyblebbabibrevaxbbjbqb";
            expectedOutput = "6";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "qqqmqqqsbteqqopsuqiqumrqzpqnqgqeniqqkyqqyqqqpxzqeqqquhdqquhqqqfqjirqaqqaquxqoqqjqqqqbjbgqcqqqqicnkqc";
            expectedOutput = "4";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasaaaavaaaaaaauaaeaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            expectedOutput = "44";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "a";
            expectedOutput = "0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "fg";
            expectedOutput = "0";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "yy";
            expectedOutput = "1";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "abcabcabc";
            expectedOutput = "6";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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
            input = "qwerqwedqwes";
            expectedOutput = "3";

            lock.lock();
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(stdOut));

            program = new java_6.problem_23A.subId_5687663.Main();

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