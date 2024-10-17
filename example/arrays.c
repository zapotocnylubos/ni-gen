int main() {
    int arr[5];
    int i;
    int sum = 0;

    for (i = 0; i < 5; i = i + 1) {
        arr[i] = i * 2;
    }

    i = 0;
    while (i < 5) {
        sum = sum + arr[i];
        i = i + 1;
    }

    if (sum > 20) {
        sum = sum % 20;
    } else {
        sum = sum * 2;
    }

    return sum;
}
