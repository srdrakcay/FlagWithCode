# FlagWithCode
This sample library for Country Code to Country Flag


How To Use 
```kotlin
 binding.button.setOnClickListener {
            val countryCode=binding.editTextText.text.toString()
            FlagResource.getDrawableWithFlagCode(this,countryCode).also {
                binding.imageView.setImageDrawable(it)
            }

        }
```

Project Screen

![GIF](https://i.hizliresim.com/f1q5yr4.gif)

# LİCENSE
