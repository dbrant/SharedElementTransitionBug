# To see the bug

* Run the app
* Click the button (observe the transition from the first activity to the second)
* Rotate the screen 90 degrees
* Press the "back" button to go to the previous activity (while the screen is still rotated)
* Observe that the backwards transition happens successfully, but then the activity suddenly becomes blank and reloads (almost as if it crashed), but nothing is written to logcat.
