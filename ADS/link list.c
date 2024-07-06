#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
}*head;
void createlist(int n)
{
    struct node *newnode,*temp;
    int data,i;
    head=(struct node*)malloc(sizeof(struct node));
    if(head==NULL)
    {
        printf("Unable to allocate memory");
        exit(0);
    }
    printf("Enter the data of node 1: ");
    scanf("%d",&data);
    head->data=data;
    head->next=NULL;
    temp=head;
    for(i=2;i<=n;i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        if(newnode==NULL)
        {
            printf("No memory");
            break;
        }
        printf("Enter the data of node %d: ",i);
        scanf("%d",&data);
        newnode->data=data;
        newnode->next=NULL;
        temp->next=newnode;
        temp=newnode;
    }
}
void traverselist()
{
    struct node *temp;
    if(head==NULL)
    {
        printf("List is empty.");
        return;
    }
    temp=head;
    int i=1;
    while(temp!=NULL)
    {
        printf("Data %d = %d\n",i,temp->data);
        i++;
        temp=temp->next;
    }
}
void insert()
{
    int data;
    printf("Enter the data of node to inserted: ");
    scanf("%d",&data);
    struct node *newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    if(newnode==NULL)
    {
        printf("Unable to allocate memory");
    }
    else
    {
        newnode->data=data;
        newnode->next=head;
        head=newnode;
        printf("Data inserted successfully\n");
    }
}
int main()
{
    int n;
    printf("Enter the total number of nodes: ");
    scanf("%d",&n);
    createlist(n);
    traverselist();
    insert();
    traverselist();
}
