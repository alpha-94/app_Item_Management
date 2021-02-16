package com.arslooper.item_app.item

data class Item(val id:String, val item_code:String, val item_date:String, val item_name:String) {

}

data class JsonObj(val result : List<Item>)

