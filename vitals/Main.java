package vitals;

import java.util.Locale;

import vitals.tests.BatteryTest;
import vitals.utils.Constants;
import vitals.utils.LanguageHelper;

public class Main {

	static LanguageHelper languageUtils; // Locale.US , Locale.GERMANY
	static {
		languageUtils = new LanguageHelper(Locale.GERMANY);
	}

	public static void main(String[] args) {
		BatteryTest.testBattery(languageUtils);
	}

}
