class Book:
    def __init__(self, title, author, price):
        self.title = title
        self.author = author
        self.price = price

    def __str__(self):
        return f"Book: {self.title} | Author: {self.author}\nPrice: PHP {self.price:.2f}"

class EBook(Book):
    def __init__(self, title, author, price, file_size_mb):
        super().__init__(title, author, price)
        self.file_size_mb = file_size_mb
    
    def __str__(self):
        return super().__str__()+f" | File Size: {self.file_size_mb:.2f}MB"

class Student:
    def __init__(self, name, student_id, tuition_fee):
        self.name = name
        self.student_id = student_id
        self.tuition_fee = tuition_fee

    def __str__(self):
        return f"Name: {self.name} | Student ID: {self.student_id}\nTuition Fee: PHP {self.tuition_fee:.2f}"
    
class ScholarStudent(Student):
    def __init__(self, name, student_id, tuition_fee, scholarship_percentage):
        if scholarship_percentage <0 or scholarship_percentage >100:
            raise ValueError(f"Scholarship percentage is not within range!")
        super().__init__(name, student_id, tuition_fee)
        self.scholarship_percentage = scholarship_percentage
        self.calculable_payable_fee()
    
    def calculable_payable_fee(self):
        self.payable_fee = self.tuition_fee - (self.tuition_fee*self.scholarship_percentage/100)
    
    def __str__(self):
        return super().__str__()+f"\nScholarship: {self.scholarship_percentage}%\nPayable fee: PHP {self.payable_fee:.2f}"

def main():
    students = [
        ScholarStudent("Carlo Reyes", "2026-001", 40000, 50),
        ScholarStudent("Jonathan Joestar", "2026-002", 470.37, 89)
    ]

    inventory = [
    Book("Python Basics", "Maria Santos", 450),
    EBook("Learning OOP", "Ana Cruz", 300, 5),
    EBook("Lord of the Mysteries", "Cuttlefish That Loves Diving", 1200, 7.8)
    ]

    for i in inventory:
        print()
        print(i)

    print()
    print("-"*50)#separating Outputs for Program 1 and Program 3
    for s in students:
        print()
        print(s)
        
if __name__ == "__main__":
    main()