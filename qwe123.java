//*import java.util.Random;
import java.util.Scanner;
public class qwe123 {

    public enum Color {
        RESET("\u001B[0m"),
        BLACK("\u001B[30m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        WHITE("\u001B[38m");

        private String value;

        Color(String color) {
            value = color;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public class BgColor {
        static final String BLACK = "\u001b[40m";
        static final String RED = "\u001b[41m";
        static final String GREEN = "\u001b[42m";
        static final String YELLOW = "\u001b[43m";
        static final String BLUE = "\u001b[44m";
        static final String PURPLE = "\u001b[45m";
        static final String CYAN = "\u001b[46m";
        static final String WHITE = "\u001b[47m";
        public BgColor() {
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //*Random rd = new Random();
        int Pobeda = 0;
        int O4ereDb = 1;
        int Shax4ernim=0; int Shaxbelim=0;int Sh1=0; int Sh2=0;int checkpat=0;int checkpat2=0;int checkpat3=0;int checkpat555=0; int checkmat=0; int NShaxbelim=0; int NShax4ernim=0; int ProvHaYxod=0; int Tizakril=0;
//* ЭТАП СОЗДАНИЯ ДОСКИ НАЧАЛО
        System.out.println(" ");
        System.out.print("   " + "A   ");
        System.out.print(" " + "B   ");
        System.out.print(" " + "C  ");
        System.out.print(" " + "D   ");
        System.out.print(" " + "E   ");
        System.out.print(" " + "F  ");
        System.out.print(" " + "G   ");
        System.out.print(" " + "H ");
        System.out.println(" ");
         int[][] arr = new int[8][8];
        int [][] arr2= new int[8][8];
        int [][] arr3= new int[8][8];
        int [][] arr41= new int[8][8];
        int [][] waxoviekletki= new int[8][8];
        int [][] waxoviekletki4ernix= new int[8][8];
        int [][] matoviekietki= new int[8][8];
        for (int i = 0; i < 8; i++)//*Доску создал
        {System.out.print(8-i+"  ");
            for (int j = 0; j < 8; j++)
            {
   if (i == 0 && j == 0)
                {
                    arr[i][j] = 101;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♜" + Color.RESET + "   ");
                }
                if (i == 0 && j == 1)
                {
                    arr[i][j] = 102;
                    System.out.print(BgColor.RED+Color.BLACK + "♞" + Color.RESET  +"   ");
                }
                if (i == 0 && j == 2)
                {
                    arr[i][j] = 103;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♝" + Color.RESET + "   ");
                }
                if (i == 0 && j == 3)
                {
                    arr[i][j] = 104;
                    System.out.print(BgColor.RED+Color.BLACK + "♛" + Color.RESET + "   ");
                }
                if (i == 0 && j == 4)
                {
                    arr[i][j] = 105;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♚" + Color.RESET + "   ");
                }
                if (i == 0 && j == 5)
                {
                    arr[i][j] = 106;
                    System.out.print(BgColor.RED+Color.BLACK + "♝" + Color.RESET + "   ");
                }
                if (i == 0 && j == 6)
                {
                    arr[i][j] = 107;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♞" + Color.RESET + "   ");
                }
                if (i == 0 && j == 7)
                {
                    arr[i][j] = 108;
                    System.out.print(BgColor.RED+Color.BLACK + "♜" + Color.RESET + "   ");
                }
                if (i == 7 && j == 0)
                {
                    arr[i][j] = 901;
                    System.out.print(BgColor.RED+Color.WHITE + "♜" + Color.RESET + "   ");
                }
                if (i == 7 && j == 1)
                {
                    arr[i][j] = 902;
                    System.out.print(BgColor.GREEN+Color.WHITE +"♞"+ Color.RESET + "   ");
                }
                if (i == 7 && j == 2)
                {
                    arr[i][j] = 903;
                    System.out.print(BgColor.RED+Color.WHITE +"♝" + Color.RESET+ "   ");
                }
                if (i == 7 && j == 4)
                {
                    arr[i][j] = 905;
                    System.out.print(BgColor.RED+Color.WHITE +"♚" + Color.RESET+ "   ");
                }
                if (i == 7 && j == 3)
                {
                    arr[i][j] = 904;
                    System.out.print(BgColor.GREEN+Color.WHITE +"♛"+ Color.RESET + "   ");
                }
                if (i == 7 && j == 5)
                {
                    arr[i][j] = 906;
                    System.out.print(BgColor.GREEN+Color.WHITE +"♝"+ Color.RESET + "   ");
                }
                if (i == 7 && j == 6)
                {
                    arr[i][j] = 907;
                    System.out.print(BgColor.RED+Color.WHITE +"♞" + Color.RESET+ "   ");
                }
                if (i == 7 && j == 7)
                {
                    arr[i][j] = 908;
                    System.out.print(BgColor.GREEN+Color.WHITE +"♜"+ Color.RESET + "   ");
                }

                if (i == 1 && j == 0)
                {
                    arr[i][j] = 201;
                    System.out.print(BgColor.RED+Color.BLACK + "♙" + Color.RESET + "   ");
                }
                if (i == 1 && j == 1)
                {
                    arr[i][j] = 202;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♙" + Color.RESET + "   ");
                }
                if (i == 1 && j == 2)
                {
                    arr[i][j] = 203;
                    System.out.print(BgColor.RED+Color.BLACK + "♙" + Color.RESET + "   ");
                }
                if (i == 1 && j == 3)
                {
                    arr[i][j] = 204;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♙" + Color.RESET + "   ");
                }
                if (i == 1 && j == 4)
                {
                    arr[i][j] = 205;
                    System.out.print(BgColor.RED+Color.BLACK + "♙" + Color.RESET + "   ");
                }
                if (i == 1 && j == 5)
                {
                    arr[i][j] = 206;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♙" + Color.RESET + "   ");
                }
                if (i == 1 && j == 6)
                {
                    arr[i][j] = 207;
                    System.out.print(BgColor.RED+Color.BLACK + "♙" + Color.RESET + "   ");
                }
                if (i == 1 && j == 7)
                {
                    arr[i][j] = 208;
                    System.out.print(BgColor.GREEN+Color.BLACK + "♙" + Color.RESET + "   ");
                }

                if (i == 6 && j == 0)
                {
                    arr[i][j] = 801;
                    System.out.print(BgColor.GREEN+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                if (i == 6 && j == 1)
                {
                    arr[i][j] = 802;
                    System.out.print(BgColor.RED+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                if (i == 6 && j == 2)
                {
                    arr[i][j] = 803;
                    System.out.print(BgColor.GREEN+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                if (i == 6 && j == 3)
                {
                    arr[i][j] = 804;
                    System.out.print(BgColor.RED+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                if (i == 6 && j == 4)
                {
                    arr[i][j] = 805;
                    System.out.print(BgColor.GREEN+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                if (i == 6 && j == 5)
                {
                    arr[i][j] = 806;
                    System.out.print(BgColor.RED+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                if (i == 6 && j == 6)
                {
                    arr[i][j] = 807;
                    System.out.print(BgColor.GREEN+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                if (i == 6 && j == 7)
                {
                    arr[i][j] = 808;
                    System.out.print(BgColor.RED+Color.WHITE+"♙" + Color.RESET+"   ");
                }
                else if (i != 0 && i != 7 && i != 1 && i != 6)
                {
                    if (i%2==0&&j%2==0)
                         {
                    arr[i][j] = 0;
                    System.out.print(BgColor.GREEN+Color.GREEN + "♙" + Color.RESET + "   ");
                         }
                    else
                    {
                        if(i%2==1&&j%2==1)
                         {
                        arr[i][j] =  0;
                        System.out.print(BgColor.GREEN+Color.GREEN + "♙" + Color.RESET + "   ");
                         } else
                    {
                        arr[i][j] = 0;
                        System.out.print(BgColor.RED+Color.RED + "♙" + Color.RESET + "   ");
                    }
                    }
                }
            }System.out.println("");

        }

//* ЭТАП СОЗДАНИЯ ДОСКИ КОНЕЦ

//* Двойной ход пешки н
        int b1 = 0;
        int b2 = 0;
        int b3 = 0;
        int b4 = 0;
        int b5 = 0;
        int b6 = 0;
        int b7 = 0;
        int b8 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int c7 = 0;
        int c8 = 0;
//* Двойной ход пешки к
//* Условие ROKигровки н
        int RBL1 = 0;
        int RBL8 = 0;
        int R4L1 = 0;
        int R4L8 = 0;
//* Условие ROKигровки к


        while (Pobeda != 1)
        {checkpat=0;
//*Пат н


//*пат начало
            if(Shaxbelim==0&&Shax4ernim==0) {
                for (int Wax = 0; Wax < 8; Wax++) {
                    for (int Xaw = 0; Xaw < 8; Xaw++) {
//*пешки пат н
                        if (arr[Wax][Xaw] >= 801 && arr[Wax][Xaw] <= 808) {
                            if ((Wax != 0 && Xaw - 1 >= 0 && arr[Wax - 1][Xaw - 1] != 0 && arr[Wax - 1][Xaw - 1] < 505) || (Wax != 0 && Xaw + 1 <= 7 && arr[Wax - 1][Xaw + 1] != 105 && arr[Wax - 1][Xaw + 1] < 505) || arr[Wax - 1][Xaw] == 0) {
                                checkpat555++;
                            }
                        }
                        if (arr[Wax][Xaw] >= 201 && arr[Wax][Xaw] <= 208) {
                            if ((Wax != 7 && Xaw - 1 >= 0 && arr[Wax + 1][Xaw - 1] > 505) || (Wax != 7 && Xaw + 1 <= 7 && arr[Wax + 1][Xaw + 1] > 505) || arr[Wax + 1][Xaw] == 0) {
                                checkpat++;
                            }
                        }
//* пешки пат к
//* кони пат н
                        if (arr[Wax][Xaw] == 902 || arr[Wax][Xaw] == 907 || arr[Wax][Xaw] == 977) {
                            if (Wax - 2 >= 0) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && arr[Wax - 2][Xaw - 1] < 505) {
                                    checkpat555++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && arr[Wax - 2][Xaw + 1] < 505) {
                                    checkpat555++;
                                }
                            }
                            if (Wax + 2 <= 7) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && arr[Wax + 2][Xaw - 1] < 505) {
                                    checkpat555++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && arr[Wax + 2][Xaw + 1] < 505) {
                                    checkpat555++;
                                }
                            }
                            if (Wax - 1 >= 0) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && arr[Wax - 1][Xaw - 2] < 505) {
                                    checkpat555++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && arr[Wax - 1][Xaw + 2] < 505) {
                                    checkpat555++;
                                }
                            }
                            if (Wax + 1 <= 7) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && arr[Wax + 1][Xaw - 2] < 505) {
                                    checkpat555++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && arr[Wax + 1][Xaw + 2] < 505) {
                                    checkpat555++;
                                }
                            }
                        }
                        if (arr[Wax][Xaw] == 102 || arr[Wax][Xaw] == 107 || arr[Wax][Xaw] == 177) {
                            if (Wax - 2 >= 0) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax - 2][Xaw - 1] > 505 || arr[Wax - 2][Xaw - 1] == 0)) {
                                    checkpat++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax - 2][Xaw + 1] > 505 || arr[Wax - 2][Xaw + 1] == 0)) {
                                    checkpat++;
                                }
                            }
                            if (Wax + 2 <= 7) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax + 2][Xaw - 1] > 505 || arr[Wax + 2][Xaw - 1] == 0)) {
                                    checkpat++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax + 2][Xaw + 1] > 505 || arr[Wax + 2][Xaw + 1] == 0)) {
                                    checkpat++;
                                }
                            }

                            if (Wax - 1 >= 0) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax - 1][Xaw - 2] > 505 || arr[Wax - 1][Xaw - 2] == 0)) {
                                    checkpat++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax - 1][Xaw + 2] > 505 || arr[Wax - 1][Xaw + 2] == 0)) {
                                    checkpat++;
                                }
                            }
                            if (Wax + 1 <= 7) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax + 1][Xaw - 2] > 505 || arr[Wax + 1][Xaw - 2] == 0)) {
                                    checkpat++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax + 1][Xaw + 2] > 505 || arr[Wax + 1][Xaw + 2] == 0)) {
                                    checkpat++;
                                }
                            }
                        }
//* кони пат к
//*ладьи пат н
                        if (arr[Wax][Xaw] == 101 || arr[Wax][Xaw] == 108 || arr[Wax][Xaw] == 188) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw] == 0 || arr[Wax + Vert][Xaw] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {
                                if (arr[Wax - Vert2][Xaw] == 0 || arr[Wax - Vert2][Xaw] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                if (arr[Wax][Xaw + Vert3] == 0 || arr[Wax][Xaw + Vert3] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }
                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                if (arr[Wax][Xaw - Vert4] == 0 || arr[Wax][Xaw - Vert4] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
                        if (arr[Wax][Xaw] == 901 || arr[Wax][Xaw] == 908 || arr[Wax][Xaw] == 988) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                if (arr[Wax][Xaw + Vert3] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                if (arr[Wax][Xaw - Vert4] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
//* ладьи пат к
//* слоны пат н

                        if (arr[Wax][Xaw] == 903 || arr[Wax][Xaw] == 906 || arr[Wax][Xaw] == 966) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
                        if (arr[Wax][Xaw] == 103 || arr[Wax][Xaw] == 106 || arr[Wax][Xaw] == 166) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] == 0 || arr[Wax + Vert][Xaw + Vert] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] == 0 || arr[Wax - Vert2][Xaw - Vert2] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] == 0 || arr[Wax - Vert3][Xaw + Vert3] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] == 0 || arr[Wax + Vert4][Xaw - Vert4] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
//* слоны пат к
//* квины пат н
                        if (arr[Wax][Xaw] == 904 || arr[Wax][Xaw] == 944) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if (arr[Wax + Vert5][Xaw] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi5++;
                                }
                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if (arr[Wax - Vert6][Xaw] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi6++;
                                }
                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if (arr[Wax][Xaw + Vert7] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi7++;
                                }
                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if (arr[Wax][Xaw - Vert8] < 555) {
                                    checkpat555++;
                                } else {
                                    ProverkaWaxaLadbi8++;
                                }
                            }
                        }


                        if (arr[Wax][Xaw] == 104 || arr[Wax][Xaw] == 144) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] == 0 || arr[Wax + Vert][Xaw + Vert] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] == 0 || arr[Wax - Vert2][Xaw - Vert2] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] == 0 || arr[Wax - Vert3][Xaw + Vert3] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] == 0 || arr[Wax + Vert4][Xaw - Vert4] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if (arr[Wax + Vert5][Xaw] == 0 || arr[Wax + Vert5][Xaw] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi5++;
                                }
                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if (arr[Wax - Vert6][Xaw] == 0 || arr[Wax - Vert6][Xaw] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi6++;
                                }
                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if (arr[Wax][Xaw + Vert7] == 0 || arr[Wax][Xaw + Vert7] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi7++;
                                }
                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if (arr[Wax][Xaw - Vert8] == 0 || arr[Wax][Xaw - Vert8] > 555) {
                                    checkpat++;
                                } else {
                                    ProverkaWaxaLadbi8++;
                                }
                            }
                        }
