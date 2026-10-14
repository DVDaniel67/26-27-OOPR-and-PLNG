byte_string = b'Hello Python'
print(f"\n\nBytes Object: {byte_string}")

stringbyte = str(byte_string)
print("Bytes to String: "+stringbyte)

hex_byte = byte_string.hex()
print("Bytes to Hex: "+hex_byte)

byte_hex = bytes.fromhex(hex_byte)
print(f"Hex to Bytes: {byte_hex}")

byte_array = bytearray('Hello Python','utf-8')
print(f"New Bytearray: {byte_array}")

byte_to_array = bytearray(byte_string)
print(f"Bytes to Bytearray: {byte_to_array}")

slicedbyte = byte_string[6:]
print(f"Sliced Bytes: {slicedbyte}")

byte_array[0] = 104
print(f"Modified Message: {byte_array}")