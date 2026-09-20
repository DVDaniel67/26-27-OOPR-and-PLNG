student = 0
while True:
    student +=1
    print(f"Enter Student {student}'s grades")
    print("Enter Java Grade: ")
    java=float(input())
    print("Enter C Grade: ")
    c=float(input())
    print("Enter Database Handling Grade: ")
    dbhandling=float(input())
    average=(java+c+dbhandling)/3
    if average>=90 and average<=100:
        rate = 'A'
    elif average>=80 and average<=89:
        rate = 'B'
    elif average >=75 and average<=79:
        rate = 'C'
    else:
        rate = 'F'

    result = f"""
Output:
{rate}
Explanation:
The average of the student is {average:.3f}, so the student's grade is {rate}.
"""
    print(result)
    choice=(input("Do you want to continue? (YES/NO)").upper())
    if(choice == "YES"):
        continue
    elif(choice=="NO"):
        break
    else: 
        print("invalid input, shutting down.")
        break