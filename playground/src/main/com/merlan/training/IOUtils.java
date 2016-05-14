package main.com.merlan.training;

import java.io.*;

/**
 * Created by Administrator on 2016/5/9.
 */
public class IOUtils {

    public void testSystemIn(){
        //why inputstrem +reader
        //why buffered reader after inputstream
        InputStreamReader isr = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            s = br.readLine();
            while(s!=null) {
                if(s.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(s.toUpperCase());
                s = br.readLine();
            }
            br.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void testBuffer() {
        try {
            //查看修改日就可以判断文件是否是新建的了
            BufferedWriter bw = new BufferedWriter(new FileWriter("d:/java.txt"));
            BufferedReader br = new BufferedReader(new FileReader("d:/java.txt"));
            String s = null;
            for(int i=1; i<100; i++) {
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();//换行
            }
            //刷新该流的缓冲，br没有该方法
            bw.flush();
            while((s=br.readLine())!=null) {
                System.out.println(s);
            }
            bw.close();
            br.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testInputStream() {
        FileInputStream in = null;
        try {
            in = new FileInputStream("e:/1.txt");
        }catch(FileNotFoundException e) {
            System.out.println("找不到文件");
            System.exit(-1);
        }
        //下面表示找到了文件
        int tag = 0;
        try {
            long num = 0;
            while((tag = in.read())!=-1) {
                //read是字节流，若是有汉字就显示不正常了,使用reader就解决了
                System.out.print((char)tag);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("共读取了" + num + "字符");
        }catch(IOException e1) {//read和close都会抛出IOException
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }

    public void testOutputStream() {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {

            in = new FileInputStream("d:/java.txt");

            //下面的若是不存在的话会自动建立

            out = new FileOutputStream("d:/my_java.txt");


            while ((b = in.read()) != -1) {
                out.write(b);
            }


            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e1) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件已复制");
    }

    public void testObjectIO() {

    }

    public void testTransferCode() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/java.txt"));
            osw.write("你好123");//可以直接写入字符串，包括中文,因为外边的是字符流
            System.out.println("编码方式：" + osw.getEncoding());//ISO8859_1是西欧语言，又叫latin-1，此时未考虑东方人，国标（ISO）为Unicode
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream("d:/java.txt",true),"ISO8859_1");//true表示追加
            osw.write("这是追加的内容");
            System.out.println("编码方式：" + osw.getEncoding());
            osw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void testDataStream() {
        //先在内存里分配一个字节数组，再有一个 OutputStream，再加上一个数据流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {//写出读入
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());//共几个字节可用
            DataInputStream dis = new DataInputStream(bais);
            ////先写的先读（队列）,下面这两个输出不可以调换,否则就先输出了double里的一个字节
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testIO() {
        try {
            File file = new File ("test.txt");
            System.out.println(file.getAbsolutePath());
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
            int b ;
            while((b = fis.read()) != -1) {

                fos.write(b);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void testRandomAccess() {
        byte[] b1 = {1,2,3};
        byte[] b2 = {1,2,3,4,5,6};
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("input.txt", "rw");
            raf.writeUTF("Hello random access file");
            raf.seek(0);
            System.out.println("" + raf.read(b1,0, 3));
            raf.seek(0);
            System.out.println("" + raf.read(b2,1,2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
