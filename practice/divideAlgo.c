#include <stdio.h>
int divide(int,int);
int divide(int dividend, int divisor) {
    int quotient = 0;
    
    // division by zero
    if (divisor == 0) {
        printf("Error! Division by zero is not allowed.\n");
        return -1; 
    }
    
    // adjust sign of result
    int sign = 1;
    if (dividend < 0) {
        sign = -sign;
        dividend = -dividend; // Make dividend positive
    }
    if (divisor < 0) {
        sign = -sign;
        divisor = -divisor; // Make divisor positive
    }

    while (dividend >= divisor) {
        dividend -= divisor;
        quotient++;
    }

    return sign * quotient;
}

int main() {
    int dividend, divisor;
    
    printf("Enter dividend: ");
    scanf("%d", &dividend);
    
    printf("Enter divisor: ");
    scanf("%d", &divisor);
    
    int result = divide(dividend, divisor);
    
    if (result != -1) { 
        printf("Result: %d\n", result);
    }
    
    return 0;
}
