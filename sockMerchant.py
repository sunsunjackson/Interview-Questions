n = 9
result = 0
arr = [10, 20, 20, 10, 10, 30, 50, 10, 20]
table = [] #creates a list

for i in arr: #loops through the array
    if(i not in table): #if the number from the array isn't already
                        #in the table, append it
        table.append(i)
    else:  #otherwise, it means that we found a duplicate
        result += 1 #that's one pair
        table.remove(i) #remove the found duplicate so we don't overcount
#print(table)
print(result)
