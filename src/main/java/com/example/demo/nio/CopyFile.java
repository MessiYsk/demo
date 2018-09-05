package com.example.demo.nio;// $Id$

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyFile {
    static public void main(String args[]) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: java CopyFile infile outfile");
            System.exit(1);
        }

        String infile = args[0];
        String outfile = args[1];

        FileChannel fcin;
        try (FileInputStream fin = new FileInputStream(infile)) {
            fcin = fin.getChannel();
        }

        FileChannel fcout;
        try (FileOutputStream fout = new FileOutputStream(outfile)) {
            fcout = fout.getChannel();
        }

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            buffer.clear();

            int r = fcin.read(buffer);

            if (r == -1) {
                break;
            }

            buffer.flip();

            fcout.write(buffer);
        }
    }
}
