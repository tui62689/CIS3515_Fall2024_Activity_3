package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val numbers: Array<Int>) : BaseAdapter() {


    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
        val textView = TextView(context)
        textView.text = numbers[position].toString()
        textView.textSize = 22f
        textView.setPadding(5, 10, 0, 10)
        return textView
    }

}