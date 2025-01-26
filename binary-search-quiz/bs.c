#include <stdlib.h>
#include <stdio.h>

// array is a sorted array of strings
// n is the number of elements in the array
// key is the element to search for
int binSearch(char *array[], int n, int key)
{
    int low = 0;
    int high = n; // 2

    while (low <= high)
    {
        int mid = (low + high) / 2;     // 1
        int element = atoi(array[mid]); // 3 4 5
        if (element == key)
            return mid;
        if (element < key)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

// argc is the number of arguments
// argv is an array of arguments
int main(int argc, char *argv[])
{
    if (argc < 2)
    {
        fprintf(stderr, "Usage: %s <non-decreasing-sequence-of-numbers>\n"
                        "\tReturns the position of an element in the\n"
                        "\tsequence that is equal to the sequence length\n"
                        "\tor zero if no such element exists.\n",
                argv[0]);
        return 1;
    }
    printf("%d\n", 1 + binSearch(argv + 1, argc - 1, argc - 1));
    return 0;
}