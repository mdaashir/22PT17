#include <iostream>
using namespace std;
int n, i;
struct node
{
    int data;
    struct node *prev, *next;
} *head, *temp, *newnode;
void createlist(int n)
{
    head = (struct node *)malloc(sizeof(struct node));
    if (head == NULL)
    {
        cout << "Unable to allocate memory";
        exit(0);
    }
    cout << "Enter the data of node 1: ";
    cin >> head->data;
    head->next = head->prev = NULL;
    temp = head;
    for (i = 2; i <= n; i++)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        if (newnode == NULL)
        {
            cout << "No memory";
            break;
        }
        cout << "Enter the data of node " << i << ": ";
        cin >> newnode->data;
        newnode->next = newnode->prev = NULL;
        newnode->prev = temp;
        temp->next = newnode;
        temp = newnode;
    }
    cout << "The Data is Successfully inputed..." << endl;
}
void traverselist()
{
    if (head == NULL)
    {
        printf("List is empty.");
        return;
    }
    temp = head;
    i = 1;
    while (temp != NULL)
    {
        cout << "Data " << i << " = " << temp->data << endl;
        i++;
        temp = temp->next;
    }
    cout << "The Data is Successfully displayed..." << endl;
}
void insertatbeg()
{
    newnode = (struct node *)malloc(sizeof(struct node));
    if (newnode == NULL)
    {
        printf("Unable to allocate memory");
    }
    else
    {
        cout << "Enter the data of node to inserted: ";
        cin >> newnode->data;
        newnode->prev = NULL;
        newnode->next = head;
        head->prev = newnode;
        head = newnode;
        n++;
    }
    cout << "The Data is Successfully inputed at the beggining..." << endl;
}
void insertatend()
{
    if (head == NULL)
    {
        printf("List is empty.");
        return;
    }
    temp = head;
    while (temp != NULL)
    {
        cout << temp;
        temp = temp->next;
    }
    newnode = (struct node *)malloc(sizeof(struct node));
    if (newnode == NULL)
    {
        printf("Unable to allocate memory");
    }
    else
    {
        cout << "Enter the data of node to inserted: ";
        cin >> newnode->data;
        newnode->prev = temp;
        newnode->next = NULL;
        temp->next = newnode;
        n++;
    }
    cout << "The Data is Successfully inputed at the end..." << endl;
}
int main()
{
    cout << "Enter the total number of nodes: ";
    cin >> n;
    createlist(n);
    insertatbeg();
    insertatend();
    traverselist();
}
