#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

typedef struct NODE{
    struct NODE* next = NULL;
    char* s;
} node;
int main(void){
    char* S = NULL;
    scanf("%s", S);
    node sNode;

    sNode.s = strtok(S, "&&");

    while (sNode.next != NULL)
    {
        printf("%s\n", ptr);
        ptr = strtok(NULL, " ");
}