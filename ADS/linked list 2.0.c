#include <stdio.h>
#include<stdlib.h>
int n, i;
struct node
{
    int data;
    struct node *next;
} *head, *newnode, *temp;
void createlist()
{
    printf("Enter the total number of nodes: ");
    scanf("%d", &n);
    head = (struct node *)malloc(sizeof(struct node));
    if (head == NULL)
    {
        printf("Unable to allocate memory");
        exit(0);
    }
    printf("Enter the data of node 1: ");
    scanf("%d", head->data);
    head->next = NULL;
    temp = head;
    for (i = 2; i <= n; i++)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        if (newnode == NULL)
        {
            printf("No memory");
            break;
        }
        printf("Enter the data of node %d: ", i);
        scanf("%d", newnode->data);
        newnode->next = NULL;
        temp->next = newnode;
        temp = newnode;
    }
    printf("\nThe Data is Successfully inputed...");
}
void traverselist()
{
    if (head == NULL)
    {
        printf("List is empty.");
        return;
    }
    temp = head;
    int i = 1;
    while (temp != NULL)
    {
        printf("Data %d = %d\n", i, temp->data);
        i++;
        temp = temp->next;
    }
}
int main()
{
    createlist();
    traverselist();
    // insert();
    traverselist();
}
