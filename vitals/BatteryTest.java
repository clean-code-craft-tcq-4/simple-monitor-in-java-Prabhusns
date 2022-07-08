package vitals;

public class BatteryTest {

	public static void testBattery() {
		BatteryChecker lowTempChecker = createBatteryInstance();
		BatteryChecker highTempChecker = createBatteryInstance();
		BatteryChecker lowSOCChecker = createBatteryInstance();
		BatteryChecker highSOCChecker = createBatteryInstance();
		BatteryChecker highCRChecker = createBatteryInstance();

		lowTempChecker
				.setInputPOJO(RangeValidator.constructRangePOJO(-2, Constants.tempLowLimit, Constants.tempUpLimit));
		highTempChecker
				.setInputPOJO(RangeValidator.constructRangePOJO(55, Constants.tempLowLimit, Constants.tempUpLimit));

		lowSOCChecker
				.setInputPOJO(RangeValidator.constructRangePOJO(10, Constants.tempLowLimit, Constants.tempUpLimit));
		highSOCChecker
				.setInputPOJO(RangeValidator.constructRangePOJO(98, Constants.tempLowLimit, Constants.tempUpLimit));

		highCRChecker.setInputPOJO(RangeValidator.constructRangePOJO(1, Constants.tempLowLimit, Constants.tempUpLimit));

		assert (lowTempChecker.checkBatteryCondition() == false);
		assert (highTempChecker.checkBatteryCondition() == false);

		assert (lowSOCChecker.checkBatteryCondition() == false);
		assert (highSOCChecker.checkBatteryCondition() == false);

		assert (highCRChecker.checkBatteryCondition() == false);

	}

	public static BatteryChecker createBatteryInstance() {
		return new BatteryChecker(new TemperatureChecker(), new SOCChecker(), new ChargeRateChecker());
	}

}
