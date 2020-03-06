$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/searchh.feature");
formatter.feature({
  "name": "Registered user Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Registered user login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login11"
    }
  ]
});
formatter.step({
  "name": "navigate to signin page1",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on signin11",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Username1 \"\u003cusrnm123\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Password1 \"\u003cpwd123\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Login1",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on search product textbox1 \"\u003csearch111\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on search button12",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usrnm123",
        "pwd123",
        "",
        "search111"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "password123",
        "",
        "bag"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Registered user login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login11"
    }
  ]
});
formatter.step({
  "name": "navigate to signin page1",
  "keyword": "Given "
});
formatter.match({
  "location": "search.searchpro.navigate_to_signin_page1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin11",
  "keyword": "When "
});
formatter.match({
  "location": "search.searchpro.signin1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username1 \"Lalitha\"",
  "keyword": "And "
});
formatter.match({
  "location": "search.searchpro.usrnm123(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Password1 \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "search.searchpro.pwd123(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login1",
  "keyword": "And "
});
formatter.match({
  "location": "search.searchpro.loginn1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search product textbox1 \"bag\"",
  "keyword": "When "
});
formatter.match({
  "location": "search.searchpro.search111(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button12",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});