package com.example.school_checkwork_profile1

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.school_checkwork_profile1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        //name
        binding.showProfileButton.setOnClickListener{

            /////////////////写真を変えるよ！///////////////////////////////////
            binding.profileImage.setImageResource(R.drawable.chloe_image)
            binding.profileLabelText.text = "名前"
            binding.profileCommentText.text = "Androidメンターのくろえだよ"

            // 注意）activity_main.xml　の初期写真・文字も一緒に変えておこう！
            //////////////////////////////////////////////////////////////////

            //color change
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(0, 180, 220))
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
        }

        //idol
        binding.showSportButton.setOnClickListener{

            /////////////////写真を変えるよ！///////////////////////////////////
            binding.profileImage.setImageResource(R.drawable.danielle_image)
            binding.profileLabelText.text = "推し"
            binding.profileCommentText.text = "韓国のアイドルの、Newjeansが好き。ダニエルが推し。"
            //////////////////////////////////////////////////////////////////

            //color change
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(220, 0, 100))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
        }

        //food
        binding.showFoodButton.setOnClickListener{

            /////////////////写真を変えるよ！///////////////////////////////////
            binding.profileImage.setImageResource(R.drawable.korean_food_image)
            binding.profileLabelText.text = "好きな食べ物"
            binding.profileCommentText.text = "韓国料理など、辛い物が好き。"
            /////////////////////////////////////////////////////////////////

            //color change
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(0, 180, 120))
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
        }

        //hobby
        binding.showHobbyButton.setOnClickListener{

            /////////////////写真を変えるよ！///////////////////////////////////
            binding.profileImage.setImageResource(R.drawable.starbucks_image)
            binding.profileLabelText.text = "趣味"
            binding.profileCommentText.text = "スタバに行くこと。"
            ////////////////////////////////////////////////////////////////

            //color change
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(220, 180, 0))
        }
    }
}