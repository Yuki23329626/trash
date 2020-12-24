objects = mysort.c

mysort: $(objects)
	gcc -o mysort -pthread mysort.c

.PHONY: clean
clean:
	find . ! -name makefile ! -name mysort.c -maxdepth 1 -type f -delete
