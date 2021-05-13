package app.miki.mikiso.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Word型の変数を宣言
        val apple:Word = Word(R.drawable.apple4, "リンゴ", "apple")
        val banana:Word = Word(R.drawable.banana4, "バナナ", "banana")
        val orange:Word = Word(R.drawable.orange4, "オレンジ", "orange")
        val strawberry:Word = Word(R.drawable.strawberry4, "いちご", "strawberry")
        val words:Array<Word> = arrayOf(apple,banana,orange,strawberry)
        for (i in words) {
            addWord(i)
        }
    }

    fun addWord(word: Word) {
        val nameTextView:TextView = TextView(this)
        nameTextView.text = word.name

        val layout:LinearLayout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView:ImageView = ImageView(this)
        imageView.setImageResource(word.resID)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)

    }

}




