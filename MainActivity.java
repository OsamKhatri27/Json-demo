package com.example.innu.jsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ArrayParsing();
        // ObjectParsing();
        MixedParsing1();
        MixedParsing2();
        MixedParsing3();
        MixedParsing4();
    }

    public void ArrayParsing() {

        String str = "['Anil','Sunil','Ravi','Pankaj','Gaurav']";
        try
        {
            JSONArray jsonArray = new JSONArray(str);
            for(int i=0;i<jsonArray.length();i++)
            {
                String value = jsonArray.getString(i);
                Log.i("myapp",value);
            }
        }
        catch(Exception e)
        {

        }
    }

    public void ObjectParsing(){
        String str = "{'name':'Anil','phone':'9393849843','email':'anil@mail.com'}";
        try
        {
            JSONObject jsonObject = new JSONObject(str);

            String name = jsonObject.getString("name");
            long phone = jsonObject.getLong("phone");
            String email = jsonObject.getString("email");
             Log.i("myapp", name+phone+email);

        }
        catch(Exception e)
        {

        }
    }

    public void MixedParsing1()
    {
        Log.i("myapp","test1");
        String str="[ [1,2,3],[4,5],[6,7,8] ]";
        try{
          JSONArray jsonarray1=new JSONArray(str);
            for(int i=0;i<jsonarray1.length();i++)
            {
                JSONArray jsonArray2 = jsonarray1.getJSONArray(i);
                for(int j=0;j<jsonArray2.length();j++)
                {

                    String value1 = jsonArray2.getString(j);
                    Log.i("myapp",value1);
                }
            }

        }catch (Exception e)
        {

        }
    }

    public void MixedParsing2()
    {
        Log.i("myapp","test2");
        String str="[ {'name':'Anil','age':'20'}, {'name':'osam','age':'20'} ]";
       try {
           JSONArray jsonarray3 = new JSONArray(str);
           for(int i=0;i<jsonarray3.length();i++)
           {
               JSONObject jsonobject1=jsonarray3.getJSONObject(i);

            String name= jsonobject1.getString("name");
               int age=jsonobject1.getInt("age");
               Log.i("myapp",name+age);
           }
       }catch(Exception e){}
    }

    public void MixedParsing3()
    {
        String str="{ 'UP':['Faridabad','Ghaziabad'], 'Punjab':['Chandigarh','Ludhiana'] }";

        try{
            JSONObject jsonObject =new JSONObject(str);
            JSONArray jsonArray=jsonObject.getJSONArray("UP");

            for(int i=0;i<jsonArray.length();i++)
            {
                String value=jsonArray.getString(i);
                Log.i("myapp",value);
            }

            JSONArray jsonArray1=jsonObject.getJSONArray("Punjab");

            for(int j=0;j<jsonArray1.length();j++)
            {
                String value1=jsonArray1.getString(j);
                Log.i("myapp",value1);
            }


        }catch (Exception e)
        {

        }
    }
    public void MixedParsing4()
    {
        Log.i("myapp","test4");

       String str ="{ 'It':{'name':'osam','age':'20'},'civil':{'name':'manisha','age':'20'}}";
     try {
         JSONObject jsonObject = new JSONObject(str);

         JSONObject jsonObject1=jsonObject.getJSONObject("It");
         String name=jsonObject1.getString("name");
         int age =jsonObject1.getInt("age");
        Log.i("myapp",name+age);

         JSONObject jsonObject2=jsonObject.getJSONObject("civil");
         String name1=jsonObject2.getString("name");
         int age1 =jsonObject2.getInt("age");
         Log.i("myapp",name1+age1);

     }catch (Exception e)
     {}
    }

}
