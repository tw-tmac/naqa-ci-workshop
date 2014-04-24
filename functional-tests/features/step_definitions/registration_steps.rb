Given /^I am on the registration page$/ do
  visit "http://10.10.10.50:8080/naqa-ci-workshop-qa/courses"
end

When /^I register for '(.*)'$/ do | class_name |
  choose(class_name)
  click_button('Submit')
end

Then /^I should have a confirmation for '(.*)'$/ do  | class_name |
  page.should have_content "You have selected the following courses #{class_name}"
end