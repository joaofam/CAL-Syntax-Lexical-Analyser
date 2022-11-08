all: build run

build:
	export CLASSPATH=/usr/local/lib/antlr-4.11.1-complete.jar:.
	`java -Xmx500M org.antlr.v4.Tool` file.g4
	javac *.java

run:
	java file test4.cal