//* квины пат к
//* кинг пат н

                        if ((arr[Wax][Xaw] == 105)) {

                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if ((arr[Wax + Vert][Xaw + Vert] == 0 || arr[Wax + Vert][Xaw + Vert] > 555)&&waxoviekletki[Wax+Vert][Xaw+Vert]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi1++;

                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if ((arr[Wax - Vert2][Xaw - Vert2] == 0 || arr[Wax - Vert2][Xaw - Vert2] > 555)&&waxoviekletki[Wax-Vert2][Xaw-Vert2]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi2++;

                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if ((arr[Wax - Vert3][Xaw + Vert3] == 0 || arr[Wax - Vert3][Xaw + Vert3] > 555)&&waxoviekletki[Wax-Vert3][Xaw+Vert3]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi3++;

                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if ((arr[Wax + Vert4][Xaw - Vert4] == 0 || arr[Wax + Vert4][Xaw - Vert4] > 555)&&waxoviekletki[Wax+Vert4][Xaw-Vert4]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi4++;

                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if ((arr[Wax + Vert5][Xaw] == 0 || arr[Wax + Vert5][Xaw] > 555)&&waxoviekletki[Wax+Vert5][Xaw]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi5++;

                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if ((arr[Wax - Vert6][Xaw] == 0 || arr[Wax - Vert6][Xaw] > 555)&&waxoviekletki[Wax-Vert6][Xaw]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi6++;

                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if ((arr[Wax][Xaw + Vert7] == 0 || arr[Wax][Xaw + Vert7] > 555)&&waxoviekletki[Wax][Xaw+Vert7]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi7++;

                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if ((arr[Wax][Xaw - Vert8] == 0 || arr[Wax][Xaw - Vert8] > 555)&&waxoviekletki[Wax][Xaw-Vert8]==0) {
                                    checkpat3++;
                                }
                                ProverkaWaxaLadbi8++;

                            }
                        }
                        if ((arr[Wax][Xaw] == 905)) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if ((arr[Wax + Vert][Xaw + Vert] < 555)&&waxoviekletki4ernix[Wax+Vert][Xaw+Vert]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi1++;

                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if ((arr[Wax - Vert2][Xaw - Vert2] < 555)&&waxoviekletki4ernix[Wax-Vert2][Xaw-Vert2]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi2++;

                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if ((arr[Wax - Vert3][Xaw + Vert3] < 555)&&waxoviekletki4ernix[Wax-Vert3][Xaw+Vert3]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi3++;

                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if ((arr[Wax + Vert4][Xaw - Vert4] < 555)&&waxoviekletki4ernix[Wax+Vert4][Xaw-Vert4]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi4++;

                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if ((arr[Wax + Vert5][Xaw] < 555)&&waxoviekletki4ernix[Wax+Vert5][Xaw]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi5++;

                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if ((arr[Wax - Vert6][Xaw] < 555)&&waxoviekletki4ernix[Wax-Vert6][Xaw]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi6++;

                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if ((arr[Wax][Xaw + Vert7] < 555)&&waxoviekletki4ernix[Wax][Xaw+Vert7]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi7++;

                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if ((arr[Wax][Xaw - Vert8] < 555)&&waxoviekletki4ernix[Wax][Xaw-Vert8]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi8++;

                            }
                        }
//* кинг пат к
                    }
                }
            }

//*пат конец


//*мат начало

//*
            if(Shaxbelim==1||Shax4ernim==1)
            {
//* взять фигуру н
                for (int Wax = 0; Wax < 8; Wax++) {
                    for (int Xaw = 0; Xaw < 8; Xaw++) {
//*пешки шах н
                        if (arr[Wax][Xaw] >= 801 && arr[Wax][Xaw] <= 808) {
                            if (Wax != 0 && Xaw - 1 >= 0 && arr[Wax - 1][Xaw - 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                checkmat++;
                            }
                            if (Wax != 0 && Xaw + 1 <= 7 && arr[Wax - 1][Xaw + 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                checkmat++;
                            }
                        }

                        if (arr[Wax][Xaw] >= 201 && arr[Wax][Xaw] <= 208) {
                            if (Wax != 7 && Xaw - 1 >= 0 && arr[Wax + 1][Xaw - 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                checkmat++;
                            }
                            if (Wax != 7 && Xaw + 1 <= 7 && arr[Wax + 1][Xaw + 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                checkmat++;
                            }
                        }
//* пешки шах к
//* кони шах н
                        if (arr[Wax][Xaw] == 902 || arr[Wax][Xaw] == 907 || arr[Wax][Xaw] == 977) {
                            if (Wax - 2 >= 0) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && arr[Wax - 2][Xaw - 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && arr[Wax - 2][Xaw + 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                }
                            }
                            if (Wax + 2 <= 7) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && arr[Wax + 2][Xaw - 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && arr[Wax + 2][Xaw + 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                }
                            }

                            if (Wax - 1 >= 0) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && arr[Wax - 1][Xaw - 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && arr[Wax - 1][Xaw + 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                }
                            }
                            if (Wax + 1 <= 7) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && arr[Wax + 1][Xaw - 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && arr[Wax + 1][Xaw + 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                }
                            }
                        }

                        if (arr[Wax][Xaw] == 102 || arr[Wax][Xaw] == 107 || arr[Wax][Xaw] == 177) {
                            if (Wax - 2 >= 0) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && arr[Wax - 2][Xaw - 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && arr[Wax - 2][Xaw + 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                }
                            }
                            if (Wax + 2 <= 7) {
                                int kh = 0;
                                if (Xaw - 1 >= 0 && kh == 0 && arr[Wax + 2][Xaw - 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 1 <= 7 && kh == 0 && arr[Wax + 2][Xaw + 1] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                }
                            }

                            if (Wax - 1 >= 0) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && arr[Wax - 1][Xaw - 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && arr[Wax - 1][Xaw + 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                }
                            }
                            if (Wax + 1 <= 7) {
                                int kh = 0;
                                if (Xaw - 2 >= 0 && kh == 0 && arr[Wax + 1][Xaw - 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    kh++;
                                    checkmat++;
                                }
                                if (Xaw + 2 <= 7 && kh == 0 && arr[Wax + 1][Xaw + 2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                }
                            }
                        }
//* кони шах к
//*ладьи шах н
                        if (arr[Wax][Xaw] == 101 || arr[Wax][Xaw] == 108 || arr[Wax][Xaw] == 188) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw] == 0) {
                                } else if (arr[Wax + Vert][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {
                                if (arr[Wax - Vert2][Xaw] == 0) {
                                } else if (arr[Wax - Vert2][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                if (arr[Wax][Xaw + Vert3] == 0) {
                                } else if (arr[Wax][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                if (arr[Wax][Xaw - Vert4] == 0) {
                                } else if (arr[Wax][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
                        if (arr[Wax][Xaw] == 901 || arr[Wax][Xaw] == 908 || arr[Wax][Xaw] == 988) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw] == 0) {
                                } else if (arr[Wax + Vert][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw] == 0) {
                                } else if (arr[Wax - Vert2][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                if (arr[Wax][Xaw + Vert3] == 0) {
                                } else if (arr[Wax][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                if (arr[Wax][Xaw - Vert4] == 0) {
                                } else if (arr[Wax][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
//* ладьи шах к
//* слоны шах н

                        if (arr[Wax][Xaw] == 903 || arr[Wax][Xaw] == 906 || arr[Wax][Xaw] == 966) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                } else if (arr[Wax + Vert][Xaw + Vert] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                } else if (arr[Wax - Vert2][Xaw - Vert2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                } else if (arr[Wax - Vert3][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                } else if (arr[Wax + Vert4][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
                        if (arr[Wax][Xaw] == 103 || arr[Wax][Xaw] == 106 || arr[Wax][Xaw] == 166) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                } else if (arr[Wax + Vert][Xaw + Vert] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                } else if (arr[Wax - Vert2][Xaw - Vert2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                } else if (arr[Wax - Vert3][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                } else if (arr[Wax + Vert4][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }
                        }
//* слоны шах к
//* квины шах н
                        if (arr[Wax][Xaw] == 904 || arr[Wax][Xaw] == 944) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                } else if (arr[Wax + Vert][Xaw + Vert] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                } else if (arr[Wax - Vert2][Xaw - Vert2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                } else if (arr[Wax - Vert3][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                } else if (arr[Wax + Vert4][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if (arr[Wax + Vert5][Xaw] == 0) {
                                } else if (arr[Wax + Vert5][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi5++;
                                }
                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if (arr[Wax - Vert6][Xaw] == 0) {
                                } else if (arr[Wax - Vert6][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi6++;
                                }
                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if (arr[Wax][Xaw + Vert7] == 0) {
                                } else if (arr[Wax][Xaw + Vert7] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi7++;
                                }
                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if (arr[Wax][Xaw - Vert8] == 0) {
                                } else if (arr[Wax][Xaw - Vert8] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi8++;
                                }
                            }
                        }


                        if (arr[Wax][Xaw] == 104 || arr[Wax][Xaw] == 144) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                } else if (arr[Wax + Vert][Xaw + Vert] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi1++;
                                }
                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                } else if (arr[Wax - Vert2][Xaw - Vert2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi2++;
                                }
                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                } else if (arr[Wax - Vert3][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi3++;
                                }
                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                } else if (arr[Wax + Vert4][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi4++;
                                }
                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if (arr[Wax + Vert5][Xaw] == 0) {
                                } else if (arr[Wax + Vert5][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi5++;
                                }
                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if (arr[Wax - Vert6][Xaw] == 0) {
                                } else if (arr[Wax - Vert6][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi6++;
                                }
                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if (arr[Wax][Xaw + Vert7] == 0) {
                                } else if (arr[Wax][Xaw + Vert7] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi7++;
                                }
                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if (arr[Wax][Xaw - Vert8] == 0) {
                                } else if (arr[Wax][Xaw - Vert8] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500) {
                                    checkmat++;
                                } else {
                                    ProverkaWaxaLadbi8++;
                                }
                            }
                        }
//* квины шах к
//* кинги
                        if ((arr[Wax][Xaw] == 105)) {

                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if ((arr[Wax + Vert][Xaw + Vert] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax+Vert][Xaw+Vert]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi1++;

                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if ((arr[Wax - Vert2][Xaw - Vert2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax-Vert2][Xaw-Vert2]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi2++;

                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if ((arr[Wax - Vert3][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax-Vert3][Xaw+Vert3]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi3++;

                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if ((arr[Wax + Vert4][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax+Vert4][Xaw-Vert4]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi4++;

                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if ((arr[Wax + Vert5][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax+Vert5][Xaw]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi5++;

                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if ((arr[Wax - Vert6][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax-Vert6][Xaw]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi6++;

                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if ((arr[Wax][Xaw + Vert7] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax][Xaw+Vert7]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi7++;

                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if ((arr[Wax][Xaw - Vert8] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]>500)&&waxoviekletki[Wax][Xaw-Vert8]==0) {
                                    checkmat++;
                                }
                                ProverkaWaxaLadbi8++;

                            }
                        }
                        if ((arr[Wax][Xaw] == 905)) {
                            int ProverkaWaxaLadbi1 = 0;
                            int ProverkaWaxaLadbi2 = 0;
                            int ProverkaWaxaLadbi3 = 0;
                            int ProverkaWaxaLadbi4 = 0;
                            int ProverkaWaxaLadbi5 = 0;
                            int ProverkaWaxaLadbi6 = 0;
                            int ProverkaWaxaLadbi7 = 0;
                            int ProverkaWaxaLadbi8 = 0;
                            for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                if ((arr[Wax + Vert][Xaw + Vert] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500)&&waxoviekletki4ernix[Wax+Vert][Xaw+Vert]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi1++;

                            }

                            for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                if ((arr[Wax - Vert2][Xaw - Vert2] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500)&&waxoviekletki4ernix[Wax-Vert2][Xaw-Vert2]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi2++;

                            }
                            for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                if ((arr[Wax - Vert3][Xaw + Vert3] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500)&&waxoviekletki4ernix[Wax-Vert3][Xaw+Vert3]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi3++;

                            }


                            for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                if ((arr[Wax + Vert4][Xaw - Vert4] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<505)&&waxoviekletki4ernix[Wax+Vert4][Xaw-Vert4]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi4++;

                            }

                            for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                if ((arr[Wax + Vert5][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500)&&waxoviekletki4ernix[Wax+Vert5][Xaw]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi5++;

                            }

                            for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                if ((arr[Wax - Vert6][Xaw] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500)&&waxoviekletki4ernix[Wax-Vert6][Xaw]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi6++;

                            }
                            for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                if ((arr[Wax][Xaw + Vert7] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500)&&waxoviekletki4ernix[Wax][Xaw+Vert7]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi7++;

                            }
                            for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                if ((arr[Wax][Xaw - Vert8] == arr[Sh1][Sh2]&&arr[Sh1][Sh2]<500)&&waxoviekletki4ernix[Wax][Xaw-Vert8]==0) {
                                    checkpat2++;
                                }
                                ProverkaWaxaLadbi8++;

                            }
                        }


















                    }
                }
//* взять фигуру к
//* я устал, я ухожу н
                for (int Sr = 0; Sr < 8; Sr++) {
                    for (int Sr2 = 0; Sr2 < 8; Sr2++) {

                        arr41[Sr][Sr2] = arr[Sr][Sr2];
                    }

                }





                int K41=0; int K42=0; int K61=0; int K62=0;
                for (int Wax = 0; Wax < 8; Wax++) {
                    for (int Xaw = 0; Xaw < 8; Xaw++) {
                        if(arr[Wax][Xaw]==105)
                        {
                            K41=Wax; K42=Xaw;
                        }
                        if(arr[Wax][Xaw]==905)
                        {
                            K61=Wax; K62=Xaw;
                        }
                    }

                }
                int Yaystal=0;
                //*шах начало
                while (Yaystal<=7) {
                    int klll999 = 0;
                    for (int Wax = 0; Wax < 8; Wax++) {
                        for (int Xaw = 0; Xaw < 8; Xaw++) {
//*пешки шах н
                            //*черн
                            if (Yaystal == 0) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K41 - 1 >= 0) && (arr[K41 - 1][K42] == 0 || arr[K41 - 1][K42] > 560)&&waxoviekletki[K41-1][K42]==0) {
                                    arr[K41 - 1][K42] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K61 - 1 >= 0) && (arr[K61 - 1][K62] < 400)&&waxoviekletki4ernix[K61-1][K62]==0) {
                                    arr[K61 - 1][K62] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }
                            if (Yaystal == 1) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K41 + 1 <= 7) && (arr[K41 + 1][K42] == 0 || arr[K41 + 1][K42] > 560)&&waxoviekletki[K41+1][K42]==0) {
                                    arr[K41 + 1][K42] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K61 + 1 <= 7) && (arr[K61 + 1][K62] < 400)&&waxoviekletki4ernix[K61+1][K62]==0) {
                                    arr[K61 + 1][K62] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }


                            if (Yaystal == 2) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K42 + 1 <= 7) && (arr[K41][K42+1] == 0 || arr[K41][K42+1] > 560)&&waxoviekletki[K41][K42+1]==0) {
                                    arr[K41][K42+1] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K62 + 1 <= 7) && (arr[K61][K62+1] < 400)&&waxoviekletki4ernix[K61][K62+1]==0) {
                                    arr[K61][K62+1] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }


                            if (Yaystal == 3) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K42 - 1 >= 0) && (arr[K41][K42-1] == 0 || arr[K41][K42-1] > 560)&&waxoviekletki[K41][K42-1]==0) {
                                    arr[K41][K42-1] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K62 - 1 >= 0) && (arr[K61][K62-1] < 400)&&waxoviekletki4ernix[K61][K62-1]==0) {
                                    arr[K61][K62-1] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }

                            if (Yaystal == 4) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K41 - 1 >= 0)&& (K42 - 1 >= 0) && (arr[K41-1][K42-1] == 0 || arr[K41-1][K42-1] > 560)&&waxoviekletki[K41-1][K42-1]==0) {
                                    arr[K41-1][K42-1] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K61 - 1 >= 0)&& (K62 - 1 >= 0) && (arr[K61-1][K62-1] < 400)&&waxoviekletki4ernix[K61-1][K62-1]==0) {
                                    arr[K61-1][K62-1] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }

                            if (Yaystal == 5) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K41 + 1 <= 7)&& (K42 - 1 >= 0) && (arr[K41+1][K42-1] == 0 || arr[K41+1][K42-1] > 560)&&waxoviekletki[K41+1][K42-1]==0) {
                                    arr[K41+1][K42-1] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K61 + 1 <= 7)&& (K62 - 1 >= 0) && (arr[K61+1][K62-1] < 400)&&waxoviekletki4ernix[K61+1][K62-1]==0) {
                                    arr[K61+1][K62-1] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }
                            if (Yaystal == 6) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K42 + 1 <= 7)&& (K41 - 1 >= 0) && (arr[K41-1][K42+1] == 0 || arr[K41-1][K42+1] > 560)&&waxoviekletki[K41-1][K42+1]==0) {
                                    arr[K41-1][K42+1] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K62 + 1 <= 7)&& (K61 - 1 >= 0) && (arr[K61-1][K62+1] < 400)&&waxoviekletki4ernix[K61-1][K62+1]==0) {
                                    arr[K61-1][K62+1] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }

                            if (Yaystal == 7) {
                                if (Shax4ernim == 1 && klll999 == 0 && (K41 + 1 <= 7)&& (K42 + 1 <= 7) && (arr[K41+1][K42+1] == 0 || arr[K41+1][K42+1] > 560)&&waxoviekletki[K41+1][K42+1]==0) {
                                    arr[K41+1][K42+1] = 105;
                                    arr[K41][K42] = 0;
                                    klll999++;
                                }
                                if (Shaxbelim == 1 && klll999 == 0 && (K61 + 1 <= 7)&& (K62 + 1 <= 7) && (arr[K61+1][K62+1] < 400)&&waxoviekletki4ernix[K61+1][K62+1]==0) {
                                    arr[K61+1][K62+1] = 905;
                                    arr[K61][K62] = 0;
                                    klll999++;
                                }Yaystal++;
                            }
                            if (arr[Wax][Xaw] >= 801 && arr[Wax][Xaw] <= 808) {
                                if (Wax != 0 && Xaw - 1 >= 0 && arr[Wax - 1][Xaw - 1] == 105) {
                                    NShax4ernim = 1;
                                }
                                if (Wax != 0 && Xaw + 1 <= 7 && arr[Wax - 1][Xaw + 1] == 105) {
                                    NShax4ernim = 1;
                                }
                            }

                            if (arr[Wax][Xaw] >= 201 && arr[Wax][Xaw] <= 208) {
                                if (Wax != 7 && Xaw - 1 >= 0 && arr[Wax + 1][Xaw - 1] == 905) {
                                    NShaxbelim = 1;
                                }
                                if (Wax != 7 && Xaw + 1 <= 7 && arr[Wax + 1][Xaw + 1] == 905) {
                                    NShaxbelim = 1;
                                }
                            }
//* пешки шах к
//* кони шах н
                            if (arr[Wax][Xaw] == 902 || arr[Wax][Xaw] == 907 || arr[Wax][Xaw] == 977) {
                                if (Wax - 2 >= 0) {
                                    int kh = 0;
                                    if (Xaw - 1 >= 0 && kh == 0 && arr[Wax - 2][Xaw - 1] == 105) {
                                        kh++;
                                        NShax4ernim = 1;
                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && arr[Wax - 2][Xaw + 1] == 105) {
                                        NShax4ernim = 1;
                                    }
                                }
                                if (Wax + 2 <= 7) {
                                    int kh = 0;
                                    if (Xaw - 1 >= 0 && kh == 0 && arr[Wax + 2][Xaw - 1] == 105) {
                                        kh++;
                                        NShax4ernim = 1;
                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && arr[Wax + 2][Xaw + 1] == 105) {
                                        NShax4ernim = 1;
                                    }
                                }

                                if (Wax - 1 >= 0) {
                                    int kh = 0;
                                    if (Xaw - 2 >= 0 && kh == 0 && arr[Wax - 1][Xaw - 2] == 105) {
                                        kh++;
                                        NShax4ernim = 1;

                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && arr[Wax - 1][Xaw + 2] == 105) {
                                        NShax4ernim = 1;

                                    }
                                }
                                if (Wax + 1 <= 7) {
                                    int kh = 0;
                                    if (Xaw - 2 >= 0 && kh == 0 && arr[Wax + 1][Xaw - 2] == 105) {
                                        kh++;
                                        NShax4ernim = 1;

                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && arr[Wax + 1][Xaw + 2] == 105) {
                                        NShax4ernim = 1;

                                    }
                                }
                            }

                            if (arr[Wax][Xaw] == 102 || arr[Wax][Xaw] == 107 || arr[Wax][Xaw] == 177) {
                                if (Wax - 2 >= 0) {
                                    int kh = 0;
                                    if (Xaw - 1 >= 0 && kh == 0 && arr[Wax - 2][Xaw - 1] == 905) {
                                        kh++;
                                        NShaxbelim = 1;

                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && arr[Wax - 2][Xaw + 1] == 905) {
                                        NShaxbelim = 1;

                                    }
                                }
                                if (Wax + 2 <= 7) {
                                    int kh = 0;
                                    if (Xaw - 1 >= 0 && kh == 0 && arr[Wax + 2][Xaw - 1] == 905) {
                                        kh++;
                                        NShaxbelim = 1;

                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && arr[Wax + 2][Xaw + 1] == 905) {
                                        NShaxbelim = 1;

                                    }
                                }

                                if (Wax - 1 >= 0) {
                                    int kh = 0;
                                    if (Xaw - 2 >= 0 && kh == 0 && arr[Wax - 1][Xaw - 2] == 905) {
                                        kh++;
                                        NShaxbelim = 1;

                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && arr[Wax - 1][Xaw + 2] == 905) {
                                        NShaxbelim = 1;

                                    }
                                }
                                if (Wax + 1 <= 7) {
                                    int kh = 0;
                                    if (Xaw - 2 >= 0 && kh == 0 && arr[Wax + 1][Xaw - 2] == 905) {
                                        kh++;
                                        NShaxbelim = 1;

                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && arr[Wax + 1][Xaw + 2] == 905) {
                                        NShaxbelim = 1;

                                    }
                                }
                            }
//* кони шах к
//*ладьи шах н
                            if (arr[Wax][Xaw] == 101 || arr[Wax][Xaw] == 108 || arr[Wax][Xaw] == 188) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw] == 0) {
                                    } else if (arr[Wax + Vert][Xaw] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {
                                    if (arr[Wax - Vert2][Xaw] == 0) {
                                    } else if (arr[Wax - Vert2][Xaw] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                    if (arr[Wax][Xaw + Vert3] == 0) {
                                    } else if (arr[Wax][Xaw + Vert3] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                    if (arr[Wax][Xaw - Vert4] == 0) {
                                    } else if (arr[Wax][Xaw - Vert4] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
                            if (arr[Wax][Xaw] == 901 || arr[Wax][Xaw] == 908 || arr[Wax][Xaw] == 988) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw] == 0) {
                                    } else if (arr[Wax + Vert][Xaw] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw] == 0) {
                                    } else if (arr[Wax - Vert2][Xaw] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                    if (arr[Wax][Xaw + Vert3] == 0) {
                                    } else if (arr[Wax][Xaw + Vert3] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                    if (arr[Wax][Xaw - Vert4] == 0) {
                                    } else if (arr[Wax][Xaw - Vert4] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
//* ладьи шах к
//* слоны шах н

                            if (arr[Wax][Xaw] == 903 || arr[Wax][Xaw] == 906 || arr[Wax][Xaw] == 966) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (arr[Wax + Vert][Xaw + Vert] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (arr[Wax - Vert2][Xaw - Vert2] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (arr[Wax - Vert3][Xaw + Vert3] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (arr[Wax + Vert4][Xaw - Vert4] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
                            if (arr[Wax][Xaw] == 103 || arr[Wax][Xaw] == 106 || arr[Wax][Xaw] == 166) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (arr[Wax + Vert][Xaw + Vert] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (arr[Wax - Vert2][Xaw - Vert2] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (arr[Wax - Vert3][Xaw + Vert3] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (arr[Wax + Vert4][Xaw - Vert4] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
//* слоны шах к
//* квины шах н
                            if (arr[Wax][Xaw] == 904 || arr[Wax][Xaw] == 944) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                int ProverkaWaxaLadbi5 = 0;
                                int ProverkaWaxaLadbi6 = 0;
                                int ProverkaWaxaLadbi7 = 0;
                                int ProverkaWaxaLadbi8 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (arr[Wax + Vert][Xaw + Vert] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (arr[Wax - Vert2][Xaw - Vert2] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (arr[Wax - Vert3][Xaw + Vert3] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (arr[Wax + Vert4][Xaw - Vert4] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }

                                for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                    if (arr[Wax + Vert5][Xaw] == 0) {
                                    } else if (arr[Wax + Vert5][Xaw] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi5++;
                                    }
                                }

                                for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                    if (arr[Wax - Vert6][Xaw] == 0) {
                                    } else if (arr[Wax - Vert6][Xaw] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi6++;
                                    }
                                }
                                for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                    if (arr[Wax][Xaw + Vert7] == 0) {
                                    } else if (arr[Wax][Xaw + Vert7] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi7++;
                                    }
                                }
                                for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                    if (arr[Wax][Xaw - Vert8] == 0) {
                                    } else if (arr[Wax][Xaw - Vert8] == 105) {
                                        NShax4ernim = 1;

                                    } else {
                                        ProverkaWaxaLadbi8++;
                                    }
                                }
                            }


                            if (arr[Wax][Xaw] == 104 || arr[Wax][Xaw] == 144) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                int ProverkaWaxaLadbi5 = 0;
                                int ProverkaWaxaLadbi6 = 0;
                                int ProverkaWaxaLadbi7 = 0;
                                int ProverkaWaxaLadbi8 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (arr[Wax + Vert][Xaw + Vert] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (arr[Wax - Vert2][Xaw - Vert2] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (arr[Wax - Vert3][Xaw + Vert3] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (arr[Wax + Vert4][Xaw - Vert4] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }

                                for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                    if (arr[Wax + Vert5][Xaw] == 0) {
                                    } else if (arr[Wax + Vert5][Xaw] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi5++;
                                    }
                                }

                                for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                    if (arr[Wax - Vert6][Xaw] == 0) {
                                    } else if (arr[Wax - Vert6][Xaw] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi6++;
                                    }
                                }
                                for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                    if (arr[Wax][Xaw + Vert7] == 0) {
                                    } else if (arr[Wax][Xaw + Vert7] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi7++;
                                    }
                                }
                                for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                    if (arr[Wax][Xaw - Vert8] == 0) {
                                    } else if (arr[Wax][Xaw - Vert8] == 905) {
                                        NShaxbelim = 1;

                                    } else {
                                        ProverkaWaxaLadbi8++;
                                    }
                                }
                            }
//* квины шах к
                        }
                    }System.out.println(ProvHaYxod);System.out.println(ProvHaYxod);System.out.println(ProvHaYxod);
                    if(NShaxbelim==0&&NShax4ernim==0){System.out.print("Шахчер"+NShax4ernim);
                        ProvHaYxod++;}
                }

//*шах конец


                for (int Sr = 0; Sr < 8; Sr++) {
                    for (int Sr2 = 0; Sr2 < 8; Sr2++) {

                        arr[Sr][Sr2] = arr41[Sr][Sr2];
                    }

                }



//* я устал, я ухожу к

//* Ты закрыл меня спиной
//И стреляешь по врагам
//Так выглядит любовь
//Ведь любовь — это война
//Мы укроемся от всех
//На исходе наша жизнь
//И пускай патронов нет
//Но вдвоём мы победим н














//*шах начало
                for (int Wax = 0; Wax < 8; Wax++) {
                    for (int Xaw = 0; Xaw < 8; Xaw++) {
//*пешки шах н
                        if(Shaxbelim==1){
                            if (arr[Wax][Xaw] >= 801 && arr[Wax][Xaw] <= 808) {
                                if (b1 == 0 && matoviekietki[4][0] == 1 && arr[4][0] == 0 && arr[5][0] == 0 && arr[6][0] == 801) {
                                    Tizakril++;
                                }
                                if (b2 == 0 && matoviekietki[4][1] == 1 && arr[4][1] == 0 && arr[5][1] == 0 && arr[6][1] == 802) {
                                    Tizakril++;
                                }
                                if (b3 == 0 && matoviekietki[4][2] == 1 && arr[4][2] == 0 && arr[5][2] == 0 && arr[6][2] == 803) {
                                    Tizakril++;
                                }
                                if (b4 == 0 && matoviekietki[4][3] == 1 && arr[4][3] == 0 && arr[5][3] == 0 && arr[6][3] == 804) {
                                    Tizakril++;
                                }
                                if (b5 == 0 && matoviekietki[4][4] == 1 && arr[4][4] == 0 && arr[5][4] == 0 && arr[6][4] == 805) {
                                    Tizakril++;
                                }
                                if (b6 == 0 && matoviekietki[4][5] == 1 && arr[4][5] == 0 && arr[5][5] == 0 && arr[6][5] == 806) {
                                    Tizakril++;
                                }
                                if (b7 == 0 && matoviekietki[4][6] == 1 && arr[4][6] == 0 && arr[5][6] == 0 && arr[6][6] == 807) {
                                    Tizakril++;
                                }
                                if (b8 == 0 && matoviekietki[4][7] == 1 && arr[4][7] == 0 && arr[5][7] == 0 && arr[6][7] == 808) {
                                    Tizakril++;
                                }

                                if (matoviekietki[Wax - 1][Xaw] == 1 && arr[Wax - 1][Xaw] == 0) {
                                    Tizakril++;
                                }

                                if (Wax != 0 && Xaw - 1 >= 0 && matoviekietki[Wax - 1][Xaw - 1] == 1) {
                                    Tizakril++;

                                }
                                if (Wax != 0 && Xaw + 1 <= 7 && matoviekietki[Wax - 1][Xaw + 1] == 1) {
                                    Tizakril++;
                                }
                            }
                        }

                        if(Shax4ernim==1){
                            if (arr[Wax][Xaw] >= 201 && arr[Wax][Xaw] <= 208) {

                                if (c1 == 0 && matoviekietki[3][0] == 1 && arr[2][0] == 0 && arr[3][0] == 0 && arr[1][0] == 201) {
                                    Tizakril++;
                                }
                                if (c2 == 0 && matoviekietki[3][1] == 1 && arr[2][1] == 0 && arr[3][1] == 0 && arr[1][1] == 202) {
                                    Tizakril++;
                                }
                                if (c3 == 0 && matoviekietki[3][2] == 1 && arr[2][2] == 0 && arr[3][2] == 0 && arr[1][2] == 203) {
                                    Tizakril++;
                                }
                                if (c4 == 0 && matoviekietki[3][3] == 1 && arr[2][3] == 0 && arr[3][3] == 0 && arr[1][3] == 204) {
                                    Tizakril++;
                                }
                                if (c5 == 0 && matoviekietki[3][4] == 1 && arr[2][4] == 0 && arr[3][4] == 0 && arr[1][4] == 205) {
                                    Tizakril++;
                                }
                                if (c6 == 0 && matoviekietki[3][5] == 1 && arr[2][5] == 0 && arr[3][5] == 0 && arr[1][5] == 206) {
                                    Tizakril++;
                                }
                                if (c7 == 0 && matoviekietki[3][6] == 1 && arr[2][6] == 0 && arr[3][6] == 0 && arr[1][6] == 207) {
                                    Tizakril++;
                                }
                                if (c8 == 0 && matoviekietki[3][7] == 1 && arr[2][7] == 0 && arr[3][7] == 0 && arr[1][7] == 208) {
                                    Tizakril++;
                                }

                                if (arr[Wax + 1][Xaw] == 0 && (matoviekietki[Wax + 1][Xaw ] == 1)) {
                                    Tizakril++;
                                }
                                if (Wax != 7 && Xaw - 1 >= 0 && (matoviekietki[Wax + 1][Xaw - 1] == 1)) {
                                    Tizakril++;
                                }
                                if (Wax != 7 && Xaw + 1 <= 7 && (matoviekietki[Wax + 1][Xaw + 1] == 1)) {
                                    Tizakril++;
                                }

                            }
                        }
//* пешки шах к
//* кони шах н
                        if(Shaxbelim==1){
                            if (arr[Wax][Xaw] == 902 || arr[Wax][Xaw] == 907 || arr[Wax][Xaw] == 977) {
                                if (Wax - 2 >= 0) {
                                    int kh = 0;

                                    if (Xaw - 1 >= 0 && kh == 0 && matoviekietki[Wax - 2][Xaw - 1] == 1) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && matoviekietki[Wax - 2][Xaw + 1] == 1) {
                                        Tizakril++;
                                    }

                                }
                                if (Wax + 2 <= 7) {
                                    int kh = 0;

                                    if (Xaw - 1 >= 0 && kh == 0 && matoviekietki[Wax + 2][Xaw - 1] == 1) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && matoviekietki[Wax + 2][Xaw + 1] == 1) {
                                        Tizakril++;
                                    }

                                }

                                if (Wax - 1 >= 0) {
                                    int kh = 0;

                                    if (Xaw - 2 >= 0 && kh == 0 && matoviekietki[Wax - 1][Xaw - 2] == 1) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && matoviekietki[Wax - 1][Xaw + 2] == 1) {
                                        Tizakril++;
                                    }

                                }
                                if (Wax + 1 <= 7) {
                                    int kh = 0;

                                    if (Xaw - 2 >= 0 && kh == 0 && matoviekietki[Wax + 1][Xaw - 2] == 1) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && (matoviekietki[Wax + 1][Xaw + 2] == 1)) {
                                        Tizakril++;
                                    }

                                }
                            }
                        }

                        if(Shax4ernim==1){
                            if (arr[Wax][Xaw] == 102 || arr[Wax][Xaw] == 107 || arr[Wax][Xaw] == 177) {
                                if (Wax - 2 >= 0) {
                                    int kh = 0;

                                    if (Xaw - 1 >= 0 && kh == 0 && (matoviekietki[Wax - 2][Xaw - 1] == 1)) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && (matoviekietki[Wax - 2][Xaw + 1] == 1)) {
                                        Tizakril++;
                                    }

                                }
                                if (Wax + 2 <= 7) {
                                    int kh = 0;

                                    if (Xaw - 1 >= 0 && kh == 0 && (matoviekietki[Wax + 2][Xaw - 1] == 1)) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 1 <= 7 && kh == 0 && (matoviekietki[Wax + 2][Xaw + 1] == 1)) {
                                        Tizakril++;
                                    }

                                }

                                if (Wax - 1 >= 0) {
                                    int kh = 0;

                                    if (Xaw - 2 >= 0 && kh == 0 && (matoviekietki[Wax - 1][Xaw - 2] == 1)) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && (matoviekietki[Wax - 1][Xaw + 2] == 1)) {
                                        Tizakril++;
                                    }

                                }
                                if (Wax + 1 <= 7) {
                                    int kh = 0;

                                    if (Xaw - 2 >= 0 && kh == 0 && (matoviekietki[Wax + 1][Xaw - 2] == 1)) {
                                        kh++;
                                        Tizakril++;
                                    }
                                    if (Xaw + 2 <= 7 && kh == 0 && (matoviekietki[Wax + 1][Xaw + 2] == 1)) {
                                        Tizakril++;
                                    }

                                }
                            }
                        }
//* кони шах к
//*ладьи шах н
                        if(Shax4ernim==1){
                            if (arr[Wax][Xaw] == 101 || arr[Wax][Xaw] == 108 || arr[Wax][Xaw] == 188) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw] == 0&&matoviekietki[Wax + Vert][Xaw] == 0) {
                                    } else if (matoviekietki[Wax + Vert][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }


                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {
                                    if (arr[Wax - Vert2][Xaw] == 0&&matoviekietki[Wax - Vert2][Xaw] == 0) {
                                    } else if (matoviekietki[Wax - Vert2][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }

                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                    if (arr[Wax][Xaw + Vert3] == 0&&matoviekietki[Wax][Xaw + Vert3] == 0) {
                                    } else if (matoviekietki[Wax][Xaw + Vert3] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }

                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                    if (arr[Wax][Xaw - Vert4] == 0&&matoviekietki[Wax][Xaw - Vert4] == 0) {
                                    } else if (matoviekietki[Wax][Xaw - Vert4] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
                        }

                        if(Shaxbelim==1){
                            if (arr[Wax][Xaw] == 901 || arr[Wax][Xaw] == 908 || arr[Wax][Xaw] == 988) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw] == 0&&matoviekietki[Wax + Vert][Xaw] == 0) {
                                    } else if (matoviekietki[Wax + Vert][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }


                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw] == 0&&matoviekietki[Wax - Vert2][Xaw] == 0) {
                                    } else if (matoviekietki[Wax - Vert2][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                    if (arr[Wax][Xaw + Vert3] == 0&&matoviekietki[Wax][Xaw + Vert3] == 0) {
                                    } else if (matoviekietki[Wax][Xaw + Vert3] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                    if (arr[Wax][Xaw - Vert4] == 0&&matoviekietki[Wax][Xaw - Vert4] == 0) {
                                    } else if (matoviekietki[Wax][Xaw - Vert4] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
                        }
//* ладьи шах к
//* слоны шах н

                        if(Shaxbelim==1){
                            if (arr[Wax][Xaw] == 903 || arr[Wax][Xaw] == 906 || arr[Wax][Xaw] == 966) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0 && matoviekietki[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (matoviekietki[Wax + Vert][Xaw + Vert] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0 && matoviekietki[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (matoviekietki[Wax - Vert2][Xaw - Vert2] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0 && matoviekietki[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (matoviekietki[Wax - Vert3][Xaw + Vert3] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0 && matoviekietki[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (matoviekietki[Wax + Vert4][Xaw - Vert4] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
                        }
                        if(Shax4ernim==1){
                            if (arr[Wax][Xaw] == 103 || arr[Wax][Xaw] == 106 || arr[Wax][Xaw] == 166) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0 && matoviekietki[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (matoviekietki[Wax + Vert][Xaw + Vert] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0 && matoviekietki[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (matoviekietki[Wax - Vert2][Xaw - Vert2] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0 && matoviekietki[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (matoviekietki[Wax - Vert3][Xaw + Vert3] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0 && matoviekietki[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (matoviekietki[Wax + Vert4][Xaw - Vert4] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }
                            }
                        }
//* слоны шах к
//* квины шах н
                        if(Shaxbelim==1){
                            if (arr[Wax][Xaw] == 904 || arr[Wax][Xaw] == 944) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                int ProverkaWaxaLadbi5 = 0;
                                int ProverkaWaxaLadbi6 = 0;
                                int ProverkaWaxaLadbi7 = 0;
                                int ProverkaWaxaLadbi8 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0 && matoviekietki[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (matoviekietki[Wax + Vert][Xaw + Vert] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }

                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0 && matoviekietki[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (matoviekietki[Wax - Vert2][Xaw - Vert2] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0 && matoviekietki[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (matoviekietki[Wax - Vert3][Xaw + Vert3] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0 && matoviekietki[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (matoviekietki[Wax + Vert4][Xaw - Vert4] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }

                                for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                    if (arr[Wax + Vert5][Xaw] == 0 && matoviekietki[Wax + Vert5][Xaw] == 0) {
                                    } else if (matoviekietki[Wax + Vert5][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi5++;
                                    }
                                }

                                for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                    if (arr[Wax - Vert6][Xaw] == 0 && matoviekietki[Wax - Vert6][Xaw] == 0) {
                                    } else if (matoviekietki[Wax - Vert6][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi6++;
                                    }
                                }
                                for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                    if (arr[Wax][Xaw + Vert7] == 0 && matoviekietki[Wax][Xaw + Vert7] == 0) {
                                    } else if (matoviekietki[Wax][Xaw + Vert7] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi7++;
                                    }
                                }
                                for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                    if (arr[Wax][Xaw - Vert8] == 0 && matoviekietki[Wax][Xaw - Vert8] == 0) {
                                    } else if (matoviekietki[Wax][Xaw - Vert8] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi8++;
                                    }
                                }
                            }
                        }


                        if(Shax4ernim==1){
                            if (arr[Wax][Xaw] == 104 || arr[Wax][Xaw] == 144) {
                                int ProverkaWaxaLadbi1 = 0;
                                int ProverkaWaxaLadbi2 = 0;
                                int ProverkaWaxaLadbi3 = 0;
                                int ProverkaWaxaLadbi4 = 0;
                                int ProverkaWaxaLadbi5 = 0;
                                int ProverkaWaxaLadbi6 = 0;
                                int ProverkaWaxaLadbi7 = 0;
                                int ProverkaWaxaLadbi8 = 0;
                                for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                    if (arr[Wax + Vert][Xaw + Vert] == 0 && matoviekietki[Wax + Vert][Xaw + Vert] == 0) {
                                    } else if (matoviekietki[Wax + Vert][Xaw + Vert] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi1++;
                                    }
                                }


                                for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                    if (arr[Wax - Vert2][Xaw - Vert2] == 0 && matoviekietki[Wax - Vert2][Xaw - Vert2] == 0) {
                                    } else if (matoviekietki[Wax - Vert2][Xaw - Vert2] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi2++;
                                    }
                                }
                                for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                    if (arr[Wax - Vert3][Xaw + Vert3] == 0 && matoviekietki[Wax - Vert3][Xaw + Vert3] == 0) {
                                    } else if (matoviekietki[Wax - Vert3][Xaw + Vert3] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi3++;
                                    }
                                }


                                for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                    if (arr[Wax + Vert4][Xaw - Vert4] == 0 && matoviekietki[Wax + Vert4][Xaw - Vert4] == 0) {
                                    } else if (matoviekietki[Wax + Vert4][Xaw - Vert4] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi4++;
                                    }
                                }

                                for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                    if (arr[Wax + Vert5][Xaw] == 0 && matoviekietki[Wax + Vert5][Xaw] == 0) {
                                    } else if (matoviekietki[Wax + Vert5][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi5++;
                                    }
                                }

                                for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                    if (arr[Wax - Vert6][Xaw] == 0 && matoviekietki[Wax - Vert6][Xaw] == 0) {
                                    } else if (matoviekietki[Wax - Vert6][Xaw] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi6++;
                                    }
                                }
                                for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                    if (arr[Wax][Xaw + Vert7] == 0 && matoviekietki[Wax][Xaw + Vert7] == 0) {
                                    } else if (matoviekietki[Wax][Xaw + Vert7] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi7++;
                                    }
                                }
                                for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                    if (arr[Wax][Xaw - Vert8] == 0 && matoviekietki[Wax][Xaw - Vert8] == 0) {
                                    } else if (matoviekietki[Wax][Xaw - Vert8] == 1) {
                                        Tizakril++;
                                    } else {
                                        ProverkaWaxaLadbi8++;
                                    }
                                }
                            }
                        }
//* квины шах к
                    }
                }

//*шах конец












































//* Ты закрыл меня спиной
//И стреляешь по врагам
//Так выглядит любовь
//Ведь любовь — это война
//Мы укроемся от всех
//На исходе наша жизнь
//И пускай патронов нет
//Но вдвоём мы победим к

//*шах конец
            }

            if(Shaxbelim==1&&checkmat==0&&ProvHaYxod==0&&Tizakril==0)
            {System.out.println("ЧЕРНЫЕ! ");
                Pobeda = 1;

                System.out.println("ЧЕРНЫЕ! ");
                System.out.println("ВЫИГРАЛИ! ");
            }
            else if(Shax4ernim==1&&checkmat==0&&ProvHaYxod==0&&Tizakril==0)
            {System.out.println("БЕЛЫЕ! ");
                Pobeda = 1;

                System.out.println("БЕЛЫЕ! ");
                System.out.println("ПОБЕДИЛИ! ");
            }
//* мат конец
            if(Shaxbelim==0&&checkpat555+checkpat2==0&&O4ereDb%2==1)
            {
                Pobeda = 1;
                System.out.println("НИЧЬЯ! ");
                System.out.println("НИЧЬЯ! ");
                System.out.println("НИЧЬЯ! ");
            }
            else if(Shax4ernim==0&&checkpat+checkpat3==0&&O4ereDb%2==0)
            {
                Pobeda = 1;
                System.out.println("НИЧЬЯ! ");
                System.out.println("НИЧЬЯ! ");
                System.out.println("НИЧЬЯ! ");
            }


            else {
                if(Pobeda==1){System.out.println("GAMEOVER");}else
                {


                    if (Shaxbelim == 1) {
                        System.out.println("ВНИМАНИЕ");
                        System.out.println("ВНИМАНИЕ");
                        System.out.println("ВНИМАНИЕ");
                        System.out.println("БЕЛЫМ ОБЪЯВЛЕН ШАХ");
                    }

                    if (Shax4ernim == 1) {
                        System.out.println("ВНИМАНИЕ");
                        System.out.println("ВНИМАНИЕ");
                        System.out.println("ВНИМАНИЕ");
                        System.out.println("ЧЕРНЫМ ОБЪЯВЛЕН ШАХ");
                    }


                    String Xod = "";
                    if (O4ereDb % 2 == 1) //* КТО ХОДИТ
                    {
                        System.out.println("Ходят белые: ");
                    } else {
                        System.out.println("Ходят черные: ");
                    }


                    while (!Xod.equals("1") && !Xod.equals("2") && !Xod.equals("3"))//* ИГРОВЫЕ ВАРИАНТЫ
                    {
                        if (O4ereDb <= 18) {
                            System.out.println("1 - Совершить ход, 2 - Сдаться ");
                            System.out.println("");
                            Xod = sc.next();
                        } else {
                            System.out.println("1 - Совершить ход, 2 - Сдаться, 3 - Объявить пат ");
                            System.out.println("");
                            Xod = sc.next();
                        }
                    }


                    if (Xod.equals("2") && O4ereDb % 2 == 1) //* ИГРОВЫЕ ВАРИАНТЫ исход
                    {
                        Pobeda = 1;
                        System.out.println("ПОБЕДА ЧЕРНЫХ! ");
                    } else if (Xod.equals("3") && O4ereDb >= 18) {
                        Pobeda = 1;
                        System.out.println("НИЧЬЯ! ");
                    } else if (Xod.equals("2") && O4ereDb % 2 == 0) {
                        Pobeda = 1;
                        System.out.println("ПОБЕДА БЕЛЫХ! ");
                    }


//*&&RP3!=1

                    else {
                        if (Xod.equals("3") && O4ereDb < 18) {
                            Pobeda = 0;
                            System.out.println("ТЫ САМЫЙ УМНЫЙ ТУТ???");
                        }
                        int PR2 = 0;
                        int RP3 = 0;
                        int hghg = 0;
                        int lll = 0;
                        while (PR2 != 1 || RP3 != 1 || (Shax4ernim != 0 && O4ereDb % 2 == 0) || (Shaxbelim != 0 && O4ereDb % 2 == 1)) {

                            if (lll > 2 && O4ereDb >= 18) {
                                String Bod = "";
                                System.out.println("Хочешь пат? напиши 3");
                                System.out.println("");
                                Bod = sc.next();
                                if (Bod.equals("3")) {
                                    Pobeda = 1;
                                    System.out.println("НИЧЬЯ! ");
                                    System.out.println("Ну сделай хоть ход напоследок");
                                }
                            }


                            if (Shaxbelim == 1 && hghg > 0) {
                                System.out.println("ВНИМАНИЕ");
                                System.out.println("ВНИМАНИЕ");
                                System.out.println("ВНИМАНИЕ");
                                System.out.println("БЕЛЫМ ОБЪЯВЛЕН ШАХ");
                                hghg++;
                            }

                            if (Shax4ernim == 1 && hghg > 0) {
                                System.out.println("ВНИМАНИЕ");
                                System.out.println("ВНИМАНИЕ");
                                System.out.println("ВНИМАНИЕ");
                                System.out.println("ЧЕРНЫМ ОБЪЯВЛЕН ШАХ");
                                hghg++;
                            }


                            //*arr[7][0]=0;
//*arr[2][4]=901;
                            //*System.out.println(arr[0][1]);
                            //*System.out.println(arr[0][1]);
                            //*System.out.println(arr[0][1]);
                            checkmat = 0;
                            checkpat = 0;
                            checkpat2 = 0;
                            checkpat3 = 0;
                            checkpat555 = 0;
                            ProvHaYxod = 0; Tizakril=0;

                            int qq = 0;
                            int z = 0;
                            int qqq = 0;
                            int RRTT=0;
                            while (z != 1) {
                                System.out.println("Букву выбери откуда ");
                                if (Shax4ernim == 1 || Shaxbelim == 1)
                                    System.out.println(" ");
                                String q = sc.next();
                                qqq = 0;
                                Shax4ernim = 0;
                                Shaxbelim = 0;
                                NShaxbelim = 0;
                                NShax4ernim = 0;

                                if (q.equals("A") || q.equals("a")) {
                                    qqq = 0;
                                    z = 1;
                                }
                                if (q.equals("B") || q.equals("b")) {
                                    qqq = 1;
                                    z = 1;
                                }
                                if (q.equals("C") || q.equals("c")) {
                                    qqq = 2;
                                    z = 1;
                                }
                                if (q.equals("D") || q.equals("d")) {
                                    qqq = 3;
                                    z = 1;
                                }
                                if (q.equals("E") || q.equals("e")) {
                                    qqq = 4;
                                    z = 1;
                                }
                                if (q.equals("F") || q.equals("f")) {
                                    qqq = 5;
                                    z = 1;
                                }
                                if (q.equals("G") || q.equals("g")) {
                                    qqq = 6;
                                    z = 1;
                                }
                                if (q.equals("H") || q.equals("h")) {
                                    qqq = 7;
                                    z = 1;
                                }
                            }
                            while (qq < 1 || qq > 8) {
                                System.out.println("Цифру выбери откуда ");
                                System.out.println(" ");
                                String Cifra1 = ("");
                                Cifra1= sc.next();
                                if(Cifra1.equals("1")){RRTT=1;}
                                if(Cifra1.equals("2")){RRTT=2;}
                                if(Cifra1.equals("3")){RRTT=3;}
                                if(Cifra1.equals("4")){RRTT=4;}
                                if(Cifra1.equals("5")){RRTT=5;}
                                if(Cifra1.equals("6")){RRTT=6;}
                                if(Cifra1.equals("7")){RRTT=7;}
                                if(Cifra1.equals("8")){RRTT=8;}
                                qq = 9 - RRTT;

                            }


                            int ww = 0;
                            int TTRR=0;
                            int zz = 0;
                            int www = 0;
                            while (zz != 1) {
                                System.out.println("Букву выбери куда ");
                                System.out.println(" ");
                                String w = sc.next();
                                www = 0;
                                if (w.equals("A") || w.equals("a")) {
                                    www = 0;
                                    zz = 1;
                                }
                                if (w.equals("B") || w.equals("b")) {
                                    www = 1;
                                    zz = 1;
                                }
                                if (w.equals("C") || w.equals("c")) {
                                    www = 2;
                                    zz = 1;
                                }
                                if (w.equals("D") || w.equals("d")) {
                                    www = 3;
                                    zz = 1;
                                }
                                if (w.equals("E") || w.equals("e")) {
                                    www = 4;
                                    zz = 1;
                                }
                                if (w.equals("F") || w.equals("f")) {
                                    www = 5;
                                    zz = 1;
                                }
                                if (w.equals("G") || w.equals("g")) {
                                    www = 6;
                                    zz = 1;
                                }
                                if (w.equals("H") || w.equals("h")) {
                                    www = 7;
                                    zz = 1;
                                }
                            }

                            while (ww < 1 || ww > 8) {
                                System.out.println("Цифру выбери куда ");
                                System.out.println(" ");
                                String Cifra2 = (""); Cifra2=sc.next();
                                if(Cifra2.equals("1")){TTRR=1;}
                                if(Cifra2.equals("2")){TTRR=2;}
                                if(Cifra2.equals("3")){TTRR=3;}
                                if(Cifra2.equals("4")){TTRR=4;}
                                if(Cifra2.equals("5")){TTRR=5;}
                                if(Cifra2.equals("6")){TTRR=6;}
                                if(Cifra2.equals("7")){TTRR=7;}
                                if(Cifra2.equals("8")){TTRR=8;}
                                ww = 9 - TTRR;
                            }


                            if ((O4ereDb % 2 == 1 && arr[qq - 1][qqq] < 800) || (O4ereDb % 2 == 0 && (arr[qq - 1][qqq] > 300)) || arr[qq - 1][qqq] == 0) //* Условия от
                            {
                                if (O4ereDb % 2 == 1) {
                                    System.out.println("БЕЛЫЕ СХОДИЛИ НЕПРАВИЛЬНО");
                                    System.out.println("БЕЛЫЕ ДОЛЖНЫ ПЕРЕХОДИТЬ");
                                    PR2 = 0;
                                    System.out.println(" ");
                                } else {
                                    System.out.println("ЧЕРНЫЕ СХОДИЛИ НЕПРАВИЛЬНО");
                                    System.out.println("ЧЕРНЫЕ ДОЛЖНЫ ПЕРЕХОДИТЬ");
                                    PR2 = 0;
                                }
                            } else {
                                PR2 = 1;

//* Черные пешки н
                                if ((arr[qq - 1][qqq] == 201) && (((ww - qq == 2 && c1 == 0) || (ww - qq == 1 && ((c1 == 1) || (c1 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 201))) {
                                    c1 = 1;
                                    RP3 = 1;
                                }
                                if (((arr[qq - 1][qqq] == 202)) && (((ww - qq == 2 && c2 == 0) || (ww - qq == 1 && ((c2 == 1) || (c2 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 202))) {
                                    c2 = 1;
                                    RP3 = 1;
                                }
                                if (((arr[qq - 1][qqq] == 203)) && (((ww - qq == 2 && c3 == 0) || (ww - qq == 1 && ((c3 == 1) || (c3 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 203))) {
                                    c3 = 1;
                                    RP3 = 1;
                                }
                                if (((arr[qq - 1][qqq] == 204)) && (((ww - qq == 2 && c4 == 0) || (ww - qq == 1 && ((c4 == 1) || (c4 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 204))) {
                                    c4 = 1;
                                    RP3 = 1;
                                }
                                if (((arr[qq - 1][qqq] == 205)) && (((ww - qq == 2 && c5 == 0) || (ww - qq == 1 && ((c5 == 1) || (c5 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 205))) {
                                    c5 = 1;
                                    RP3 = 1;
                                }
                                if (((arr[qq - 1][qqq] == 206)) && (((ww - qq == 2 && c6 == 0) || (ww - qq == 1 && ((c6 == 1) || (c6 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 206))) {
                                    c6 = 1;
                                    RP3 = 1;
                                }
                                if (((arr[qq - 1][qqq] == 207)) && (((ww - qq == 2 && c7 == 0) || (ww - qq == 1 && ((c7 == 1) || (c7 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 207))) {
                                    c7 = 1;
                                    RP3 = 1;
                                }
                                if (((arr[qq - 1][qqq] == 208)) && (((ww - qq == 2 && c8 == 0) || (ww - qq == 1 && ((c8 == 1) || (c8 == 0)))) && www == qqq && ((arr[qq][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((ww - qq == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] > 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 208))) {
                                    c8 = 1;
                                    RP3 = 1;
                                }
//* Черные пешки к


//* Белые пешки н
                                if (((arr[qq - 1][qqq] == 801)) && (((qq - ww == 2 && b1 == 0) || (qq - ww == 1 && ((b1 == 1) || (b1 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 801))) {
                                    b1 = 1;
                                    RP3 = 1;

                                }
                                if (((arr[qq - 1][qqq] == 802)) && (((qq - ww == 2 && b2 == 0) || (qq - ww == 1 && ((b2 == 1) || (b2 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 802))) {
                                    b2 = 1;
                                    RP3 = 1;

                                }
                                if (((arr[qq - 1][qqq] == 803)) && (((qq - ww == 2 && b3 == 0) || (qq - ww == 1 && ((b3 == 1) || (b3 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 803))) {
                                    b3 = 1;
                                    RP3 = 1;

                                }
                                if (((arr[qq - 1][qqq] == 804)) && (((qq - ww == 2 && b4 == 0) || (qq - ww == 1 && ((b4 == 1) || (b4 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 804))) {
                                    b4 = 1;
                                    RP3 = 1;

                                }
                                if (((arr[qq - 1][qqq] == 805)) && (((qq - ww == 2 && b5 == 0) || (qq - ww == 1 && ((b5 == 1) || (b5 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 805))) {
                                    b5 = 1;
                                    RP3 = 1;

                                }
                                if (((arr[qq - 1][qqq] == 806)) && (((qq - ww == 2 && b6 == 0) || (qq - ww == 1 && ((b6 == 1) || (b6 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 806))) {
                                    b6 = 1;
                                    RP3 = 1;

                                }
                                if (((arr[qq - 1][qqq] == 807)) && (((qq - ww == 2 && b7 == 0) || (qq - ww == 1 && ((b7 == 1) || (b7 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 807))) {
                                    b7 = 1;
                                    RP3 = 1;

                                }
                                if (((arr[qq - 1][qqq] == 808)) && (((qq - ww == 2 && b8 == 0) || (qq - ww == 1 && ((b8 == 1) || (b8 == 0)))) && www == qqq && ((arr[qq - 2][qqq] == 0) && (arr[ww - 1][qqq] == 0))) || ((qq - ww == 1) && (www - qqq == 1 || www - qqq == -1) && (arr[ww - 1][www] < 800 && arr[ww - 1][www] != 0) && (arr[qq - 1][qqq] == 808))) {
                                    b8 = 1;
                                    RP3 = 1;

                                }
//* Белые пешки к


//* Белая ладья н
                                if ((arr[qq - 1][qqq] == 901 || arr[qq - 1][qqq] == 908 || arr[qq - 1][qqq] == 988) && (www == qqq || ww == qq) && (arr[ww - 1][www] < 800)) {



                                    int pl1 = 0;
                                    if (www == qqq) {
                                        for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                            if (qq < ww && arr[qq - 1 + l1][qqq] == 0) {
                                                pl1 += 0;
                                            } else if (ww < qq && arr[qq - 1 - l1][qqq] == 0) {
                                                pl1 += 0;
                                            } else {
                                                pl1++;
                                            }

                                        }
                                    }
                                    int pl2 = 0;
                                    if (ww == qq) {

                                        for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                            if (qqq < www && arr[qq - 1][qqq + l2] == 0) {
                                                pl2 += 0;
                                            } else if (www < qqq && arr[qq - 1][qqq - l2] == 0) {
                                                pl2 += 0;
                                            } else {
                                                pl2++;
                                            }

                                        }
                                    }
                                    if (pl2 == 0 && pl1 == 0) {
                                        RP3 = 1;

                                        //* усл на рок
                                        if (arr[qq - 1][qqq] == 901) {
                                            RBL1 = 1;
                                        } else {
                                            RBL8 = 1;
                                        }

                                    } else {
                                        RP3 = 0;
                                    }
                                }
                                //* 6ela9 Ladb9 k

//* Черная ладья н
                                if ((arr[qq - 1][qqq] == 101 || arr[qq - 1][qqq] == 108 || arr[qq - 1][qqq] == 188) && (www == qqq || ww == qq) && (arr[ww - 1][www] > 800 || arr[ww - 1][www] == 0)) {

                                    int pl1 = 0;
                                    if (www == qqq) {
                                        for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                            if (qq < ww && arr[qq - 1 + l1][qqq] == 0) {
                                                pl1 += 0;
                                            } else if (ww < qq && arr[qq - 1 - l1][qqq] == 0) {
                                                pl1 += 0;
                                            } else {
                                                pl1++;
                                            }

                                        }
                                    }
                                    int pl2 = 0;
                                    if (ww == qq) {

                                        for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                            if (qqq < www && arr[qq - 1][qqq + l2] == 0) {
                                                pl2 += 0;
                                            } else if (www < qqq && arr[qq - 1][qqq - l2] == 0) {
                                                pl2 += 0;
                                            } else {
                                                pl2++;
                                            }

                                        }
                                    }
                                    if (pl2 == 0 && pl1 == 0) {
                                        RP3 = 1;

                                        //* усл на рок
                                        if (arr[qq - 1][qqq] == 101) {
                                            R4L1 = 1;
                                        } else {
                                            R4L8 = 1;
                                        }


                                    } else {
                                        RP3 = 0;
                                    }
                                }
//* Черная ладья к


//* Конь в пальто н
                                if ((arr[qq - 1][qqq] == 102 || arr[qq - 1][qqq] == 107 || arr[qq - 1][qqq] == 177) && (((qq - ww == 2 || ww - qq == 2) && (www - qqq == 1 || www - qqq == -1)) || ((qq - ww == 1 || ww - qq == 1) && (www - qqq == 2 || www - qqq == -2))) && (arr[ww - 1][www] > 800 || arr[ww - 1][www] == 0)) {
                                    RP3 = 1;

                                }
//* Конь в пальто к


//* Белые кони н
                                if ((arr[qq - 1][qqq] == 902 || arr[qq - 1][qqq] == 907 || arr[qq - 1][qqq] == 977) && (((qq - ww == 2 || ww - qq == 2) && (www - qqq == 1 || www - qqq == -1)) || ((qq - ww == 1 || ww - qq == 1) && (www - qqq == 2 || www - qqq == -2))) && (arr[ww - 1][www] < 800)) {
                                    RP3 = 1;

                                }
//* Белые кони к


//* Белый слон н
                                if ((arr[qq - 1][qqq] == 903 || arr[qq - 1][qqq] == 906 | arr[qq - 1][qqq] == 966) && (Math.abs(ww - qq) == Math.abs(www - qqq)) && (arr[ww - 1][www] < 800)) {

                                    int pl1 = 0;
                                    if (qq > ww && qqq > www) {


                                        for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                            if (arr[qq - 1 - l1][qqq - l1] == 0) {
                                                pl1 += 0;
                                            } else {
                                                pl1++;
                                            }

                                        }
                                    }
                                    int pl2 = 0;
                                    if (qq < ww && qqq > www) {

                                        for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                            if (arr[qq - 1 + l2][qqq - l2] == 0) {
                                                pl2 += 0;
                                            } else {
                                                pl2++;
                                            }

                                        }
                                    }

                                    int pl3 = 0;
                                    if (qq > ww && qqq < www) {

                                        for (int l3 = 1; l3 < Math.abs(qqq - www); l3++) {
                                            if (arr[qq - 1 - l3][qqq + l3] == 0) {
                                                pl3 += 0;
                                            } else {
                                                pl3++;
                                            }
                                            System.out.println(pl3);
                                        }
                                    }
                                    int pl4 = 0;
                                    if (qq < ww && qqq < www) {

                                        for (int l4 = 1; l4 < Math.abs(qqq - www); l4++) {
                                            if (arr[qq - 1 + l4][qqq + l4] == 0) {
                                                pl4 += 0;
                                            } else {
                                                pl4++;
                                            }
                                            System.out.println(pl4);
                                        }
                                    }


                                    if (pl2 == 0 && pl1 == 0 && pl3 == 0 && pl4 == 0) {
                                        RP3 = 1;

                                    } else {
                                        RP3 = 0;
                                    }
                                }
//* Белый слон к

//* Черный слон н
                                if ((arr[qq - 1][qqq] == 103 || arr[qq - 1][qqq] == 106 || arr[qq - 1][qqq] == 166) && (Math.abs(ww - qq) == Math.abs(www - qqq)) && (arr[ww - 1][www] > 800 || arr[ww - 1][www] == 0)) {

                                    int pl1 = 0;
                                    if (qq > ww && qqq > www) {


                                        for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                            if (arr[qq - 1 - l1][qqq - l1] == 0) {
                                                pl1 += 0;
                                            } else {
                                                pl1++;
                                            }

                                        }
                                    }
                                    int pl2 = 0;
                                    if (qq < ww && qqq > www) {

                                        for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                            if (arr[qq - 1 + l2][qqq - l2] == 0) {
                                                pl2 += 0;
                                            } else {
                                                pl2++;
                                            }
                                            System.out.println(pl2);
                                        }
                                    }

                                    int pl3 = 0;
                                    if (qq > ww && qqq < www) {

                                        for (int l3 = 1; l3 < Math.abs(qqq - www); l3++) {
                                            if (arr[qq - 1 - l3][qqq + l3] == 0) {
                                                pl3 += 0;
                                            } else {
                                                pl3++;
                                            }
                                            System.out.println(pl3);
                                        }
                                    }
                                    int pl4 = 0;
                                    if (qq < ww && qqq < www) {

                                        for (int l4 = 1; l4 < Math.abs(qqq - www); l4++) {
                                            if (arr[qq - 1 + l4][qqq + l4] == 0) {
                                                pl4 += 0;
                                            } else {
                                                pl4++;
                                            }
                                            System.out.println(pl4);
                                        }
                                    }


                                    if (pl2 == 0 && pl1 == 0 && pl3 == 0 && pl4 == 0) {
                                        RP3 = 1;
                                        //*осн усл

                                    } else {
                                        RP3 = 0;
                                    }
                                }
//* Черный слон к


//* Белый кинг н
                                if ((arr[qq - 1][qqq] == 905) && (Math.abs(qq - ww) == 1 || Math.abs(qqq - www) == 1) && (arr[ww - 1][www] < 800)) {
                                    RP3 = 1;
                                    if ((ww - 2 >= 0 && arr[ww - 2][www] == 105) || (ww <= 7 && arr[ww][www] == 105) || (ww - 2 >= 0 && www + 1 <= 7 && arr[ww - 2][www + 1] == 105) || (ww <= 7 && www + 1 <= 7 && arr[ww][www + 1] == 105) || (ww - 2 >= 0 && www - 1 >= 0 && arr[ww - 2][www - 1] == 105) || (ww <= 7 && www - 1 >= 0 && arr[ww][www - 1] == 105) || (www + 1 <= 7 && arr[ww - 1][www + 1] == 105) || (www - 1 >= 0 && arr[ww - 1][www - 1] == 105)) {
                                        RP3 = 0;
                                    }

                                    RBL1 = 1;
                                    RBL8 = 1;
                                }
//* Белый кинг к
//* Блек кинг н
                                if ((arr[qq - 1][qqq] == 105) && (Math.abs(qq - ww) == 1 || Math.abs(qqq - www) == 1) && (arr[ww - 1][www] > 800 || arr[ww - 1][www] == 0)) {
                                    RP3 = 1;
                                    if ((ww - 2 >= 0 && arr[ww - 2][www] == 905) || (ww <= 7 && arr[ww][www] == 905) || (ww - 2 >= 0 && www + 1 <= 7 && arr[ww - 2][www + 1] == 905) || (ww <= 7 && www + 1 <= 7 && arr[ww][www + 1] == 905) || (ww - 2 >= 0 && www - 1 >= 0 && arr[ww - 2][www - 1] == 905) || (ww <= 7 && www - 1 >= 0 && arr[ww][www - 1] == 905) || (www + 1 <= 7 && arr[ww - 1][www + 1] == 905) || (www - 1 >= 0 && arr[ww - 1][www - 1] == 905)) {
                                        RP3 = 0;
                                    }


                                    R4L1 = 1;
                                    R4L8 = 1;
                                }
//* Блек кинг к

//*ROKигровка б н dl
                                if (((arr[qq - 1][qqq] == 905) && (arr[ww - 1][www] == 901) || (arr[qq - 1][qqq] == 901) && (arr[ww - 1][www] == 905)) && (arr[7][1] == 0 && arr[7][2] == 0 && arr[7][3] == 0) && (RBL1 == 0) && Shaxbelim == 0) {
                                    arr[7][4] = 0;
                                    arr[7][0] = 0;
                                    arr[7][1] = 0;
                                    arr[7][3] = 901;
                                    arr[7][2] = 905;
                                    RP3 = 1;

                                    R4L1 = 1;
                                    R4L8 = 1;
                                }
//*ROKигровка б к dl

// *ROKигровка б н k
                                if (((arr[qq - 1][qqq] == 905) && (arr[ww - 1][www] == 908) || (arr[qq - 1][qqq] == 908) && (arr[ww - 1][www] == 905)) && (arr[7][5] == 0 && arr[7][6] == 0) && (RBL8 == 0) && Shaxbelim == 0) {
                                    arr[7][7] = 0;
                                    arr[7][4] = 0;
                                    arr[7][5] = 908;
                                    arr[7][6] = 905;

                                    RP3 = 1;

                                    R4L1 = 1;
                                    R4L8 = 1;
                                }
//*ROKигровка б к k


//*ROKигровка 4 н dl
                                if (((arr[qq - 1][qqq] == 105) && (arr[ww - 1][www] == 101) || (arr[qq - 1][qqq] == 101) && (arr[ww - 1][www] == 105)) && (arr[0][1] == 0 && arr[0][2] == 0 && arr[0][3] == 0) && R4L1 == 0 && Shax4ernim == 0) {
                                    arr[0][4] = 0;
                                    arr[0][0] = 0;
                                    arr[0][1] = 0;
                                    arr[0][3] = 101;
                                    arr[0][2] = 105;

                                    RP3 = 1;

                                    R4L1 = 1;
                                    R4L8 = 1;
                                }
//*ROKигровка 4 к dl


// *ROKигровка 4 н k
                                if (((arr[qq - 1][qqq] == 105) && (arr[ww - 1][www] == 108) || (arr[qq - 1][qqq] == 108) && (arr[ww - 1][www] == 105)) && (arr[0][5] == 0 && arr[0][6] == 0) && (R4L8 == 0) && Shax4ernim == 0) {
                                    arr[0][7] = 0;
                                    arr[0][4] = 0;
                                    arr[0][5] = 108;
                                    arr[0][6] = 105;

                                    RP3 = 1;

                                    R4L1 = 1;
                                    R4L8 = 1;
                                }
//*ROKигровка 4 к k


//* Белый ферзь н
                                if ((arr[qq - 1][qqq] == 904 || arr[qq - 1][qqq] == 944) && (arr[ww - 1][www] < 800) && ((www == qqq || ww == qq) || (Math.abs(ww - qq) == Math.abs(www - qqq)))) {
                                    {
                                        System.out.println("1оe условие прошло Ф");

                                        System.out.println(arr[qq - 1][www]);
                                        if (Math.abs(ww - qq) == Math.abs(www - qqq)) {
                                            System.out.println("2оe условие прошло Ф на сл");
                                            int pl1 = 0;
                                            if (qq > ww && qqq > www) {


                                                for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                                    if (arr[qq - 1 - l1][qqq - l1] == 0) {
                                                        pl1 += 0;
                                                    } else {
                                                        pl1++;
                                                    }
                                                    System.out.println(pl1);
                                                }
                                            }
                                            int pl2 = 0;
                                            if (qq < ww && qqq > www) {

                                                for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                                    if (arr[qq - 1 + l2][qqq - l2] == 0) {
                                                        pl2 += 0;
                                                    } else {
                                                        pl2++;
                                                    }
                                                    System.out.println(pl2);
                                                }
                                            }

                                            int pl3 = 0;
                                            if (qq > ww && qqq < www) {

                                                for (int l3 = 1; l3 < Math.abs(qqq - www); l3++) {
                                                    if (arr[qq - 1 - l3][qqq + l3] == 0) {
                                                        pl3 += 0;
                                                    } else {
                                                        pl3++;
                                                    }
                                                    System.out.println(pl3);
                                                }
                                            }
                                            int pl4 = 0;
                                            if (qq < ww && qqq < www) {

                                                for (int l4 = 1; l4 < Math.abs(qqq - www); l4++) {
                                                    if (arr[qq - 1 + l4][qqq + l4] == 0) {
                                                        pl4 += 0;
                                                    } else {
                                                        pl4++;
                                                    }
                                                    System.out.println(pl4);
                                                }
                                            }

                                            if (pl2 == 0 && pl1 == 0 && pl3 == 0 && pl4 == 0) {
                                                RP3 = 1;

                                            } else {
                                                RP3 = 0;
                                            }
                                        } else {
                                            System.out.println("2оe условие прошло Ф на лад");
                                            int pl1 = 0;
                                            if (www == qqq) {

                                                for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                                    if (qq < ww && arr[qq - 1 + l1][qqq] == 0) {
                                                        pl1 += 0;
                                                    } else if (ww < qq && arr[qq - 1 - l1][qqq] == 0) {
                                                        pl1 += 0;
                                                    } else {
                                                        pl1++;
                                                    }

                                                }
                                            }
                                            int pl2 = 0;
                                            if (ww == qq) {

                                                for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                                    if (qqq < www && arr[qq - 1][qqq + l2] == 0) {
                                                        pl2 += 0;
                                                    } else if (www < qqq && arr[qq - 1][qqq - l2] == 0) {
                                                        pl2 += 0;
                                                    } else {
                                                        pl2++;
                                                    }

                                                }
                                            }
                                            if (pl2 == 0 && pl1 == 0) {
                                                RP3 = 1;

                                            } else {
                                                RP3 = 0;
                                            }
                                        }
                                    }
                                }
//* Белый ферзь к
//* Черный ферзь н
                                if ((arr[qq - 1][qqq] == 104 || arr[qq - 1][qqq] == 144) && (arr[ww - 1][www] > 800 || arr[ww - 1][www] == 0) && ((www == qqq || ww == qq) || (Math.abs(ww - qq) == Math.abs(www - qqq)))) {
                                    {
                                        System.out.println("1оe условие прошло ");

                                        System.out.println(arr[qq - 1][www]);
                                        if (Math.abs(ww - qq) == Math.abs(www - qqq)) {
                                            int pl1 = 0;
                                            if (qq > ww && qqq > www) {


                                                for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                                    if (arr[qq - 1 - l1][qqq - l1] == 0) {
                                                        pl1 += 0;
                                                    } else {
                                                        pl1++;
                                                    }
                                                    System.out.println(pl1);
                                                }
                                            }
                                            int pl2 = 0;
                                            if (qq < ww && qqq > www) {

                                                for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                                    if (arr[qq - 1 + l2][qqq - l2] == 0) {
                                                        pl2 += 0;
                                                    } else {
                                                        pl2++;
                                                    }
                                                    System.out.println(pl2);
                                                }
                                            }

                                            int pl3 = 0;
                                            if (qq > ww && qqq < www) {

                                                for (int l3 = 1; l3 < Math.abs(qqq - www); l3++) {
                                                    if (arr[qq - 1 - l3][qqq + l3] == 0) {
                                                        pl3 += 0;
                                                    } else {
                                                        pl3++;
                                                    }
                                                    System.out.println(pl3);
                                                }
                                            }
                                            int pl4 = 0;
                                            if (qq < ww && qqq < www) {

                                                for (int l4 = 1; l4 < Math.abs(qqq - www); l4++) {
                                                    if (arr[qq - 1 + l4][qqq + l4] == 0) {
                                                        pl4 += 0;
                                                    } else {
                                                        pl4++;
                                                    }
                                                    System.out.println(pl4);
                                                }
                                            }
                                            if (pl2 == 0 && pl1 == 0 && pl3 == 0 && pl4 == 0) {
                                                RP3 = 1;

                                            } else {
                                                RP3 = 0;
                                            }
                                        } else {
                                            int pl1 = 0;
                                            if (www == qqq) {

                                                for (int l1 = 1; l1 < Math.abs(qq - ww); l1++) {
                                                    if (qq < ww && arr[qq - 1 + l1][qqq] == 0) {
                                                        pl1 += 0;
                                                    } else if (ww < qq && arr[qq - 1 - l1][qqq] == 0) {
                                                        pl1 += 0;
                                                    } else {
                                                        pl1++;
                                                    }
                                                    System.out.println(pl1);
                                                }
                                            }
                                            int pl2 = 0;
                                            if (ww == qq) {

                                                for (int l2 = 1; l2 < Math.abs(qqq - www); l2++) {
                                                    if (qqq < www && arr[qq - 1][qqq + l2] == 0) {
                                                        pl2 += 0;
                                                    } else if (www < qqq && arr[qq - 1][qqq - l2] == 0) {
                                                        pl2 += 0;
                                                    } else {
                                                        pl2++;
                                                    }
                                                    System.out.println(pl2);
                                                }
                                            }
                                            if (pl2 == 0 && pl1 == 0) {
                                                RP3 = 1;



                                            } else {
                                                RP3 = 0;
                                            }
                                        }
                                    }
                                }
//* Черный ферзь к
//*&&(arr[qq-1][qqq]>=801&&arr[qq-1][qqq]<=808)

//*Перевоплащение пешки н

                                if (RP3 == 1 && (arr[qq - 1][qqq] >= 801 && arr[qq - 1][qqq] <= 808) && (ww - 1) == 0 && (www >= 0 && www <= 7)) {
                                    System.out.println("Пешка превращается в: 1 - Ферзь, 2 - Слон, 3 - Конь, 4 - Ладья");
                                    int MMMMM = 0;
                                    String Pr = sc.next();

                                    do {
                                        {
                                            if (MMMMM > 0) {
                                                System.out.println("Пешка превращается в: 1 - Ферзь, 2 - Слон, 3 - Конь, 4 - Ладья");
                                            }
                                            if (Pr.equals("1")) {
                                                arr[qq - 1][qqq] = 944;
                                            }
                                            if (Pr.equals("2")) {
                                                arr[qq - 1][qqq] = 966;
                                            }
                                            if (Pr.equals("3")) {
                                                arr[qq - 1][qqq] = 977;
                                            }
                                            if (Pr.equals("4")) {
                                                arr[qq - 1][qqq] = 988;
                                                System.out.println("DDDSdsdsdsd");
                                            }
                                        }
                                    }
                                    while (!Pr.equals("1") && !Pr.equals("2") && !Pr.equals("3") && !Pr.equals("4"));
                                }

                                if (RP3 == 1 && (arr[qq - 1][qqq] >= 201 && arr[qq - 1][qqq] <= 208) && (ww - 1) == 7 && (www >= 0 && www <= 7)) {
                                    System.out.println("Пешка превращается в: 1 - Ферзь, 2 - Слон, 3 - Конь, 4 - Ладья");
                                    int MMMMM = 0;
                                    String Pr = sc.next();

                                    do {
                                        if (MMMMM > 0) {
                                            System.out.println("Пешка превращается в: 1 - Ферзь, 2 - Слон, 3 - Конь, 4 - Ладья");
                                        }
                                        MMMMM++;
                                        if (Pr.equals("1")) {
                                            arr[qq - 1][qqq] = 144;
                                        }
                                        if (Pr.equals("2")) {
                                            arr[qq - 1][qqq] = 166;
                                        }
                                        if (Pr.equals("3")) {
                                            arr[qq - 1][qqq] = 177;
                                        }
                                        if (Pr.equals("4")) {
                                            arr[qq - 1][qqq] = 188;

                                        }
                                    }
                                    while (!Pr.equals("1") && !Pr.equals("2") && !Pr.equals("3") && !Pr.equals("4"));
                                }


//*Перевоплащение пешки к


                                for (int Sr = 0; Sr < 8; Sr++) {
                                    for (int Sr2 = 0; Sr2 < 8; Sr2++) {

                                        arr2[Sr][Sr2] = arr[Sr][Sr2];
                                        arr3[Sr][Sr2] = arr[Sr][Sr2];


                                    }

                                }


                                if (RP3 == 1) {
                                    int l = 0;

//*Делаем ход (удалить)
                                    for (int ii = 0; ii < 8; ii++) {
                                        for (int jj = 0; jj < 8; jj++) {

                                            if (qqq == jj && qq - 1 == ii) {
                                                //*System.out.println("ЫЫЫЫЫЫЫЫЫЫЫЫ ");
                                                l = arr2[ii][jj];
                                                arr2[ii][jj] = 0;
                                            }


                                        }

                                    }

                                    //* Делаем ход вставить
                                    for (int iii = 0; iii < 8; iii++) {
                                        for (int jjj = 0; jjj < 8; jjj++) {
                                            if (www == jjj && ww - 1 == iii) {
                                                arr2[iii][jjj] = l;
                                            }


                                        }

                                    }


                                    for (int Sr3 = 0; Sr3 < 8; Sr3++) {
                                        for (int Sr4 = 0; Sr4 < 8; Sr4++) {
                                            arr[Sr3][Sr4] = arr2[Sr3][Sr4];
                                        }
                                    }


                                    //*if (O4ereDb % 2 == 1 && Shaxbelim == 1) {
                                    //*  if (arr[Sh1][Sh2] > 500) {
                                    //*     System.out.println("ТунТунТун");
                                    //*      System.out.println(" ");
                                    //*  Shaxbelim = 0;
                                    //* }
                                    //*  }
                                    //* if (O4ereDb % 2 == 0 && Shax4ernim == 1)
                                    //* {
                                    //*    if (arr[Sh1][Sh2] < 500) {
                                    //*     System.out.println("ТунТунТунYenfg");
                                    //*     System.out.println(" ");
                                    //*     Shax4ernim = 0;
                                    //*  }
                                    //* }


                                } else {
                                    if (O4ereDb % 2 == 1) {
                                        System.out.println("БЕЛЫЕ СХОДИЛИ НЕПРАВИЛЬНО");
                                        System.out.println("БЕЛЫЕ ДОЛЖНЫ ПЕРЕХОДИТЬ");
                                        System.out.println(" ");
                                    } else {
                                        System.out.println("ЧЕРНЫЕ СХОДИЛИ НЕПРАВИЛЬНО");
                                        System.out.println("ЧЕРНЫЕ ДОЛЖНЫ ПЕРЕХОДИТЬ");
                                    }
                                }
                            }
                            //*if(Shaxbelim!=0||Shax4ernim!=0)
                            //*{System.out.println("ШАХ НЕ РЕШЕН");System.out.println("ШАХ НАДО РЕШИТЬ!");}

                            for (int Wax = 0; Wax < 8; Wax++) {
                                for (int Xaw = 0; Xaw < 8; Xaw++) {
                                    waxoviekletki[Wax][Xaw]=0;
                                }
                            }
                            for (int Wax = 0; Wax < 8; Wax++) {
                                for (int Xaw = 0; Xaw < 8; Xaw++) {
                                    waxoviekletki4ernix[Wax][Xaw]=0;
                                }
                            }
                            for (int Wax = 0; Wax < 8; Wax++) {
                                for (int Xaw = 0; Xaw < 8; Xaw++) {
                                    matoviekietki[Wax][Xaw]=0;
                                }
                            }







//*шах начало
                            for (int Wax = 0; Wax < 8; Wax++) {
                                for (int Xaw = 0; Xaw < 8; Xaw++) {
//*пешки шах н
                                    if (arr[Wax][Xaw] >= 801 && arr[Wax][Xaw] <= 808) {
                                        if (Wax != 0 && Xaw - 1 >= 0 && (arr[Wax - 1][Xaw - 1] < 505&&arr[Wax - 1][Xaw - 1] != 0)) {
                                            waxoviekletki[Wax - 1][Xaw - 1]=1;
                                        }
                                        if (Wax != 0 && Xaw + 1 <= 7 && (arr[Wax - 1][Xaw + 1] < 505&&arr[Wax - 1][Xaw + 1]  !=0)) {
                                            waxoviekletki[Wax - 1][Xaw + 1]=1;
                                        }


                                        if (Wax != 0 && Xaw - 1 >= 0 && arr[Wax - 1][Xaw - 1] == 105) {
                                            Shax4ernim = 1;
                                            //* System.out.println("Траляля");
                                            Sh1 = Wax;
                                            Sh2 = Xaw;
                                        }
                                        if (Wax != 0 && Xaw + 1 <= 7 && arr[Wax - 1][Xaw + 1] == 105) {
                                            Shax4ernim = 1;
                                            //*System.out.println("Траляля");
                                            Sh1 = Wax;
                                            Sh2 = Xaw;
                                        }
                                    }

                                    if (arr[Wax][Xaw] >= 201 && arr[Wax][Xaw] <= 208) {

                                        if (Wax != 7 && Xaw - 1 >= 0 && (arr[Wax + 1][Xaw - 1] > 505)) {
                                            waxoviekletki4ernix[Wax + 1][Xaw - 1]=1;
                                        }
                                        if (Wax != 7 && Xaw + 1 <= 7 && (arr[Wax + 1][Xaw + 1]  > 505)) {
                                            waxoviekletki4ernix[Wax + 1][Xaw + 1]=1;
                                        }




                                        if (Wax != 7 && Xaw - 1 >= 0 && arr[Wax + 1][Xaw - 1] == 905) {
                                            Shaxbelim = 1;
                                            //*System.out.println("Траляля");
                                            Sh1 = Wax;
                                            Sh2 = Xaw;
                                        }
                                        if (Wax != 7 && Xaw + 1 <= 7 && arr[Wax + 1][Xaw + 1] == 905) {
                                            Shaxbelim = 1;
                                            //* System.out.println("Траляля");
                                            Sh1 = Wax;
                                            Sh2 = Xaw;
                                        }
                                    }
//* пешки шах к
//* кони шах н
                                    if (arr[Wax][Xaw] == 902 || arr[Wax][Xaw] == 907 || arr[Wax][Xaw] == 977) {
                                        if (Wax - 2 >= 0) {
                                            int kh = 0;
                                            if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax - 2][Xaw - 1] <505&&arr[Wax - 2][Xaw - 1] !=0)) {
                                                waxoviekletki[Wax - 2][Xaw - 1]=1;

                                            }
                                            if (Xaw - 1 >= 0 && kh == 0 && arr[Wax - 2][Xaw - 1] == 105) {
                                                kh++;
                                                Shax4ernim = 1;
                                                //* System.out.println("Траляля");
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && arr[Wax - 2][Xaw + 1] == 105) {
                                                Shax4ernim = 1;
                                                //*System.out.println("Траляля");
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax - 2][Xaw + 1] < 505&&arr[Wax - 2][Xaw + 1] != 0)) {
                                                waxoviekletki[Wax - 2][Xaw + 1]=1;
                                            }
                                        }
                                        if (Wax + 2 <= 7) {
                                            int kh = 0;
                                            if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax + 2][Xaw - 1] < 505&&arr[Wax + 2][Xaw - 1] != 0)) {
                                                waxoviekletki[Wax + 2][Xaw - 1]=1;
                                            }
                                            if (Xaw - 1 >= 0 && kh == 0 && arr[Wax + 2][Xaw - 1] == 105) {
                                                kh++;
                                                Shax4ernim = 1;
                                                System.out.println("Траляля");
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && arr[Wax + 2][Xaw + 1] == 105) {
                                                Shax4ernim = 1;
                                                System.out.println("Траляля");
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax + 2][Xaw + 1] < 505&&arr[Wax + 2][Xaw + 1] != 0)) {
                                                waxoviekletki[Wax + 2][Xaw + 1]=1;
                                            }
                                        }
                                        if (Wax - 1 >= 0) {
                                            int kh = 0;
                                            if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax - 1][Xaw - 2] < 505&&arr[Wax - 1][Xaw -2] != 0)) {
                                                waxoviekletki[Wax - 1][Xaw -2]=1;
                                            }
                                            if (Xaw - 2 >= 0 && kh == 0 && arr[Wax - 1][Xaw - 2] == 105) {
                                                kh++;
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && arr[Wax - 1][Xaw + 2] == 105) {
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax - 1][Xaw + 2] < 505&&arr[Wax - 1][Xaw + 2] != 0)) {
                                                waxoviekletki[Wax - 1][Xaw +2]=1;
                                            }
                                        }
                                        if (Wax + 1 <= 7) {
                                            int kh = 0;
                                            if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax + 1][Xaw - 2] < 505&&arr[Wax +1][Xaw -2] != 0)) {
                                                waxoviekletki[Wax + 1][Xaw -2]=1;
                                            }
                                            if (Xaw - 2 >= 0 && kh == 0 && arr[Wax + 1][Xaw - 2] == 105) {
                                                kh++;
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax + 1][Xaw + 2] == 105)) {
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax + 1][Xaw + 2] < 505&&arr[Wax +1][Xaw + 2] != 0)) {
                                                waxoviekletki[Wax + 1][Xaw +2]=1;
                                            }
                                        }
                                    }

                                    if (arr[Wax][Xaw] == 102 || arr[Wax][Xaw] == 107 || arr[Wax][Xaw] == 177) {
                                        if (Wax - 2 >= 0) {
                                            int kh = 0;
                                            if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax - 2][Xaw - 1] > 505)) {
                                                waxoviekletki4ernix[Wax -2][Xaw -1]=1;
                                            }
                                            if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax - 2][Xaw - 1] == 905)) {
                                                kh++;
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax - 2][Xaw + 1] == 905)) {
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax - 2][Xaw + 1] > 505)) {
                                                waxoviekletki4ernix[Wax -2][Xaw +1]=1;
                                            }
                                        }
                                        if (Wax + 2 <= 7) {
                                            int kh = 0;
                                            if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax + 2][Xaw - 1] > 505)) {
                                                waxoviekletki4ernix[Wax +2][Xaw -1]=1;
                                            }
                                            if (Xaw - 1 >= 0 && kh == 0 && (arr[Wax + 2][Xaw - 1] == 905)) {
                                                kh++;
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax + 2][Xaw + 1] == 905)) {
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 1 <= 7 && kh == 0 && (arr[Wax + 2][Xaw + 1] > 505)) {
                                                waxoviekletki4ernix[Wax +2][Xaw +1]=1;
                                            }
                                        }

                                        if (Wax - 1 >= 0) {
                                            int kh = 0;
                                            if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax - 1][Xaw - 2] > 505)) {
                                                waxoviekletki4ernix[Wax -1][Xaw -2]=1;
                                            }
                                            if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax - 1][Xaw - 2] == 905)) {
                                                kh++;
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax - 1][Xaw + 2] == 905)) {
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax - 1][Xaw + 2] > 505)) {
                                                waxoviekletki4ernix[Wax -1][Xaw +2]=1;
                                            }
                                        }
                                        if (Wax + 1 <= 7) {
                                            int kh = 0;
                                            if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax + 1][Xaw - 2] > 505)) {
                                                waxoviekletki4ernix[Wax +1][Xaw -2]=1;
                                            }
                                            if (Xaw - 2 >= 0 && kh == 0 && (arr[Wax + 1][Xaw - 2] == 905)) {
                                                kh++;
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax + 1][Xaw + 2] == 905)) {
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            }
                                            if (Xaw + 2 <= 7 && kh == 0 && (arr[Wax + 1][Xaw + 2] > 505)) {
                                                waxoviekletki4ernix[Wax +1][Xaw +2]=1;
                                            }
                                        }
                                    }
//* кони шах к
//*ладьи шах н
                                    if (arr[Wax][Xaw] == 101 || arr[Wax][Xaw] == 108 || arr[Wax][Xaw] == 188) {
                                        int ProverkaWaxaLadbi1 = 0;
                                        int ProverkaWaxaLadbi2 = 0;
                                        int ProverkaWaxaLadbi3 = 0;
                                        int ProverkaWaxaLadbi4 = 0;
                                        for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                            if (arr[Wax + Vert][Xaw] == 0) {waxoviekletki4ernix[Wax +Vert][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax +Vert][Xaw]=1;}
                                            } else if (arr[Wax + Vert][Xaw] == 905) {waxoviekletki4ernix[Wax +Vert][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax +Vert][Xaw]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax + Vert][Xaw] < 505){waxoviekletki4ernix[Wax +Vert][Xaw]=1;}
                                                ProverkaWaxaLadbi1++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}


                                        for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {
                                            if (arr[Wax - Vert2][Xaw] == 0) {waxoviekletki4ernix[Wax -Vert2][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax -Vert2][Xaw]=1;}
                                            } else if (arr[Wax - Vert2][Xaw] == 905) {waxoviekletki4ernix[Wax -Vert2][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax -Vert2][Xaw]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax - Vert2][Xaw] < 505){waxoviekletki4ernix[Wax -Vert2][Xaw]=1;}
                                                ProverkaWaxaLadbi2++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                            if (arr[Wax][Xaw + Vert3] == 0) {waxoviekletki4ernix[Wax ][Xaw+Vert3]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw+Vert3]=1;}
                                            } else if (arr[Wax][Xaw + Vert3] == 905) {waxoviekletki4ernix[Wax ][Xaw+Vert3]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw+Vert3]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax ][Xaw+Vert3] < 505){waxoviekletki4ernix[Wax ][Xaw+Vert3]=1;}
                                                ProverkaWaxaLadbi3++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                            if (arr[Wax][Xaw - Vert4] == 0) {waxoviekletki4ernix[Wax ][Xaw-Vert4]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw-Vert4]=1;}
                                            } else if (arr[Wax][Xaw - Vert4] == 905) {waxoviekletki4ernix[Wax ][Xaw-Vert4]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw-Vert4]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax ][Xaw-Vert4] < 505){waxoviekletki4ernix[Wax ][Xaw-Vert4]=1;}
                                                ProverkaWaxaLadbi4++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                    }

                                    if (arr[Wax][Xaw] == 901 || arr[Wax][Xaw] == 908 || arr[Wax][Xaw] == 988) {
                                        int ProverkaWaxaLadbi1 = 0;
                                        int ProverkaWaxaLadbi2 = 0;
                                        int ProverkaWaxaLadbi3 = 0;
                                        int ProverkaWaxaLadbi4 = 0;
                                        for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7; Vert++) {
                                            if (arr[Wax + Vert][Xaw] == 0) {waxoviekletki[Wax+Vert ][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax +Vert][Xaw]=1;}
                                            } else if (arr[Wax + Vert][Xaw] == 105) {waxoviekletki[Wax+Vert ][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax +Vert][Xaw]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert ][Xaw] > 505){waxoviekletki4ernix[Wax+Vert ][Xaw]=1;}
                                                ProverkaWaxaLadbi1++;
                                            }
                                        }
                                        if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0; Vert2++) {

                                            if (arr[Wax - Vert2][Xaw] == 0) {waxoviekletki[Wax-Vert2 ][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax -Vert2][Xaw]=1;}
                                            } else if (arr[Wax - Vert2][Xaw] == 105) {waxoviekletki[Wax-Vert2 ][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax -Vert2][Xaw]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert2 ][Xaw] > 505){waxoviekletki4ernix[Wax-Vert2 ][Xaw]=1;}
                                                ProverkaWaxaLadbi2++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7; Vert3++) {
                                            if (arr[Wax][Xaw + Vert3] == 0) {waxoviekletki[Wax][Xaw+Vert3]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw+Vert3]=1;}
                                            } else if (arr[Wax][Xaw + Vert3] == 105) {waxoviekletki[Wax][Xaw+Vert3]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw+Vert3]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax][Xaw+Vert3] > 505){waxoviekletki4ernix[Wax ][Xaw+Vert3]=1;}
                                                ProverkaWaxaLadbi3++;
                                            }
                                        }
                                        if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0; Vert4++) {
                                            if (arr[Wax][Xaw - Vert4] == 0) {waxoviekletki[Wax][Xaw-Vert4]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw-Vert4]=1;}
                                            } else if (arr[Wax][Xaw - Vert4] == 105) {waxoviekletki[Wax][Xaw-Vert4]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw-Vert4]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax ][Xaw-Vert4] > 505){waxoviekletki4ernix[Wax ][Xaw-Vert4]=1;}
                                                ProverkaWaxaLadbi4++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                    }
