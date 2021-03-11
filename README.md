CodePath App Development Project
===

# Runner's High

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
Runner's High is a mood-tracking and run-tracking app that allows users to log their mood both before and after they go running. It also logs the user's run through location services and provides information on their pace and route. User will be able to look back at data from previous runs and see how their mood has changed over time.

### App Evaluation
- **Category:** Health and Fitness.
- **Mobile:** Having the phone with them allows a user to track their run.
- **Story:** Allows users to track their mood and see the effect of exercise on their mood both long term and short term.
- **Market:** Anyone invested in their physical or mental health would enjoy this app.
- **Habit:** Users with a regular exercise routine would make use of the app in accordance with their routine. The app would also influence people to develop a routine by showing promising results.
- **Scope:** The app is still in the developmental phase. 

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User will report their mood before and after the run using radiobuttons that quantify various emotions-stress,anxiety etc. 
* User will be able to track their run live and review it after finishing

**Optional Nice-to-have Stories**

* Directions while running
* Announcements of running stats (text-to-speech)
* Setting end destination
* Being able to see graph of emotional progress over time
* Being able to see relationship between pre-run mood and run performance or mood post-run and run performance.-definitely optional for now
* Implement map so user can see live position while running
* Implement links to mental health links/phone numbers

### 2. Screen Archetypes

* Home Screen/Start Screen
   * Display data on past run and mood
   * Display a button to start a new run
* Mood Logging Screen (Create Screen)
   * Features radio buttons to allow user to track anxiety,stress,overall mood on scales 1-10 and journal anything else on their mind if they choose.
* Settings Screen
    * Allows user to toggle TTS, when announcements are made, (etc.)

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home Screen
* Data visuals screen. Graphs etc
* Mood Logging Screen
* Map Screen

**Flow Navigation** (Screen to Screen)

* Settings
   * => Back to Homescreen
* Homescreen
   * => Maps(Go for run button) 
   * => Mood Logging screen
   * => Settings Screen

## Wireframes
<img src="/WireframeCodepath-1.png" width=600>

## Schema 
[This section will be completed in Unit 9]
### Models
[Add table of models]
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
