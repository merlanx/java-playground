package main.com.merlan.tools;

import java.io.*;
import java.util.*;

/**
 * Created by Administrator on 2016/5/14.
 * Count letter occurrence
 */
public class CountFrequence {
    private final String fileName;
    private File file;
    private Map<Integer,Integer> map = new TreeMap();

    public CountFrequence(String fileName) {
        this.fileName = fileName;
        this.getFile();
    }

    private void getFile() {
        this.file = new File(this.fileName);
    }
    public void count() {
        String chac;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));
            while ((chac = br.readLine()) != null ) {
                for(int i=0;i<chac.length(); i++) {
                    char c = chac.charAt(i);
                    if((c >= 'a' && c<= 'z') || (c >= 'A' && c <= 'Z' )) {
                        int value = map.getOrDefault((int) c, 0);
                        map.put((int) c, value + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void printResult() {
            for (Integer integer : this.map.keySet()) {
                System.out.println((char)integer.intValue() + " : " + map.get(integer));
            }
    }



}
