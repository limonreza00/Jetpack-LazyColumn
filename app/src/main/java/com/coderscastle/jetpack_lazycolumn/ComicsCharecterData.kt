package com.coderscastle.jetpack_lazycolumn

data class ComicsCharacterData (
        val  image: Int,
        val name: String,
        val desc : String
        )

fun getComicsCharacterData(): List<ComicsCharacterData>{

    return listOf<ComicsCharacterData>(

        ComicsCharacterData(R.drawable.ironman,"Iron Man","Tony Stark"),
        ComicsCharacterData(R.drawable.captain_america,"Captain America","Steve Rogers"),
        ComicsCharacterData(R.drawable.hawkeye,"Hawkeye","Clint Barton"),
        ComicsCharacterData(R.drawable.hulk,"Hulk","Bruce Banner"),
        ComicsCharacterData(R.drawable.thor,"Thor","Thor Odinson"),
        ComicsCharacterData(R.drawable.black_widow,"Black Widow","Natasha Romanoff"),
        ComicsCharacterData(R.drawable.doom,"Dr Doom","Victor"),
        ComicsCharacterData(R.drawable.aquaman,"Aquaman","Arthur Curry"),
        ComicsCharacterData(R.drawable.batman,"Batman","Bruce Wayne"),
        ComicsCharacterData(R.drawable.flash,"Flash","Barry Allen"),
        ComicsCharacterData(R.drawable.superman,"Superman","Clark"),
        ComicsCharacterData(R.drawable.wonder_woman,"WonderWoman","Diana")

    )

}