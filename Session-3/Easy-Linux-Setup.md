# Easy Linux Setup on Windows

## Setting up WSL

To set up Linux on Windows easily, you can use the Windows Subsystem for Linux (WSL). Run the following command in PowerShell:

```powershell
wsl --install
```

This command will install WSL and the default Linux distribution. If you are on Windows, you will also need to download the Ubuntu app from the Microsoft Store. This app will connect to WSL and act as an overlay.

If you are already on Linux or macOS, you can skip the above instructions and proceed to the next part.

## Setting up Ubuntu

Open the terminal or, on Windows, the Ubuntu app. You will need to set up Ubuntu by running the following commands:

```bash
sudo apt update
sudo apt upgrade
```

You will also need to set up a user and password for Linux.(Optional)

## Installing WSL Extension in VS Code

Before proceeding to the next step, ensure you have the WSL extension installed in Visual Studio Code.

## Forking and Cloning the Repository

1. Fork the repository [https://github.com/rothardo/java-0-to-1](https://github.com/rothardo/java-0-to-1) on GitHub.
2. Clone your forked repository:

```bash
git clone https://github.com/<your-username>/java-0-to-1.git
```

3. Change directory into the cloned repository:

```bash
cd java-0-to-1
```

4. Open the repository in VS Code:

```bash
code .
```

If you are on Linux or macOS, you can simply open the app.


## Checking Remote Repositories

To verify your remote repositories, you can run the following command in your terminal:

```bash
git remote -v
```

You should see output similar to the following:

```
origin  https://github.com/<your-username>/java-0-to-1.git (fetch)
origin  https://github.com/<your-username>/java-0-to-1.git (push)
upstream  https://github.com/rothardo/java-0-to-1.git (fetch)
upstream  https://github.com/rothardo/java-0-to-1.git (push)
```

This indicates that `origin` points to your forked repository and `upstream` points to the original repository.

## Making Changes

Make your changes as per the instructions in each session's `instructions.md`.

## Committing and Pushing Changes

1. Commit your changes:

```bash
git add .
git commit -m "Your commit message"
```

2. Push your changes to your forked repository (origin):

```bash
git push origin master
```

3. Create a pull request to the upstream repository's master branch from GitHub.

Your changes will be reviewed and, once accepted, will be reflected in the main repository.


