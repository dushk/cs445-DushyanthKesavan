JFLAGS = -g
JC = javac
JVM = java
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		Thing.java \
		Creature.java \
		Tiger.java \
		Ant.java \
		Flyer.java \
		Fly.java \
		Bat.java \
		TestCreature.java

MAIN = TestCreature

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(MAIN)

clean: 
	$(RM) *.class


