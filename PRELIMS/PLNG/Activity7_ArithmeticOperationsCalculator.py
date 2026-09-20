while True:
    print("Arithmetic Calculator")
    print("1.Addition     2. Subtraction      3. Multiplication")
    print("4.Division     5. Modulus          6. Increment")
    print("7.Decrement")
    choice=int(input("\nSelect an Arithmetic Operation: "))
    match choice:
        case 1:
            x=int(input("Enter the x value: "))
            y=int(input("Enter the y value: "))
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Addition: {x+y}")
        case 2:
            x=int(input("Enter the x value: "))
            y=int(input("Enter the y value: "))
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Subtraction: {x-y}")
        case 3:
            x=int(input("Enter the x value: "))
            y=int(input("Enter the y value: "))
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Multiplication: {x*y}")
        case 4:
            x=int(input("Enter the x value: "))
            y=int(input("Enter the y value: "))
            if y==0:
                print("Invalid y input.")
            else:
                print(f"Variable Values: x = {x}, y = {y}")
                print(f"Division: {x/y}")
        case 5:
            x=int(input("Enter the x value: "))
            y=int(input("Enter the y value: "))
            print(f"Variable Values: x = {x}, y = {y}")
            print(f"Modulus: {x%y}")
        case 6:
            x=int(input("Enter the x value: "))
            print(f"Variable Value: x = {x}")
            x+=1
            print(f"Increment: {x}")
        case 7:
            x=int(input("Enter the x value: "))
            print(f"Variable Value: x = {x}")
            x-=1
            print(f"Decrement: {x}")
        case _:
            print("Invalid input")
            continue
    choice=input("Continue Program? (YES/NO)").upper()
    if(choice == "YES"):
        continue
    elif(choice=="NO"):
        break
    else: 
        print("Invalid input. Terminating Program.")
        break