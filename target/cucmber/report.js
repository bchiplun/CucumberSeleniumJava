$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and add items to cart",
  "description": "",
  "id": "search-and-add-items-to-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search a vegetable and check if it is displayed",
  "description": "",
  "id": "search-and-add-items-to-cart;search-a-vegetable-and-check-if-it-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Selenium"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Greenkart home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User seach \"Cucumber\" in search box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" is displayed on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumstepDefinition.user_is_on_greenkart_home_page()"
});
formatter.result({
  "duration": 5406777400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 12
    }
  ],
  "location": "SeleniumstepDefinition.user_seach_something_in_search_box(String)"
});
formatter.result({
  "duration": 3415510800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "SeleniumstepDefinition.something_is_displayed_on_the_page(String)"
});
formatter.result({
  "duration": 78955400,
  "status": "passed"
});
formatter.after({
  "duration": 380411300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search a vegetable and add to cart and check if it is displayed",
  "description": "",
  "id": "search-and-add-items-to-cart;search-a-vegetable-and-add-to-cart-and-check-if-it-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Selenium"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on Greenkart home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User seach \"Brinjal\" in search box",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User adds the vegetable into cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User goes to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "\"Brinjal\" is displayed on the cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumstepDefinition.user_is_on_greenkart_home_page()"
});
formatter.result({
  "duration": 3814643300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 12
    }
  ],
  "location": "SeleniumstepDefinition.user_seach_something_in_search_box(String)"
});
formatter.result({
  "duration": 3292177500,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumstepDefinition.user_adds_the_vegetable_into_cart()"
});
formatter.result({
  "duration": 3504138800,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumstepDefinition.user_goes_to_cart_page()"
});
formatter.result({
  "duration": 266613600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 1
    }
  ],
  "location": "SeleniumstepDefinition.is_displayed_on_the_cart_page(String)"
});
formatter.result({
  "duration": 49559500,
  "status": "passed"
});
formatter.after({
  "duration": 191872600,
  "status": "passed"
});
});