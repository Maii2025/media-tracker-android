# Week {{N}} Reflection

**Name: Mai Nhia Vang   
**Date: 05/28/2026

---

## Commits This Week

<!-- Paste a link to your commits for this week. The easiest way: go to your repo on GitHub,
     click "commits", and copy the URL after filtering by your name or branch. -->

**Link: https://github.com/Maii2025/media-tracker-android/pull/2/changes/8bf9a3b1b53eb0ecc0eb6d868fe829375bb32561


---

## Code Review

<!-- Every week you leave a review on a pod mate's pull request. Fill in both parts below.
     Part 1 is the link — I will verify the review exists on GitHub.
     Part 2 is your written assessment — what you actually looked at and what you found. -->

**Reviewed: Jacob Vigliotti *(pod mate's name)*
**Link to my review: https://github.com/jacobvigliotti/media-tracker-android/pull/2 

### What I Looked At

<!-- Walk through the code you reviewed. What was the PR trying to do? Which files or
     functions did you focus on? --> 
     
Fixing the follow probelms based on these statement:
-Profile data might not update correctly after the app is backgrounded
-Something seems to keep loading in the background after I leave the Library screen
-Library filter resets every time I rotate my phone
-The Register button doesn't do anything
-The filter chips on the Library screen get cut off on my phone
-The bottom nav bar never highlights the active tab
-App crashes when I tap anything in the Library

The files that I focused on and worked on for the functions were:
-BottomNavBar.kt
-NagGraph.kt
-Routes.kt
-LibraryScreen.kt
-LibraryViewModel.lt
-MyProfileScreen.kt

### What I Noticed

<!-- Be specific. Did you spot a potential bug? A pattern that could cause problems? Something
     done well that you want to call out? "I looked at the ViewModel and everything seemed fine"
     is not specific enough. Name the thing you noticed and explain why it matters. -->

     -The horizontalScroll line from the LibraryScreen.kt required a import to be able to work smoothly.

### Comments I Left

<!-- Briefly summarize the comments you left on the PR. If you left a positive comment,
     say what it was. If you left a suggestion, say what you suggested and why. -->

---

I left a postitive comment: The pod mate add an code that was not same as the instructor, but at least it works for him.

## One Thing I Understood More Deeply

<!-- Be specific. Don't write "I learned about ViewModels." Write what specifically clicked —
     what was confusing before, what made it make sense, and how you'd explain it to someone else.
     There are no wrong answers here. -->

---

The import part, some coding require and suggest to add a import on top of the code. 

## One Thing I'm Still Confused About

<!-- Be honest. This is the most useful part of the reflection for me — it tells me where to
     spend more time in class. You will not lose points for being confused. -->

---
The reflection part that I need to spend more time is finish commint my coding on time so my pod mates can checkout my coding and get me review. 

## Anything Else *(optional)*

<!-- Did you help a pod mate work through something? Did you discover something cool or frustrating?
     Did something from a previous week finally click? This is a good place to put it. -->

---

## Rubric

*You don't need to self-assess — this is here so you know what I'm looking at.*

| Section | Points | Full Credit | Half Credit | No Credit |
|:---|:---:|:---|:---|:---|
| **Reflection** | 10 | Specific, honest responses to "More Deeply" and "Still Confused" sections. Shows genuine thinking — not just "I learned X." | Responses are present but vague or generic ("I got better at Compose"). | Missing or one-word answers. |
| **Code Review** | 10 | Specific observation about the code with explanation of why it matters (or a substantive positive comment). Link to review present and verified. | A question or comment that shows you read the code, but lacks explanation. | "Looks good!" or equivalent. Missing link. Review not found on GitHub. |
| **Total** | **20** | | | |

**A note on the code review score:** I check that the review actually exists on GitHub before grading. The written summary here and the GitHub comment should match. If the review isn't there, the written summary can't earn credit.
