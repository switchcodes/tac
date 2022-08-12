package com.example.tac

class Logic {
	var enemy:Player
	var myself:Player

	constructor(enemy: Player, myself: Player) {
		this.enemy = enemy
		this.myself = myself
	}

	fun addPoint(player: Player){
		if(player.gamePoints== 0 || player.gamePoints == 15) {
			player.gamePoints += 15
		}
		else if(player.gamePoints == 30){
			player.gamePoints += 10
		}
		else if(player.gamePoints == 40 || isDeuce()){
			player.gamePoints = 0
			player.setPoints+=1
		}
	}

	fun isDeuce():Boolean{
		
		return false
	}



}