[![](https://jitpack.io/v/android-rk/EmailValidator.svg)](https://jitpack.io/#android-rk/EmailValidator)

# EmailValidator
Validate the IDN email address .

# How to Use:

EmailValidator emailValidator=new EmailValidator();
emailValidator.isValid("your email to be validated");

isValid() will return true if the valid email <br/>
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
hi@stavros.io			 	valid <br/>
hi@			 		invalid<br/>
hi+there@stavros.io			valid<br/>
hi@stavros.io			 	valid<br/>
stavros.k@stavros.io			valid<br/>
stavros.@stavros.io			invalid<br/>
stavros..k@stavros.io			invalid<br/>
!#$%&'*(-/=?@stavros.io			invalid<br/>
f*ck@stavros.io			 	valid<br/>
#$%!^/&@stavros.io			valid<br/>
h(a)i@stavros.io			invalid<br/>
{sta}vros@stavros.io			valid<br/>
stavros@stavros.io{io}			valid<br/>
em@il@stavros.io			invalid<br/>
"<\"@\".!#%$@stavros.io			invalid<br/>
<\"@\\".!#%$@stavros.io			invalid<br/>
"hi@you"@stavros.io			valid<br/>
"hi you"@stavros.io			valid<br/>
" "@stavros.io			 	valid<br/>
hi"@"you@stavros.io			invalid<br/>
"<\"@\\".!.#%$@stavros.io		invalid<br/>
hi\there@stavros.io			invalid<br/>
cow@[dead::beef]			invalid<br/>
stavros@io			 	invalid<br/>
拉爾@雅虎.在			            valid<br/>
1@23456789				invalid<br/>
1@[23456789]			 	invalid<br/>
रवि@डाटामेल.भारत			  valid<br/>
ราวี@ดาต้าเมล.ไทย			   valid<br/>
ravi@datamail.in.th			valid<br/>
රවී@දත්තතැපැල.ලංකා			  valid<br/>
रवि@डाटा			 	 invalid<br/>
