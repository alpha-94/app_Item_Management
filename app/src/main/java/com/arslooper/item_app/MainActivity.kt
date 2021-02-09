package com.arslooper.item_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.arslooper.item_app.item.*
import kotlinx.android.synthetic.main.main_activity_main.*

import com.arslooper.item_app.entry.ConfirmActivity as entry_ConfirmActivity
import com.arslooper.item_app.entry.SearchActivity as entry_SearchActivity
import com.arslooper.item_app.entry.SelectActivity as entry_SelectActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_main)

        main_card_appCompatTextView_Item_confrim.setOnClickListener {
            val intent = Intent(this@MainActivity, ConfirmActivity::class.java)
            startActivity(intent)
        }

        main_card_appCompatTextView_Item_Search.setOnClickListener {
            val intent = Intent(this@MainActivity, SearchActivity::class.java)
            startActivity(intent)
        }

        main_card_appCompatTextView_Item_Analyze.setOnClickListener {
            val intent = Intent(this@MainActivity, AnalyzeActivity::class.java)
            startActivity(intent)
        }

        main_card2_appCompatTextView_Entry_Confirm.setOnClickListener {
            val intent = Intent(this@MainActivity, entry_ConfirmActivity::class.java)
            startActivity(intent)
        }

        main_card2_appCompatTextView_Entry_Search.setOnClickListener {
            val intent = Intent(this@MainActivity, entry_SearchActivity::class.java)
            startActivity(intent)
        }

        main_card2_appCompatTextView_Entry_Select.setOnClickListener {
            val intent = Intent(this@MainActivity, entry_SelectActivity::class.java)
            startActivity(intent)
        }
    }
}