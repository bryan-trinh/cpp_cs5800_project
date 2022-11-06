JFLAGS = -g
JC = javac
.SUFFIXES: .java .class

OUT = out
BACKEND = backend
CLEANDIR = $(OUT)/$(BACKEND)
CLASSES = \
	$(BACKEND)/Customer.java \
	$(BACKEND)/Food.java \
	$(BACKEND)/HistoricalPrice.java \
	$(BACKEND)/Order.java \
	$(BACKEND)/Restaurant.java

default: $(CLASSES:.java=.class)
all: default

.java.class:
	$(JC) $(JFLAGS) $*.java -d $(OUT)

run:
	java -cp out $(BACKEND)/Restaurant

clean:
	$(RM) $(CLEANDIR)/*.class