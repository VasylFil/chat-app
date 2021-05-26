package com.example.aiogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_chat_list_item.view.*


class Chat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_template)
        val payload = intent.getStringArrayListExtra(DATA)
        Log.d("DEB", payload.toString())


        val chat_image = findViewById<ImageView>(R.id.chat_image_chat)

        val image = payload?.get(0)
        val name = payload?.get(1)
        val text = payload?.get(2)

        findViewById<TextView>(R.id.chat_username_chat).text = name
        findViewById<TextView>(R.id.msgFrom_chat).text = text

        val requestOptions = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        Glide.with(chat_image)
            .applyDefaultRequestOptions(requestOptions)
            .load(image).apply(RequestOptions.circleCropTransform()).into(chat_image);

    }


    fun sendMessage(view: View){
        val msgText = findViewById<EditText>(R.id.msgInput).text.toString()
        if (msgText.isNotEmpty())
        {
            val msgTo = findViewById<TextView>(R.id.msgTo).setText(msgText)
            findViewById<EditText>(R.id.msgInput).setText("")
        }
    }
}























