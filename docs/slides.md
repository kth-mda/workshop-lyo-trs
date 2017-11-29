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

### Before we get into OSLC... (I)

Let's play a bit with RDF and SPARQL.

- Go to the _Setting up the User Directory adaptor_ section of the handout
- Copy the SPARQL query to initialise the user directory
- Open http://localhost:3030/ and then _Dataset_ tab
- Paste the query into an editor
- Select `JiraDataset` from the dropdown
- Copy the _SPARQL Update_ URI from the _info_ tab
- Paste it into the _SPARQL endpoint_ field back on the _query_ tab
- Hit the "play" button in the top right corner

### Before we get into OSLC... (II)

Now let's switch back to the query endpoint URI (just replace `update` with `query` at the end of the _SPARQL endpoint_ field) and let's ask a few queries.

#### Count the number of users

```sparql
SELECT (COUNT(DISTINCT ?instance) AS ?count) WHERE {
  ?instance a <http://xmlns.com/foaf/0.1/#Person> .
}
```

#### DIY!

**Task: Retrieve all given names of the users.**