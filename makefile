all:
	mvn clean test --quiet

test:
	mvn clean test

# Usage: make git-"New check-in"
git-%: 
	mvn clean; git add -u . && git commit -m "$(@:git-%=%)" && git push origin master
