import com.smu.mscda.CaptitalizeAndGenerateMDhex;
import org.junit.Assert;
import org.junit.Test;

public class TestCase {
    private final String inputString="smu";

    @Test
    public void testCapitalize() {
        Assert.assertEquals("Smu", CaptitalizeAndGenerateMDhex.Capitalize(inputString));
    }
    @Test
    public void testMd5() {
        Assert.assertEquals("3773300c2f413cc7136f8d74b305519c", CaptitalizeAndGenerateMDhex.HexConversion(inputString));
    }
}
