package vista;

import javax.swing.ImageIcon;

public class Player {

	private String nickName;
	private ImageIcon avatar;
	private PlayerEnums playerSignature;
	
	Player(){
	}
	
	Player(String nickName, ImageIcon avatar, PlayerEnums playerSignature){
		this.setNickName(nickName);
		this.setAvatar(avatar);
		this.setPlayerSignature(playerSignature);
	}

	public ImageIcon getAvatar() {
		return avatar;
	}

	public void setAvatar(ImageIcon avatar) {
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
