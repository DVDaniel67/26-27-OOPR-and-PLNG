product1=float(input("Enter the cost of the first item:₱"))
product2=float(input("Enter the cost of the second item:₱"))
totalcost=product1+product2
while totalcost>0:
    payment=float(input("Enter your payment:"))
    totalcost-=payment
    if totalcost>0:
        print(f"Missing ₱{totalcost} amount.")
    else:
        print(f"You will receive ₱{abs(totalcost):.2f} in change.")