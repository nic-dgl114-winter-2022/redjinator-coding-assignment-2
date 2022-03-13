# redjinator-coding-assignment-2


## Project Description
Just a little app for myself to bug my kids with, you can choose a character from a recyclerview list and bring up a more focused profile screen which may include voice clips quoting funny lines from the cartoon with some interesting facts on screen.

The app's purpose is to display my basic understanding of the concepts required, but I did play a little bit with fragments. At the time of writing, I am still writing this documentation and have not yet had the time to go back and refactor into any type of design pattern or best practices. I do have some repeating code at present but in the interest of time and I'm moving on and will come back to it if possible.

### Time permitting planned changes
- refactor depreciated bottom_navigation.setOnNavigationItemSelectedListener in MainActivity.kt
- refactor array's found in RecyclerAdapter.kt into a dataclass
- somehow not repeat so much code across the "Profile Activities - ie: GaryActivity, AvocadoActivity, etc...

### Questions I have unanswered
- Why on GaryActivity the back button "on the actionBar" wouldn't work when I had actionBar.setDisplayHomeAsUpEnabled(true), this is actually why I created the current back buttons you see below the character_images on the activities "GaryActivity & AvocadoActivity". I know I could just write and abstract class with my required methods I want implemented for my kotlin classes but I haven't gotten to seeing how I'll manage it with the xml layout files. Maybe a recyclerview with full screen sized views for the profiles? I'm not sure yet.

## Example Features
- RecyclerView
- Fragments
- Bottom nav bar
- Explicit intents
- It Runs!!! I mean... it is currently functioning.


## Project Files
Below is a list of the primary project files that I created and/or modified from the templates provided in Android Studio and information I learned by watching YouTube https://www.youtube.com/c/CodeWithMazn, particularly when creating the bottom navigation and associated fragments.

### Activities
- MainActivity.kt
- RecyclerAdapter.kt
- GaryActivity.kt
- AvocadoActivity.kt

### Fragments
- ProfileFragment.kt
- InfoFragment.kt

### XML files
- activity_avocado.xml
- activity_gary.xml
- activity_main.xml
- fragment_info.xml
- fragment_profile.xml
- list_items.xml
- profile_items.xml
- menu.xml
- strings.xml

## Under Construction
- Function descriptions
- Object descriptions