//* ладьи шах к
//* слоны шах н

                                    if (arr[Wax][Xaw] == 903 || arr[Wax][Xaw] == 906 || arr[Wax][Xaw] == 966) {
                                        int ProverkaWaxaLadbi1 = 0;
                                        int ProverkaWaxaLadbi2 = 0;
                                        int ProverkaWaxaLadbi3 = 0;
                                        int ProverkaWaxaLadbi4 = 0;
                                        for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                            if (arr[Wax + Vert][Xaw + Vert] == 0) {waxoviekletki[Wax+Vert][Xaw+Vert]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                            } else if (arr[Wax + Vert][Xaw + Vert] == 105) {waxoviekletki[Wax+Vert][Xaw+Vert]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert ][Xaw+Vert] > 505){waxoviekletki4ernix[Wax+Vert ][Xaw+Vert]=1;}
                                                ProverkaWaxaLadbi1++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                            if (arr[Wax - Vert2][Xaw - Vert2] == 0) {waxoviekletki[Wax-Vert2][Xaw-Vert2]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                            } else if (arr[Wax - Vert2][Xaw - Vert2] == 105) {waxoviekletki[Wax-Vert2][Xaw-Vert2]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert2 ][Xaw-Vert2] > 505){waxoviekletki4ernix[Wax-Vert2 ][Xaw-Vert2]=1;}
                                                ProverkaWaxaLadbi2++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                            if (arr[Wax - Vert3][Xaw + Vert3] == 0) {waxoviekletki[Wax-Vert3][Xaw+Vert3]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                            } else if (arr[Wax - Vert3][Xaw + Vert3] == 105) {waxoviekletki[Wax-Vert3][Xaw+Vert3]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert3 ][Xaw+Vert3] > 505){waxoviekletki4ernix[Wax-Vert3 ][Xaw+Vert3]=1;}
                                                ProverkaWaxaLadbi3++;
                                            }
                                        }
                                        if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                            if (arr[Wax + Vert4][Xaw - Vert4] == 0) {waxoviekletki[Wax+Vert4][Xaw-Vert4]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                            } else if (arr[Wax + Vert4][Xaw - Vert4] == 105) {waxoviekletki[Wax+Vert4][Xaw-Vert4]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert4 ][Xaw-Vert4] > 505){waxoviekletki4ernix[Wax+Vert4 ][Xaw-Vert4]=1;}
                                                ProverkaWaxaLadbi4++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                    }
                                    if (arr[Wax][Xaw] == 103 || arr[Wax][Xaw] == 106 || arr[Wax][Xaw] == 166) {
                                        int ProverkaWaxaLadbi1 = 0;
                                        int ProverkaWaxaLadbi2 = 0;
                                        int ProverkaWaxaLadbi3 = 0;
                                        int ProverkaWaxaLadbi4 = 0;
                                        for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                            if (arr[Wax + Vert][Xaw + Vert] == 0) {waxoviekletki4ernix[Wax+Vert][Xaw+Vert]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                            } else if (arr[Wax + Vert][Xaw + Vert] == 905) {waxoviekletki4ernix[Wax+Vert][Xaw+Vert]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert ][Xaw+Vert] < 505){waxoviekletki4ernix[Wax+Vert][Xaw+Vert]=1;}
                                                ProverkaWaxaLadbi1++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                            if (arr[Wax - Vert2][Xaw - Vert2] == 0) {waxoviekletki4ernix[Wax-Vert2][Xaw-Vert2]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                            } else if (arr[Wax - Vert2][Xaw - Vert2] == 905) {waxoviekletki4ernix[Wax-Vert2][Xaw-Vert2]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert2 ][Xaw-Vert2] < 505){waxoviekletki4ernix[Wax -Vert2][Xaw-Vert2]=1;}
                                                ProverkaWaxaLadbi2++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                            if (arr[Wax - Vert3][Xaw + Vert3] == 0) {waxoviekletki4ernix[Wax-Vert3][Xaw+Vert3]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                            } else if (arr[Wax - Vert3][Xaw + Vert3] == 905) {waxoviekletki4ernix[Wax-Vert3][Xaw+Vert3]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert3 ][Xaw+Vert3] < 505){waxoviekletki4ernix[Wax-Vert3][Xaw+Vert3]=1;}
                                                ProverkaWaxaLadbi3++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                            if (arr[Wax + Vert4][Xaw - Vert4] == 0) {waxoviekletki4ernix[Wax+Vert4][Xaw-Vert4]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                            } else if (arr[Wax + Vert4][Xaw - Vert4] == 905) {waxoviekletki4ernix[Wax+Vert4][Xaw-Vert4]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert4 ][Xaw-Vert4] < 505){waxoviekletki4ernix[Wax+Vert4 ][Xaw-Vert4]=1;}
                                                ProverkaWaxaLadbi4++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                    }
