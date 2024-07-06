'''
# Program-4
list1=[int(input("Enter the elements: ")) for i in range(int(input('Enter the n: ')))]
for i in range(len(list1)): list1[i]=list1[i]**2
print(list1)
# Program-5
list2,list3=[input("Enter the string: ") for i in range(int(input('Enter the n1: ')))],[input("Enter the string: ") for i in range(int(input('Enter the n2: ')))]
print(list(x+y for x in list2 for y in list3))
# Program-6
list4,list5=[int(input("Enter the elements: ")) for i in range(int(input('Enter the n1: ')))],[int(input("Enter the elements: ")) for i in range(int(input('Enter the n2: ')))]
print(list(zip(list4,reversed(list5))))
# Program-7
list6=[input("Enter the string: ") for i in range(int(input('Enter the n: ')))]
print(list(filter(None,list6)))
'''
# Program-8
list7=[eval(input('Enter the elements: ')) for _ in range(int(input('Enter the n: ')))]

print(list7)
