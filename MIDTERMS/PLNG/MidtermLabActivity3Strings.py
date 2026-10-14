first_name, last_name = "Maria", "Santos"
full_name = first_name+" "+last_name

print(f"First Name: {first_name}\nLast Name: {last_name}\nFull Name: {full_name}")
print(f"First Letter: {full_name[0]}\nLast Letter: {full_name[11]}")
try:
    full_name[0] = "D"
except TypeError as error:
    print(error)

new_name = "D"+full_name[1:]
print(f"New Name: {new_name[0:6]}\nOriginal Name: {full_name[0:6]}")

for i in range(len(full_name)):
    print(full_name[i])

print(f"Sliced First Name: {full_name[:6]}\nSliced Last Name: {full_name[6:]}")

userin = input("Enter One Character to Search: ")

found = full_name.find(userin)

if(found!=-1):
    print(f"Character found at index {found}")
else: print("Character not in name.")