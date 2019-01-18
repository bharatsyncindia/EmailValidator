[![](https://jitpack.io/v/android-rk/EmailValidator.svg)](https://jitpack.io/#android-rk/EmailValidator)

# EmailValidator
Validate the IDN email address .

# How to Use:

EmailValidator emailValidator=new EmailValidator();
emailValidator.isValid("your email to be validated");

isValid() will return true if the valid email 
otherwise false.


# Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
# Add the dependency

	dependencies {
	        implementation 'com.github.android-rk:EmailValidator:1.1'
	}
# Tested Email Addresses:
hi@stavros.io			 	valid
hi@			 		invalid
hi+there@stavros.io			valid
hi@stavros.io			 	valid
stavros.k@stavros.io			valid
stavros.@stavros.io			invalid
stavros..k@stavros.io			invalid
!#$%&'*(-/=?@stavros.io			nvalid
f*ck@stavros.io			 	valid
#$%!^/&@stavros.io			valid
h(a)i@stavros.io			invalid
{sta}vros@stavros.io			valid
stavros@stavros.io{io}			valid
em@il@stavros.io			invalid
"<\"@\".!#%$@stavros.io			invalid
<\"@\\".!#%$@stavros.io			invalid
"hi@you"@stavros.io			valid
"hi you"@stavros.io			valid
" "@stavros.io			 	valid
hi"@"you@stavros.io			invalid
"<\"@\\".!.#%$@stavros.io		invalid
hi\there@stavros.io			invalid
cow@[dead::beef]			invalid
stavros@io			 	invalid
拉爾@雅虎.在			            valid
1@23456789				invalid
1@[23456789]			 	invalid
रवि@डाटामेल.भारत			  valid
ราวี@ดาต้าเมล.ไทย			  valid
ravi@datamail.in.th			valid
රවී@දත්තතැපැල.ලංකා			  valid
रवि@डाटा			 	 invalid
