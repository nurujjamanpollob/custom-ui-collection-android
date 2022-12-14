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
If you found library or dependency not found error, add this also like this, in your project level <b>settings.gradle</b> file:

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


<h3>
<a href="https://github.com/nurujjamanpollob/custom-ui-collection-android/blob/master/uimodule/src/main/java/com/nurujjamanpollob/customview/CircleLayout.java">CircleLayout - A Custom ConstraintLayout</a></h3>

<br />

This class is a extended version of ConstraintLayout. This class is used to draw a circle in the background of the View, and it even supports circle border and supports adjusting background circle size parameter. The reason of using ConstraintLayout as it supports designing process so easy and highly customizable.

<hr />
<h3> Issues </h3>

You can't use <b>wrap_content</b> and <b>match_parent</b> as value of tag parameter of <b>android:layout_width</b> and <b>android:layout_height</b> <br />
<hr />
<b>Why?</b> <br /> <br />

Because, <b>wrap_content</b> and <b>match_parent</b> is a dimension, and I don't know why android framework not passing appropriate dimension value for them, while reading.

While initializing views, we need the <b>Height</b> and <b>Width</b> of the parent view, in order to calculate appropriate margin to center the circle view. when the parameter passes <b>wrap_content</b> and <b>match_parent</b> is throws <b>UnSupportedOperationException</b> because android framework do not convert them to dimension, and throw a <b>Exception</b> instead. While creating views, we always get <b>0</b> for <b>View Width</b> and <b>View Height</b>. So, it's become impossible to measure margins!
<hr />
<br />

<h4> Interactive Mockup </h4>

<img src="https://github.com/nurujjamanpollob/custom-ui-collection-android/raw/master/circle_layout_demo.gif" />

<hr />

<h4> Implementation Guide </h4>

First, open your desired layout file and define the tag like this(remove space after start and tag):

<pre>
<code> < com.nurujjamanpollob.customview.CircleLayout

        android:id="@+id/circleLayout"
        android:layout_width="120dp"
        android:layout_height="120dp"
        app:circle_border_color="#F9F9F8"
        app:circle_border_width="5dp"
        app:circle_color="#4B4C4C">
	
< /com.nurujjamanpollob.customview.CircleLayout>
</code>
</pre>

Set <b>0</b> for the value of <b>app:circle_border_width</b>, if you don't want circle border.

Thats it. For your design guide, check documentation, you can also check these link for sample code:

<ul>
<li> <a href="https://github.com/nurujjamanpollob/custom-ui-collection-android/blob/master/app/src/main/res/layout/circle_layout_example.xml">Circle Layout Example XML</a></li>
<li> <a href="https://github.com/nurujjamanpollob/custom-ui-collection-android/blob/master/app/src/main/java/dev/nurujjamanpollob/uitestapp/CircleLayoutDemoActivity.java">Circle Layout Demo Activity</a></li>
</ul>

<hr />
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
<hr />

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
<th> Short Details </th>
</tr>

<tr>

<td> colorInt </td>

<td> The color hex in the Android Framework supported Integer format </td>

</tr>

</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
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
<th> Short Details </th>
</tr>

<tr>

<td> colorInt </td>

<td> The color hex in the Android Framework supported Integer format </td>

</tr>
</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
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
<th> Short Details </th>
</tr>

<tr>

<td> width </td>

<td> The number should be represent the px value of the border width </td>

</tr>

</tbody>
</table>

<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
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
<th> Short Details </th>
</tr>

<tr>

<td> width </td>

<td> The number should be represent the px value of the border width </td>

</tr>

</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
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
<th> Short Details </th>
</tr>

<tr>

<td> height </td>

<td> The number should be represent the px value of the border height </td>

</tr>

</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
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
<th> Short Details </th>
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
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
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
<th> Short Details </th>
</tr>

<tr>
<td>Null</td>
<td></td>
</tr>

<tr>
</tr>

</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
</tr>
</tbody>
</table>
<hr />
<br />

<h4> XML Properties </h4>

<br />
<h5> app:circle_color </h5> 
<pre>
<code> app:circle_color </code>
</pre>

Used to define the background circle color from the XML TAG


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:circle_color </td>
<td> color </td>
<td> Defines the CircleLayout's background circle color. A valid Android Framework supported hex color code is expected. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>


<br />
<h5> app:circle_border_color </h5> 
<pre>
<code> app:circle_border_color </code>
</pre>

Used to define the background circle border color from the XML TAG


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:circle_border_color </td>
<td> color </td>
<td> Defines the CircleLayout's background circle border color. A valid Android Framework supported hex color code is expected. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>


<br />



<h5> app:circle_border_width </h5> 
<pre>
<code> app:circle_border_width </code>
</pre>

