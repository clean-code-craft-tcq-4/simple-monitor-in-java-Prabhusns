package vitals.tests;

import vitals.BatteryChecker;
import vitals.RangeValidator;
import vitals.Unit;
import vitals.Utils.Constants;
import vitals.Utils.LanguageHelper;

public class BatteryTest {

	LanguageHelper languageUtils;

	public BatteryTest(LanguageHelper languageUtils) {
		this.languageUtils = languageUtils;
	}

	public static void testBattery(LanguageHelper languageUtils) {
		BatteryChecker lowTempChecker = createBatteryInstance(languageUtils);
		BatteryChecker highTempChecker = createBatteryInstance(languageUtils);
		BatteryChecker lowSOCChecker = createBatteryInstance(languageUtils);
		BatteryChecker highSOCChecker = createBatteryInstance(languageUtils);
		BatteryChecker highCRChecker = createBatteryInstance(languageUtils);
		BatteryChecker normalTempChecker = createBatteryInstance(languageUtils);
//
		lowTempChecker
				.setInputPOJO(RangeValidator.constructRangePOJO(-2, Constants.tempLowLimit, Constants.tempUpLimit));
		highTempChecker
				.setInputPOJO(RangeValidator.constructRangePOJO(55, Constants.tempLowLimit, Constants.tempUpLimit));

		lowSOCChecker.setInputPOJO(RangeValidator.constructRangePOJO(10, Constants.socLowLimit, Constants.socUpLimit));
		highSOCChecker.setInputPOJO(RangeValidator.constructRangePOJO(98, Constants.socLowLimit, Constants.socUpLimit));

		highCRChecker.setInputPOJO(RangeValidator.constructRangePOJO(1, Constants.crUpLimit, Constants.crUpLimit));

		normalTempChecker.setInputPOJO(
				RangeValidator.constructRangePOJO(35, Constants.tempLowLimit, Constants.tempUpLimit, Unit.FAHRENHEIT));

		 
		assert (lowTempChecker.checkBatteryCondition() == false);
		assert (highTempChecker.checkBatteryCondition() == false);

		assert (lowSOCChecker.checkBatteryCondition() == false);
		assert (highSOCChecker.checkBatteryCondition() == false);

		assert (highCRChecker.checkBatteryCondition() == false);

		assert (normalTempChecker.checkBatteryCondition() == false);


	}

	public static BatteryChecker createBatteryInstance(LanguageHelper languageUtils) {
		return new BatteryChecker(languageUtils);
	}

}
