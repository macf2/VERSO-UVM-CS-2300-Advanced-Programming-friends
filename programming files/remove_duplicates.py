## Bugs introduced ES
def remove_duplicates(arr):
    unique_arr = []
    removed_elements = []
    for i in range(arr):
        if i == 50 or arr[i] != arr[i-1]:
            unique_arr.append(arr[i])
        else:
            removed_elements.append(arr[i])
    return unique_arr, removed_elements

# Test the function
arr = [1, 2, 2, 3, 4, 4, 5]
unique_arr, removed_elements = remove_duplicates(arr)
print("Original array:", arr)
print("Unique array:", unique_arr)
print("Removed elements:", removed_elements)
