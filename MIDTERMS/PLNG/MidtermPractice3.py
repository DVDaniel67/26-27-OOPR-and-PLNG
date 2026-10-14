import pymysql.cursors
from tkinter import *
from tkinter import messagebox
from openpyxl import *
from random import randint

print("=====Program 31=====\n\n")

# Database connection sentence
connection = pymysql.connect(host='localhost',
                            user='root',
                            password='',
                            db='students',
                        charset='utf8mb4',
                        cursorclass=pymysql.cursors.DictCursor)
try:
    with connection.cursor() as cursor:
    #single line reading
        sql = "SELECT `id`, `firstname`,`lastname` FROM `users`"
        cursor.execute(sql)
        for row in cursor.fetchall():
           #read all lines
            firstname = str(row["firstname"])
            lastname = str(row["lastname"])
            #print on screen
            print("firstname : " + firstname)
            print("lastname : " + lastname)
finally:
    connection.close()

print("=====Program 32=====\n\n")

window = Tk()
# add widgets here

window.title('Hello Python')
window.geometry("300x200+10+20")
window.mainloop()

print("=====Program 33=====\n\n")

window = Tk()
window.title("mrhuseyin.medium.com")
window.geometry("400x300")
#plotting grid forms
application = Frame(window)
application.grid()
L1 = Label(uygulama, text="Enter your name")
L1.grid(padx=110, pady=10)
E1 = Entry(application, bd =2)
E1.grid(padx=110, pady=3)
#draw form
window.mainloop()

print("=====Program 34=====\n\n")

window = Tk()

window.title("mrhuseyin.medium.com")
window.geometry("400x300")

#grid form çizdirme
application = Frame(window)
application.grid()

Lb1 = Listbox(application)
Lb1.insert(1, "Python")
Lb1.insert(2, "C#")
Lb1.insert(3, "JAVA")
Lb1.insert(4, "JAVASCRIPT")
Lb1.grid(padx=110, pady=10)

#draw form
pencere.mainloop()

print("=====Program 35=====\n\n")

# opening the existing excel file
wb = load_workbook('C:\\Users\\Admin\\Desktop\\excel.xlsx')

# create the sheet object
sheet = wb.active

def excel():
    # resize the width of columns in excel spreadsheet
    sheet.column_dimensions['A'].width = 30
    sheet.column_dimensions['B'].width = 10
    sheet.column_dimensions['C'].width = 10
    sheet.column_dimensions['D'].width = 20
    sheet.column_dimensions['E'].width = 20
    sheet.column_dimensions['F'].width = 40
    sheet.column_dimensions['G'].width = 50

    # write given data to an excel spreadsheet at particular location
    sheet.cell(row=1, column=1).value = "Name"
    sheet.cell(row=1, column=2).value = "Course"
    sheet.cell(row=1, column=3).value = "Semester"
    sheet.cell(row=1, column=4).value = "Form Number"
    sheet.cell(row=1, column=5).value = "Contact Number"
    sheet.cell(row=1, column=6).value = "Email id"
    sheet.cell(row=1, column=7).value = "Address"

# Functions to set focus (cursor)
def focus1(event):
    course_field.focus_set()

def focus2(event):
    sem_field.focus_set()

def focus3(event):
    form_no_field.focus_set()

def focus4(event):
    contact_no_field.focus_set()

def focus5(event):
    email_id_field.focus_set()

def focus6(event):
    address_field.focus_set()

# Function for clearing the contents of text entry boxes
def clear():
    name_field.delete(0, END)
    course_field.delete(0, END)
    sem_field.delete(0, END)
    form_no_field.delete(0, END)
    contact_no_field.delete(0, END)
    email_id_field.delete(0, END)
    address_field.delete(0, END)

# Function to take data from GUI window and write to an excel file
def insert():
    if (name_field.get() == "" and
        course_field.get() == "" and
        sem_field.get() == "" and
        form_no_field.get() == "" and
        contact_no_field.get() == "" and
        email_id_field.get() == "" and
        address_field.get() == ""):
        
        print("empty input")
    else:
        current_row = sheet.max_row
        current_column = sheet.max_column

        sheet.cell(row=current_row + 1, column=1).value = name_field.get()
        sheet.cell(row=current_row + 1, column=2).value = course_field.get()
        sheet.cell(row=current_row + 1, column=3).value = sem_field.get()
        sheet.cell(row=current_row + 1, column=4).value = form_no_field.get()
        sheet.cell(row=current_row + 1, column=5).value = contact_no_field.get()
        sheet.cell(row=current_row + 1, column=6).value = email_id_field.get()
        sheet.cell(row=current_row + 1, column=7).value = address_field.get()

        wb.save('C:\\Users\\Admin\\Desktop\\excel.xlsx')
        name_field.focus_set()
        clear()

