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

While initializing views, we need the <b>Height</b> and <b>Width</b> of the parent view, in order to calculate appropriate margin to center the circle view. when the parameter passes <b>wrap_content</b> and <b>match_parent</b> is throws <b>UnSupportedOperationException</b> because android framework do not convert them to dimension, and throw a <b>Exception</b> instead. While creating views, we always get <b>0</b> for <b>View Width</b> and <b>View Height</b>. So, it's become impossible to measure margins!

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


<h4> Public Methods </h4>

<br />
<h5> setCircleColor </h5>

<pre>
<code>public void setCircleColor(int colorInt)</code>
</pre>
This method used to set the layout's circle color.

<table>

<tbody>

<tr>
<th> Parameters </th>
</tr>

<tr>

<td> colorInt </td>

<td> The color hex in the Android Framework supported Integer format </td>

</tr>

<tr>

<td> Returns </td>
<td> Nothing </td> 
</tr>

</tbody>

</table>

<br />


<h5> setCircleBorderColor </h5>

<pre>
<code>public void setCircleBorderColor(int colorInt)</code>
</pre>
This method used to set the layout's circle border color.

<table>

<tbody>

<tr>
<th> Parameters </th>
</tr>

<tr>

<td> colorInt </td>

<td> The color hex in the Android Framework supported Integer format </td>

</tr>
</tbody>
</table>

<br />
<table>
<tbody>
<tr> 
<th>Return Type</th>
</tr>

<tr>
<td>Void</td>
<td>Nothing Return anything!</td>
</tr>
</tbody>
</table>

<br />


<h5> setCircleBorderWidth </h5>

<pre>
<code>public void setCircleBorderWidth(int width)</code>
</pre>
This method used to set the layout's circle border width.

<table>

<tbody>

<tr>
<th> Parameters </th>
</tr>

<tr>

<td> width </td>

<td> The number should be represent the px value of the border width </td>

</tr>

</tbody>
</table>

<br />
<table>
<tbody>
<tr> 
<th>Return Type</th>
</tr>

<tr>
<td>Void</td>
<td>Nothing Return anything!</td>
</tr>
</tbody>
</table>

<br />


<h5> setCircleWidth </h5>

<pre>
<code>public void setCircleWidth(int width)</code>
</pre>
This method used to set the layout's circle width. Especially, used to override the default circle width.

<table>

<tbody>

<tr>
<th> Parameters </th>
</tr>

<tr>

<td> width </td>

<td> The number should be represent the px value of the border width </td>

</tr>

</tbody>
</table>

<br />
<table>
<tbody>
<tr> 
<th>Return Type</th>
</tr>

<tr>
<td>Void</td>
<td>Nothing Return anything!</td>
</tr>
</tbody>
</table>


<br />


<h5> setCircleHeight </h5>

<pre>
<code>public void setCircleHeight(int height)</code>
</pre>
This method used to set the layout's circle height. Especially, used to override the default circle height.

<table>

<tbody>

<tr>
<th> Parameters </th>
</tr>

<tr>

<td> height </td>

<td> The number should be represent the px value of the border height </td>

</tr>

</tbody>
</table>

<br />
<table>
<tbody>
<tr> 
<th>Return Type</th>
</tr>

<tr>
<td>Void</td>
<td>Nothing Return anything!</td>
</tr>
</tbody>
</table>


<br />


<h5> setCircleSize </h5>

<pre>
<code>setCircleSize(int width, int height)</code>
</pre>
This method used to set the layout's circle width and height. Especially, used to override the default circle width and height setting.

<table>

<tbody>

<tr>
<th> Parameters </th>
</tr>

<tr>

<td> height </td>

<td> The number should be represent the px value of the border width </td>

</tr>

<tr>
<td>width</td>
<td>The number should be represent the px value of the border height</td>
</tr>

<tr>
</tr>

</tbody>
</table>

<br />
<table>
<tbody>
<tr> 
<th>Return Type</th>
</tr>

<tr>
<td>Void</td>
<td>Nothing Return anything!</td>
</tr>
</tbody>
</table>

<br />



<h5> resetCircleWidthAndHeight() </h5>

<pre>
<code>public void resetCircleWidthAndHeight()</code>
</pre>
Revert back to the original circle width and height, while creating this view for the first time.

<table>

<tbody>

<tr>
<th> Parameters </th>
</tr>

<tr>
<td>Null</td>
<td></td>
</tr>

<tr>
</tr>

</tbody>
</table>

<br />
<table>
<tbody>
<tr> 
<th>Return Type</th>
</tr>

<tr>
<td>Void</td>
<td>Nothing Return anything!</td>
</tr>
</tbody>
</table>




