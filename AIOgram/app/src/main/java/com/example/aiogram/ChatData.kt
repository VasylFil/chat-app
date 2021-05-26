package com.example.aiogram

data class ChatData(

    var username: String,
    var image: String,
    var text: String

) {

    override fun toString(): String {
        return "Chat(username='$username', image='$image', text='$text')"
    }

}
























