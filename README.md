# Kotlin Click Shrink Effect Library
![](https://komarev.com/ghpvc/?username=click-shrink-effect-android&color=55acb7&style=for-the-badge&logo=Github&label=Views)
[![](https://jitpack.io/v/muratozturk5/ClickShrinkEffectLibrary.svg)](https://jitpack.io/#muratozturk5/ClickShrinkEffectLibrary)
[![](https://jitpack.io/v/muratozturk5/ClickShrinkEffectLibrary/month.svg)](https://jitpack.io/#muratozturk5/ClickShrinkEffectLibrary)

![App Screenshot](https://github.com/muratozturk5/ClickShrinkEffectLibrary/blob/master/Screenshot/shrink.gif)

Kotlin View Click Shrink Effect

## 🛠 Setup

- Step 1. Add the JitPack repository to your build file

*Add it in your root **build.gradle** at the end of repositories:*

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
- Step 2. Add the dependency
```
dependencies {
         implementation 'com.github.muratozturk5:ClickShrinkEffectLibrary:1.2.0'
}
```

## 🔎 Usage

```
button.applyClickShrink()
textView.applyClickShrink(shrinkValue = 0.80f, animationDuration = 150L)
cardView.applyClickShrink(shrinkValue = 0.75f, animationDuration = 150L)
imageView.applyClickShrink(shrinkValue = 0.50f, animationDuration = 250L)
```

## 👨 Developed By 

 <img src="https://avatars.githubusercontent.com/u/62841905?s=400&u=6b1f97cf6a3dfe668719000f9686f5fe861f273a&v=4" width="70" align="left">


**Murat ÖZTÜRK**

[![Linkedin](https://img.shields.io/badge/-linkedin-grey?logo=linkedin)](https://www.linkedin.com/in/murat-%C3%B6zt%C3%BCrk-7a9306217/)

📄 License 
-------

```
MIT License

Copyright (c) 2022 Murat ÖZTÜRK

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
