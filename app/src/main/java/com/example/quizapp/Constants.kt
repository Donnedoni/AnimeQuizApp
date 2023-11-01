package com.example.quizapp

object Constants {

    const val USER_NAME :String="userName"
    const val TOTAL_QUESTIONS:String="totalQuestions"
    const val CORRECT_ANSWERS:String ="correctAnswer"

    fun getQuestions(): ArrayList<Questions>{
        val questionList = arrayListOf<Questions>()

        val que1 = Questions(
            1,
            "What is the character's Name",
            R.drawable.ic_madara,
            "Madara",
            "Itachi",
            "Sasuke",
            "Shisui",
            1)
        
        questionList.add(que1)
        


        val que2 = Questions(
            2,
            "What is the character's Name",
            R.drawable.ic_goten,
            "Goku",
            "Goten",
            "Turles",
            "Bardock",
            2)

        questionList.add(que2)



        val que3 = Questions(
            3,
            "What is the character's Name",
            R.drawable.ic_naruto,
            "Boruto",
            "Manma",
            "Minato",
            "Naruto",
            4)

        questionList.add(que3)



        val que4 = Questions(
            4,
            "What is the character's Name",
            R.drawable.ic_tanjiro,
            "Kamaboko Gonpachiro",
            "Shakakiri Gengoro",
            "Tanjiro Kamado",
            "Itadaki Tontaro",
            3)

        questionList.add(que4)



        val que5 = Questions(
            5,
            "What is the character's Name",
            R.drawable.ic_turle,
            "Goku",
            "Bardock",
            "Turles",
            "Goku",
            3)

        questionList.add(que5)



        val que6 = Questions(
            6,
            "What is the character's Name",
            R.drawable.ic_minato,
            "Boruto",
            "Saruto",
            "Minato",
            "Naruto",
            3)

        questionList.add(que6)



        val que7 = Questions(
            7,
            "What is the character's Name",
            R.drawable.ic_bardock,
            "Bardock",
            "Goku",
            "Turles",
            "Goten",
            1)

        questionList.add(que7)



        val que8 = Questions(
            8,
            "What is the character's Name",
            R.drawable.ic_twoguys,
            "Izumo & Kotetsu",
            "Sasuke & Naruto",
            "Hidan & Kakuzu",
            "The 2 guys from Naruto",
            1)

        questionList.add(que8)



        val que9 = Questions(
            9,
            "What is the character's Name",
            R.drawable.ic_kidgoku,
            "Turles",
            "Goten",
            "Bardock",
            "Goku",
            4)

        questionList.add(que9)

        return questionList
        
        
    }
    
}