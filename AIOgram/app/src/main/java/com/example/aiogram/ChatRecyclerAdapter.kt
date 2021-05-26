package com.example.aiogram

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_chat_list_item.view.*


class ChatRecyclerAdapter(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    val classContext = context
    private var items: List<ChatData> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ChatViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_chat_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ChatViewHolder -> {
                holder.bind(items.get(position))
                holder.itemView.setOnClickListener{
                    val dataImage = items.get(position).image
                    val dataName = items.get(position).username
                    val dataText = items.get(position).text
                    val payload = ArrayList<String>()
                    payload.add(dataImage)
                    payload.add(dataName)
                    payload.add(dataText)
                    val myContext = this.classContext
                    val intent = Intent(myContext, Chat::class.java).apply {
                        putStringArrayListExtra(DATA, payload)
                    }
                    startActivity(myContext, intent, null)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(chatList: List<ChatData>){
        items = chatList
    }

    class ChatViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val chat_image = itemView.chat_image
        val chat_username = itemView.chat_username
        val chat_text = itemView.chat_text

        fun bind(chatItem: ChatData){
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(chatItem.image).apply(RequestOptions.circleCropTransform()).into(chat_image);

            chat_username.setText(chatItem.username)
            chat_text.setText(chatItem.text)
        }
    }
}

