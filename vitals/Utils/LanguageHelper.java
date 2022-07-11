package vitals.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageHelper {

	Locale localeName;

	public LanguageHelper(Locale localeName) {
		this.localeName = localeName;
	}

	public ResourceBundle getResource() {
		ResourceBundle bundle = ResourceBundle.getBundle(Constants.localeFolderName, this.localeName);
		return bundle;
	}

	public void printLanguageString(String key) {
		System.out.println(getResource().getString(key));
	}

}
