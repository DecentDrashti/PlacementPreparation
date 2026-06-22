#include <stdio.h>

int main() {
    int n = 24;

    int start = 1;
    int end = 1;
    int sum = 1;

    while (start <= n / 2) {

        if (sum < n) {
            end++;
            sum += end;
        }
        else if (sum > n) {
            sum -= start;
            start++;
        }
        else {
            break;
        }
    }

    if (sum == n) {
        while (start <= end) {
            printf("%d ", start);
            start++;
        }
    }
    else {
        printf("Not Possible");
    }

    return 0;
}
