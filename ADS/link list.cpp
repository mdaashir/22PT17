#include <iostream>
using namespace std;
struct node
{
    int key;
    struct node *left, *right;
};

struct node *newNode(int item)
{
    struct node *temp = new struct node;
    temp->key = item;
    temp->left = temp->right = NULL;
    return temp;
}

struct node *insert(struct node *node, int key)
{
    if (node == NULL)
        return newNode(key);

    if (key < node->key)
        node->left = insert(node->left, key);
    else if (key > node->key)
        node->right = insert(node->right, key);
    else
        cout << "Duplicate Elements not allowed...";

    return node;
}

struct node *search(struct node *root, int key)
{
    if (root == NULL || root->key == key)
        return root;

    if (root->key < key)
        return search(root->right, key);

    return search(root->left, key);
}

struct node *create(struct node *root)
{
    char ch = 'y';
    while (ch == 'y' || ch == 'Y')
    {
        int n;
        cout << "Enter the number of Elements: ";
        cin >> n;
        for (int i = 0; i < n; ++i)
        {
            int item;
            cout << "Enter the Element to be added: ";
            cin >> item;
            insert(root, item);
        }
        cout << "Do you want to add more... [Y]es or [N]o: ";
        cin >> ch;
    }
    return root;
}

struct node *inorder(struct node *root)
{
    if (root == NULL)
    {
        return root;
    }
    return inorder(root->left);
    cout << endl
         << root->key << endl;
    return inorder(root->right);
}
/*int main()
{
    struct node* root = NULL;
    int choice;
    cout << "\t\tMenu\n";
    while (true)
    {
        cout << "\n[1]Create or Add Element.\n[2]Search a ";
    }

    int key;

    if (search(root, key) == NULL)
        cout << key << " not found" << endl;
    else
        cout << key << " found" << endl;

    return 0;
}
*/
