$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  As a user i want login to Jurnal.id\n  so i can see jurnal homepage",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify user login feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@2.1"
    }
  ]
});
formatter.step({
  "name": "User navigate to jurnal id",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter username as \u003cusername\u003e and password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User click sign in button",
  "keyword": "When "
});
formatter.step({
  "name": "User verify the \u003cstatus\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ]
    },
    {
      "cells": [
        "dikabrenda@outlook.com",
        "8SQVv/p9jVScEs4/2CZsLw\u003d\u003d",
        "Success"
      ]
    },
    {
      "cells": [
        "dikabrenda@outlook.com",
        "8D/NpYLiC+arNBHcGNcNpg\u003d\u003d",
        "Failed"
      ]
    },
    {
      "cells": [
        "dikabrend@outlook.com",
        "8SQVv/p9jVScEs4/2CZsLw\u003d\u003d",
        "Failed"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user login feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@2.1"
    }
  ]
});
formatter.step({
  "name": "User navigate to jurnal id",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.User_nagivate_to_jurnal_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username as dikabrenda@outlook.com and password as 8SQVv/p9jVScEs4/2CZsLw\u003d\u003d",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.User_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.User_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the Success in step",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.User_verify_the_status_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user login feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@2.1"
    }
  ]
});
formatter.step({
  "name": "User navigate to jurnal id",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.User_nagivate_to_jurnal_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username as dikabrenda@outlook.com and password as 8D/NpYLiC+arNBHcGNcNpg\u003d\u003d",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.User_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.User_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the Failed in step",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.User_verify_the_status_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user login feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@2.1"
    }
  ]
});
formatter.step({
  "name": "User navigate to jurnal id",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.User_nagivate_to_jurnal_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username as dikabrend@outlook.com and password as 8SQVv/p9jVScEs4/2CZsLw\u003d\u003d",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.User_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.User_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the Failed in step",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.User_verify_the_status_in_step(String)"
});
formatter.result({
  "status": "passed"
});
});