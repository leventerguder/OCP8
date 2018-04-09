package chapter13.listResourceBundle;

import java.util.ResourceBundle;

public class ResBundleTest {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("chapter13.listResourceBundle.ResBundle");
		// if the property file has same name with java class , the java class
		// is first!
		System.out.println(rb.getString("MovieName"));
		System.out.println(rb.getClass());
	}
}

// For the resource bundles implemented as classes extended from
// ListResourceBundles , Java uses the reflection mechanism to find and load the
// class.

// packagequalifier.bundlename + "_" + language + "_" + country + "_" + (variant
// + "_#" | "#") + script + "-" + extensions

//
//BundleName + "_" + language + "_" + country + "_" + variant
//BundleName + "_" + language + "_" + country
//BundleName + "_" + language
//BundleName + "_" + defaultLanguage + "_" + defaultCountry
//BundleName + "_" + defaultLanguage


