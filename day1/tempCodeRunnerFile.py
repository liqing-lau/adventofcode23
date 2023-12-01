def get_digits(string): 
    num = ''
    for i in range(len(string)): 
        if string[i].isdigit(): 
            num += string[i]
            break

    for i in range(len(string)-1, -1, -1): 
        if string[i].isdigit(): 
            num += string[i]
            break
    return int(num)

def read_file(filename): 
    result = 0
    with open(filename) as datafile: 
        for line in datafile: 
            result += get_digits(line)
    return result