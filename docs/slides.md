% OSLC Lyo workshop
% Andrew Berezovskyi and Jad El-khoury
% 30. Nov 2017

# Introduction

### Format

- 40..60 minute lecture
- ~2 hours for the hands-on
- **Make sure you have the OVA virtual machine image imported into VirtualBox and verify that the VM boots and Eclipse link on the desktop works!**

# OSLC & Linked Data intro lecture

# Hands-on

## Preliminaries

### Getting around the VM tools

- Eclipse shortcut is on the desktop
- `Ctrl+Alt+T` opens up the terminal
- `~/Desktop/lyo-workshop` is where the exercise material is
- `~/opt/` is where most of the tools are installed

### Task recap

- Users directory as a linked data service
- Jira linked data service proxy (adaptor)

### First steps

- Check out Jira http://localhost:2990
    - log in using `admin:admin` pair
    - pro tip: Firefox has most of the bookmarks you need for today
- Start a triplestore via `fuseki run`
    - pro tip: `Ctrl+Shift+T` opens a terminal tab