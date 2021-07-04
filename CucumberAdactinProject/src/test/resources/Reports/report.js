$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20File/search.feature");
formatter.feature({
  "name": "To validate Search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate Search and Booking Hotel using valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User is in  Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \"\u003cUsername\u003e\" ,\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click Login",
  "keyword": "When "
});
formatter.step({
  "name": "User is in search page, User enter details for hotel search",
  "keyword": "When "
});
formatter.step({
  "name": "User click search button,User click Radio button and click continue",
  "keyword": "And "
});
formatter.step({
  "name": "User book the hotel by filling \"\u003cfirstname\u003e\" ,\"\u003clastname\u003e\",\"\u003caddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User pay amount using \"\u003ccc_num\u003e\" ,\"\u003ccvv\u003e\",\"\u003cccType\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click booknow button and id number is generated",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "",
        "Password",
        "",
        "firstname",
        "",
        "lastname",
        "",
        "address",
        "",
        "cc_num",
        "",
        "cvv",
        "",
        "ccType",
        "",
        "month",
        "",
        "year"
      ]
    },
    {
      "cells": [
        "ArchanaLachu",
        "",
        "9994906957",
        "",
        "archana",
        "",
        "lachu",
        "",
        "chennai",
        "",
        "4756949674876456",
        "",
        "789",
        "",
        "VISA",
        "",
        "July",
        "",
        "2024"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate Search and Booking Hotel using valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in  Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotel.user_is_in_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"ArchanaLachu\" ,\"9994906957\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotel.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Login",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotel.user_click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in search page, User enter details for hotel search",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotel.user_is_in_search_page_User_enter_details_for_hotel_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click search button,User click Radio button and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotel.user_click_search_button_User_click_Radio_button_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User book the hotel by filling \"archana\" ,\"lachu\",\"chennai\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotel.user_book_the_hotel_by_filling(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pay amount using \"4756949674876456\" ,\"789\",\"VISA\",\"July\",\"2024\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotel.user_pay_amount_using(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click booknow button and id number is generated",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotel.user_click_booknow_button_and_id_number_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});