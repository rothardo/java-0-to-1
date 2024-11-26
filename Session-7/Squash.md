# Git Squash

## What is Squash?
Squashing is a way to combine multiple commits into a single commit. This is especially useful when you’ve made many small commits that don’t add much value and you want to clean up your commit history.

## Real-World Example:
Let’s say you’ve been working on a feature and have made several commits to fix small bugs or improve things. Instead of having a cluttered commit history, you decide to squash those commits into one clean, concise commit.

## How to Do It:

### 1. Start an Interactive Rebase:
First, start an interactive rebase to the commit before the first commit you want to squash:

```bash
git rebase -i HEAD~5
```

### 2. Change `pick` to `squash`:
In the rebase interface, change `pick` to `squash` (or `s`) for the commits you want to combine into one.

**Example:**

```text
pick abc123 First commit
squash def456 Second commit
squash ghi789 Third commit
```

### 3. Save and Exit:
After editing the rebase todo list, save and exit. Git will then combine the selected commits into one.

### 4. Edit Commit Message:
Git will open an editor to allow you to edit the commit message for the squashed commit. Write a single commit message that summarizes the changes.

### 5. Complete the Rebase:

```bash
git rebase --continue
```

## When to Use Squash:
- When you have multiple small or experimental commits and want to clean up your commit history before merging them into the main branch.
- When you want to combine related changes into a single commit to make the history more understandable.
