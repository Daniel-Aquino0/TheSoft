package com.example.thesoft

import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


class ListadeItensAdapta(private var dataset: MutableList<String>): Adapter {

    class ViewHolder (view: View ) : RecyclerView .ViewHolder (view)

    val item : CheckBox= View .findViewById(R.id.Itensdalista)

}

override fun onCreateViewholder (viewGruop: ViewGroup, viewType: Int) : RecyclerView.ViewHolder{

}
