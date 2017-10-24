package com.example.harshavardhan.a2z;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.harshavardhan.a2z.inputOutput.UpdateBooks;
import com.example.harshavardhan.a2z.library.Book;
import com.example.harshavardhan.a2z.library.Lib;

import com.example.harshavardhan.a2z.R;

import java.io.IOException;

public class common extends AppCompatActivity {
    EditText edit1;
    Button butt1;
    UpdateBooks u=new UpdateBooks();
    Book b[]=null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            b=u.f(getApplicationContext());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        edit1=(EditText)findViewById(R.id.edit1);
        butt1=(Button)findViewById(R.id.butt1);
        final int choice=getIntent().getStringExtra("select").toCharArray()[0]-'0';
        if(choice==1)
            edit1.setHint("Title");
        else if (choice==2)
            edit1.setHint("Words in title");
        else if(choice==3)
            edit1.setHint("Author");
        else
            edit1.setHint("Publication");
        final Intent ij=new Intent(getApplicationContext(),Main8Activity.class);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice == 1) {
                    Lib l = new Lib();
                    int a[] = l.SearchBookName(edit1.getText().toString(), b);
                    ij.putExtra("intarr",a);
                    startActivity(ij);
                }
                else if(choice==2){
                    Lib l = new Lib();
                    int a[] = l.SearchBookWordsInTitle(edit1.getText().toString(), b);
                    ij.putExtra("intarr",a);
                    startActivity(ij);
                }
                else if(choice==3){
                    Lib l = new Lib();
                    int a[] = l.SearchBookAuthor(edit1.getText().toString(), b);
                    ij.putExtra("intarr",a);
                    startActivity(ij);
                }
                else
                {
                    Lib l = new Lib();
                    int a[] = l.SearchPublication(edit1.getText().toString(), b);
                    ij.putExtra("intarr",a);
                    startActivity(ij);
                }
            }
        } );


    }
}
