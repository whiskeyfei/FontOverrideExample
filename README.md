Global font override example
============================

Example of how to override font defaults everywhere in your Android app.
This changes the behavior everywhere for all views, no changes to layout xml are required.

The example fonts included are the Chrome OS core fonts (Croscore fonts).

============================
以下是我新增说明，原demo是覆盖了系统的默认字体，包括（monospace，serif，Sans，default）四种。
The original demo is the default system covers the font, including (monospace, serif, Sans, default) four.The following is my new instructions,about to method.


## Usage

1、just some text needs to display a different font or style：
    Set the textStyle or typeface properties for each font
    
2、Replace the App global font style：
    Definition of the application level theme style,if you do this,you can not have to set a separate font style, unified display of a font, you can also use the same way to deal with a special font display
    
        <style name="AppFontTheme" parent="AppBaseTheme">
            <item name="android:typeface">serif</item>
        </style>

#### 扩展阅读
[Is it possible to set font for entire Application?](http://stackoverflow.com/questions/2711858/is-it-possible-to-set-font-for-entire-application)