//* слоны шах к
//* квины шах н
                                    if (arr[Wax][Xaw] == 904 || arr[Wax][Xaw] == 944) {
                                        int ProverkaWaxaLadbi1 = 0;
                                        int ProverkaWaxaLadbi2 = 0;
                                        int ProverkaWaxaLadbi3 = 0;
                                        int ProverkaWaxaLadbi4 = 0;
                                        int ProverkaWaxaLadbi5 = 0;
                                        int ProverkaWaxaLadbi6 = 0;
                                        int ProverkaWaxaLadbi7 = 0;
                                        int ProverkaWaxaLadbi8 = 0;
                                        for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                            if (arr[Wax + Vert][Xaw + Vert] == 0) {waxoviekletki[Wax +Vert][Xaw+Vert]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                            } else if (arr[Wax + Vert][Xaw + Vert] == 105) {waxoviekletki[Wax +Vert][Xaw+Vert]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert][Xaw+Vert] > 505){waxoviekletki4ernix[Wax+Vert][Xaw+Vert]=1;}
                                                ProverkaWaxaLadbi1++;
                                            }
                                        }
                                        if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                            if (arr[Wax - Vert2][Xaw - Vert2] == 0) {waxoviekletki[Wax -Vert2][Xaw-Vert2]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                            } else if (arr[Wax - Vert2][Xaw - Vert2] == 105) {waxoviekletki[Wax -Vert2][Xaw-Vert2]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert2 ][Xaw-Vert2] > 505){waxoviekletki4ernix[Wax-Vert2][Xaw-Vert2]=1;}
                                                ProverkaWaxaLadbi2++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                            if (arr[Wax - Vert3][Xaw + Vert3] == 0) {waxoviekletki[Wax -Vert3][Xaw+Vert3]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                            } else if (arr[Wax - Vert3][Xaw + Vert3] == 105) {waxoviekletki[Wax -Vert3][Xaw+Vert3]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert3][Xaw+Vert3] > 505){waxoviekletki4ernix[Wax-Vert3][Xaw+Vert3]=1;}
                                                ProverkaWaxaLadbi3++;
                                            }
                                        }
                                        if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                            if (arr[Wax + Vert4][Xaw - Vert4] == 0) {waxoviekletki[Wax +Vert4][Xaw-Vert4]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                            } else if (arr[Wax + Vert4][Xaw - Vert4] == 105) {waxoviekletki[Wax +Vert4][Xaw-Vert4]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert4 ][Xaw-Vert4] > 505){waxoviekletki4ernix[Wax+Vert4 ][Xaw-Vert4]=1;}
                                                ProverkaWaxaLadbi4++;
                                            }
                                        }
                                        if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                            if (arr[Wax + Vert5][Xaw] == 0) {waxoviekletki[Wax +Vert5][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert5][Xaw]=1;}
                                            } else if (arr[Wax + Vert5][Xaw] == 105) {waxoviekletki[Wax +Vert5][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax+Vert5][Xaw]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert5][Xaw] > 505){waxoviekletki4ernix[Wax+Vert5][Xaw]=1;}
                                                ProverkaWaxaLadbi5++;
                                            }
                                        }
                                        if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                            if (arr[Wax - Vert6][Xaw] == 0) {waxoviekletki[Wax -Vert6][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert6][Xaw]=1;}
                                            } else if (arr[Wax - Vert6][Xaw] == 105) {waxoviekletki[Wax -Vert6][Xaw]=1;if(Shax4ernim==0){matoviekietki[Wax-Vert6][Xaw]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert6][Xaw] > 505){waxoviekletki4ernix[Wax-Vert6][Xaw]=1;}
                                                ProverkaWaxaLadbi6++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                            if (arr[Wax][Xaw + Vert7] == 0) {waxoviekletki[Wax ][Xaw+Vert7]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw+Vert7]=1;}
                                            } else if (arr[Wax][Xaw + Vert7] == 105) {waxoviekletki[Wax ][Xaw+Vert7]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw+Vert7]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax][Xaw+Vert7] > 505){waxoviekletki4ernix[Wax][Xaw+Vert7]=1;}
                                                ProverkaWaxaLadbi7++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                            if (arr[Wax][Xaw - Vert8] == 0) {waxoviekletki[Wax ][Xaw-Vert8]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw-Vert8]=1;}
                                            } else if (arr[Wax][Xaw - Vert8] == 105) {waxoviekletki[Wax ][Xaw-Vert8]=1;if(Shax4ernim==0){matoviekietki[Wax][Xaw-Vert8]=1;}
                                                Shax4ernim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax][Xaw-Vert8] > 505){waxoviekletki4ernix[Wax][Xaw-Vert8]=1;}
                                                ProverkaWaxaLadbi8++;
                                            }
                                        }if(Shax4ernim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                    }


                                    if (arr[Wax][Xaw] == 104 || arr[Wax][Xaw] == 144) {
                                        int ProverkaWaxaLadbi1 = 0;
                                        int ProverkaWaxaLadbi2 = 0;
                                        int ProverkaWaxaLadbi3 = 0;
                                        int ProverkaWaxaLadbi4 = 0;
                                        int ProverkaWaxaLadbi5 = 0;
                                        int ProverkaWaxaLadbi6 = 0;
                                        int ProverkaWaxaLadbi7 = 0;
                                        int ProverkaWaxaLadbi8 = 0;
                                        for (int Vert = 1; ProverkaWaxaLadbi1 == 0 && Wax + Vert <= 7 && Xaw + Vert <= 7; Vert++) {
                                            if (arr[Wax + Vert][Xaw + Vert] == 0) {waxoviekletki4ernix[Wax +Vert][Xaw+Vert]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                            } else if (arr[Wax + Vert][Xaw + Vert] == 905) {waxoviekletki4ernix[Wax +Vert][Xaw+Vert]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert][Xaw+Vert]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert][Xaw+Vert] < 505){waxoviekletki4ernix[Wax+Vert][Xaw+Vert]=1;}
                                                ProverkaWaxaLadbi1++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert2 = 1; ProverkaWaxaLadbi2 == 0 && Wax - Vert2 >= 0 && Xaw - Vert2 >= 0; Vert2++) {

                                            if (arr[Wax - Vert2][Xaw - Vert2] == 0) {waxoviekletki4ernix[Wax -Vert2][Xaw-Vert2]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                            } else if (arr[Wax - Vert2][Xaw - Vert2] == 905) {waxoviekletki4ernix[Wax -Vert2][Xaw-Vert2]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert2][Xaw-Vert2]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert2][Xaw-Vert2] < 505){waxoviekletki4ernix[Wax-Vert2][Xaw-Vert2]=1;}
                                                ProverkaWaxaLadbi2++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert3 = 1; ProverkaWaxaLadbi3 == 0 && Xaw + Vert3 <= 7 && Wax - Vert3 >= 0; Vert3++) {
                                            if (arr[Wax - Vert3][Xaw + Vert3] == 0) {waxoviekletki4ernix[Wax -Vert3][Xaw+Vert3]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                            } else if (arr[Wax - Vert3][Xaw + Vert3] == 905) {waxoviekletki4ernix[Wax -Vert3][Xaw+Vert3]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert3][Xaw+Vert3]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert3][Xaw+Vert3] < 505){waxoviekletki4ernix[Wax-Vert3][Xaw+Vert3]=1;}
                                                ProverkaWaxaLadbi3++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}

                                        for (int Vert4 = 1; ProverkaWaxaLadbi4 == 0 && Xaw - Vert4 >= 0 && Wax + Vert4 <= 7; Vert4++) {
                                            if (arr[Wax + Vert4][Xaw - Vert4] == 0) {waxoviekletki4ernix[Wax +Vert4][Xaw-Vert4]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                            } else if (arr[Wax + Vert4][Xaw - Vert4] == 905) {waxoviekletki4ernix[Wax +Vert4][Xaw-Vert4]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert4][Xaw-Vert4]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert4][Xaw-Vert4] < 505){waxoviekletki4ernix[Wax+Vert4][Xaw-Vert4]=1;}
                                                ProverkaWaxaLadbi4++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert5 = 1; ProverkaWaxaLadbi5 == 0 && Wax + Vert5 <= 7; Vert5++) {
                                            if (arr[Wax + Vert5][Xaw] == 0) {waxoviekletki4ernix[Wax +Vert5][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert5][Xaw]=1;}
                                            } else if (arr[Wax + Vert5][Xaw] == 905) {waxoviekletki4ernix[Wax +Vert5][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax+Vert5][Xaw]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax+Vert5][Xaw] < 505){waxoviekletki4ernix[Wax+Vert5][Xaw]=1;}
                                                ProverkaWaxaLadbi5++;
                                            }
                                        }
                                        if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert6 = 1; ProverkaWaxaLadbi6 == 0 && Wax - Vert6 >= 0; Vert6++) {

                                            if (arr[Wax - Vert6][Xaw] == 0) {waxoviekletki4ernix[Wax -Vert6][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert6][Xaw]=1;}
                                            } else if (arr[Wax - Vert6][Xaw] == 905) {waxoviekletki4ernix[Wax -Vert6][Xaw]=1;if(Shaxbelim==0){matoviekietki[Wax-Vert6][Xaw]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax-Vert6][Xaw] < 505){waxoviekletki4ernix[Wax-Vert6][Xaw]=1;}
                                                ProverkaWaxaLadbi6++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert7 = 1; ProverkaWaxaLadbi7 == 0 && Xaw + Vert7 <= 7; Vert7++) {
                                            if (arr[Wax][Xaw + Vert7] == 0) {waxoviekletki4ernix[Wax ][Xaw+Vert7]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw+Vert7]=1;}
                                            } else if (arr[Wax][Xaw + Vert7] == 905) {waxoviekletki4ernix[Wax ][Xaw+Vert7]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw+Vert7]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax][Xaw+Vert7] < 505){waxoviekletki4ernix[Wax][Xaw+Vert7]=1;}
                                                ProverkaWaxaLadbi7++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                        for (int Vert8 = 1; ProverkaWaxaLadbi8 == 0 && Xaw - Vert8 >= 0; Vert8++) {
                                            if (arr[Wax][Xaw - Vert8] == 0) {waxoviekletki4ernix[Wax ][Xaw-Vert8]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw-Vert8]=1;}
                                            } else if (arr[Wax][Xaw - Vert8] == 905) {waxoviekletki4ernix[Wax ][Xaw-Vert8]=1;if(Shaxbelim==0){matoviekietki[Wax][Xaw-Vert8]=1;}
                                                Shaxbelim = 1;
                                                Sh1 = Wax;
                                                Sh2 = Xaw;
                                            } else {if(arr[Wax][Xaw-Vert8] < 505){waxoviekletki4ernix[Wax][Xaw-Vert8]=1;}
                                                ProverkaWaxaLadbi8++;
                                            }
                                        }if(Shaxbelim==0){for (int Wa3x = 0; Wa3x < 8; Wa3x++) {
                                            for (int Xa3w = 0; Xa3w < 8; Xa3w++) {
                                                matoviekietki[Wa3x][Xa3w]=0;
                                            }}}
                                    }
