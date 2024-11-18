# Pulling Changes from Origin or Upstream

When working on a project with multiple people, it's important to keep your local repository up-to-date with the latest changes. Here are some simple steps to pull changes from the origin or upstream repository.

## Pulling Changes from Upstream to Local

You can pull changes directly from the upstream repository to your local repository and then push those changes to your origin repository.

### Technical Steps:
1. Add the upstream repository if you haven't already:
    ```bash
    git remote add upstream <URL-of-upstream-repo>
    ```
2. Fetch the latest changes from the upstream repository:
    ```bash
    git fetch upstream
    ```
3. Merge the changes into your local branch:
    ```bash
    git merge upstream/main
    ```
4. Push the changes to your origin repository:
    ```bash
    git push origin main
    ```

### Easy Version:
1. Link the main project repository to your local setup.
2. Get the latest updates from the main project.
3. Combine those updates with your local work.
4. Send the updates to your personal GitHub repository.

## Syncing Fork on GitHub and Pulling Changes

Alternatively, you can sync your fork on GitHub itself and then pull the changes from your origin repository.

### Technical Steps:
1. Go to your forked repository on GitHub.
2. Click on the "Fetch upstream" button and then "Fetch and merge".
3. Pull the changes to your local repository:
    ```bash
    git pull origin main
    ```

### Easy Version:
1. Update your forked repository on GitHub with the latest changes from the main project.
2. Download those updates to your local setup.

## Creating a Pull Request

To contribute your changes back to the main project, you need to create a pull request.

### Technical Steps:
1. Push your changes to your origin repository:
    ```bash
    git push origin main
    ```
2. Go to your forked repository on GitHub.
3. Click on the "New pull request" button.
4. Select the base repository (upstream) and the branch you want to merge into.
5. Create the pull request.

### Easy Version:
1. Send your updates to your personal GitHub repository.
2. On GitHub, request to merge your updates into the main project that is the upstream.

## Example with Three People

Imagine three people, Akash, Ayush, and Amit, working on a project. Akash makes some changes and pushes them to the upstream repository. Ayush and Amit should regularly pull changes from the upstream to keep their local repositories up-to-date. When Ayush finishes his work, he creates a pull request to merge his changes into the upstream. Once the changes are merged, Amit can pull the latest updates from the upstream.

## Good Practice

It's a good practice to regularly pull changes from the upstream repository before pushing anything to your origin. This ensures that you have the latest updates and reduces the chances of merge conflicts.

Remember, continuously pulling from upstream is not mandatory, but it helps you stay updated with any changes others have made to the project.
