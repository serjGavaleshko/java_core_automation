package EasyTests;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionTest {
    @Test
    @FileParameters(value = "src/test/java/resources/resources.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.multiply(argA, argB));
    }

    static class MathFunctions {
        static int multiply(int a, int b){
            return a*b;
        }
    }
}