# Week {{N}} Reflection

**Name: Mai Nhia Vang                
**Date: 07/02/2026

---

## Commits This Week

<!-- Paste a link to your commits for this week. The easiest way: go to your repo on GitHub,
     click "commits", and copy the URL after filtering by your name or branch. -->

**Link: https://github.com/Maii2025/media-tracker-android/commit/936c474da48440322dc998eab5a3250faa1f5e15
---

## Code Review

<!-- Every week you leave a review on a pod mate's pull request. Fill in both parts below.
     Part 1 is the link — I will verify the review exists on GitHub.
     Part 2 is your written assessment — what you actually looked at and what you found. -->

**Reviewed: Jacob Vigliotti* *(pod mate's name)*
**Link to my review: https://github.com/jacobvigliotti/media-tracker-android/pull/7/changes/f11d779ca9fc8df520bca8573e8fd5c59dc9b33d

### What I Looked At

<!-- Walk through the code you reviewed. What was the PR trying to do? Which files or
     functions did you focus on? -->

The files that I look into his code is: MediaDetailScreen.kt. This file show all the details that 
he build for a single media page in the library. It includes the cover image, title, author,
description, rating, action buttons (Want To and Save), and a section for reviews. 



### What I Noticed

<!-- Be specific. Did you spot a potential bug? A pattern that could cause problems? Something
     done well that you want to call out? "I looked at the ViewModel and everything seemed fine"
     is not specific enough. Name the thing you noticed and explain why it matters. -->

I noticed that the code is clear and easy to read. The TopAppBbar has a back button that helps the user
go back to the previous screen. This is important because if there is no back button, the user would
get stuck on the page and not be able to return to the last screen. The back button works by
calling onNavigateBack(), which sends the user back when they tap it.

"TopAppBar(
modifier = Modifier.fillMaxWidth(), // Forces full horizontal width
navigationIcon = {
IconButton(onClick = { onNavigateBack() }) {
Icon(
imageVector = Icons.AutoMirrored.Filled.ArrowBack,
contentDescription = "Back"


### Comments I Left

<!-- Briefly summarize the comments you left on the PR. If you left a positive comment,
     say what it was. If you left a suggestion, say what you suggested and why. -->
---
let my pod mate know that it is important to have a back button to help users navigate back to the
previous screen. This matters for this page because it makes it easier for users to move around the
app and return to the original screen without confusion.

I also mentioned that the page description for Dune uses the same information as the wireframe 
that we are trying to build. I suggested that he and I should consider adding information that
relates more to us personally. I also understand why he did not include unique information 
in that test description because of the short time.

## One Thing I Understood More Deeply

<!-- Be specific. Don't write "I learned about ViewModels." Write what specifically clicked —
     what was confusing before, what made it make sense, and how you'd explain it to someone else.
     There are no wrong answers here. -->

---
One thing I understand more deeply is that each page or screen we build can use @Composable to 
preview the screen. I may not have pay close attention to the word @Composable before, and 
it did not fully make sense to me. Now I understand why this annotation is important when 
building a screen in Jetpack Compose.

## One Thing I'm Still Confused About

<!-- Be honest. This is the most useful part of the reflection for me — it tells me where to
     spend more time in class. You will not lose points for being confused. -->

---
One thing I’m still confused about is how @Composable works when building a full screen. 
I know it helps show UI, but I am still learning how different composable functions work together 
and update the screen.

## Anything Else *(optional)*

<!-- Did you help a pod mate work through something? Did you discover something cool or frustrating?
     Did something from a previous week finally click? This is a good place to put it. -->

---

I like how you give us directions through Word documents. This helps us read the questions
multiple times and better understand them. It would be great if you could upload them 1 or
2 days ahead of time. This would help me and other students who have issues with their 
code to work ahead. Most of the time, I am trying to fix my screen but cannot find the 
issue. It is not that I did not work on my issue before class—I did—but sometimes I 
still run into problems after adding code to the program.



## Rubric

*You don't need to self-assess — this is here so you know what I'm looking at.*

| Section | Points | Full Credit | Half Credit | No Credit |
|:---|:---:|:---|:---|:---|
| **Reflection** | 10 | Specific, honest responses to "More Deeply" and "Still Confused" sections. Shows genuine thinking — not just "I learned X." | Responses are present but vague or generic ("I got better at Compose"). | Missing or one-word answers. |
| **Code Review** | 10 | Specific observation about the code with explanation of why it matters (or a substantive positive comment). Link to review present and verified. | A question or comment that shows you read the code, but lacks explanation. | "Looks good!" or equivalent. Missing link. Review not found on GitHub. |
| **Total** | **20** | | | |

**A note on the code review score:** I check that the review actually exists on GitHub before grading. The written summary here and the GitHub comment should match. If the review isn't there, the written summary can't earn credit.
