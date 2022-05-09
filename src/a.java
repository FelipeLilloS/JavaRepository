/*
import java.io.*;
import java.util.*;
import java.lang.*;

public class a {

    static void writer(BufferedWriter wr, int k) throws IOException {
        if(k <= 0){
            wr.close();
            return;
        } else if(k >= 1){
            int number = (int)(Math.random()*1001);
            wr.write(number+"\n");
            writer(wr,k-1);
        }
    }
    int searchLess(ArrayList arr, int v){
        if(arr.size() < 1){
            return 0;
        }
        return 0;
    }
    int searchHigh(){
        return 0;
    }
    int searchEqual(){
        return 0;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String path = "./";
        BufferedWriter wr = new BufferedWriter(new FileWriter(path+"numeros.txt"));
        int k = 1000;
        writer(wr,k);
        BufferedReader re = new BufferedReader(new FileReader(path + "numeros.txt"));
        String text = re.readLine();
        while(text != null) {
            int number = Integer.parseInt(text);
            arr.add(number);
            text = re.readLine();
        }
        int v = 101;


    }
}

 */