Used to define the background circle border width from the XML TAG

<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:circle_border_width </td>
<td> dimension </td>
<td> Defines the CircleLayout's background circle border width. A valid Android Framework supported dimension format is expected, such as dp, in etc. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>


<br />
<h5> android:layout_height </h5> 
<pre>
<code> android:layout_height </code>
</pre>

Used to define the View Height

<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> android:layout_height </td>
<td> dimension </td>
<td> Defines the CircleLayout's View Height. A valid Android Framework supported dimension format is expected, such as dp, in etc. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>

<br />
<h5> android:layout_width </h5> 
<pre>
<code> android:layout_width  </code>
</pre>

Used to define the View Width

<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> android:layout_width  </td>
<td> dimension </td>
<td> Defines the CircleLayout's View Width. A valid Android Framework supported dimension format is expected, such as dp, in etc. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>
<hr />
<br />

<h4> Constants </h4>
No constants are defined for this class!
<hr />

<h4> <a href="https://github.com/nurujjamanpollob/custom-ui-collection-android/blob/master/uimodule/src/main/java/com/nurujjamanpollob/customview/RippleBackground.java">RippleBackground - Show Ripple effect on the view </a></h4>

<br />
<br />
This class is a extended version of <b>Relative Layout</b>. This class used to show Ripple Effect in the background of <b>View</b>. This class usages an inner class named <b>RippleView</b> to create the backgound circle, as following by XML property value of <b>ripple_amount</b> where <b>ripple_amount</b> is refers to how many circles to create and animate on the <b>View</b>. Also, I have used <b>ObjectAnimator</b> and <b>AnimatorSet</b> to animate those ripples.
<hr />
<br />

<h4> Issues </h4>

No issues so far. Please report if you found any.

<hr />
<br />



<h4> Interactive Mockup </h4>

<img src="https://github.com/nurujjamanpollob/custom-ui-collection-android/raw/master/ripple_background_demo.gif" />

<hr />

<h4> Implementation Guide </h4>

First, open your desired layout file and define the tag like this(remove space after start and tag):

<pre>
<code> < com.nurujjamanpollob.customview.RippleBackground
        android:id="@+id/ripple_background"
        android:layout_width="200dp"
        android:layout_height="200dp"
        app:ripple_amount="3"
        app:ripple_color="#F0F9F8"
        app:ripple_duration="3000"
        app:ripple_radius="50dp"
        app:ripple_scale="2">
	
	< /com.nurujjamanpollob.customview.RippleBackground>
</code>
</pre>

If you want ouline styled ripples, define <b>app:ripple_type</b> value to <b>strokeRipple</b>.

Then, in your code, start animation like this:

<pre>
<code> 
// Get ripple view by ID
RippleBackground rippleBackground = findViewById(R.id.ripple_background);
// Start Animation
rippleBackground.startRippleAnimation();
</code>
</pre>

it will be run infinite until you stop. To stop, you need to invoke this method:

<pre>
<code> rippleBackground.stopRippleAnimation(); </code>
</pre>

Hope, it helps!

Thats it. For your design guide, check documentation, you can also check these link for sample code:

<ul>
<li> <a href="https://github.com/nurujjamanpollob/custom-ui-collection-android/blob/master/app/src/main/res/layout/ripple_background_example.xml">Ripple Background Example XML</a></li>
<li> <a href="https://github.com/nurujjamanpollob/custom-ui-collection-android/blob/master/app/src/main/java/dev/nurujjamanpollob/uitestapp/RippleDemoActivity.java">Ripple Demo Activity</a></li>
</ul>

<hr />


<h4> Constructors </h4>
<br />
First:
<pre>
<code> public RippleBackground(Context context) // Initialize this view in the given context </code>
</pre>

<br />
Second:
<pre>
<code> public RippleBackground(Context context, AttributeSet attrs) // Initialize this view in the given context with properties from the XML </code>
</pre>
<br />

Third:
<pre>
<code> public RippleBackground(Context context, AttributeSet attrs, int defStyleAttr) //Initialize the view in given context with attributes from XML and An attribute in the current theme that contains a reference to a style resource that supplies default values for the view </code>
</pre>
<hr />
<br />
<br />

<h4> Public Methods </h4>


<br />
<h5> startRippleAnimation() </h5>

<pre>
<code>public void startRippleAnimation()</code>
</pre>
Method to start ripple animation in the background View.

<table>

<tbody>

<tr>
<th> Parameters </th>
<th> Short Details </th>
</tr>

<tr>
<td>Null</td>
<td></td>
</tr>

<tr>
</tr>

</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
</tr>
</tbody>
</table>



<br />
<h5> stopRippleAnimation() </h5>

