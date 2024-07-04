#include <iostream>
using namespace std;
class Node
{
public:
    int key;
    Node *left,*right;
    Node(int data)
    {
        key=data;
        left=NULL;
        right=NULL;
    }

    Node * insert(Node* root,int data)
    {
        Node* p=root;
        Node* q=NULL;
        while(p!=NULL)
        {
            if (data==p->key)
            {
                cout<<"Duplicate key";
                return p;
            }
            q=p;
            if (data<p->key)
                p=p->left;
            else
                p=p->right;
        }
        Node* newNode=new Node(data);
        if (q==NULL)
            root=newNode;
        else if(data<q->key)
            q->left=newNode;
        else
            q->right=newNode;
        return root;
    }

    void inorder(Node* root)
    {
        Node* temp=root;
        if(temp==NULL)
            return;
        inorder(temp->left);
        cout<<"\n"<<temp->key<<"\n";
        inorder(temp->right);
    }

// function to find right side minimum
// and its parent
    Node* minkey(Node* curr, Node*&par)
    {
        Node* t = curr->right;
        par=curr;
        while(t->left!=NULL)
        {
            t=t->left;
            if(t->left!=NULL)
                par=t;
        }
        return t;
    }
// function to search the node to be deleted and its
// parent
    void search(Node* &curr, Node* &par,int delkey)

    {
        while(curr!=NULL)
        {
            if (delkey==curr->key)

                return;
            par=curr;
            if (delkey<curr->key)
                curr=curr->left;
            else
                curr=curr->right;
        }
        return;
    }
// function to delete a node which is leaf
    Node* delcase1(Node* root,Node* curr, Node* par)
    {
        if(par==NULL)
            root=NULL;
        if (par->left==curr)
            par->left=NULL;
        else
            par->right=NULL;
        delete curr;
        return root;
    }

//function to delete a node with one child
    Node* delcase2(Node* root,Node* curr, Node* par)
    {
        if(curr->left!=NULL && curr->right==NULL)
        {
            if(par==NULL)
                root=curr->left;
            else if(par->right==curr)
                par->right=curr->left;
            else
                par->left=curr->left;
        }
        else

            if(curr->left==NULL && curr->right!=NULL)
            {
                if(par==NULL)
                    root=curr->right;
                else if(par->right==curr)
                    par->right=curr->right;
                else
                    par->left=curr->right;
            }
        delete curr;
        return root;
    }
//function to delete node with two child
    Node* delcase3(Node*root,Node * curr, Node *&par)
    {
        Node* temp;
        temp=minkey(curr,par);
        curr->key=temp->key;
        if(temp->left==NULL && temp->right==NULL)
            root=delcase1(root,temp,par);
        else
            root=delcase2(root,temp,par);
        return root;
    }
    Node* delnode(Node* root,Node *curr, Node *par)
    {
        if(curr->left==NULL && curr->right==NULL)
            root=delcase1(root,curr,par);
        else if(curr->left!=NULL && curr->right != NULL)
            root=delcase3(root,curr,par);
        else
            root=delcase2(root,curr,par);
        return root;

    }

};

int main()
{
    Node* root=NULL;
    Node* curr;
    Node* par=NULL;
    int i,n,data,delkey;
    cout<<"\n Enter number of data to be inserted";
    cin>>n;
    cout<<"\nEnter data one by one";
    for(i=0; i<n; i++)
    {
        cin>>data;
        root=root->insert(root,data);
    }
    root->inorder(root);
    cout<<"\n Enter data to be deleted";
    cin>>delkey;
    curr=root;
    root->search(curr,par,delkey);
    if(curr==NULL)
        cout<<"Key not found";
    else
    {
        root=root->delnode(root,curr,par);
        root->inorder(root);
        cout<<"New root"<<root->key;
    }
}
