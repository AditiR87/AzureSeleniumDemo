$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Eastender.feature");
formatter.feature({
  "line": 2,
  "name": "Verify the Eastenders next Epsoide Time",
  "description": "",
  "id": "verify-the-eastenders-next-epsoide-time",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "check the time of EastEnder next Epsoide via TV button and iplayer search",
  "description": "",
  "id": "verify-the-eastenders-next-epsoide-time;check-the-time-of-eastender-next-epsoide-via-tv-button-and-iplayer-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tvbuttonsearch"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select the TV option under More option in header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "iplayer page is opened",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"\u003csearch1\u003e\" in search box",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on first link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Programme website",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "check the time for the next episode",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "verify-the-eastenders-next-epsoide-time;check-the-time-of-eastender-next-epsoide-via-tv-button-and-iplayer-search;",
  "rows": [
    {
      "cells": [
        "search1"
      ],
      "line": 14,
      "id": "verify-the-eastenders-next-epsoide-time;check-the-time-of-eastender-next-epsoide-via-tv-button-and-iplayer-search;;1"
    },
    {
      "cells": [
        "EastEnders"
      ],
      "line": 15,
      "id": "verify-the-eastenders-next-epsoide-time;check-the-time-of-eastender-next-epsoide-via-tv-button-and-iplayer-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7850608020,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "check the time of EastEnder next Epsoide via TV button and iplayer search",
  "description": "",
  "id": "verify-the-eastenders-next-epsoide-time;check-the-time-of-eastender-next-epsoide-via-tv-button-and-iplayer-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tvbuttonsearch"
    },
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select the TV option under More option in header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "iplayer page is opened",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"EastEnders\" in search box",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on first link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Programme website",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "check the time for the next episode",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSD.i_am_in_HomePage()"
});
formatter.result({
  "duration": 478342201,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSD.i_select_the_TV_option_under_More_option_in_header()"
});
