package com.example.tac

class Logic {
	var enemy: Player
	var myself: Player

	constructor(enemy: Player, myself: Player) {
		this.enemy = enemy
		this.myself = myself
	}

	fun addPoint(player: Player) {
		if (player.gamePoints == 0 || player.gamePoints == 15) {
			player.gamePoints += 15
		} else if (player.gamePoints == 30) {
			player.gamePoints += 10
		} else if (player.gamePoints == 40 && !isDeuce()) {
			resetGamePoints()
			player.setPoints += 1
		}
		else if (isDeuce()){
			if(player.advantage){ //TODO Advantage kann berücksichtigt nicht ob der andere spieler eine hat!
				resetGamePoints()
				player.setPoints += 1
				player.advantage = false
			}
			player.advantage = true
		}
	}

	fun resetGamePoints() {
		enemy.gamePoints = 0
		myself.gamePoints = 0
	}

	fun isDeuce(): Boolean {
		return enemy.gamePoints == myself.gamePoints && enemy.gamePoints == 40
	}


}