# Driver code
if __name__ == "__main__":
    root = Tk()
    root.configure(background='light green')
    root.title("registration form")
    root.geometry("500x300")

    excel()

    heading = Label(root, text="Form", bg="light green")
    name = Label(root, text="Name", bg="light green")
    course = Label(root, text="Course", bg="light green")
    sem = Label(root, text="Semester", bg="light green")
    form_no = Label(root, text="Form No.", bg="light green")
    contact_no = Label(root, text="Contact No.", bg="light green")
    email_id = Label(root, text="Email id", bg="light green")
    address = Label(root, text="Address", bg="light green")

    heading.grid(row=0, column=1)
    name.grid(row=1, column=0)
    course.grid(row=2, column=0)
    sem.grid(row=3, column=0)
    form_no.grid(row=4, column=0)
    contact_no.grid(row=5, column=0)
    email_id.grid(row=6, column=0)
    address.grid(row=7, column=0)

    name_field = Entry(root)
    course_field = Entry(root)
    sem_field = Entry(root)
    form_no_field = Entry(root)
    contact_no_field = Entry(root)
    email_id_field = Entry(root)
    address_field = Entry(root)

    name_field.bind("<Return>", focus1)
    course_field.bind("<Return>", focus2)
    sem_field.bind("<Return>", focus3)
    form_no_field.bind("<Return>", focus4)
    contact_no_field.bind("<Return>", focus5)
    email_id_field.bind("<Return>", focus6)

    name_field.grid(row=1, column=1, ipadx="100")
    course_field.grid(row=2, column=1, ipadx="100")
    sem_field.grid(row=3, column=1, ipadx="100")
    form_no_field.grid(row=4, column=1, ipadx="100")
    contact_no_field.grid(row=5, column=1, ipadx="100")
    email_id_field.grid(row=6, column=1, ipadx="100")
    address_field.grid(row=7, column=1, ipadx="100")

    excel()

    submit = Button(root, text="Submit", fg="Black", bg="Red", command=insert)
    submit.grid(row=8, column=1)
    root.mainloop()


print("=====Program 36=====\n\n")

rand = randint(1, 100)
counter = 0

while True:
    counter += 1
    num = int(input("Enter values between 1 and 100 (0 exit):"))
    if num == 0:
        print("You canceled the game.")
        break
    elif num < rand:
        print("Enter a Higher Number.")
        continue
    elif num > rand:
        print("Enter a Lower Number.")
        continue
    else:
        print("Randomly selected number {0}!".format(rand))
        print("Your guess number {0}".format(counter))
        break

print("=====Program 37=====\n\n")

favorite_fruits = ['apples', 'erics', 'oranges']
print("My favourite fruits {}".format(favorite_fruits))

print("=====Program 38=====\n\n")

mixed_list = [3.14, 2.54, "CPU", "WINDOWS 10"]
print(mixed_list)

print("=====Program 39=====\n\n")

weekdays = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"]
print(weekdays[4])

print("=====Program 40=====\n\n")

my_list = [3, 1, 2]

my_list[0] = 1
my_list[1] = 1
my_list[2] = 2

print(my_list)

print("=====Program 41=====\n\n")

weekdays = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"]

print("Friday" in weekdays)
print("Saturday" in weekdays)

print("=====Program 42=====\n\n")

list1 = [10, 21, 4, 45, 66, 93]

for num in list1:
    # checking condition
    if num % 2 == 0:
        print(num, end=" ")

print("=====Program 43=====\n\n")

numbers = [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
numbers2 = [21, 22, 23, 24, 25]
combine = numbers + numbers2

for number in combine:
    if number % 4 == 0:
        print(number)

print("=====Program 44=====\n\n")

i = 1
while i <= 12:
    print(f"{i}. class")
    i += 1

print("=====Program 45=====\n\n")

number = input("enter a number: ")
sum=0
for numberofdigit in number:
    sum += int(numberofdigit)

print("the sum of the digits of the number:",sum)

print("=====Program 46=====\n\n")

number = input("enter an number: ")
carpim=1
for digitofnumber in str(numaber):
    if int(digitofnumber) != 0:
        multiplication*= int(digitofnumber)
print("digits of the number: ",multiplication)

print("=====Program 47=====\n\n")

text = input("enter a name: ")

for i in range(10):
    print(text)

print("=====Program 48=====\n\n")

text = input("enter a name: ")

i = 0
while i < 10:
    i += 1
    print(text)

print("=====Program 49=====\n\n")

numbers_list = [35, 48, 52, 57, 68, 84]

total = sum(numbers_list)
piece = len(numbers_list)
print(total / piece)

print("=====Program 50=====\n\n")

total=0
while True:
    num = float(input("enter a number: "))
    if numr ==0:
        break
    total+=num
print("The sum of the numbers: ",total)