# Introduction

An HMOS library for creating animated grid buttons.

# Demo

<img src="https://github.com/pratiknagalgave/animated_grid/blob/main/Demo.gif" style=" width:160px ; height:220px "  >

# How to use
# Installation

In order to use the library, add the following line to your root gradle file:

I) For using animated_grid module in sample app, include the source code and add the below dependencies in entry/build.gradle to generate hap/support.har.
```
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar', '*.har'])
    testImplementation 'junit:junit:4.13'
    ohosTestImplementation 'com.huawei.ohos.testkit:runner:1.0.0.100'
    implementation project(':grid_animation_library')
}
```
II) For using animated_grid in separate application using har file, add the har file in the entry/libs folder and add the dependencies in entry/build.gradle file.
```
dependencies {
            implementation fileTree(dir: 'libs', include: ['*.jar'])
            testImplementation 'junit:junit:4.13'
}
```
III) For using animated_grid from a remote repository in separate application, add the below dependencies in entry/build.gradle file.


# Usage
**For example 
Use the following in your xml**

     <com.pratik.grid_animation_library.animationGrid
             ohos:id="$+id:button_1"
             ohos:height="match_content"
             ohos:width="match_content"
             ohos:alignment="center"
       />
       
**Use the following code in java file**
```
public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        animationGrid Button1 = (animationGrid) findComponentById(ResourceTable.Id_button_1);
        Button1.setText("Button");
        Button1.setIconRes("https://www.animatedimages.org/data/media/209/animated-cat-image-0072.gif");
        Button1.setBg(ResourceTable.Graphic_button_gray);
        Button1.setTextColor(Color.WHITE);
    }
}
```
# LICENSE 

Copyright 2021 Pratik Nagalgave

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
