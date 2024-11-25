# Git Rebase

## What is Rebase?

In simple terms, **rebase** is like rewriting history. It allows you to move, combine, or change the order of commits in your Git history. It's mainly used to **integrate changes from one branch into another**, making the history cleaner.

Imagine you have two branches: one for your feature (`feature-branch`) and one for the main project (`main` branch). Let's say someone has made updates to the `main` branch, and you want to **move your changes on top** of those updates instead of just merging them in. This will help keep the commit history linear and avoid the messiness that can result from multiple merge commits.

## Real-World Example:

Let’s say you are working on a project, and your colleague made some updates to the `main` branch. Instead of merging those changes into your branch (which might create a messy commit history with merge commits), you can **rebase** your changes onto the `main` branch so it looks like you were working on top of their changes all along. This results in a cleaner, more understandable history.

### How to Rebase:

#### 1. Checkout your feature branch

```bash
git checkout feature-branch
```

#### 2. Rebase your changes on top of the `main` branch

```bash
git rebase main
```

In this example:

- `git checkout feature-branch`: Switches to your feature branch.
- `git rebase main`: Replays your feature branch commits on top of the latest `main` branch. This updates your feature branch to incorporate any changes that have been made to `main` since you started your work.

### What Happens After Rebase:

- Your changes will be **rewritten** to apply directly on top of `main`, which results in a **cleaner commit history**.
- If there are conflicts, Git will pause the rebase, and you will need to resolve them before continuing.

### To continue after resolving conflicts:

```bash
git rebase --continue
```

After resolving conflicts and continuing, Git will apply the remaining commits from your branch onto `main`.

---

## Interactive Rebase (`git rebase -i HEAD~n`)

In addition to the basic rebase workflow, Git also offers a powerful feature called **interactive rebase**. This allows you to modify the commit history of your branch, such as **squashing**, **reordering**, or **editing** commits. It's useful when you need to clean up your commits before pushing them to a shared repository.

### What is `git rebase -i HEAD~n`?

The **interactive rebase** (`git rebase -i`) allows you to interactively modify the last `n` commits on your branch. The `HEAD~n` argument specifies how many commits back from the current commit you want to rebase.

For example, if you wanted to rebase the last 5 commits, you'd run:

```bash
git rebase -i HEAD~5
```

This will open a text editor with a list of the last 5 commits, and you can choose what to do with each one.

### Why Use `git rebase -i`?

- **Squash commits**: Combine multiple commits into one to keep your history clean and concise.
- **Reorder commits**: Change the order of commits if needed (e.g., if one commit depends on another).
- **Edit commit messages**: Change the commit message to better describe the work done.
- **Split commits**: Break up a commit into smaller, more logical pieces.
- **Remove commits**: Remove unnecessary or unwanted commits from the history.

---

### Step-by-Step Guide to Interactive Rebase

1. **Start an Interactive Rebase**

   First, decide how many commits you want to work with. For example, to work with the last 3 commits:

   ```bash
   git rebase -i HEAD~3
   ```

   This will open an editor showing a list of the last 3 commits:

   ```
   pick f3f12e2 Commit message #3
   pick 45df34a Commit message #2
   pick 9a123df Commit message #1
   ```

2. **Modify the Commit List**

   You'll see a list of commits, each with the word `pick` in front of it. This is where you can decide what to do with each commit.

   Here are some of the most common actions you can take:

   - **Squash commits**: To combine commits, change `pick` to `squash` (or just `s` for short) on the commit you want to merge into the previous one.

   ### know more about [**Squash**](https://github.com/rothardo/java-0-to-1/blob/master/Session-7/Squash.md) here.

   Example: If you want to squash `Commit message #2` into `Commit message #3`, change the second line like this:

   ```
   pick f3f12e2 Commit message #3
   squash 45df34a Commit message #2
   pick 9a123df Commit message #1
   ```

   - **Reorder commits**: To reorder commits, simply change the order of the lines. For example, if you want to swap the positions of `Commit message #2` and `Commit message #1`, you would do:

     ```
     pick f3f12e2 Commit message #3
     pick 9a123df Commit message #1
     pick 45df34a Commit message #2
     ```

   - **Edit commit messages**: To change the commit message of a commit, replace `pick` with `reword`:

     ```
     pick f3f12e2 Commit message #3
     reword 45df34a Commit message #2
     pick 9a123df Commit message #1
     ```

   - **Remove commits**: If you want to delete a commit, simply remove the line from the list.

3. **Save and Exit the Editor**

   After you've made your changes, save the file and exit the editor. Git will then apply the changes according to your instructions.

4. **Handle Conflicts**

   If there are any conflicts during the rebase (for example, if the changes in one commit conflict with those in another), Git will pause and ask you to resolve the conflicts. After resolving the conflicts, you can continue the rebase by running:

   ```bash
   git rebase --continue
   ```

5. **Finish the Rebase**

   Once the rebase is complete, your branch history will have been rewritten according to your changes. If you squashed commits, you might be asked to update the commit message for the squashed commit. Edit the message and save.

---

## Remember

**Rebase rewrites history**, so be cautious when rebasing commits that have already been shared with others, as it can lead to confusion or lost work.
