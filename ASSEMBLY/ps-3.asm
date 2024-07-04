
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

ORG 100h

;PROGRAM-1      

;MOV AX, 0X200 
;MOV BX, 0X100
;MOV [BX], 'H'
;INC BX
;MOV [BX], 'E'
;INC BX
;MOV [BX], 'L'
;INC BX
;MOV [BX], 'L'
;INC BX      
;MOV [BX], 'O'
                         
;MOV BX, 0X100
;MOV SI, BX
;MOV DI, AX    

;MOV CX, 5
;REP MOVSB

;PROGRAM-2

;MOV BX, 0X200
;MOV [BX], 'H'
;PUSH [BX]
;INC BX 
;MOV [BX], 'E'
;PUSH [BX]
;INC BX
;MOV [BX], 'L'
;PUSH [BX]
;INC BX
;MOV [BX], 'L'
;PUSH [BX]
;INC BX
;MOV [BX], 'O'
;PUSH [BX]

;INC BX

;INC BX
;POP [BX]
;INC BX
;POP [BX]
;INC BX
;POP [BX]
;INC BX
;POP [BX]
;INC BX
;POP [BX]
;INC BX   

;PROGRAM-4
 
;MOV BX, 0X200
;MOV [BX], 'H'
;PUSH [BX]
;INC BX 
;MOV [BX], 'E'
;PUSH [BX]
;INC BX
;MOV [BX], 'L'
;PUSH [BX]
;INC BX
;MOV [BX], 'L'
;PUSH [BX]
;INC BX
;MOV [BX], 'O'
;PUSH [BX]

MOV BX, 0X200       
MOV CX, 5
LOOP:
    MOV AH, 0h
    INT 16h   
    MOV [BX], AL 
    MOV AH, 0Eh
    MOV AL, [BX]
    INC BX
    INT 10h
LOOP LOOP

;MOV AX, 0X200 
;MOV BX, 0X200
;MOV CX, 5
;PRINT: 
;    MOV AH, 0Eh 
;    MOV AL, [DX]
;    INT 10h     
;    INC DX
;    LOOP PRINT
    
RET




