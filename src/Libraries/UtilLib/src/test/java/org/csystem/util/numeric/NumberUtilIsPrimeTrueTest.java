/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki çok büyük asal sayıları test için kullanabilirsiniz:
	6750161072220585911
	1603318868174368979
	6584583408148485263
	6245098347044246839
	6285871677077738093
	5697859706174583067
	710584055392819667
	4935060337471977161
	3728803592870153407
	4331452335614730577
	1386437196678024971
	1677990107453991593
	4765603950744460867
	4498306523077899307
	4434895834573449257
-----------------------------------------------------------------------------------------------------------------------*/
// NumberUtilIsPrimeTrueTest
package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested before and passed")
@RunWith(Parameterized.class)
public class NumberUtilIsPrimeTrueTest {

    public long input;

    @Parameterized.Parameters
    public static Collection<Long> createData()
    {
        return List.of(6285871677077738093L, 4434895834573449257L, 19L ,71L);
    }

    public NumberUtilIsPrimeTrueTest(long input) {
        this.input = input;
    }

    @Test
    public void test()
    {
        Assert.assertTrue(NumberUtil.isPrime(input));
    }
}
