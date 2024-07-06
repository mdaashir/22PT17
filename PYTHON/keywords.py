import math
# ,cmath,numpy
from os import system as screen
# input values of A,B,C
(a,b,c)=(input('Enter the value of A : '),input('Enter the value of B : '),input('Enter the value of C : '))
# pow() funtion
print('\nA to the power B = ',pow(int(abs(float(a))),int(float(b))))
# pow() function with 3rd parameter
print('\nA to the power B and modules of C = ',pow(int(abs(float(a))),int(abs(float(b))),int(c)))
# abs() function
print('\nabsolute value of A,B,C = ',abs(float(a)),',',abs(float(b)),',',abs(float(c)))
# round() function
print('\nA is rounded to B places of decimal = ',round(float(a),int(abs(float(b)))))
# math.floor() function
print('\nfloor value of A , B , C = ',math.floor(float(a)),',',math.floor(float(b)),',',math.floor(float(c)))
# math.ceil() function
print('\nceil value of A , B , C = ',math.ceil(float(a)),',',math.ceil(float(b)),',',math.ceil(float(c)))
# print() function
print('\nvalues of A , B , C = ',a,b,c)
# str() function
print('\nstring values of A , B , C = ',str(a),str(b),str(c))
screen('cls')
