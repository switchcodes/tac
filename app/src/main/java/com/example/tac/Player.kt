package com.example.tac

class Player {
	var setPoints = 0
	var gamePoints = 0
	var advantage = false

	constructor(setPoints: Int, gamePoints: Int) {
		this.setPoints = setPoints
		this.gamePoints = gamePoints
	}
}