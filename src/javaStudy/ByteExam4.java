package javaStudy;

import java.io.DataInputStream;
import java.io.FileInputStream;

    public class ByteExam4 {

        public static void main(String[] args) {
            try(
                    DataInputStream out = new DataInputStream(new FileInputStream("data.txt"));
            ){
                int i = out.readInt();          
                boolean b = out.readBoolean();          
                double d = out.readDouble();

                System.out.println(i);
                System.out.println(b);
                System.out.println(d);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
