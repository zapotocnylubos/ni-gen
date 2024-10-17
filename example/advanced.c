int multiply(int a, int b) {
    return a * b;
}

int main() {
    int i;
    int total;

    total = 0;

    for (i = 1; i <= 5; i = i + 1) {
        if (i % 2 == 0) {
            total = total + multiply(i, 2);
        } else {
            total = total + multiply(i, 3);
        }
    }

    return total;
}
