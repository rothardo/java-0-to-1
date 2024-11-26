# Git Stash

## What is Stash?

Imagine you’re working on a feature, but you need to temporarily leave your work to fix something urgent. **Stashing** lets you "shelve" your changes and come back to them later.

## Real-World Example:

Let’s say you are working on a feature, and in the middle of it, you need to switch to a bug fix on a different branch. You don’t want to commit your unfinished work yet, so you **stash** it, switch to the other branch, and once you're done, you can come back and **apply** your changes later.

## How to Do It:

### 1. Stash Changes:

```bash
git stash
```

This command saves your uncommitted changes and restores your working directory to the state of the last commit.

### 2. Apply Stashed Changes:

```bash
git stash apply
```

This command re-applies the last stashed changes to your working directory.

### 3. List Stashes:

```bash
git stash list
```

This shows a list of all the stashes you've saved.

### 4. Drop a Stash:

```bash
git stash drop
```

This deletes the latest stash.

## When to Use Stash:

- When you need to temporarily set aside changes without committing them (e.g., to switch branches or work on a different task).
- When you want to save your work temporarily, and then return to it later without leaving a messy history.
