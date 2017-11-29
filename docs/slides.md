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

### Task recap

- Users Directory linked data service (adaptor)
- Jira adaptor
- Connect Jira bug authors to UD users
- Stream the adaptor resource updates over TRS (MQTT)
- Bonus: create a digital twin (as a V-REP adaptor)

### First steps

- Start the VM using VirtualBox 5.1 or higher
- Check out Jira http://localhost:2990
    - log in using `admin:admin` pair
    - pro tip: Firefox has most of the bookmarks you need for today
- Start a triplestore via `fuseki run`
    - pro tip: `Ctrl+Shift+T` opens a terminal tab

### Getting around the VM tools

- Eclipse shortcut is on the desktop
- `Ctrl+Alt+T` opens up the terminal
- `~/Desktop/lyo-workshop` is where the exercise material is
- `~/opt/` is where most of the tools are installed

### Before we get into Lyo Designer... (I)

Let's play a bit with RDF and SPARQL.

- Go to the _Setting up the User Directory adaptor_ section of the handout
- Copy the SPARQL query to initialise the user directory
- Open http://localhost:3030/ and then _Dataset_ tab
- Paste the query into an editor
- Select `JiraDataset` from the dropdown
- Copy the _SPARQL Update_ URI from the _info_ tab
- Paste it into the _SPARQL endpoint_ field back on the _query_ tab
- Hit the "play" button in the top right corner

### Before we get into Lyo Designer... (II)

Now let's switch back to the query endpoint URI (just replace `update` with `query` at the end of the _SPARQL endpoint_ field) and let's ask a few queries.

#### Count the number of users

```sparql
SELECT (COUNT(DISTINCT ?instance) AS ?count) WHERE {
  ?instance a <http://xmlns.com/foaf/0.1/#Person> .
}
```

#### DIY!

**Task: Retrieve all given names of the users.**

## User Directory adaptor

### Define the Domain Specification (I)

- Switch to _Sirius_ perspective
- Open the `toolchain.xml` file (_not with the double-click, but using the triangle arrow_).
- Open the `Specification` element further
- Double-click on the _Specification Diagram_

### Define the Domain Specification (II)

> **TODO: picture from the Specification Diagram here**

### Define the Domain Specification (III)

- Create the `FOAF` domain
- Add the `Person` resource
- Add three literal properties:
    - `name:String`
    - `givenName:String`
    - `familyName:String`

### Define the Domain Specification (IV)

> **TODO: picture with the Person resource here**

### Create the User Directory adaptor (I)

Open the _Toolchain Diagram_:

> **TODO: picture from the Toolchain Diagram here**

### Create the User Directory adaptor (II)

Add the `UserDirectory` adaptor from the pallette:

> **TODO: picture with the UD here**

> Use the previously defined Domain when prompted

### Create the User Directory adaptor (III)

Define the generation parameters under _Properties_ view, _Semantic_ tab:

> **TODO: picture with the semantic tab here**

### Create the User Directory adaptor (IV)

Fill out the following values in the _Semantic_ tab:

-