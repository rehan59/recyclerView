This is a simple Android application demonstrating the usage of RecyclerView to display a list of items. RecyclerView is a more flexible and efficient version of ListView for displaying large datasets.

Features
  * Displays a list of herbal plants in a vertically scrolling list.
  * Supports adding new items to the list dynamically.
  * Implements a custom adapter to populate data into the RecyclerView.

Getting Started
To use RecyclerView in your own Android project, follow these steps:

1. Add RecyclerView Dependency: Include the RecyclerView dependency in your app's build.gradle file:
   implementation 'androidx.recyclerview:recyclerview:1.2.0'
   
2. Define RecyclerView in Layout: Define your RecyclerView in your layout XML file:
    <androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
3. Create Custom Layout: Design a custom layout for each item in the RecyclerView.
4. Implement Custom Adapter: Create a custom adapter to populate data into the RecyclerView efficiently.
5. Set Up RecyclerView: Set up your RecyclerView in your activity or fragment:
