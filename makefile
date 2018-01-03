all: test

test:
	mvn clean test

git-%: 
	mvn clean; git add -u . && git commit -m "$(@:git-%=%)" && git push origin master
