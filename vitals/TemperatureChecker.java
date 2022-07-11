package vitals;

import vitals.enums.Status;
import vitals.model.RangeInputPOJO;
import vitals.utils.LanguageHelper;
import vitals.utils.RangeValidator;
import vitals.utils.ValidatorInterface;

public class TemperatureChecker implements ValidatorInterface {
	LanguageHelper languageUtils;

	public TemperatureChecker(LanguageHelper languageUtils) {
		this.languageUtils = languageUtils;
	}

	@Override
	public boolean validateRange(RangeInputPOJO inputPOJO) {
		if (RangeValidator.lowRangeCheck(inputPOJO) || RangeValidator.highRangeCheck(inputPOJO)) {
			languageUtils.printLanguageString("temp_out_of_range");
			return false;
		}
		checkWarnings(inputPOJO);
		return true;
	}

	@Override
	public void checkWarnings(RangeInputPOJO inputPOJO) {
		Status warningStatus = RangeValidator.checkWarnings(inputPOJO);
		switch (warningStatus) {
		case LOW:
			languageUtils.printLanguageString("temp_low_warning");
			break;
		case HIGH:
			languageUtils.printLanguageString("temp_high_warning");
			break;
		case NORMAL:
			languageUtils.printLanguageString("temp_normal");
			break;
		}
	}

}
