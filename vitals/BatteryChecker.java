package vitals;

import vitals.Utils.LanguageHelper;
import vitals.model.RangeInputPOJO;

public class BatteryChecker {

	TemperatureChecker tempChecker;
	SOCChecker socChecker;
	ChargeRateChecker chargeRateChecker;
	RangeInputPOJO inputPOJO;
	boolean isTempOk = false;
	boolean isCROk = false;
	boolean isSOCOk = false;

	public RangeInputPOJO getInputPOJO() {
		return inputPOJO;
	}

	public void setInputPOJO(RangeInputPOJO inputPOJO) {
		this.inputPOJO = inputPOJO;
	}

	public BatteryChecker(LanguageHelper languageUtils) {
		super();
		this.tempChecker = new TemperatureChecker(languageUtils);
		this.socChecker = new SOCChecker(languageUtils);
		this.chargeRateChecker = new ChargeRateChecker(languageUtils);
	}

	public boolean checkBatteryCondition() {
		isTempOk = tempChecker.validateRange(inputPOJO);
		isSOCOk = socChecker.validateRange(inputPOJO);
		isCROk = chargeRateChecker.validateRange(inputPOJO);
		return checkBattery();
	}

	public boolean checkBattery() {
		if (isTempOk && isCROk && isSOCOk) {
			System.out.println("Battery is Okay");
			return true;
		}
		System.out.println("Battery is not Okay");
		return false;
	}

}
