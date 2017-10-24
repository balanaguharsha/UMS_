package com.example.harshavardhan.a2z.inputOutput;

import android.content.Context;

import java.io.*;
import com.example.harshavardhan.a2z.entry.Im;

/**
 * Created by SAKSHAM on 10/24/2017.
 */

public class UpdateIm {

    public Im f(Context con) throws IOException,ClassNotFoundException
    {
        Im t=new Im();

        ObjectInputStream fp = new ObjectInputStream(con.openFileInput("StIm"));

        t=(Im)fp.readObject();

        fp.close();

        return t;
    }
}
