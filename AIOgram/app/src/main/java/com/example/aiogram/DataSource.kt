package com.example.aiogram


class DataSource{

    companion object{

        fun createDataSet(): ArrayList<ChatData>{
            val list = ArrayList<ChatData>()
            list.add(
                ChatData(
                    "Arch",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/arch.png",
                    "Pathetic human beings"
                )
            )
            list.add(
                ChatData(
                    "Cron",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/cron.png",
                    "Time is relative, isn't it?"
                )
            )
            list.add(
                ChatData(
                    "Debian",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/debian.png",
                    "Choose the white side!"
                )
            )
            list.add(
                ChatData(
                    "Fedora",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/fedora.png",
                    "Choose the red side!"
                )
            )
            list.add(
                ChatData(
                    "GCC",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/gcc.jpg",
                    "I like collections, and you?"
                )
            )
            list.add(
                ChatData(
                    "Java",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/java.png",
                    "Hey, wanna see me throwing runtime error?)"
                )
            )
            list.add(
                ChatData(
                    "Kali",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/kali.png",
                    "Choose the dark side!"
                )
            )
            list.add(
                ChatData(
                    "Kernel",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/kernel.png",
                    "Faded heart"
                )
            )
            list.add(
                ChatData(
                    "Manjaro",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/manjaro.png",
                    "I'm kinda Arch but not aggressive..."
                )
            )
            list.add(
                ChatData(
                    "Matrix",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/matrix.png",
                    "Security & decentralization first!"
                )
            )
            list.add(
                ChatData(
                    "Mint",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/mint.png",
                    "Same useless as Ubuntu"
                )
            )
            list.add(
                ChatData(
                    "Python",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/python.png",
                    "Pagan Deity. The Crocodile Hunter."
                )
            )
            list.add(
                ChatData(
                    "Solus",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/solus.png",
                    "Let's hang out a bit"
                )
            )
            list.add(
                ChatData(
                    "SUDO",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/sudo.png",
                    "To be or not no be?!!"
                )
            )
            list.add(
                ChatData(
                    "TOR",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/tor.png",
                    "Like onions?"
                )
            )
            list.add(
                ChatData(
                    "Ubuntu",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/ubuntu.png",
                    "Useless as Mint"
                )
            )
            list.add(
                ChatData(
                    "Userdel",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/userdel.png",
                    "Just erase it."
                )
            )
            list.add(
                ChatData(
                    "Vim",
                    "https://raw.githubusercontent.com/VasylFil/chat-app/main/img/vim.png",
                    "Vi veri veniversum vivus vici!"
                )
            )

            return list
        }
    }
}