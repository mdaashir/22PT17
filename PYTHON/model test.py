# loop for prompt till exit
a=[int(input("Enter the Elements: ")) for _ in range(int(input("Enter the size of list: ")))]
while(True):
    n=int(input("\t\tMENU\n[1] Lenght of a list.\n[2] Add elememts.\n[3] Search for elements.\n[4] Sort a list. \n[5] Delete a Element. \n\nEnter your choice: "))
    if(n==1):
        print("Lenght of list: ",len(a))
    if(n==2):
        a.extend(eval(input("Enter the elements to be adeed: ")))
        print("List after addition: ",a)
    if(n==3):
        print("Element found in index: ",a.index(int(input("Enter the Element to be searched: "))))
    if(n==4):
        a.sort(reverse=True)
        print("Sorted list: ",a)
    if(n==5):
        a.remove(int(input("Enter the element to be removed: ")))
        print("List after element removed: ",a)
    if(input("\n[y] to continue. \n[n] to exit. \nEnter your choice: ")=='n'):
        break
