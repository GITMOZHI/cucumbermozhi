$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Gayathri/eclipse-workspace/mozhi/Seleniumcucumber/feature/speed.feature");
formatter.feature({
  "name": "To get net speed",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To get net speed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user is on netflix speed page",
  "keyword": "Given "
});
formatter.match({
  "location": "Upload.user_is_on_netflix_speed_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check net speed",
  "keyword": "When "
});
formatter.match({
  "location": "Upload.check_net_speed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the net speed printed",
  "keyword": "Then "
});
formatter.match({
  "location": "Upload.check_the_net_speed_printed()"
});
formatter.result({
  "status": "passed"
});
});