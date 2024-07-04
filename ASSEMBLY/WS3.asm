
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h
    
MOV [0X245], 'A'
MOV [0X246], 'B'
MOV [0X247], 'C'
MOV [0X248], 'D'
MOV [0X249], 'E'

MOV SI, 0X245
MOV DI, 0X345
MOVSB    

MOV DS, [0X345]
ret




