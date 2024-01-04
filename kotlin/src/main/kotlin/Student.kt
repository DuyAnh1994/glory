package org.example

class Student {
    private var name: String? = null

    init {

    }

    fun setName(name: String) {
        this.name = name
    }

    fun getDisplayName(ext: String): String {
        return "$name - $ext"
    }
}