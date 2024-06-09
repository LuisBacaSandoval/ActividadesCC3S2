package org.example;

public class ConsoleGraphics implements Graphics{
    @Override
    public void drawText(String text) {
        print(text);
    }
    @Override
    public void drawHorizontalLine(int width) {
        var rowText = new StringBuilder();

        for (int i = 0; i < width; i++) {
            rowText.append('X');
        }

        print(rowText.toString());
    }
    private void print(String text) {
        System.out.println(text);
    }
    @Override
    public void drawCircle(int radius) {
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                if (x * x + y * y <= radius * radius) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}