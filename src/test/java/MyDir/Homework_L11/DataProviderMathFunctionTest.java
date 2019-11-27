package MyDir.Homework_L11;

import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.testng.Assert;

public class ContactBook {
    @Test
    @FileParameters(value = "src/test/resources/resources.csv", mapper =  CsvWithHeaderMapper.class)

    public static void doSomethingTest(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, MathFunctions.multiply(argA, argB);
    }
}
