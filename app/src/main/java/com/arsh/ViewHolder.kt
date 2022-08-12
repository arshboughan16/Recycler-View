package com.arsh

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    var tvName = view.findViewById<TextView>(R.id.tvName)
    var tvId = view.findViewById<TextView>(R.id.tvId)

}
