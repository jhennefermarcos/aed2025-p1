run: build
	# Executando..
	java -cp bin Main

build:
	# Compilando..
	javac -d bin Main.java

clean:
	# Removendo..
	rm -r bin

git:
	git config --global user.name "Jhennefer Marcos"
	git config --global user.email "jhennefermarcos@gmail.com"

test: test_q1 test_q2 test_q3

build_test: build
	@javac -d bin test/Test*.java

# Questão 1
test_q1: build_test
	@java -ea -cp bin test.TestQ1

# Questão 2
test_q2: build_test
	@java -ea -cp bin test.TestQ2

# Questão 3
test_q3: build_test
	@java -ea -cp bin test.TestQ3


