package com.example.tac

import android.app.Activity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import com.example.tac.databinding.ActivityMainBinding

class MainActivity : Activity() {

	private lateinit var binding: ActivityMainBinding

	lateinit var animTranslate:Animation
	lateinit var setText:TextView
	lateinit var btEnemy:Button
	lateinit var btMy:Button
	lateinit var btUndo:Button

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setText = findViewById(R.id.setPoints)
		animTranslate = AnimationUtils.loadAnimation(this, R.anim.translate)

		setText.isSelected = true

		btEnemy = findViewById(R.id.enemy)
		btMy = findViewById(R.id.myself)
		btUndo = findViewById(R.id.undo)

		var enemy = Player(0,0)
		var me = Player(0,0)

		var l = Logic(enemy,me)

		btEnemy.setOnClickListener{
			println("Enemy")
			l.addPoint(enemy)
			println(enemy.gamePoints)
			println(enemy.advantage)
		}
		btMy.setOnClickListener{
			println("Myself")
			l.addPoint(me)
			println(me.gamePoints)
			println(me.advantage)
		}
		btUndo.setOnClickListener{
			println("Undo")
			println(enemy.gamePoints.toString() + " : " + me.gamePoints)
		}


	}
}