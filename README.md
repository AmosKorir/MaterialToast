# :cyclone:MaterialToast

[ ![Download](https://api.bintray.com/packages/skyways/MaterialToast/MaterialToast/images/download.svg?version=1.0) ](https://bintray.com/skyways/MaterialToast/MaterialToast/1.0/link)  [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=shield)](https://app.circleci.com/pipelines/github/skyways/MaterialToast/)
Show multi-colored Toast messages in android

**It supports the following Toasts**
    1. Primary Toast
    2. Success Toast
    3. Warning Toast
    4. Error Toast 
    5. Default Toast


### Primary Toast :blue_heart:
![image](https://github.com/skyways/materialtoast/blob/master/art/primary.jpg)

```kotlin
      MaterialToast.show(this, MaterialToast.PRIMARY, "Primary", MaterialToast.LONG)
```

### Success Toast :green_heart:
![image](https://github.com/skyways/materialtoast/blob/master/art/success.jpg)

```kotlin
       MaterialToast.show(this, MaterialToast.SUCCESS, "success", MaterialToast.LONG)
```
### Warning Toast:yellow_heart:
![image](https://github.com/skyways/materialtoast/blob/master/art/warning.jpg)

```kotlin
     MaterialToast.show(this, MaterialToast.WARNING, "Warning", MaterialToast.LONG)
```
### Error Toast :heart:
![image](https://github.com/skyways/materialtoast/blob/master/art/error.jpg)

```kotlin
      MaterialToast.show(this, MaterialToast.ERROR, "Error", MaterialToast.LONG)
```
## Default Toast  :black_heart:
![image](https://github.com/skyways/materialtoast/blob/master/art/default.jpg)

```kotlin
      MaterialToast.show(this, MaterialToast.DEFAULT, "Default", MaterialToast.LONG)
```

### Install through gradle
```gradle
implementation 'com.materialtoast:MaterialToast:1.0'
```