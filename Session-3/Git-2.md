# Git Configuration

## What is `git config`?

`git config` is a command used to set configuration options for your Git installation. These configurations can be for your identity (like your name and email), how Git behaves, and other preferences.

## Technical Explanation

The `git config` command allows you to configure Git settings at three different levels:

1.  **Global Level**: Applies to the current user across all repositories. Use the `--global` flag.
    ```sh
    git config --global user.name "Your Name"
    ```
2.  **System Level**: Applies to all users on the system and all their repositories. Use the `--system` flag.

    ```sh
    git config --system core.editor "vim"
    ```

3.  **Local Level**:

                To set the configuration at the local level, you can use the following command:

                Applies to the specific repository that you are working on. No flag is needed.

        `sh

    git config user.email "your.email@example.com"
    `

            ```sh
            git config --local user.email "your.email@example.com"
            ```

Configuration settings are stored in different files depending on the level:

- System: `/etc/gitconfig`
- Global: `~/.gitconfig` or `~/.config/git/config`
- Local: `.git/config` in the repository directory

You can also edit these files directly to change the configuration settings.(Optional)

## Common `git config` Commands

- `git config --global user.name "Your Name"`: Sets your name for all repositories.
- `git config --global user.email "your.email@example.com"`: Sets your email for all repositories.
- `git config --list`: Lists all the configuration settings.

# Git Log and Git Show

## `git log`

`git log` shows the commit history for the repository.
It lists all the commits made in the repository in reverse chronological order.

### Example

```sh
git log
```

## `git show`

`git show` displays detailed information about a specific commit.

### Example

```sh
git show <commit-hash>
```

# Git Branch

## What is a Branch?

A branch in Git is a pointer to a specific commit. It allows you to work on different versions of a project simultaneously.

### Example

```sh
git branch new-feature
git checkout new-feature
```

# Git Merge

## What is Merge?

Merging is the process of combining changes from different branches into one.

### Example

```sh
git checkout master
git merge new-feature
```

below is an image of the same
![Git Merge](https://github.com/rothardo/java-0-to-1/blob/master/Session-3/GIT-MERGE.png){ width=50% }

## Handling Merge Conflicts

When there are conflicting changes, Git will notify you. You need to manually resolve these conflicts.

### Example

```sh
# Edit the conflicting files to resolve conflicts
git add <resolved-file>
git commit
```

# Git Remote

## What is Remote?

A remote in Git is a common repository that all team members use to exchange their changes.

### Example

```sh
git remote -v
```

### Origin and Upstream

- **Origin**: The default remote repository.
- **Upstream**: The original repository from which you forked.

### Example

```sh
git remote add origin https://github.com/yourusername/java-0-to-1
git remote add upstream https://github.com/rothardo/java-0-to-1
```

## Setting Up Other Remotes

### Example

```sh
git remote add new-origin https://github.com/anotheruser/java-0-to-1
```

# Git Clone

## What is Clone?

`git clone` is used to create a copy of an existing repository.

### Example

```sh
git clone https://github.com/rothardo/java-0-to-1
```

# Git Push

## What is Push?

`git push` uploads your local changes to the remote repository.

### Example

```sh
git push origin master
git push origin new-feature
```

# Pull Request (PR)

## What is a PR?

A Pull Request (PR) is a way to propose changes to a repository.

### Easy Terms

A PR is like asking the project owner to pull in your changes.

### Technical Terms

A PR is a request to merge your branch into another branch in the repository.

### Example

```sh
# Create a new branch
git checkout -b new-feature

# Make changes and commit
git commit -am "Add new feature"

# Push the branch to remote
git push origin new-feature

# Create a PR on GitHub
```
