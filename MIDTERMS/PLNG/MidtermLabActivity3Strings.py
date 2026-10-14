first_name = input("Enter first name: ")
last_name = input("Enter last name: ")
full_name = first_name+" "+last_name
split = full_name.split()
print(f"First Name: {first_name}\nLast Name: {last_name}\nFull Name: {full_name}")
print(f"First Letter: {full_name[0]}\nLast Letter: {full_name[-1]}")
try:
    full_name[0] = "D"
except TypeError as error:
    print(error)

new_name = "D"+full_name[1:]
new_name_split = new_name.split()
print(f"New Name: {new_name_split[0]}\nOriginal Name: {split[0]}")

for i in range(len(full_name)):
    print(full_name[i])

print(f"Sliced First Name: {split[0]}\nSliced Last Name: {split[1]}")

userin = input("Enter One Character to Search: ")

foundchar = False
i=0
while i <len(full_name):
    found = full_name.lower().find(userin.lower(),i)
    if found!=-1:
        print(f"Character found at index {found}")
        foundchar = True
        i=found+len(userin)
    else: break

if foundchar==False:
    print("Character not in name.")
