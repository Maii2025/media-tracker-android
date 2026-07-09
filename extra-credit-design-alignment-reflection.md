# Extra Credit Reflection — Design Alignment

*See `extra-credit-design-alignment.md` for submission requirements and the full assignment description.*

**Name: Mai Nhia Vang
**Date: 07/02/2026

---

## The Audit

*Before touching any code, compare your running app to the wireframes screen by screen. List what you found — be specific about which screen, which component, and what was different. "The colors were off" is not specific. "The active chip on the Search screen was using amber instead of primary container (#E0E0FF)" is specific.*

*List at least five concrete differences you found:*

1. Color did not match the colors shown in the design tokens 
2. Buttons had different shapes, border shapes were not rounded
3. Some headings did not use correct front weight
4. Some text fields were not bold
5. The status badges in the Library section did not use correct color for WantTo, InProgress, and Finished. 

---

## What You Changed

*Walk through the changes you made. For each area of the design system, describe what the code looked like before and what you changed it to. Reference specific files and Composables.*


### Color System

<!-- What did your Color.kt look like before? What did you add or change? How did you wire colors into MaterialTheme? -->

In the Color.kt file, I changed the colors based on the requirements listed in the extra credit document.
The table below shows the before and after color changes. I changed the colors by adding the new color values based on the token section.

For example, the token section below shows Primary. In the file, it was written as:

val Primary = Color(0xFF4F46E5)

I deleted the old color value 0xFF4F46E5 and replaced it with the new color value 0xFF6366F1. 
The updated line became:

val Primary = Color(0xFF6366F1)

The table below shows the before and after colors change that I added into to the Color.kt file. 

Token | Hex (After color - now ) | Before color|
|:---|:---|:---|
| Primary | `#6366F1` | 0xFF4F46E5  |
| Primary Container | `#E0E0FF` | 0xFFE0E7FF  |
| On Primary Container | `#3730A3` | 0xFF1E1B4B |
| Secondary | `#DB2777` | 0xFFD97706 |
| Secondary Container | `#FCE7F3` | 0xFFFEF3C7 |
| Tertiary | `#D97706` | 0xFF0D9488 |
| Want To | `#7C3AED` | None, just created based on the requirement color|
| Want To Container | `#EDE9FE` | None, just created based on the requirement |
| In Progress | `#2563EB` | None, just created based on the requirement |
| In Progress Container | `#DBEAFE` | None, just created based on the requirement |
| Finished | `#059669` | None, just created based on the requirement|
| Finished Container | `#D1FAE5` | None, just created based on the requirement |



### Typography

<!-- Were weights hardcoded? Did you update Type.kt? What specifically changed? -->

The front weights were not hardcoded. I was able to change the Type.kt files based on the requirement. 
I changed the frontWeight from Medium to SemiBold and added a displayLarge style with a bold front weight.

### Buttons

<!-- Which button variants needed work? What was wrong and how did you fix it? -->

Before add the changes, the buttons used the default Material 3 style. The corners were not rounded like the wireframe design.
In the LoginScreen.kt, I changed the login button by adding RoundedCornerShape(20.dp) to make it look more rounded.
I also changed the button colors to the app's primary color and onPrimary text color that was written as ButtonDefaults.buttonColors().
Lastly, I did update the edit Profile button (MyProfileScreen.kt) to look rounded shaped.

### Text Fields

<!-- What shape and color changes did you make? -->

I changed the email field to use a placeholder to match the wireframe design. I also 
used RoundedCornerShape(8.dp) and changed the border color using OutlinedTextFieldDefaults.color.

### Other Components

<!-- Chips, cards, bottom nav, status badges — what changed? -->

Cards:
I changed in the ActivityFeedScreen.kt file. It changes the "elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)" 
to "elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)". 
This made the shadow of the card larger and more visible.

Bottom Navigation: 
I created a bottom navigation bar that is using NavigationBar and NavigationBarItem. This show different tabs
and make selected tabs to have a pill-shaped background using primaryContainer. The icon and text to use the primary color.
For the unselected tabs use onSurfaceVariant color which is a gray color. 

Status badges: 
I create a folder called components and add a filed called StatusBadge.kt. This file have the three badges of 
WantToBadge(), InprogressBadge(), and FinishedBadge(). It used the text colors from the Color.kt filed to 
match the design. 


---

## What Was Hard

*Describe the most technically challenging part of this work. Don't write "it was confusing." Explain specifically what confused you, what you tried, and what helped you figure it out. If something in the Jetpack Compose theming system surprised you, describe it.*

---
The hardest part of this assignment was finding which files and composables that I need to changed 
to meet the requirements. This project have many files and composables that I will have to be careful
when reviewing them. I have been compared each screen with wireframe and decide where to edit the code. 


## What You Understand Now

*What do you understand about Jetpack Compose theming — `MaterialTheme`, `colorScheme`, `typography`, component defaults — that you didn't fully grasp before this assignment? Be specific enough that you could explain it to a pod mate who hasn't done this yet.*

---
I understand that MaterialTheme controls the overall design such as text formatting, colors,
and UI components. It also helps keep the app's look consistent. 

For colorScheme, I learned that it manages color theme. If a component uses
MaterialTheme.colorScheme.primary, the color will automatically change when the primary color in the
theme is edited. 

I also learned that typography control text styles such as heading, body, labels. 
This help maintain consistent text formatting throughout the app's style. 



## Self-Assessment

*Look at the rubric (`extra-credit-design-alignment-rubric.md`) and estimate your own score 
for each section. Be honest — this does not affect your grade, but it shows me whether you read 
the rubric carefully.*

| Section | Possible | My Estimate |
|:---|:---:|:-----------:|
| Color System | 13 |     13      |
| Typography | 5 |      5      |
| Component Styling | 15 |     13      |
| Navigation & Cards | 5 |      4      |
| Reflection | 12 |     10      |
| **Total** | **50** |     45      |

*One thing I think I did well:*

One thing I did well is change the color in the Color.kt files. 
This one is not hard when reading the requirement assigned and can be easily understood.

*One thing I know I left incomplete or could have done better:*

What I could have done better is the FilterChip section. I am not sure how many FilterChip that I will
have to update by the "shape= RoundedCornerShape(8.dp)". 

