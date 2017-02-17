$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/fruit.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Fruit list",
  "description": "To make a great smoothie , I need some fruit",
  "id": "fruit-list",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 21,
  "name": "List fruit",
  "description": "",
  "id": "fruit-list;list-fruit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "the system knows about the following fruit:",
  "rows": [
    {
      "cells": [
        "name",
        "color"
      ],
      "line": 23
    },
    {
      "cells": [
        "banana",
        "yellow"
      ],
      "line": 24
    },
    {
      "cells": [
        "strawberry",
        "red"
      ],
      "line": 25
    },
    {
      "cells": [
        "orange",
        "orange"
      ],
      "line": 26
    },
    {
      "cells": [
        "blackberry",
        "black"
      ],
      "line": 27
    },
    {
      "cells": [
        "cherry",
        "red"
      ],
      "line": 28
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "the client requests GET /fruits",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "the response should be JSON:",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 31,
    "value": "[{\"name\":\"banana\",\"color\":\"yellow\"},\r\n {\"name\":\"strawberry\",\"color\":\"red\"},\r\n {\"name\":\"orange\",\"color\":\"orange\"},\r\n {\"name\":\"blackberry\",\"color\":\"black\"},\r\n {\"name\":\"cherry\",\"color\":\"red\"}\r\n]"
  }
});
formatter.match({
  "location": "FruitSteps.theSystemKnowsAboutTheFollowingFruit(Fruit\u003e)"
});
formatter.result({
  "duration": 82908691,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.theClientRequestsGETFruits()"
});
formatter.result({
  "duration": 305156471,
  "status": "passed"
});
formatter.match({
  "location": "RestSteps.theResponseShouldBeJSON(String)"
});
formatter.result({
  "duration": 148623108,
  "status": "passed"
});
});