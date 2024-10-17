int main() {
    int x;
    x = 10;

    if (x > 5) {
        x = x - 1;
    } else {
        x = x + 1;
    }

    while (x > 0) {
        x = x - 1;
    }

    switch (x) {
        case 1:
            x = x + 10;
            break;
        case 2:
            x = x + 20;
            break;
        default:
            x = x + 30;
    }

    return x;
}
