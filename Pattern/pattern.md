### Number Triangular
    1
    2 2
    3 3 3
    4 4 4 4

    for(int i = 1; i <= 4; i++) {
      for(int j = 1; j <= i; j++) {
          System.out.print(i + " ");
      }
      System.out.println();
    }

### Palindrome Triangular
        1
       212
      32123
     4321234

     int n = 4;

    for(int i = 1; i <= n; i++) {

      for(int space = 1; space <= n - i; space++)
          System.out.print(" ");
  
      for(int j = i; j >= 1; j--)
          System.out.print(j);
  
      for(int j = 2; j <= i; j++)
          System.out.print(j);
  
      System.out.println();
    }

### Zero-One Triangle
      1
      0 1
      1 0 1
      0 1 0 1

      int n = 4;

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            System.out.print((i + j) % 2 + " ");
        }
        System.out.println();
    }

### Diamond Pattern
      int n = 4;

    // upper half
    for(int i = 1; i <= n; i++) {
    
        for(int s = 1; s <= n - i; s++)
            System.out.print(" ");
    
        for(int j = 1; j <= 2*i - 1; j++)
            System.out.print("*");
    
        System.out.println();
    }
    
    // lower half
    for(int i = n - 1; i >= 1; i--) {
    
        for(int s = 1; s <= n - i; s++)
            System.out.print(" ");
    
        for(int j = 1; j <= 2*i - 1; j++)
            System.out.print("*");
    
        System.out.println();
    }

### Square Hollow Pattern
       int n = 5;

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
    
            if(i == 1 || i == n || j == 1 || j == n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

### Hollow Hourglass Pattern
    int n = 5;

    // upper
    for(int i = n; i >= 1; i--) {
    
        for(int s = 0; s < n - i; s++)
            System.out.print(" ");
    
        for(int j = 1; j <= i; j++) {
            if(j == 1 || j == i || i == n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }
    
    // lower
    for(int i = 2; i <= n; i++) {
    
        for(int s = 0; s < n - i; s++)
            System.out.print(" ");
    
        for(int j = 1; j <= i; j++) {
            if(j == 1 || j == i || i == n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }

### Butterfly Star Pattern
      int n = 4;

    // upper
    for(int i = 1; i <= n; i++) {
    
        for(int j = 1; j <= i; j++)
            System.out.print("*");
    
        for(int s = 1; s <= 2*(n - i); s++)
            System.out.print(" ");
    
        for(int j = 1; j <= i; j++)
            System.out.print("*");
    
        System.out.println();
    }
    
    // lower
    for(int i = n; i >= 1; i--) {
    
        for(int j = 1; j <= i; j++)
            System.out.print("*");
    
        for(int s = 1; s <= 2*(n - i); s++)
            System.out.print(" ");
    
        for(int j = 1; j <= i; j++)
            System.out.print("*");
    
        System.out.println();
    }
