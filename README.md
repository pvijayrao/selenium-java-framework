# selenium-java-framework
# HRM UI Tests

Environment/command line variables:
log_level
env
app_url
browser

Defaults (test.properties):
app_url=http://localhost:4200
env=dev
browser=chrome
log_level=INFO

Command to execute tests:

1. mvn clean test -Dlog_level=DEBUG

2. mvn clean test -Dlog_level=INFO -Denv=dev -Dapp_url=http://localhost:4200 -Dbrowser=firefox


Test reports: surefire-reports
