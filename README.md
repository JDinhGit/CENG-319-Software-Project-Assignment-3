# CENG319 Software Project Assignment 3 - GridView
Tutorial Blog (GridView)

## Introduction
GridView is a ViewGroup that displays gridView items onto 2D scrolling grid. These gridView items could be in text or in a picture format. The format from where the items are displayed are in columns and rows. The icons can also be clickable which allow the user to move from one activity to another. GridView is also from a subclass of AdapterView. Not to be confused with GridLayout as GridLayout places its icons onto a rectangular grid instead of a 2D grid.

## History
Seeing as GridView is a subclass of AdapterView, AdapterView was introduced in API Level 1, which does not have a code name unlike future APIs.

## The major methods/attributes
Firstly you are required to have two java files, however the 2nd java file does not require a xml file included with it(in this case the imagechanger), but you can have one if needed. In your MainActivity.java it would have:<br> 

<b>gV.setAdapter(new ImageChange(this));</b><br>
ImageChange is the 2nd java file and is being called by setAdapter. setAdapter allows data to go through the GridView. gV is a variable that this example uses to identify GridView layout which is found by findViewById, it can be any variable of the developers choice. <br>

<b>gV.setOnItemClickListener(new AdapterView.OnItemClickListener()</b><br>
The setOnItemClicker is a callback method that tells the AdapterView that the item is being clicked. <br>

<b>public void onItemClick(AdapterView<?> parent, View view, int positionID, long id)</b><br>
This will give function to all items that are included in your gridView. In multiple cases when an item is clicked, developers can set them to their specific needs such as, intents, toast, exit, etc.<br>

In your 2nd java file (in this case my ImageChange.java) it would have:<br>

<b>public class ImageChange extends BaseAdapter</b><br>
BaseAdapter will allow the gridView to have basic implementation of adapter.<br>

<b>public View getView(int position, View convertView, ViewGroup parent)</b><br>
This gives your images the correct placements of where they should be by using the item ID position. Also it gives the developer options to how big they want their images to be.<br>

<b>Additional methods that are used, but are not absolutely neccessary.</b><br>

<b>getItem()</b> - Will give the developer the item position on the gridView<br>

<b>getItemId</b> - Returns row ID<br>

## Example Project
You can find my example here on my repository. With my example I have 2 java files and 1 xml file. The 2 java files all relate to the main functionality of the gridView, however the images implemented in this example are optional and are not a requirement for a functioning gridView. If you plan on using intents you may have to add statements that inform your program to call the correct ItemID to bring to the correct intent. Another thing is that the images used in this example are all added to drawable and are all called from the 2nd java file (in this example is ImageChange.java).  
