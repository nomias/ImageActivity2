package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycle = findViewById<RecyclerView>(R.id.recyclerView)
        recycle.layoutManager= GridLayoutManager(this,4)
        val images = arrayOf(
            Image("Large Blue Note", R.drawable.largebluenote),
            Image("Large Green Note", R.drawable.largegreennote),
            Image("Large Orange Note", R.drawable.largeorangenote),
            Image("Large Purple Note", R.drawable.largepurplenote),
            Image("Large Red Note", R.drawable.largerednote),
            Image("Medium Blue Note", R.drawable.mediumbluenote),
            Image("Medium Green Note", R.drawable.mediumbluenote),
            Image("Medium Orange Note", R.drawable.mediumbluenote),
            Image("Medium Purple Note", R.drawable.mediumbluenote),
            Image("Medium Red Note", R.drawable.mediumbluenote),
            Image("Small Blue Note", R.drawable.smallbluenote),
            Image("Small Green Note", R.drawable.smallgreenote),
            Image("Small Orange Note", R.drawable.smallorangenote),
            Image("Small Purple Note", R.drawable.smallpurplenote),
            Image("Small Red Note", R.drawable.smallrednote)
        )
        recycle.adapter=ImageAdapter(this,images)
    }
}