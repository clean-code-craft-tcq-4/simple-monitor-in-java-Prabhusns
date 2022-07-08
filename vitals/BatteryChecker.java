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

	public BatteryChecker() {
		super();
		this.tempChecker = new TemperatureChecker();
		this.socChecker = new SOCChecker();
		this.chargeRateChecker = new ChargeRateChecker();
	}

	public boolean checkBatteryCondition() {
		boolean isTempOk = tempChecker.validateRange(inputPOJO);
		boolean isSOCOk = socChecker.validateRange(inputPOJO);
		boolean isCROk = chargeRateChecker.validateRange(inputPOJO);
		return checkBattery(isTempOk, isCROk, isSOCOk);
	}

	public boolean checkBattery(boolean isTempOk, boolean isCROk, boolean isSOCOk) {
		if (isTempOk && isCROk && isSOCOk) {
			System.out.println("Battery is Okay");
			return true;
		}
		System.out.println("Battery is not Okay");
		return false;
	}

}
