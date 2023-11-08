package com.example.recycleview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var user : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyle_exam)
        val imageId = intArrayOf(
            R.drawable.img,R.drawable.img_1,R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4, R.drawable.img_5,R.drawable.img_6,R.drawable.img_7
        )
        val name = arrayOf("Chris","Meg","Peter","Stewy","Brian","Louise","Jotaro","Yoma")
        val lastmsg = arrayOf("No country for old man","Breaking Bad","Better call Saul",
            "The Witcher","The Martian","Rush hour","Stardust Crusader","The Run")
        val lastmsgtime = arrayOf("07:00 am","07:11 pm","09:11 pm","10:37 am","05:00 am","00:00 am","00:00 am","00:00 am")

        user = ArrayList()
        for (i in name.indices) {
            val user1 = User(name[i],lastmsg[i],lastmsgtime[i],imageId[i])
            user.add(user1)
        }
        recyclerView = findViewById<RecyclerView>(R.id.recycle)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(user)


    }
}