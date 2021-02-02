CURRENTPATH=$(shell pwd)
CLASSPATH=.:$(CURRENTPATH)/libs/antlr-4.9-complete.jar:$(CURRENTPATH)/target

build: target/NginxTopo.class

target/NginxTopo.class: parser/src/NginxParser.java parser/src/NginxLexer.java src/*.java
	mkdir -p target jar sample
	javac -d target parser/src/*.java
	javac  -cp $(CLASSPATH) -d target src/*.java 

parser/src/NginxParser.java parser/src/NginxLexer.java: src/Nginx.g4
	java -jar libs/antlr-4.9-complete.jar -o parser src/Nginx.g4


clean:
	rm -rf target/*

tags:
	ctags -R src/ parser/src/

render:
	(cd target ; java  NginxTopo ../sample/nginx.conf >/tmp/test.dot)
	dot -Tsvg -o /tmp/test.svg /tmp/test.dot
	eog /tmp/test.svg

jar: build
	(cd target ; jar xf ../libs/antlr-4.9-complete.jar)
	(cd target ; jar cvfm ../jar/nginx_topo.jar ../src/manifest.mf  *)

.PHONY: clean tags jar
