package vitals;

public class RangeTest {

	public static void testRanges() {

		assert (RangeValidator.rangeValidator.validateRange(RangeValidator.constructRangePOJO(25,
				Constants.tempLowLimit, Constants.tempUpLimit, Constants.tempStr, true)));

		assert (RangeValidator.rangeValidator.validateRange(RangeValidator.constructRangePOJO(50,
				Constants.tempLowLimit, Constants.tempUpLimit, Constants.tempStr, true)) == false);

		assert (RangeValidator.rangeValidator.validateRange(RangeValidator.constructRangePOJO(50, Constants.socLowLimit,
				Constants.socUpLimit, Constants.socStr, true)));

		assert (RangeValidator.rangeValidator.validateRange(RangeValidator.constructRangePOJO(89, Constants.socLowLimit,
				Constants.socUpLimit, Constants.socStr, true)) == false);

		assert (RangeValidator.rangeValidator.validateRange(
				RangeValidator.constructRangePOJO(0.7f, 0f, Constants.crUpLimit, Constants.crStr, false)));

		assert (RangeValidator.rangeValidator.validateRange(
				RangeValidator.constructRangePOJO(0.9f, 0f, Constants.crUpLimit, Constants.crStr, false)) == false);

	}

}
