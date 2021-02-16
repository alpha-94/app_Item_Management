package com.arslooper.item_app.item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arslooper.item_app.R
import kotlinx.android.synthetic.main.item_activity_search.*

import com.google.gson.GsonBuilder
import okhttp3.*
import java.io.IOException
import java.net.URL


class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_activity_search)

        println("fetchJson start")
        fetchJson()

    }
    
    private fun fetchJson(){
        println("fetchJson start in")
        val url = URL("http://10.0.2.2/dashboard/query.php/")
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object: Callback{
            override fun onResponse(call: Call, response: Response) {
                println("onResponse start")
                val body = response.body?.string()

                val gson = GsonBuilder().create()
                val list = gson.fromJson(body, JsonObj::class.java)

                runOnUiThread {
                    println("runOnUiThread start")
                    item_search_RecyclerView.adapter  = SearchAdepter(list)
                }
            }
            override fun onFailure(call: Call, e: IOException) {
                println("fail :: $e")
            }
        })
    }
}
