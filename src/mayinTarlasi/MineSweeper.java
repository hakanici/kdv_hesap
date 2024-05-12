package mayinTarlasi;

import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int col;
    private char[][] gameBoard;
    private boolean[][] mines;
    private boolean[][] visited;
    private int mineCount;


    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        gameBoard = new char[row][col];
        mines = new boolean[row][col];
        visited = new boolean[row][col];
        mineCount = row * col / 4; // Mayın sayısını belirledik.
    }

    public void startGame() {
        // Oyun tahtasını ve mayınları oluşturduk.
        createGameBoard();
        placeMines();
        showMines();


        // Oyunun ana döngüsü
        boolean resume = true;
        while (resume) {


            showBoard();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Seçmek istediğiniz satır sayısını girin (1-" + row + ") :");
            int selectedRow = scanner.nextInt() - 1; //
            System.out.print("Seçmek istediğiniz sütun sayısını girin (1-" + col + ") :");
            int selectedCol = scanner.nextInt() - 1; //

            //Eğer Seçilen satır veya sütunun geçerli bir aralıkta olup olmadığını kontrolü.
            if ((selectedRow < 0 || selectedRow > row - 1) || (selectedCol < 0 || selectedCol > col - 1)) {
                System.out.print("Geçerli bir aralık giriniz !\n");
                continue;
            }


            if (visited[selectedRow][selectedCol]) { //Hücrenin tekrar seçilip seçilmediğinin kontrolü.
                System.out.println("Bu hücre zaten seçildi.");
            } else if (mines[selectedRow][selectedCol]) { //Eğer seçilen hücrede mayın varsa oyunu sonlandır.
                System.out.println("Mayına bastınız! Oyun bitti!");
                resume = false;
            } else {
                int mineCount = findMines(selectedRow, selectedCol); //Etraftaki mayınların sayısını tutacak değişken.
                gameBoard[selectedRow][selectedCol] = (char) (mineCount + '0');
                visited[selectedRow][selectedCol] = true;
                if (isWin()) { //Eğer isWin metotu true ise Oyunu kazandınız mesajı ver ve oyunu sonlandır.
                    System.out.println("Tebrikler! Oyunu kazandınız!");
                    resume = false;
                }
            }
        }
    }

    private void createGameBoard() { //Oyunun tahtasını oluşturan metot.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }

    private void placeMines() { //Random yerlerde belirtilen sayıda mayın oluşturan metot.

        for (int i = 0; i < mineCount; i++) {
            int mineRows, mineCols;
            do {
                mineRows = (int) (Math.random() * row);
                mineCols = (int) (Math.random() * col);
            } while (mines[mineRows][mineCols]);
            mines[mineRows][mineCols] = true;


        }
    }

    private int findMines(int row, int col) { //Seçilen yerin etrafında kaç mayın olduğunu hesaplayan ve gösteren metot.
        int count = 0; //Etraftaki mayınların sayısını tutacak değişken.
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < this.row && j >= 0 && j < this.col && mines[i][j]) {
                    count++;
                }
            }
        }
        return count; // count değişkenini döndür.
    }

    private void showBoard() { //Oyunun boardını gösteren metot.
        System.out.println("Game Board:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (visited[i][j]) {
                    System.out.print(gameBoard[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    private boolean isWin() { //visited ve mines metotları eğer false döndürüyorsa false, true döndürüyorsa true döndürüp oyunun bitip bitmediğini kontrol eten metot.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && !mines[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void showMines() { //Mayınların yerini gösteren metot.
        System.out.println("Mines:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((mines[i][j] ? "* " : "- "));
            }
            System.out.println();
        }
        System.out.println();
    }


}



