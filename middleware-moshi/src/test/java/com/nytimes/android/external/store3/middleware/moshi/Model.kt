package com.nytimes.android.external.store3.middleware.moshi

data class Bar(val string:String)

data class Foo(
        val number: Int,
        val string: String,
        val bars: List<Bar>
)