# Git Reset

## What is Reset?
Think of **reset** as a "go back in time" button. It’s used to undo changes, either by **moving your HEAD** back to a previous commit or by **un-staging files** that you haven’t committed yet. There are different types of reset, but they all involve **rewinding** changes in some way.

## Real-World Example:
Imagine you made several changes to your project but realized that one of your changes was a mistake. Instead of manually undoing everything, you can use **reset** to "reset" your work back to the way it was before the error.

- **Soft Reset**: Undo the commit, but keep changes staged.
- **Mixed Reset**: Undo the commit and unstage the changes.
- **Hard Reset**: Undo the commit and discard changes entirely.

## Types of Reset and How to Use Them:

### 1. Soft Reset (keep changes staged):
```bash
git reset --soft HEAD~1
```
This command moves your HEAD back one commit but keeps your changes in the staging area.

### 2. Mixed Reset (unstage changes):
```bash
git reset --mixed HEAD~1
```
This command moves your HEAD back one commit and unstages the changes.

### 3. Hard Reset (discard changes):
```bash
git reset --hard HEAD~1
```
This command moves your HEAD back one commit and discards the changes you made in the working directory.

## When to Use Reset:
- **Soft reset** is useful when you want to amend a commit (i.e., modify the commit but keep the changes staged for re-committing).
- **Mixed reset** is helpful when you want to undo a commit and untrack the changes (i.e., move them from the staging area to the working directory).
- **Hard reset** is useful when you want to completely discard the changes, such as when you've made a mistake or want to roll back to a clean state.