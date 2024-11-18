# Git

## What is Version Control?

Version control is like having a detailed history book for your project. It keeps track of every change made to your files over time, allowing you to revisit and restore previous versions whenever needed. This system is crucial for teamwork, as it lets multiple people work on the same project without stepping on each other's toes. By using version control, you can easily see who made what changes, collaborate smoothly, and ensure that your project's development is well-organized and conflict-free.

## What is Git?
Git is the software that you use to help you notice the modifications that you make to the files on your computer.

It is similar to the save button in the video game but your code or documents. 
In case you have made the mistake you are able to go back to the previous versions.

Imagine you are the owner of a time machine with the capacity of taking you back to any moment of your project's history. 

If you find that you have made a mistake or you want to know how your project looked at an earlier point,
you can use Git to "travel back in time" and view or restore old versions of your files.

## Benefits of using Git

- **Collaboration**:
    The same number of people can work on one project together in the same time without one of them overwriting the work of another.

- **Version Control**: 
    You can keep a record of each and every change made to your files and if you want to go back to any previous version you can do it.

- **Backup**: 
    It acts as a backup system for your files, which means that your work is not lost.

# Git in Technical Terms

## What is Git?

Git is a distributed version control system that was created to cope with 
everything from small to very large projects in a fast and efficient manner. 
It enables several developers to work on a project at the same time without any disturbances among them.

## Uses of Git

- **Branching and Merging**: 
    Git gives you the opportunity to create branches with the intention of working on different features 
    or fixes independently and then later merge them into the main project easily.
    
- **Distributed Development**: 
    Each and every developer has a local copy of the full project history, 
    which means that they can work offline as well as they can reduce the dependency on the central server.

- **Tracking Changes**: 
    Git sees the changes on the file level, so you can view the changes made by whom and when.

## Key Git Concepts in Laymen Terms

### Repository (Repo)
A repository is just like a folder that Git is holding you for all the changes made to project files. 
It's the place where everything about your project and their history is stored.

### Git Add
`git add` is a command that tells Git to start tracking changes to a specific file. 
It's like selecting files you want to save before you actually save them.

### Git Status
`git status` is a command that shows you the current state of your project. 
It tells you which files have been changed, which ones are staged for commit, and which ones are not being tracked by Git. 
Think of it as a quick check-up to see what’s going on with your files before you save your changes.

### Commit
A commit is a thing similar to a snapshot of your project at a particular time. 
It secures the current location of your files so you can come back to it if you want it later. 

Think of Git commits as the markers you leave while discovering a jungle. 
Every marker stands for a particular point on your journey, 
and thus it is possible to trace back your steps to any other marker in case you want to return or change your path. 

Just like these markers help you navigate the jungle, 
Git commits help you manage and navigate the history of your project.

### Example of Git Commit

To create a commit, you first need to stage your changes using `git add`, and then commit them with a message describing the changes:

```bash
git add .
git commit -m "Add initial project files"
```

This will create a commit with the message "Add initial project files" that you can refer to later.
