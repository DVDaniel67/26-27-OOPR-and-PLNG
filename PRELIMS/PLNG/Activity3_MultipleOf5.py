userinput=int(input("Enter a multiple of 5 between 1 and 100: "))
if userinput<=100 and userinput>=1 and userinput%5==0:
    print("Inputted value is valid")
else: 
    print("Inputted number is invalid")