<pre>
<code>public void stopRippleAnimation()</code>
</pre>
Method to stop ripple animation in the background View.

<table>

<tbody>

<tr>
<th> Parameters </th>
<th> Short Details </th>
</tr>

<tr>
<td>Null</td>
<td></td>
</tr>

<tr>
</tr>

</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>Void</td>
<td>Nothing</td>
</tr>
</tbody>
</table>



<br />
<h5> isRippleAnimationRunning() </h5>

<pre>
<code>public boolean isRippleAnimationRunning()</code>
</pre>
Method to get whatever the the ripple animation is running in background or not.

<table>

<tbody>

<tr>
<th> Parameters </th>
<th> Short Details </th>
</tr>

<tr>
<td>Null</td>
<td></td>
</tr>

<tr>
</tr>

</tbody>
</table>
<table>
<tbody>
<tr> 
<th>Return Type</th>
<th> Short Details </th>
</tr>

<tr>
<td>boolean</td>
<td>Return true if the Ripple animation is running and showing on the background. Else, false is returned. </td>
</tr>
</tbody>
</table>

<hr />
<br />
<br />


<h4> XML Properties </h4>

<br />
<h5> app:ripple_color </h5> 
<pre>
<code> app:ripple_color </code>
</pre>

Used to define the background ripple color from the XML TAG


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:ripple_color </td>
<td> color </td>
<td> Defines the RippleBackground's background ripple color. A valid Android Framework supported hex color code is expected. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>

<br />
<h5> app:ripple_strokeWidth </h5> 
<pre>
<code> app:ripple_strokeWidth </code>
</pre>

Used to define the background ripple stroke width. ONLY work when <b>app:ripple_type="strokeRipple"</b>


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:ripple_color </td>
<td> dimension </td>
<td> Defines the RippleBackground's background ripple stroke. A valid Android Framework supported dimension type is expected, such as dp, in, etc. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>

<br />
<h5> app:ripple_radius </h5> 
<pre>
<code> app:ripple_radius </code>
</pre>

Used to define the background ripple radius. Defined via XML property.


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:ripple_radius </td>
<td> dimension </td>
<td> Defines the RippleBackground's background ripple radius. A valid Android Framework supported dimension type is expected, such as dp, in, etc. it will be parsed autometically, and converted to framework supported format. </td> 
</tr> 
</tbody>
</table>


<br />
<h5> app:ripple_duration </h5> 
<pre>
<code> app:ripple_duration </code>
</pre>

Used to define the background ripple animation duration. The time unit is milisecond. Defined via XML property.


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:ripple_duration </td>
<td> integer </td>
<td> Defines the RippleBackground's background ripple animation. The integer, which we refer as time, is expect to be milliseconds, after a single ripple animation is time out. </td> 
</tr> 
</tbody>
</table>

<br />
<h5> app:ripple_amount </h5> 
<pre>
<code> app:ripple_amount </code>
</pre>

Used to define the background ripple amount. Defined via XML property.


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:ripple_duration </td>
<td> integer </td>
<td> Defines the RippleBackground's background ripple amount. We will create ripples on the background following by this number. </td> 
</tr> 
</tbody>
</table>


<br />
<h5> app:ripple_scale </h5> 
<pre>
<code> app:ripple_scale </code>
</pre>

Used to define the background ripple scale. Defined via XML property.


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:ripple_scale </td>
<td> float </td>
<td>Defines the RippleBackground's background ripple amount. For example, we are creating 3 ripples, first one is 100dp, if we set <b>ripple_scale</b> to <b>1.2</b> it will continue to grow ,b>20%</b> more than previous ripple, like first one is <b>100dp</b>, second one will be <b>120dp</b>, third one will be <b>144dp</b> </td> 
</tr> 
</tbody>
</table>


<br />
<h5> app:ripple_type </h5> 
<pre>
<code> app:ripple_type </code>
</pre>

Used to define the background ripple type. Can be filled or outlined style. Defined via XML property.


<table>
<tbody>
<tr>
<th> Property Name </th>
<th> Property Type </th>
<th> Property Short Description </th>
</tr>

<tr>
<td> app:ripple_type </td>
<td> enum </td>
	<td>Defines the RippleBackground's background ripple type. The value can be either <b>fillRipple</b> for the filled style, for outlined style use <b>strokeRipple</b>. using value other than these may throw exception.</td> 
</tr> 
</tbody>
</table>
<hr />
<br />
<br />

<h4> Constants </h4>

This class do not have any constant. 
<hr />
<br />
<br />

## Extra contents

Looking for Android Developer for your project? I am available for work. contact me at nurujjamanpollob@gmail.com

# Special Thanks

To google team for great documentation to follow, and dear programmers for sharing many tutorials.
