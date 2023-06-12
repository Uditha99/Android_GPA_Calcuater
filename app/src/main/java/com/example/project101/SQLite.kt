package com.example.project101

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class SQLite(context:Context) :
    SQLiteOpenHelper(context , "university" ,null,1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table student (username TEXT primary key, email TEXT , password TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL("drop table if exists student")

    }

    fun insertStudentData(username:String , email:String , password:String): Boolean {

        var db = this.writableDatabase
        var value= ContentValues()

        value.put("username",username)
        value.put("email",email)
        value.put("password",password)

        var result = db.insert("student",null,value)

        if (result==-1.toLong()){
            return false
        }else{
            return true
        }
    }

    fun getStudentData(username: String , password: String): Boolean {
        var db=this.writableDatabase
        val query = "select * from student where username= '$username' and password='$password'"
        val cursor = db.rawQuery(query,null)
        if(cursor.count<=0){
            cursor.close()
            return false
        }

        cursor.close()
        return true
    }
}