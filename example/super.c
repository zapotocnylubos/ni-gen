int add(int x, int y) {
    return x + y;
}

void increment(int *value) {
    *value = *value + 1;
}

int main() {
    int result;
    int number = 5;
    result = add(number, 10);
    increment(&number);
    return result;
}