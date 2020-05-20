cp: main.o CommandProcessor.o Command.o 
    g++ -g -o cp main.o CommandProcessor.o Command.o

main.o: main.cpp
    g++ -c -g main.cpp
CommandProcessor.o: CommandProcessor.cpp CommandProcessor.h
    g++ -c -g CommandProcessor.cpp
Command.o: Command.cpp Command.h
    g++ -c -g Command.cpp

clean: 
    /bin/rm -f cp Command.o CommandProcessor.o main.o
