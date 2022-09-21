# custom-ui-collection-android
Project where I aim to share all custom view for android that I make in my fun time. Hope you will love my collection!

## Using this project

[![](https://jitpack.io/v/nurujjamanpollob/custom-ui-collection-android.svg)](https://jitpack.io/#nurujjamanpollob/custom-ui-collection-android)

Add the following code in your project level <b>build.gradle</b> file:

<br />

<pre>
<code> 	
allprojects {
    repositories {
    ...
    maven { url 'https://jitpack.io' }
		
    }

}
  
 </code>
 </pre>
 
 <br />
 
<b>Note:</b><i>Newer gradle android project prefer settings.gradle repository configuration over project level build.gradle configuration.
In that case, you should add following code in your <b>settings.gradle</b> file: </i>
	
<br />
<br />
	
<pre>
<code> 
pluginManagement {
	repositories {
        ...
        maven { url 'https://jitpack.io' }
              
    }
}
 
</code>
</pre>

<br />
<br />
If you found library not found error, add this also like this, in your project level <b>settings.gradle</b> file:

<br />

<pre>
<code> 
 dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
</code>
</pre>
 
 <br />
 <br />



In your app level <b>build.gradle</b> file, add this:
<pre>
<code> implementation 'com.github.nurujjamanpollob:custom-ui-collection-android:master-7062cb0745-1' </code>
</pre>

<br />
<br />

Detailed documentation will come shortly. Thank you.

## Class Documentation Part

<ul>
<li>
<a href="https://github.com/nurujjamanpollob/custom-ui-collection-android/blob/master/uimodule/src/main/java/com/nurujjamanpollob/customview/CircleLayout.java">CircleLayout - A Custom ConstraintLayout</a></li></ul> 

This class is a extended version of ConstraintLayout. This class is used to draw a circle in the background of the View, and it even supports circle border and supports adjusting background circle size parameter. The reason of using ConstraintLayout as it supports designing process so easy and highly customizable.

<h3> Issues </h3>

You can't use <b>wrap_content</b> and <b>match_parent</b> as value of tag parameter of <b>android:layout_width</b> and <b>android:layout_height</b> <br />

<b>Why?</b> <br /> <br />

Because, <b>wrap_content</b> and <b>match_parent</b> is a dimension, and I don't know why android framework not passing appropriate dimension value for them, while reading.

While initializing views, we need the <b>Height</b> and <b>Width</b> of the parent view, in order to calculate appropriate margin to center the circle view. when the parameter passes <b>wrap_content</b> and <b>match_parent</b> is throws <b>UnSupportedOperationException</b> because android framework do not convert them to dimension, and throw a <b>Exception</b> instead. While creating views, we always get <b>0</b> for <b>View Width</b> and <b>View Height</b>. So, it's become ipossible to measure margins!

<br />

<h4> Constructors </h4>

First:
<pre>
<code> public CircleLayout(Context context) // Initialize the view in given context </code>
</pre>

<br />
Second:
<pre>
<code> public CircleLayout(Context context, AttributeSet attrs) // Initialize the view in given context with attributes from XML </code>
</pre>
<br />
Third:
<pre>
<code> public CircleLayout(Context context, AttributeSet attrs, int defStyleAttr) // Initialize the view in given context with attributes from XML and An attribute in the current theme that contains a reference to a style resource that supplies default values for the view </code>
</pre>




