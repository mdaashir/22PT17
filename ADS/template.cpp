#include<iostream>
using namespace std;
class linklist
{
    int i,n;
    struct node
    {
        int data;
        struct node *next;
    }*head, *newnode, *temp;
    void createlist()
    {
        cout<<"Enter the total number of nodes: ";
        cin>>n;
        head=(struct node*)malloc(sizeof(struct node));
        if(head==NULL)
            exit(0);
        cout<<"Enter the data of node 1: ";
        cin>>head->data;
        head->next=NULL;
        temp=head;
        for(i=2;i<=n;i++)
        {
            newnode=(struct node*)malloc(sizeof(struct node));
            if(newnode==NULL)
            {
                cout<<"No memory";
                break;
            }
            cout<<"Enter the data of node "<<i<<": ";
            cin>>newnode->data;
            newnode->next=NULL;
            temp->next=newnode;
            temp=temp->next;
        }

    }
    void traverselist()
    {
        if(head==NULL)
            return;
        temp=head;
        i=1;
        while(temp!=NULL)
        {
            cout<<"Data "<<i<<" = "<<temp->data<<endl;
            i++;
            temp=temp->next;
        }
    }
    public:
    linklist()
    {
        createlist();
        traverselist();
    }
}a;
int main()
{
    return(0);
}
