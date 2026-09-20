def comparing(x,b):
    if x > b: return x
    elif b > x: return b
inputs, output = [0]*3, ""
for x in range(len(inputs)):
    output = comparing(output, input(f"Enter Word {x+1}:"))
print(f"The word that comes last is {output}")