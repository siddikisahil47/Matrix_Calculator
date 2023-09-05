import java.util.Scanner;
class project{
    public static void main(String[] args){
        int ch=-1;
        int row1, col1, row2, col2;
        Scanner s = new Scanner(System.in);
        do{

            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|~~~~~~~~~~~~~_MATRIX_CALCULATOR_~~~~~~~~~~~~~~~~~|");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("1. MATRIX ADDITION");
            System.out.println("2. MATRIX SUBTRACTION");
            System.out.println("3. MATRIX MULTIPLICATION");
            System.out.println("0. EXIT");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.print("Enter Your Choice : ");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter number of rows you want in Matrix - 1 : ");
                    row1 = s.nextInt();
                    System.out.print("Enter number of rows you want in Matrix - 2 : ");
                    row2 = s.nextInt();
                    System.out.print("Enter number of columns you want in Matrix - 1 : ");
                    col1 = s.nextInt();
                    System.out.print("Enter number of columns you want in Matrix - 2 : ");
                    col2 = s.nextInt();

                    if(row1!=row2 || col1!=col2){
                        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                        System.out.println("|~~~Matrix Addition & Substation is not possible~~~|");
                        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                    }
                    else{
                        int mat1[][] = new int[row1][col1];
                        int mat2[][] = new int[row2][col2];
                        int add[][] = new int[row1][col1];

                        for(int i=0;i<row1;i++){
                            for(int j=0;j<col1;j++){
                                System.out.print("Enter Matrix - 1 ["+i+","+j+"] : ");
                                mat1[i][j] = s.nextInt();
                            }
                        }
                        for(int i=0;i<row2;i++){
                            for(int j=0;j<col2;j++){
                                System.out.print("Enter Matrix - 2 ["+i+","+j+"] : ");
                                mat2[i][j] = s.nextInt();
                            }
                        }
                        for(int i=0;i<row2;i++){
                            for(int j=0;j<col2;j++){
                                add[i][j] = mat1[i][j] + mat2[i][j];
                            }
                        }
                        System.out.println();
                        for(int i=0;i<row1;i++){
                            for(int j=0;j<col1;j++){
                                System.out.print(mat1[i][j]+" ");
                            }
                            System.out.print("\t  ");
                            for(int j=0;j<col1;j++){
                                System.out.print(mat2[i][j]+" ");
                            }
                            System.out.print("\t ");
                            for(int j=0;j<col1;j++){
                                System.out.print(add[i][j]+" ");
                            }
                            System.out.println();
                        }
                    }
                break;
                case 2:
                System.out.print("Enter number of rows you want in Matrix - 1 : ");
                row1 = s.nextInt();
                System.out.print("Enter number of rows you want in Matrix - 2 : ");
                row2 = s.nextInt();
                System.out.print("Enter number of columns you want in Matrix - 1 : ");
                col1 = s.nextInt();
                System.out.print("Enter number of columns you want in Matrix - 2 : ");
                col2 = s.nextInt();

                if(row1!=row2 || col1!=col2){
                    System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                    System.out.println("|~~~Matrix Addition & Substation is not possible~~~|");
                    System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                }
                else{
                    int mat1[][] = new int[row1][col1];
                    int mat2[][] = new int[row2][col2];
                    int add[][] = new int[row1][col1];

                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            System.out.print("Enter Matrix - 1 ["+i+","+j+"] : ");
                            mat1[i][j] = s.nextInt();
                        }
                    }
                    for(int i=0;i<row2;i++){
                        for(int j=0;j<col2;j++){
                            System.out.print("Enter Matrix - 2 ["+i+","+j+"] : ");
                            mat2[i][j] = s.nextInt();
                        }
                    }
                    for(int i=0;i<row2;i++){
                        for(int j=0;j<col2;j++){
                            add[i][j] = mat1[i][j] - mat2[i][j];
                        }
                    }
                    System.out.println();
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            System.out.print(mat1[i][j]+" ");
                        }
                        System.out.print("\t");
                        for(int j=0;j<col1;j++){
                            System.out.print(mat2[i][j]+" ");
                        }
                        System.out.print("\t");
                        for(int j=0;j<col1;j++){
                            System.out.print(add[i][j]+" ");
                        }
                        System.out.println();
                    }
                }
                break;
                case 3:
                System.out.print("Enter number of rows you want in Matrix - 1 : ");
                row1 = s.nextInt();
                System.out.print("Enter number of rows you want in Matrix - 2 : ");
                col1 = s.nextInt();
                System.out.print("Enter number of columns you want in Matrix - 2 : ");

                row2 = s.nextInt();
                System.out.print("Enter number of columns you want in Matrix - 1 : ");
                col2 = s.nextInt();

                if(col1!=row2){
                    System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                    System.out.println("|~~~_Matrix Multiplication is not possible_~~~|");
                    System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                }
                else{
                    int mat1[][] = new int[row1][col1];
                    int mat2[][] = new int[row2][col2];
                    int mul[][] = new int[row1][col2];

                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            System.out.print("Enter Matrix - 1 ["+i+","+j+"] : ");
                            mat1[i][j] = s.nextInt();
                        }
                    }
                    for(int i=0;i<row2;i++){
                        for(int j=0;j<col2;j++){
                            System.out.print("Enter Matrix - 2 ["+i+","+j+"] : ");
                            mat2[i][j] = s.nextInt();
                        }
                    }
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col2;j++){
                            for(int k=0;k<col1;k++){
                                mul[i][j] += mat1[i][k] * mat2[k][j];
                            }
                        }
                    }
                    System.out.println();
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            System.out.print(mat1[i][j]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for(int i=0;i<row2;i++){
                        for(int j=0;j<col2;j++){
                            System.out.print(mat2[i][j]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col2;j++){
                            System.out.print(mul[i][j]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
    
                break;
                case 0:
                System.out.println("|~~~_THANKS_~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                System.out.println("|--------------------------------------------------|");
                System.out.println("|~~~~~~~~~~~~~~_GOOD_BYE_~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                System.out.println("|--------------------------------------------------|");
                System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~_BY_SAHIL_SIDDIKI_~~~~|");
                System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~_BY_MANISH_KUMAR_~~~~~|");
                System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~_BY_ISHANT_SHARMA_~~~~|");
                System.out.println("|--------------------------------------------------|");
                break;
            }
        }while(ch!=0);

    }
}