import java.io.*;

public class FileCopy {

public static void main(String[] args) {

try {

FileInputStream source = new FileInputStream("input.txt");

FileOutputStream destination = new FileOutputStream("output.txt");

int data;

while ((data = source.read()) != -1) {

destination.write(data);

}

source.close();

destination.close();

System.out.println("File copied successfully.");

System.out.println("Destination File Created: output.txt");

} catch (IOException e) {

System.out.println("Error: " + e.getMessage());

}

}

}