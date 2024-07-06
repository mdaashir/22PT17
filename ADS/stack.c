/*#include<stdlib.h>
#include<stdio.h>

#define SIZE 10
int stack[SIZE],top=-1,data;
void push(int data)
{
    if(top>=SIZE)
    {
        printf("\nOverflow");
    }
    else
    {
        top++;
        stack[top]=data;
    }
}
void pop()
{
    if(top<=-1)
    {
        printf("\nUnderflow");
    }
    else
    {
        printf("\nElement popped: %d",stack[top]);
        top--;
    }
}
void display()
{
    if(top<=-1)
    {
        printf("\nstack is empty...");
    }
    else
    {
        int i;
        printf("\n\n");
        for(i=top;i>=0;i--)
        {
            printf("\t%d",stack[i]);
        }
    }
}
int main(){

    int i;
    for(i=0;i<=10;i++){
        scanf("%d",&data);
        push(data);
    }
    pop();
    display();
     pop();
    display();
     pop();
    display();
     pop();
    display();
}
*/

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

#define SIZE 10000


struct stack
{
    int data;
    struct stack *next;
} *top;

int size = 0;

void push(int element)
{
    if (size >= SIZE)
    {
        printf("Stack Overflow, can't add more element to stack.\n");
        return;
    }
    struct stack * newNode = (struct stack *) malloc(sizeof(struct stack));
    newNode->data = element;
    newNode->next = top;
    top = newNode;
    size++;
    printf("Data pushed to stack.\n");
}

int pop()
{
    int data = 0;
    struct stack * topNode;
    if (size <= 0 || !top)
    {
        printf("Stack is empty.\n");
        return INT_MIN;
    }
    topNode = top;
    data = top->data;
    top = top->next;
    free(topNode);
    size--;
    return data;
}

void display()
{
    struct stack *temp=top;
    while(temp!=NULL)
    {
        printf("\n%d",temp->data);
        temp=temp->next;
    }
}
int main()
{
    int choice, data;
    while(1)
    {
        printf("------------------------------------\n");
        printf("    STACK IMPLEMENTATION PROGRAM    \n");
        printf("------------------------------------\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Size\n");
        printf("4. Exit\n");
        printf("------------------------------------\n");
        printf("Enter your choice: ");

        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                printf("Enter data to push into stack: ");
                scanf("%d", &data);
                push(data);
                break;

            case 2:
                data = pop();
                if (data != INT_MIN)
                    printf("Data => %d\n", data);
                break;

            case 3:
                printf("Stack size: %d\n", size);
                display();
                break;

            case 4:
                printf("Exiting from app.\n");
                exit(0);
                break;

            default:
                printf("Invalid choice, please try again.\n");
        }
        printf("\n\n");
    }
    return 0;
}
