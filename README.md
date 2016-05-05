Global font override example
============================

Example of how to override font defaults everywhere in your Android app.
This changes the behavior everywhere for all views, no changes to layout xml are required.

The example fonts included are the Chrome OS core fonts (Croscore fonts).

============================
以下是我新增说明，原demo是覆盖了系统的默认字体，包括（monospace，serif，Sans，default）四种。

我这里做下延伸，所以总结两种用法：

1、特定文字需要显示不同的字体或者style
    为每一种字体都设置textStyle或者typeface属性
    
2、更换App全局字体样式
    定义全局的theme Style，这样不用单独设置字体样式，统一显示一种字体，同样你也可以采用第一种方式处理特殊字体显示
    
    例如：
      <!-- 自定义字体主题，当前默认使用serif字体 -->
        <style name="AppFontTheme" parent="AppBaseTheme">
            <item name="android:typeface">serif</item>
        </style>

#### 扩展阅读
[Is it possible to set font for entire Application?](http://stackoverflow.com/questions/2711858/is-it-possible-to-set-font-for-entire-application)
