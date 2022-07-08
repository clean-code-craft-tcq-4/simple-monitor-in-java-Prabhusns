package vitals;

public class BatteryChecker {

	TemperatureChecker tempChecker;
	SOCChecker socChecker;
	ChargeRateChecker chargeRateChecker;
	RangeInputPOJO inputPOJO;

	public RangeInputPOJO getInputPOJO() {
		return inputPOJO;
	}

	public void setInputPOJO(RangeInputPOJO inputPOJO) {
		this.inputPOJO = inputPOJO;
	}

	public BatteryChecker(TemperatureChecker tempChecker, SOCChecker socChecker, ChargeRateChecker chargeRateChecker) {
		super();
		this.tempChecker = tempChecker;
		this.socChecker = socChecker;
		this.chargeRateChecker = chargeRateChecker;
	}

	public boolean checkBatteryCondition() {
		if (inputPOJO != null) {
			if (tempChecker.validateRange(inputPOJO) && socChecker.validateRange(inputPOJO)
					&& chargeRateChecker.validateRange(inputPOJO)) {
				System.out.println("Battery is Okay");
				return true;
			}
			System.out.println("Battery is not Okay");
			return false;
		}
		System.out.println("Input value is not passed");
		return false;

	}

}
