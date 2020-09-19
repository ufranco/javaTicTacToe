package vista;

import java.awt.Image;

import vista.MainView.PlayerEnums;

public class Player {

	private String nickName;
	private Image avatar;
	private PlayerEnums playerSignature;
	
	Player(String nickName, Image avatar, PlayerEnums playerSignature){
		this.setNickName(nickName);
		this.setAvatar(avatar);
		this.setPlayerSignature(playerSignature);
	}

	public Image getAvatar() {
		return avatar;
	}

	public void setAvatar(Image avatar) {
		this.avatar = avatar;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public PlayerEnums getPlayerSignature() {
		return playerSignature;
	}

	public void setPlayerSignature(PlayerEnums playerSignature) {
		this.playerSignature = playerSignature;
	}
}
