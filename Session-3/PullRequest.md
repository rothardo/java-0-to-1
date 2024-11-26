# Pull Request (PR)

## What is a PR?

A Pull Request (PR) is a way to propose changes to a repository.

### Easy Terms

A PR is like asking the project owner to pull in your changes.

### Technical Terms

A PR is a request to merge your branch into another branch in the repository.

### Understanding the Workflow

A PR typically involves these steps:

1. **Forking (Optional but Common):** Create a copy of the original repository (fork). This creates a personal copy where you can make changes without affecting the original.

2. **Branching:** Create a new branch from the main branch (often `main` or `master`) of your forked repository. This isolates your changes from the main codeline.

3. **Making Changes:** Edit files, add new code, or fix bugs within your new branch.

4. **Committing Changes:** Save your changes with descriptive commit messages. Good commit messages are concise and explain the purpose of each change.

5. **Pushing Changes:** Upload your branch to your forked repository on the platform (e.g., GitHub).

6. **Creating the Pull Request:** On the platform, initiate a PR from your branch to the original repository's main branch. This formally proposes your changes for review.

7. **Review and Feedback:** The maintainers of the original repository will review your code, provide feedback, and may request changes.

8. **Addressing Feedback:** Make any necessary revisions based on the feedback received. You can push these updates to your branch, and they'll automatically update the PR.

9. **Merging:** Once the review is complete and all changes are approved, the maintainers will merge your branch into the main branch of the original repository, integrating your contributions.

### Using Pull Requests on GitHub

Here's a practical example using GitHub:

1. **Fork the Repository:** Find the repository you want to contribute to and click the "Fork" button.

2. **Clone the Fork:** Clone your forked repository to your local machine:

   `git clone <your_forked_repo_url>`

3. **Create a Branch:** Create a new branch for your changes:

   `git checkout -b my-new-feature`

4. **Make Changes, Commit, and Push:** Make your changes, commit them with meaningful messages, and push your branch to your forked repository:

```sh
   git add .
   git commit -m "Add new feature"
   git push origin my-new-feature
```

5. **Create the Pull Request on GitHub:** Go to your forked repository on GitHub. You should see a notification to create a pull request. Click it, review your changes, and submit the PR.

### Best Practices

- Use descriptive branch names that clearly indicate the purpose of your changes.
- Write clear and concise commit messages.
- Keep your PRs focused on a single logical change. Large PRs are harder to review.
- Address reviewer feedback promptly and thoroughly.