//* квины шах к
                                }
                            }

//*шах конец


                            if (Shax4ernim == 1 && O4ereDb % 2 == 0) {
                                System.out.println("Нельзя по причине шаха черным");
                                for (int Sr34 = 0; Sr34 < 8; Sr34++) {
                                    for (int Sr44 = 0; Sr44 < 8; Sr44++) {
                                        arr[Sr34][Sr44] = arr3[Sr34][Sr44];
                                    }
                                }
                            }
                            if (Shaxbelim == 1 && O4ereDb % 2 == 1) {
                                System.out.println("Нельзя по причине шаха белым");
                                for (int Sr321 = 0; Sr321 < 8; Sr321++) {
                                    for (int Sr421 = 0; Sr421 < 8; Sr421++) {
                                        arr[Sr321][Sr421] = arr3[Sr321][Sr421];
                                    }
                                }
                            }
                            lll++;
                        }
                    }


//* ВЫВОД ДОСКИ ПОСЛЕ КАЖДОГО ХОДА
                    //*System.out.println(" ");
                    System.out.print("   " + "A   ");
                    System.out.print(" " + "B   ");
                    System.out.print(" " + "C  ");
                    System.out.print(" " + "D   ");
                    System.out.print(" " + "E   ");
                    System.out.print(" " + "F  ");
                    System.out.print(" " + "G   ");
                    System.out.print(" " + "H ");
                    System.out.println(" ");
                    for (int i = 0; i < 8; i++)//*Доску вывел
                    {
                        System.out.print(8 - i + "  ");
                        for (int j = 0; j < 8; j++) {


                            if (arr[i][j] == 101) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♜" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♜" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♜" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 102) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♞" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♞" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♞" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 103) {
                                if (i % 2 == 0 && j % 2 == 0) {
                                    System.out.print(BgColor.GREEN + Color.BLACK + "♝" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {
                                        System.out.print(BgColor.GREEN + Color.BLACK + "♝" + Color.RESET + "   ");
                                    } else {
                                        System.out.print(BgColor.RED + Color.BLACK + "♝" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 104 || arr[i][j] == 144) {
                                if (i % 2 == 0 && j % 2 == 0) {
                                    System.out.print(BgColor.GREEN + Color.BLACK + "♛" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {
                                        System.out.print(BgColor.GREEN + Color.BLACK + "♛" + Color.RESET + "   ");
                                    } else {
                                        System.out.print(BgColor.RED + Color.BLACK + "♛" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 105) {
                                if (i % 2 == 0 && j % 2 == 0) {
                                    System.out.print(BgColor.GREEN + Color.BLACK + "♚" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {
                                        System.out.print(BgColor.GREEN + Color.BLACK + "♚" + Color.RESET + "   ");
                                    } else {
                                        System.out.print(BgColor.RED + Color.BLACK + "♚" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 106 || arr[i][j] == 166) {
                                if (i % 2 == 0 && j % 2 == 0) {
                                    System.out.print(BgColor.GREEN + Color.BLACK + "♝" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {
                                        System.out.print(BgColor.GREEN + Color.BLACK + "♝" + Color.RESET + "   ");
                                    } else {
                                        System.out.print(BgColor.RED + Color.BLACK + "♝" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 107 || arr[i][j] == 177) {
                                if (i % 2 == 0 && j % 2 == 0) {
                                    System.out.print(BgColor.GREEN + Color.BLACK + "♞" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {
                                        System.out.print(BgColor.GREEN + Color.BLACK + "♞" + Color.RESET + "   ");
                                    } else {
                                        System.out.print(BgColor.RED + Color.BLACK + "♞" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 108 || arr[i][j] == 188) {
                                if (i % 2 == 0 && j % 2 == 0) {
                                    System.out.print(BgColor.GREEN + Color.BLACK + "♜" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {
                                        System.out.print(BgColor.GREEN + Color.BLACK + "♜" + Color.RESET + "   ");
                                    } else {
                                        System.out.print(BgColor.RED + Color.BLACK + "♜" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 901) {
                                if (i % 2 == 0 && j % 2 == 0) {
                                    System.out.print(BgColor.GREEN + Color.WHITE + "♜" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {
                                        System.out.print(BgColor.GREEN + Color.WHITE + "♜" + Color.RESET + "   ");
                                    } else {
                                        System.out.print(BgColor.RED + Color.WHITE + "♜" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 902) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♞" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♞" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♞" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 903) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♝" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♝" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♝" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 905) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♚" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♚" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♚" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 904 || arr[i][j] == 944) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♛" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♛" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♛" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 906 || arr[i][j] == 966) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♝" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♝" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♝" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 907 || arr[i][j] == 977) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♞" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♞" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♞" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 908 || arr[i][j] == 988) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♜" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♜" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♜" + Color.RESET + "   ");
                                    }
                                }
                            }

                            if (arr[i][j] == 201) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 202) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 203) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 204) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 205) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 206) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 207) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 208) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.BLACK + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.BLACK + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }

                            if (arr[i][j] == 801) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 802) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 803) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 804) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 805) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 806) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 807) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            }
                            if (arr[i][j] == 808) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.WHITE + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.WHITE + "♙" + Color.RESET + "   ");
                                    }
                                }
                            } else if (arr[i][j] == 0) {
                                if (i % 2 == 0 && j % 2 == 0) {

                                    System.out.print(BgColor.GREEN + Color.GREEN + "♙" + Color.RESET + "   ");
                                } else {
                                    if (i % 2 == 1 && j % 2 == 1) {

                                        System.out.print(BgColor.GREEN + Color.GREEN + "♙" + Color.RESET + "   ");
                                    } else {

                                        System.out.print(BgColor.RED + Color.RED + "♙" + Color.RESET + "   ");
                                    }
                                }


                            }


                        }

                        System.out.println(" ");
                    }
                    System.out.println(" ");
//*Пешка начало
//* Пешка конец
                    O4ereDb++; //*ПЕРЕХОД ХОДААА
                }
            }

        }

    }
}
