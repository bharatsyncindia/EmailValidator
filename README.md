[![](https://jitpack.io/v/android-rk/EmailValidator.svg)](https://jitpack.io/#android-rk/EmailValidator)

# EmailValidator
Validate the IDN email address .

# How to Use:
EmailValidator emailValidator=new EmailValidator();
emailValidator.isValid("your email to be validated");

isValid() will return true if the valid email otherwise false.


# Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
# Add the dependency

	dependencies {
	        implementation 'com.github.android-rk:EmailValidator:1.0'
	}
