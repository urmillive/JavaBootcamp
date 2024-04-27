import os
files = os.listdir()
for file in files:
    if file.endswith('.class'):
        print(file)
        os.remove(file)