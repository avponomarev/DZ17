package javaapplication3;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// СОЗДАТЬ В КОРНЕ ДИСКА "D" ТЕКСТОВЫЙ ФАЙЛ С ИМЕНЕМ ТЕСТ И ЗАПОЛНИТЬ ЕГО ЛЮБЫМИ ЗНАЧЕНИЯМИ!

public class dz17{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("d:\\тест.txt"), "Cp1251"));
        List<String> fileContent = new ArrayList<String>() ;
        String str;
        while( (str = br.readLine() ) != null )
            fileContent.add(str);
        System.out.println( fileContent);
        br.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter("d:\\тест.txt");


        for (int i = 0; i < fileContent.size(); i++) {
            writer.write(reader.readLine() + '\n');
        }

        reader.close();
        writer.close();
    }
}