package com.example.thesoft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private val Listadeitens = mutableListOf<String>()
    private lateinit var dialog: MaterialAlertDialogBuilder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botãodecriarItem = findViewById<FloatingActionButton>(R.id.BotãodeAdicionar)
        botãodecriarItem.setOnClickListener {
            abrirDialogdecriarItem()
        }

        dialog = MaterialAlertDialogBuilder(this)

    }

    private fun abrirDialogdecriarItem() {
        val adicionarDialogView =
            LayoutInflater.from(this).inflate(R.layout.crate_item_dialog, null, false)
        dialog.setView(adicionarDialogView).setPositiveButton("Confirmar") { _, _ ->
            val input = adicionarDialogView.findViewById<EditText>(R.id.CriarItemInput)
            val novoitem = input.text
        }
    }
}
