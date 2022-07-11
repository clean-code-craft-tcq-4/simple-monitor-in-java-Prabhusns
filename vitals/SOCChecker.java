package vitals;

import vitals.enums.Status;
import vitals.model.RangeInputPOJO;
import vitals.utils.LanguageHelper;
import vitals.utils.RangeValidator;
import vitals.utils.ValidatorInterface;

public class SOCChecker implements ValidatorInterface {
	LanguageHelper languageUtils;

	public SOCChecker(LanguageHelper languageUtils) {
		this.languageUtils = languageUtils;
	}

	@Override
	public boolean validateRange(RangeInputPOJO inputPOJO) {
		if (RangeValidator.lowRangeCheck(inputPOJO) || RangeValidator.highRangeCheck(inputPOJO)) {
			languageUtils.printLanguageString("cr_low_warning");
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
			languageUtils.printLanguageString("cr_low_warning");
			break;
		case HIGH:
			languageUtils.printLanguageString("cr_high_warning");
			break;
		case NORMAL:
			languageUtils.printLanguageString("cr_normal");
			break;
		}
	}
}
